package pwr.lcec.sync.scheduler;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.ScheduleExpression;
import javax.ejb.Singleton;
import javax.ejb.Timeout;
import javax.ejb.TimerService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pwr.lcec.sync.entity.gis.custom.GisAssemblies;
import pwr.lcec.sync.entity.nisc.BiSoMaster;
import pwr.lcec.sync.entity.nisc.BiSrvLoc;
import pwr.lcec.sync.entity.nisc.BiTaskRef;
import pwr.lcec.sync.entity.nisc.BiWrkflwTask;
import pwr.lcec.sync.entity.nisc.custom.NiscWorkOrderSync;
import pwr.lcec.sync.entity.vp.RateGroupPrice;
import pwr.lcec.sync.entity.vp.ServiceOrder;
import pwr.lcec.sync.entity.vp.StakingSheet;
import pwr.lcec.sync.entity.vp.StakingSheetDetail;
import pwr.lcec.sync.entity.vp.TempWMISWorkRequest;
import pwr.lcec.sync.entity.vp.WorkFlow;
import pwr.lcec.sync.entity.vp.WorkFlowTask;
import pwr.lcec.sync.interfaces.GISWorkOrderRemote;
import pwr.lcec.sync.interfaces.NiscWorkOrderRemote;
import pwr.lcec.sync.interfaces.VpWorkFlowRemote;

@Singleton
public class SyncManualWorkOrder extends ScheduleBuilder {
	
	private static final String timerInfo = "SyncManualWorkOrder";
	private static final String syncStarted = "Hello!! NISC Manual WO Sync ready to Work.";
	private static Logger logger = LogManager.getLogger(SyncManualWorkOrder.class);

	@Resource
	private TimerService timerService;

	@EJB
	private NiscWorkOrderRemote wfRemote;

	@EJB
	private VpWorkFlowRemote vpRemote;

	@EJB
	private GISWorkOrderRemote gisRemote;

	@PostConstruct
	public void init() {
		
		preparation(syncStarted);
		
	}
	
	public void reinitializeTimer(ScheduleExpression sex) {
		if (getScheduleFromTimerService(timerService, timerInfo) == null) {
			reinitializeTimer(timerService, timerInfo);
		} else if (!sex.equals(getScheduleFromTimerService(timerService, timerInfo))) {
			reinitializeTimer(timerService, timerInfo);
		} else {
			preparation("Nothing to change schedule has not changed.");
		}
	}
	
	@Timeout
	public void syncManualWorkOrder() {
		logger.info("Manual Work Order Sync Started @ " + new Date());
		
		List<TempWMISWorkRequest> woList = vpRemote.findWRToSync();
		
		woList.stream().forEach(wo -> {
			
			NiscWorkOrderSync niscWorkOrder = wfRemote.findWorkFlowTaskSync(wo.getWorkRequest());
			
			if(niscWorkOrder != null) {
				WorkFlow syncRecord = mapWorkFlow(niscWorkOrder);

				mapServiceOrder(syncRecord, niscWorkOrder);

				mapWorkFlowTasks(niscWorkOrder);

				List<GisAssemblies> assemblies = gisRemote.findAssemblies(niscWorkOrder.getBiWoWorkOrder());

				if (assemblies != null && !assemblies.isEmpty()) {

					StakingSheet ss = mapStakingSheet(syncRecord, (GisAssemblies)assemblies.get(0));

					assemblies.stream().forEach(au -> {
						
						mapStakingSheetDetail(syncRecord, au, ss);	
						
					});
					

					vpRemote.updateWorkflowCalc(Integer.valueOf(ss.getStakingSheetId()), syncRecord.getWorkEventDt(), "INIT");
				} 

			}
			
			wo.setSyncDate(new Timestamp(new Date().getTime()));
			
			vpRemote.updateTempWmisWR(wo);
			
		});

		logger.info("Manual Work Order Sync Finished @ " + new Date());
	}

