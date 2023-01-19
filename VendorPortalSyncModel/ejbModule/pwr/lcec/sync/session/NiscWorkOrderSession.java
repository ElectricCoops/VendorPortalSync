package pwr.lcec.sync.session;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pwr.lcec.sync.entity.nisc.ApBatchTran;
import pwr.lcec.sync.entity.nisc.ApBatchTranDist;
import pwr.lcec.sync.entity.nisc.ApInvAct;
import pwr.lcec.sync.entity.nisc.BiResourceRef;
import pwr.lcec.sync.entity.nisc.BiResourceWorkgrp;
import pwr.lcec.sync.entity.nisc.BiSoDet;
import pwr.lcec.sync.entity.nisc.BiSoMaster;
import pwr.lcec.sync.entity.nisc.BiSoTypeFunctionRef;
import pwr.lcec.sync.entity.nisc.BiSoTypeFunctionRefPK;
import pwr.lcec.sync.entity.nisc.BiSrvLoc;
import pwr.lcec.sync.entity.nisc.BiTaskRef;
import pwr.lcec.sync.entity.nisc.BiWorkEventCdRef;
import pwr.lcec.sync.entity.nisc.BiWrkflw;
import pwr.lcec.sync.entity.nisc.BiWrkflwTask;
import pwr.lcec.sync.entity.nisc.GlAcctMstr;
import pwr.lcec.sync.entity.nisc.WoCauRefRate;
import pwr.lcec.sync.entity.nisc.WoMstr;
import pwr.lcec.sync.entity.nisc.WoRateGrpRef;
import pwr.lcec.sync.entity.nisc.WoTranInqView;
import pwr.lcec.sync.entity.nisc.custom.NiscRateRef;
import pwr.lcec.sync.entity.nisc.custom.NiscWoTransActualsGroupbyVw;
import pwr.lcec.sync.entity.nisc.custom.NiscWorkOrderSync;
import pwr.lcec.sync.interfaces.NiscWorkOrderRemote;

