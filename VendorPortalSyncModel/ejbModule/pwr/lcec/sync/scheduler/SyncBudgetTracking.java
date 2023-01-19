package pwr.lcec.sync.scheduler;

import java.math.BigDecimal;
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

import pwr.lcec.sync.entity.nisc.ApBatchTran;
import pwr.lcec.sync.entity.nisc.ApInvAct;
import pwr.lcec.sync.entity.nisc.WoMstr;
import pwr.lcec.sync.entity.nisc.WoTranInqView;
import pwr.lcec.sync.entity.nisc.custom.NiscWoTransActualsGroupbyVw;
import pwr.lcec.sync.entity.vp.Invoice;
/*import pwr.lcec.sync.entity.vp.Project;
import pwr.lcec.sync.entity.vp.ProjectWorkOrder;
import pwr.lcec.sync.entity.vp.ProjectWorkOrderActual;
import pwr.lcec.sync.entity.vp.ProjectWorkOrderActualPK;
import pwr.lcec.sync.entity.vp.ProjectWorkOrderBudget;
import pwr.lcec.sync.entity.vp.ProjectWorkOrderBudgetPK;
import pwr.lcec.sync.entity.vp.ProjectWorkOrderTransaction;*/
import pwr.lcec.sync.entity.vp.ServiceOrder;
import pwr.lcec.sync.interfaces.NiscWorkOrderRemote;
import pwr.lcec.sync.interfaces.VpWorkFlowRemote;

@Singleton
public class SyncBudgetTracking extends ScheduleBuilder {
	private static final String timerInfo = "SyncBudgetTracking";
	private static final String syncStarted = "Hello!! Budget Tracking Sync ready to Work.";
	private static Logger logger = LogManager.getLogger(SyncBudgetTracking.class);

	@Resource
	private TimerService timerService;

	@EJB
	private VpWorkFlowRemote vpRemote;

	@EJB
	private NiscWorkOrderRemote niscRemote;

	@PostConstruct
	public void init() {
		preparation(syncStarted);
	}

	public void reinitializeTimer(ScheduleExpression sex) {
		reinitializeTimer(timerService, timerInfo);
	}