	public WorkFlow mapWorkFlow(NiscWorkOrderSync wft) {
		WorkFlow wf = null;
		try {
			wf = this.vpRemote.findWorkFlowByWorkFlow(wft.getBiWrkflwKey());
		} catch (Exception e) {

			logger.error("Exception Occured with WO: " + wft.getBiWoWorkOrder());
			logger.error("Exception Occured: " + e.getMessage());
		}

		if (wf == null) {

			wf = new WorkFlow();
			wf.setOverallAsBuiltStatusId(1);
			wf.setOverallInspectionStatusId(1);
			wf.setOverallInvoiceStatusId(1);
		}

		wf.setWorkFlowId(wft.getBiWrkflwKey().intValue());
		wf.setNeededDt(convertDtTm(wft.getBiNeededDtTm()));

		wf.setWorkEventDt(convertDtTm(wft.getBiEventDtTm()));
		wf.setWorkEventStatusId(wft.getBiWorkEventCd());
		wf.setWorkGroup(wft.getBiWorkGroup());
		wf.setWorkOrderId(wft.getBiWoWorkOrder());
		wf.setResourceId(this.vpRemote.findResourceByUserId(wft.getSyUserId().intValue()).getResourceId());

		if (wft.getBiWorkGroup().equals("PIKE")) {
			wf.setAssignedVendorId(1);
		} else if (wft.getBiWorkGroup().equals("MASTEC")) {
			wf.setAssignedVendorId(2);
		} else {
			wf.setAssignedVendorId(3);
		}

		wf.setWorkOrderName(wft.getWoDesc());
		wf.setServiceOrderId(wft.getBiSoNbr());

		if (wft.getBiAccountNbr() != null) {
			wf.setAccountId(wft.getBiAccountNbr().toString());
		} else if (wft.getBiCustToAcc() != null) {
			wf.setAccountId(wft.getBiCustToAcc().toString());
		} else {
			wf.setAccountId(null);
		}

		wf.setServiceLocationId(wft.getBiSrvLocNbr());
		wf.setOpenDt(convertDtTm(wft.getBiOpenDt()));
		wf.setServiceOrderType(wft.getBiSoTypeCd());

		if (wft.getBiResourceName() != null) {
			wf.setResourceName(wft.getBiResourceName());
		}

		this.vpRemote.updateWorkFlow(wf);

		return wf;
	}

	public ServiceOrder mapServiceOrder(WorkFlow syncRecord, NiscWorkOrderSync wft) {
		
		ServiceOrder so = vpRemote.findServiceOrderById(syncRecord.getServiceOrderId());

		if (so == null) {

			so = new ServiceOrder();

			so.setStakingSheetId(null);
			so.setSoCrewId(null);
			so.setQuantity(1);
			so.setInvoiceId(null);
			so.setInvoiceDetailId(null);
			so.setInvoiceStatusId(Integer.valueOf(1));
			so.setInvoiceSubmitGuid(null);
			so.setInspectionId(null);
			so.setInspectionStatusId(2);
		}

		so.setServiceOrderId(syncRecord.getServiceOrderId());
		so.setWorkOrderId(syncRecord.getWorkOrderId());
		so.setNeededDt(syncRecord.getNeededDt());
		so.setWorkFlowId(syncRecord.getWorkFlowId());

		so.setSoTypeCode(wft.getBiSoTypeCd());
		so.setSoStatCode(wft.getBiSoStatCd());
		so.setOpenDt(convertDtTm(wft.getBiOpenDt()));
		so.setSoFunction(wft.getBiSoFunctionCd());
		so.setServiceLocationId(wft.getBiSrvLocNbr());
		so.setSoComments(wft.getBiSoCom());

		BiSoMaster soMaster = this.wfRemote.findSoMaster(wft.getBiSoNbr());
		so.setEnterTypeCode(soMaster.getBiEnterTypeCd());
		so.setSoFullName(soMaster.getBiSoFullNm());
		so.setSoDescription(soMaster.getBiSoDesc());
		so.setNeededDt(convertDtTm(soMaster.getBiNeededDtTm()));
		so.setUserName(soMaster.getBiUserNm());
		so.setSoTypeCodeDescription(wft.getBiSoTypeFunctionDesc());

		BiSrvLoc srvLoc = this.wfRemote.findLocationById(wft.getBiSrvLocNbr());
		if (srvLoc != null) {
			so.setServiceAddress(srvLoc.getBiAddr1());
			so.setServiceCity(srvLoc.getBiCity());
			so.setServicezip(srvLoc.getBiZip());
			so.setServiceDesc(srvLoc.getBiSrvDesc());
			so.setServiceMapLocation(srvLoc.getBiSrvMapLoc());
		}

		return this.vpRemote.mergeServiceOrder(so);
	}

	public StakingSheet mapStakingSheet(WorkFlow syncRecord, GisAssemblies au) {
		StakingSheet ss = this.vpRemote.findStakingSheetByWF(syncRecord.getWorkFlowId());

		if (ss == null) {
			ss = new StakingSheet();
		}

		ss.setWorkFlowId(syncRecord.getWorkFlowId());
		ss.setWorkOrderId(syncRecord.getWorkOrderId());
		ss.setServiceOrderId(syncRecord.getServiceOrderId());
		ss.setWorkOrderDescription(syncRecord.getWorkOrderName());
		ss.setWorkOrderTypeCode(au.getStWoTypeCode());
		ss.setStServiceAddress(au.getStServiceAddr1());
		ss.setStServiceAddressCity(au.getStServiceAddrCity());
		ss.setStServiceZip(au.getStServiceAddrZip());
		ss.setStServiceAddressPhone(au.getStServiceAddrPhone());
		ss.setStServiceName(au.getStServiceName());

		return this.vpRemote.mergeStakingSheet(ss);
	}