@Stateless(name = "NISC-WorkOrderBean", mappedName = "ejb/lcec/NISC-WorkOrderProcessorBean", description = "NISC-WorkOrderProcessorBean Business Facade")
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class NiscWorkOrderSession implements NiscWorkOrderRemote {
	private static Logger logger = LogManager.getLogger(NiscWorkOrderSession.class);

	@PersistenceContext(unitName = "NISCPU")
	private EntityManager em;

	@SuppressWarnings("unchecked")
	public BiWrkflw findWorkFlowById(Integer workflow) {
		List<BiWrkflw> found = null;

		Query query = this.em.createNamedQuery("BiWrkflw.findWFByKey");
		query.setParameter("workflow", workflow);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (BiWrkflw) found.get(0);
		if (found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	@SuppressWarnings("unchecked")
	public List<BiWrkflwTask> findWorkFlowTaskByWorkOrder(String workOrderId) {
		List<BiWrkflwTask> found = null;

		Query query = this.em.createNamedQuery("BiWrkflwTask.findWFTaskByWO");
		query.setParameter("workOrderId", workOrderId);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		return found;
	}

	@SuppressWarnings("unchecked")
	public BiResourceRef findResourceByUserId(int syUserId) {
		List<BiResourceRef> found = null;

		Query query = this.em.createNamedQuery("BiResourceRef.findResourceByUserId");
		query.setParameter("syUserId", Integer.valueOf(syUserId));
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (BiResourceRef) found.get(0);
		if (found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	@SuppressWarnings("unchecked")
	public BiSoDet findSoDetByWfId(int wrkFlowId) {
		List<BiSoDet> found = null;

		Query query = this.em.createNamedQuery("BiSoDet.findSOByworkFlowId");
		query.setParameter("wrkFlowId", Integer.valueOf(wrkFlowId));

		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (BiSoDet) found.get(0);
		if (found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	@SuppressWarnings("unchecked")
	public WoMstr findWorkOrderMasterById(String woId) {
		List<WoMstr> found = null;

		Query query = this.em.createNamedQuery("WoMstr.findMasterByWoId");
		query.setParameter("woId", woId);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (WoMstr) found.get(0);
		if (found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	@SuppressWarnings("unchecked")
	public BiSoTypeFunctionRef findTypeFunctionById(BiSoTypeFunctionRefPK id) {
		List<BiSoTypeFunctionRef> found = null;

		Query query = this.em.createNamedQuery("BiSoTypeFunctionRef.findTypeFunctionById");
		query.setParameter("id", id);

		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (BiSoTypeFunctionRef) found.get(0);
		if (found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	@SuppressWarnings("unchecked")
	public BiSrvLoc findLocationById(int biSrvLocNbr) {
		List<BiSrvLoc> found = null;

		Query query = this.em.createNamedQuery("BiSrvLoc.findLocById");
		query.setParameter("biSrvLocNbr", Integer.valueOf(biSrvLocNbr));
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (BiSrvLoc) found.get(0);
		if (found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	@SuppressWarnings("unchecked")
	public List<WoRateGrpRef> findRateGroups() {
		List<WoRateGrpRef> found = null;

		Query query = this.em.createNamedQuery("WoRateGrpRef.findAll");
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		return found;
	}

	@SuppressWarnings("unchecked")
	public List<NiscRateRef> findRatesByGrp(String rateGrp) {
		List<NiscRateRef> found = null;

		Query query = this.em.createQuery(
				"SELECT new pwr.lcec.sync.entity.nisc.custom.NiscRateRef("
						+ "cr.id.woCauId,"
						+ "CU.woDesc,"
						+ "cr.id.woRateGrpCd,"
						+ "cr.woConsHrs,"
						+ "cr.woLaborRateConsCd,"
						+ "clr.woAmt,"
						+ "cr.woRetireHrs,"
						+ "cr.woLaborRateRetireCd,"
						+ "rlr.woAmt,"
						+ "cr.woCauRefRateCtr)"
					//	+ "cr.woFixedAmt) "
				+ "FROM WoCauRefRate cr "
				+ "LEFT JOIN WoLaborRateRef clr ON CLR.woLaborRateCd = CR.woLaborRateConsCd "
				+ "LEFT JOIN WoLaborRateRef rlr ON RLR.woLaborRateCd = CR.woLaborRateRetireCd "
				+ "LEFT JOIN WoCauRef cu ON CU.woCauId = cr.id.woCauId "
				+ "WHERE cr.id.woRateGrpCd = :rateGrp");

		query.setParameter("rateGrp", rateGrp);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		return found;
	}

	@SuppressWarnings("unchecked")
	public WoCauRefRate findRatePriceByCauGrp(String woCauId, String woRateGrpCd) {
		List<WoCauRefRate> found = null;

		Query query = this.em.createNamedQuery("WoCauRefRate.findRateByGrpCau");
		query.setParameter("cau", woCauId);
		query.setParameter("grpName", woRateGrpCd);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (WoCauRefRate) found.get(0);
		if (found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	@SuppressWarnings("unchecked")
	public BiSoMaster findSoMaster(String biSoNbr) {
		List<BiSoMaster> found = null;

		Query query = this.em.createNamedQuery("BiSoMaster.findSoBySOID");
		query.setParameter("biSoNbr", biSoNbr);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (BiSoMaster) found.get(0);
		if (found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	@SuppressWarnings("unchecked")
	public List<NiscWorkOrderSync> findWorkFlowTaskSync() {
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(2, -2);

		Date oldDate = c.getTime();
		logger.info("Date: " + oldDate);

		Query query = this.em.createQuery(
				"SELECT new pwr.lcec.sync.entity.nisc.custom.NiscWorkOrderSync( "
						+ "wt.biWrkflwKey,"
						+ "wt.biWrkflwTasksKey,"
						+ "w.biNeededDtTm,"
						+ "wt.biTaskCd,"
						+ "t.biTaskDesc,"
						+ "wt.biWorkEventCd,"
						+ "wt.biEventDtTm,"
						+ "wt.biWorkgrp,"
						+ "wt.biWoWorkord,"
						+ "wt.syUserId,"
						+ "r.biResourceNm,"
						+ "sd.biSoNbr,"
						+ "sd.biSoFunctionCd,"
						+ "sd.biSoTypeCd,"
						+ "sf.biSoTypeFunctionDesc,"
						+ "sd.biSoStatCd,"
						+ "sd.biOpenDt,"
						+ "sd.biCloseDt,"
						+ "sd.biSrvLocNbr,"
						+ "sd.biAcct,"
						+ "sd.biSoToAcct,"
						+ "wm.woDesc,"
						+ "wm.woTypeCd,"
						+ "sd.biSoCom )  "
				+ "FROM BiWrkflw w "
					+ "LEFT JOIN BiWrkflwTask wt ON wt.biWrkflwKey = w.biWrkflwKey "
					+ "LEFT JOIN BiResourceRef r ON r.syUserId = wt.syUserId "
					+ "LEFT JOIN BiTaskRef t ON t.biTaskTypeCd = 'R' AND t.biTaskCd = wt.biTaskCd "
					+ "LEFT JOIN BiSoDet sd ON sd.biWrkflwKey = wt.biWrkflwKey "
					+ "LEFT JOIN BiSoTypeFunctionRef sf ON sf.id.biSoTypeCd = sd.biSoTypeCd AND sf.id.biSoFunctionCd = sd.biSoFunctionCd AND sf.id.biTypeSrvGrp = 'ELEC' "
					+ "LEFT JOIN WoMstr wm ON wm.id.woId = wt.biWoWorkord AND wm.id.woHistSeqNbr = 0 "
				+ "WHERE wt.biWorkgrp IN ('PIKE', 'MASTEC') "
				+ "AND sd.biSoTypeCd NOT IN ('APT', 'CNMNR', 'CNTB', 'DCLAIM', 'DMTNC', 'ER', 'HP', 'PSC', 'OSP', 'TPOH') "
				
				 + "AND (wt.biWoWorkord IN ('400571971') "
					+ "OR (LENGTH (wt.biWoWorkord)) > 8 "
					+ "AND wt.biWoWorkord NOT LIKE '3%' "
					+ "AND (wt.biWorkEventCd NOT IN ('COMP','CANCL') "
					+ "AND (wt.biEventDtTm >= SQL('(sysdate - 120)'))))");
				/**
				  * Standard Sync Criteria
				  *
				  
				 
				  + "AND LENGTH (wt.biWoWorkord) > 8 "
				  + "AND wt.biWoWorkord NOT LIKE '3%' "
				  + "AND wt.biWorkEventCd NOT IN ('COMP','CANCL') "
				  + "AND wt.biEventDtTm >= SQL('(sysdate - 200)')");
				 * */
				 
				 
				
				
			/*	When you want to add a WO that does not fall into the standard sync criteria 
			 * 
			 **
			 + "AND (wt.biWoWorkord IN ('400160059') "
				+ "OR (LENGTH (wt.biWoWorkord)) > 8 "
				+ "AND wt.biWoWorkord NOT LIKE '3%' "
				+ "AND (wt.biWorkEventCd NOT IN ('COMP','CANCL') "
				+ "AND (wt.biEventDtTm >= SQL('(sysdate - 120)'))))");
			*/
				
			//+ "AND wt.biWoWorkord IN ('544006') ");
			

		List<NiscWorkOrderSync> found = null;
		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}
		return found;
	}

	@SuppressWarnings("unchecked")
	public BiSoDet findSoDetSyncByWfId(int wrkFlowId) {
		List<BiSoDet> found = null;

		Query query = this.em.createNamedQuery("BiSoDet.findSOSyncByWFID");
		query.setParameter("wrkFlowId", Integer.valueOf(wrkFlowId));

		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (BiSoDet) found.get(0);
		if (found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	@SuppressWarnings("unchecked")
	public List<BiWrkflwTask> findWorkFlowTaskByWorkFlow(Integer biWrkflwKey) {
		List<BiWrkflwTask> found = null;

		Query query = this.em.createNamedQuery("BiWrkflwTask.findWFTaskByWF");
		query.setParameter("biWrkflwKey", biWrkflwKey);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		return found;
	}

	@SuppressWarnings("unchecked")
	public List<BiWorkEventCdRef> findWorkEventCd() {
		List<BiWorkEventCdRef> found = null;

		Query query = this.em.createNamedQuery("BiWorkEventCdRef.findAll");

		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		return found;
	}

	@SuppressWarnings("unchecked")
	public List<GlAcctMstr> findGLAccounts() {
		
		List<BigDecimal> glAccounts = new ArrayList<BigDecimal>();
		
		glAccounts.add(new BigDecimal("107.2", new MathContext(4, RoundingMode.HALF_UP)));
		glAccounts.add(new BigDecimal("107.3", new MathContext(4, RoundingMode.HALF_UP)));
		glAccounts.add(new BigDecimal("108.08", new MathContext(5, RoundingMode.HALF_UP)));
		glAccounts.add(new BigDecimal(583));
		glAccounts.add(new BigDecimal(593));
		glAccounts.add(new BigDecimal(594));
		glAccounts.add(new BigDecimal(585));

		List<GlAcctMstr> found = null;

		Query query = this.em.createNamedQuery("GlAcctMstr.findVPAccounts");
		query.setParameter("glAccounts", glAccounts);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		return found;
	}

	@SuppressWarnings("unchecked")
	public List<BiResourceRef> findResourcesRef() {
		List<BiResourceRef> found = null;

		Query query = this.em.createNamedQuery("BiResourceRef.findAll");

		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		return found;
	}

	@SuppressWarnings("unchecked")
	public List<BiResourceWorkgrp> findResourceWorkGroupByResourceId(long resourceId) {
		List<BiResourceWorkgrp> found = null;

		Query query = this.em.createNamedQuery("BiResourceWorkgrp.findWorkGroupByResourceName");
		query.setParameter("resourceId", Long.valueOf(resourceId));
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		return found;
	}

	@SuppressWarnings("unchecked")
	public ApBatchTran findApBatchTranByInvId(String apInvId) {
		List<ApBatchTran> found = null;

		Query query = this.em.createNamedQuery("ApBatchTran.findByInvId");
		query.setParameter("apInvId", apInvId);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (ApBatchTran) found.get(0);
		if (found == null || found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	@SuppressWarnings("unchecked")
	public ApBatchTranDist findBatchDistByInvId(long apBatchTranKey) {
		List<ApBatchTranDist> found = null;

		Query query = this.em.createNamedQuery("ApBatchTranDist.findByBatchTranKey");
		query.setParameter("apBatchTranKey", Long.valueOf(apBatchTranKey));
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (ApBatchTranDist) found.get(0);
		if (found == null || found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	@SuppressWarnings("unchecked")
	public List<ApInvAct> findInvActByInvId(String apInvId) {
		List<ApInvAct> found = null;

		Query query = this.em.createNamedQuery("ApInvAct.findByInvId");
		query.setParameter("apInvId", apInvId);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		/*if (found.size() == 1)
			return (ApInvAct) found.get(0);
		if (found == null || found.isEmpty()) {
			logger.error("VP Reference not found: " + apInvId + "not found...");
			return null;
		}
		logger.error("Non Unique Result Exception: " + apInvId);
		throw new NonUniqueResultException();*/
		
		return found;
	}

	@SuppressWarnings("unchecked")
	public BiWrkflwTask findTaskByTaskKey(int biWrkflwTasksKey) {
		List<BiWrkflwTask> found = null;

		Query query = this.em.createNamedQuery("BiWrkflwTask.findWFTaskByWFTask");
		query.setParameter("biWrkflwTasksKey", Integer.valueOf(biWrkflwTasksKey));
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (BiWrkflwTask) found.get(0);
		if (found == null || found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	public BiWrkflwTask mergeWorkFlowTask(BiWrkflwTask task) {
		return (BiWrkflwTask) this.em.merge(task);
	}

	@SuppressWarnings("unchecked")
	public BiTaskRef findBiTaskRef(String biTaskCd) {
		List<BiTaskRef> found = null;

		Query query = this.em.createNamedQuery("BiTaskRef.findTaskByTaskCd");
		query.setParameter("biTaskCd", biTaskCd);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (BiTaskRef) found.get(0);
		if (found == null || found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	@SuppressWarnings("unchecked")
	@Override
	public NiscWorkOrderSync findWorkFlowTaskSync(String woid) {
		
		Query query = em.createQuery(
				"SELECT new pwr.lcec.sync.entity.nisc.custom.NiscWorkOrderSync( "
						+ "wt.biWrkflwKey,"
						+ "wt.biWrkflwTasksKey,"
						+ "w.biNeededDtTm,"
						+ "wt.biTaskCd,"
						+ "t.biTaskDesc,"
						+ "wt.biWorkEventCd,"
						+ "wt.biEventDtTm,"
						+ "wt.biWorkgrp,"
						+ "wt.biWoWorkord,"
						+ "wt.syUserId,"
						+ "r.biResourceNm,"
						+ "sd.biSoNbr,"
						+ "sd.biSoFunctionCd,"
						+ "sd.biSoTypeCd,"
						+ "sf.biSoTypeFunctionDesc,"
						+ "sd.biSoStatCd,"
						+ "sd.biOpenDt,"
						+ "sd.biCloseDt,"
						+ "sd.biSrvLocNbr,"
						+ "sd.biAcct,"
						+ "sd.biSoToAcct,"
						+ "wm.woDesc,"
						+ "wm.woTypeCd,"
						+ "sd.biSoCom )  "
				+ "FROM BiWrkflw w "
					+ "LEFT JOIN BiWrkflwTask wt ON wt.biWrkflwKey = w.biWrkflwKey "
					+ "LEFT JOIN BiResourceRef r ON r.syUserId = wt.syUserId "
					+ "LEFT JOIN BiTaskRef t ON t.biTaskTypeCd = 'R' AND t.biTaskCd = wt.biTaskCd "
					+ "LEFT JOIN BiSoDet sd ON sd.biWrkflwKey = wt.biWrkflwKey "
					+ "LEFT JOIN BiSoTypeFunctionRef sf ON sf.id.biSoTypeCd = sd.biSoTypeCd AND sf.id.biSoFunctionCd = sd.biSoFunctionCd AND sf.id.biTypeSrvGrp = 'ELEC' "
					+ "LEFT JOIN WoMstr wm ON wm.id.woId = wt.biWoWorkord AND wm.id.woHistSeqNbr = 0 "
				+ "WHERE wt.biWorkgrp IN ('PIKE', 'MASTEC') "
				+ "AND sd.biSoTypeCd NOT IN ('APT', 'CNMNR', 'CNTB', 'DCLAIM', 'DMTNC', 'ER', 'HP', 'PSC', 'OSP', 'TPOH') "
				 + "AND wt.biWoWorkord IN ('" + woid + "') ");
							

		List<NiscWorkOrderSync> found = null;
		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}
		
		if (found.size() == 1)
			return (NiscWorkOrderSync) found.get(0);
		if (found == null || found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<WoMstr> findWorkFlowByProjectId(String projectId) {
		List<WoMstr> found = null;

		Query query = this.em.createNamedQuery("WoMstr.findMasterByProjectId");
		query.setParameter("projectId", projectId);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		return found;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<NiscWoTransActualsGroupbyVw> findWoTransActualsByWoId(String woProjId, String woId) {
		List<NiscWoTransActualsGroupbyVw> found = null;

		Query query = this.em.createNamedQuery("WoTranInqView.findActualsByPrjIdWoId");
		query.setParameter("woProjId", woProjId);
		query.setParameter("woId", woId);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			
			found = converter(query.getResultList());
			
			//found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		return found;
	}
	
	public List<NiscWoTransActualsGroupbyVw> converter(List<Object[]> in) {
		
		List<NiscWoTransActualsGroupbyVw> out = new ArrayList<NiscWoTransActualsGroupbyVw>();
		
		in.stream().forEach(i -> {
			
			NiscWoTransActualsGroupbyVw vw = new NiscWoTransActualsGroupbyVw();
			vw.setWoPrdYrmo((BigDecimal)i[0]);
			vw.setWoAmt((BigDecimal) i[1]);
			
			out.add(vw);
		});
		
		return out;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<WoTranInqView> findWorkOrderTransByWoId(String woProjId, String woId) {
		List<WoTranInqView> found = null;

		Query query = this.em.createNamedQuery("WoTranInqView.findTransactionsByPrjIdWoId");
		query.setParameter("woProjId", woProjId);
		query.setParameter("woId", woId);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		return found;
	}
}