	/*@Timeout
	public void invoiceStatus() {
		
		logger.info("Budget Tracking Sync Started w/  records @ " + new Date());
		
		List<Project> projects = vpRemote.findProjects();
		
		//Get list of projects
		projects.forEach(p -> {
			
			//Get list of WO by project ID
			List<WoMstr> masters = niscRemote.findWorkFlowByProjectId(p.getProjectId());
			logger.info("Number of WO's found for project: " + p.getProjectId() + ": " + masters.size());
			//for each WO get actuals grouped by month
			masters.forEach(m -> {
				
				//Map WO details to ProjectWO table and save
				ProjectWorkOrder pwo = vpRemote.mergeProjectWorkOrder(mapNiscWorkOrder(m, m.getWoProjId()));
				
				//Map the monthly actuals to ProjectWFActual object and save, and sum total by WO and save to the PWF table.
				List<NiscWoTransActualsGroupbyVw> actuals = niscRemote.findWoTransActualsByWoId(m.getWoProjId(), m.getId().getWoId());
				//logger.info("Actuals found for WO: " + m.getId().getWoId() + ": " + actuals.size());
				for(NiscWoTransActualsGroupbyVw a : actuals) {
									
					ProjectWorkOrderActual wfActual = mapNiscActuals(a, pwo);
					vpRemote.mergeWorkOrderActual(wfActual);
					
				}
				
				BigDecimal actualSum = actuals.stream().map(x -> x.getWoAmt()).reduce(BigDecimal.ZERO, BigDecimal::add);
				pwo.setActualAmount(actualSum);
				pwo = vpRemote.mergeProjectWorkOrder(pwo);
				
				//TODO: need to collect all annual totals and insert into PWOB. 
				List<ProjectWorkOrderBudget> pwob = vpRemote.findPWOBudgetByWoId(pwo.getWorkOrderId());
				
				pwob.stream().forEach(b -> {
					
					List<ProjectWorkOrderActual> pwoa = vpRemote.findPWOActualByWoId(b.getId().getWorkOrderId(), b.getId().getYear());	
					BigDecimal annualSum = pwoa.stream().map(x -> x.getActualAmount()).reduce(BigDecimal.ZERO, BigDecimal::add);
					b.setActualAmount(annualSum);
					vpRemote.mergePWOBudget(b);
				});
				
				
				
				//Map all transactions to the PWFT table 
				List<WoTranInqView> trans = niscRemote.findWorkOrderTransByWoId(m.getWoProjId(), m.getId().getWoId());
				
				for(WoTranInqView t : trans) {
					
					ProjectWorkOrderTransaction wfTran = mapNiscTransactions(t, m.getId().getWoId());
					vpRemote.mergeWorkOrderTrans(wfTran);
				}
				
			});
			
		});
		
		logger.info("Budget Tracking Sync Finished @ " + new Date());
	}
	
	private ProjectWorkOrder mapNiscWorkOrder(WoMstr wo, String projectId) {
		
		ProjectWorkOrder nwo = new ProjectWorkOrder();
		
		Project prj = vpRemote.findProjectById(projectId);
		
		nwo.setProject(prj);
		
		nwo.setWorkOrderId(wo.getId().getWoId());
		nwo.setWorkOrderDescription(wo.getWoDesc());
		nwo.setWorkOrderStatus(wo.getWoStatCd());
		nwo.setWorkOrderType(wo.getWoTypeCd());		
		
		return nwo;
	}
	
	private ProjectWorkOrderActual mapNiscActuals(NiscWoTransActualsGroupbyVw actual, ProjectWorkOrder pwo) {
		
		ProjectWorkOrderActualPK pk = new ProjectWorkOrderActualPK();
		ProjectWorkOrderActual act = new ProjectWorkOrderActual();
		//ProjectWorkOrderBudget bud = new ProjectWorkOrderBudget();
		ProjectWorkOrderBudgetPK id = new ProjectWorkOrderBudgetPK();
		id.setWorkOrderId(pwo.getWorkOrderId());
		id.setYear(Integer.parseInt(actual.getWoPrdYrmo().toString().substring(0, 4)));
		
		ProjectWorkOrderBudget found = vpRemote.findPWOBudgetById(id);
		if(found == null) {
			found = new ProjectWorkOrderBudget(); 
			found.setId(id);
			found.setActualAmount(new BigDecimal(0.00));
			found = vpRemote.mergePWOBudget(found);
		}else {
			act.setProjectWorkOrderBudget(found);
		}
		
		act.setProjectWorkOrderBudget(found);
		act.setProjectWorkOrder(pwo);
		
		pk.setWorkOrderId(pwo.getWorkOrderId());
		pk.setPeriod(actual.getWoPrdYrmo().intValue());
		
		act.setId(pk);
		act.setActualAmount(actual.getWoAmt());
		
		return act;
		
	}
	
	private ProjectWorkOrderTransaction mapNiscTransactions(WoTranInqView tran, String woid) {
		
		ProjectWorkOrderTransaction pwot = new ProjectWorkOrderTransaction();
		//pwot.setProjectWorkOrderTransactionId(projid);
		pwot.setWoTranActKey(tran.getWoTranActKey().intValue());
		pwot.setActualAmount(tran.getWoAmt());
		
		ProjectWorkOrderActualPK id = new ProjectWorkOrderActualPK();
		id.setPeriod(tran.getWoPrdYrmo().intValue());
		id.setWorkOrderId(woid);
		ProjectWorkOrderActual act = vpRemote.findPWOAcutalById(id);
		
		pwot.setProjectWorkOrderActual(act);
		
		return pwot;
		
	}*/
	
	public TimerService getTimerService() {
		return this.timerService;
	}

	public void setTimerService(TimerService timerService) {
		this.timerService = timerService;
	}

	public static String getTimerinfo() {
		return "SyncBudgetTracking";
	}
}