	public void mapWorkFlowTasks(NiscWorkOrderSync wo) {
		List<BiWrkflwTask> biWft = wfRemote.findWorkFlowTaskByWorkFlow(wo.getBiWrkflwKey());

		biWft.stream().parallel().forEach(task -> {

			WorkFlowTask wft = new WorkFlowTask();

			wft.setWorkFlowTaskId(task.getBiWrkflwTasksKey());
			wft.setWorkFlowTaskSeq(task.getBiWrkflwTaskSeqNbr());
			wft.setWorkFlow(this.vpRemote.findWorkFlowByWorkFlow(wo.getBiWrkflwKey()));
			wft.setWFCriticalTask(task.getBiCriticalTaskSw());
			wft.setWFEventDt(convertDtTm(task.getBiEventDtTm()));
			wft.setWFTaskCode(task.getBiTaskCd());
			if (task.getBiTaskCd() != null) {
				BiTaskRef btf = wfRemote.findBiTaskRef(task.getBiTaskCd());
				if (btf != null) {
					wft.setWFTaskDescription(btf.getBiTaskDesc());
				}
			}

			wft.setWFTasksCtr(task.getBiWrkflwTasksCtr());
			wft.setWorkEventStatusId(task.getBiWorkEventCd());
			wft.setWorkGroup(task.getBiWorkgrp());
			wft.setWorkOrderId(task.getBiWoWorkord());

			this.vpRemote.mergeWFTasks(wft);
		});
	}

	public StakingSheetDetail mapStakingSheetDetail(WorkFlow syncRecord, GisAssemblies au, StakingSheet ss) {
		int rateGroupId = 0;

		if (syncRecord.getWorkGroup().equalsIgnoreCase("MASTEC")) {
			rateGroupId = 3;
		} else if (syncRecord.getWorkGroup().equalsIgnoreCase("PIKE")) {
			rateGroupId = 4;
		}

		RateGroupPrice rgp = vpRemote.findRatePriceByCauGrp(au.getGsAssemblyGuid(), rateGroupId, new Date(syncRecord.getWorkEventDt().getTime()));

		if (rgp != null) {

			StakingSheetDetail ssd = vpRemote.findStakingSheetDetailByCUID(au.getStAttachedAssemblyGuid(),
					ss.getStakingSheetId());

			if (ssd == null) {

				ssd = new StakingSheetDetail();
				ssd.setAsBuiltStatusId(1);
				ssd.setCurrentInspectionDetailStatusId(1);
				ssd.setInvoiceStatusId(1);
				ssd.setStakingSource("NISC");
				ssd.setGL_AccountId(null);
				ssd.setInvoiceId(null);
			}

			ssd.setStatusDescription(au.getStStatusRefGuid());
			ssd.setStStatusRefGuid(au.getStStatusDescription());
			ssd.setStakingSheetDetailId(au.getStAttachedAssemblyGuid());
			ssd.setAssemblyCreatedDt(au.getGsAssemblyDateCreated());
			ssd.setAssemblyModifiedDt(au.getGsAssemblyDateModified());
			ssd.setStakingSheetId(ss.getStakingSheetId());
			ssd.setStationDescription(au.getGsStationName());
			ssd.setAssemblyGuid(au.getGsAssemblyGuid());
			ssd.setAssemblyRateGroupId(rgp.getRateGroup().getRateGroupId());
			ssd.setAssemblyDescription(rgp.getAssemblyDescription());
			ssd.setAssemblyQuantity(au.getGsAssemblyQuantity());

			ssd.setAssemblyActionCode(au.getStAssemblyActionCode());

			try {
				if (au.getStAssemblyActionCode().equals("C")) {
					ssd.setAssemblyAmount(rgp.getLaborConstHours().multiply(new BigDecimal(rgp.getLaborConstCost()))
							.multiply(new BigDecimal(au.getGsAssemblyQuantity())));
				} else if (au.getStAssemblyActionCode().equals("R")) {
					ssd.setAssemblyAmount(rgp.getLaborRetireHours().multiply(new BigDecimal(rgp.getLaborRetireCost()))
							.multiply(new BigDecimal(au.getGsAssemblyQuantity())));
				}

			} catch (Exception e) {
				logger.warn("WorkOrder: " + au.getStWoNumber());
				logger.warn("AssemblyGuid: " + au.getGsAssemblyGuid());
				logger.warn("AssemblyQuantity: " + au.getGsAssemblyQuantity());
				logger.warn("LaborConstCost RGP: " + rgp.getLaborConstCost());
				logger.warn("LaborConstHours RGP: " + rgp.getLaborConstHours());
				logger.error("Exception Found where AU has NULL for a value to multiply: " + e.getMessage());
			}

			return this.vpRemote.mergeStakingSheetDetail(ssd);
		}

		return null;
	}

	public Timestamp convertDtTm(Date date) {
		return (date == null) ? null : new Timestamp(date.getTime());
	}

	public TimerService getTimerService() {
		return this.timerService;
	}

	public void setTimerService(TimerService timerService) {
		this.timerService = timerService;
	}

	public static String getTimerinfo() {
		return timerInfo;
	}

	public static String getSyncstarted() {
		return syncStarted;
	}

}
