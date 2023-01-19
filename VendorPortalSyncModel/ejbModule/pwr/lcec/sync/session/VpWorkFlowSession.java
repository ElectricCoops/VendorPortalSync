package pwr.lcec.sync.session;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pwr.lcec.sync.entity.vp.CurrentContractDate;
import pwr.lcec.sync.entity.vp.GLAccount;
import pwr.lcec.sync.entity.vp.Invoice;
import pwr.lcec.sync.entity.vp.InvoiceDetail;
import pwr.lcec.sync.entity.vp.RateGroup;
import pwr.lcec.sync.entity.vp.RateGroupPrice;
import pwr.lcec.sync.entity.vp.ServiceOrder;
import pwr.lcec.sync.entity.vp.StakingSheet;
import pwr.lcec.sync.entity.vp.StakingSheetDetail;
import pwr.lcec.sync.entity.vp.TempWMISWorkRequest;
import pwr.lcec.sync.entity.vp.VPResource;
import pwr.lcec.sync.entity.vp.Vendor;
import pwr.lcec.sync.entity.vp.WorkEventStatus;
import pwr.lcec.sync.entity.vp.WorkFlow;
import pwr.lcec.sync.entity.vp.WorkFlowTask;
import pwr.lcec.sync.entity.vp.WorkGroup;
import pwr.lcec.sync.interfaces.VpWorkFlowRemote;

@Stateless(name = "VpWorkFlowBean", mappedName = "ejb/lcec/VpWorkFlowProcessorBean", description = "VpWorkFlowProcessorBean Business Facade")
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class VpWorkFlowSession implements VpWorkFlowRemote {
	private static Logger logger = LogManager.getLogger(VpWorkFlowSession.class);

	@PersistenceContext(unitName = "VPPU")
	private EntityManager em;

	@SuppressWarnings("unchecked")
	public WorkFlow findWorkFlowByWorkOrder(String workOrderId) {
		List<WorkFlow> found = null;

		Query query = this.em.createNamedQuery("WorkFlow.findWFByWO");
		query.setParameter("workOrderId", workOrderId);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (WorkFlow) found.get(0);
		if (found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	public void updateWorkFlow(WorkFlow syncRecord) {
		this.em.merge(syncRecord);
	}

	public void insertWorkFlow(WorkFlow syncRecord) {
		this.em.persist(syncRecord);
	}
	
	@SuppressWarnings("unchecked")
	public RateGroup findRateGroupByName(String grpName) {
		List<RateGroup> found = null;

		Query query = this.em.createNamedQuery("RateGroup.findRateGrpByName");
		query.setParameter("grpName", grpName);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (RateGroup) found.get(0);
		if (found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	public RateGroup mergeRateGroup(RateGroup rg) {
		return (RateGroup) this.em.merge(rg);
	}

	@SuppressWarnings("unchecked")
	public RateGroupPrice findRatePriceByCauGrp(String woCauId, int rateGroupId, Date syncDate) {
		List<RateGroupPrice> found = null;

		Query query = this.em.createNamedQuery("RateGroupPrice.findCauByCauGrpDate");
		query.setParameter("cau", woCauId);
		query.setParameter("grpId", Integer.valueOf(rateGroupId));
		query.setParameter("syncDate", syncDate);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (RateGroupPrice) found.get(0);
		if (found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	public void mergeRateGroupPrice(RateGroupPrice cau) {
		this.em.merge(cau);
	}

	public StakingSheet mergeStakingSheet(StakingSheet ss) {
		return (StakingSheet) em.merge(ss);
	}

	public void mergeWFTasks(WorkFlowTask wft) {
		this.em.merge(wft);
	}

	public StakingSheetDetail mergeStakingSheetDetail(StakingSheetDetail ssd) {
		return (StakingSheetDetail) this.em.merge(ssd);
	}

	@SuppressWarnings("unchecked")
	public ServiceOrder findServiceOrderById(String soId) {
		List<ServiceOrder> found = null;

		Query query = this.em.createNamedQuery("ServiceOrder.findServiceOrderById");
		query.setParameter("serviceOrderId", soId);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (ServiceOrder) found.get(0);
		if (found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	public ServiceOrder mergeServiceOrder(ServiceOrder so) {
		return (ServiceOrder) this.em.merge(so);
	}

	@SuppressWarnings("unchecked")
	public List<TempWMISWorkRequest> findWRToSync() {
		List<TempWMISWorkRequest> found = null;

		Query query = this.em.createNamedQuery("TempWMISWorkRequest.findWRToSync");

		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		return found;
	}

	public void updateTempWmisWR(TempWMISWorkRequest temp) {
		em.merge(temp);
	}

	@SuppressWarnings("unchecked")
	public StakingSheet findStakingSheetByWF(int workFlowId) {
		List<StakingSheet> found = null;

		Query query = this.em.createNamedQuery("StakingSheet.findStakingSheetByWF");
		query.setParameter("workFlowId", Integer.valueOf(workFlowId));
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (StakingSheet) found.get(0);
		if (found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	@SuppressWarnings("unchecked")
	public StakingSheetDetail findStakingSheetDetailByCUID(String pointSpanCuSeqNo, int stakingSheetId) {
		List<StakingSheetDetail> found = null;

		Query query = this.em.createNamedQuery("StakingSheetDetail.findStakingSheetDetailByCUID");
		query.setParameter("stakingSheetId", Integer.valueOf(stakingSheetId));
		query.setParameter("pointSpanCuSeqNo", pointSpanCuSeqNo);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (StakingSheetDetail) found.get(0);
		if (found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	public int updateWorkflowCalc(Integer stakingsheetId, Timestamp rateDt, String typeFlg) {
		if (stakingsheetId == null || rateDt == null || StringUtils.isEmpty(typeFlg)) {
			System.out.println("ValidationException: stakingsheetId, rateDt or typeFlg cannot be blank.");
		}

		StoredProcedureQuery query = this.em.createNamedStoredProcedureQuery("UPDATE_WORKFLOW_CALC");
		query.setParameter("IN_StakingSheetId", stakingsheetId);
		query.setParameter("IN_RateDate", rateDt);
		query.setParameter("IN_TypeFlag", typeFlg);
		query.execute();

		return ((Integer) query.getOutputParameterValue("OUT_Response")).intValue();
	}

	@SuppressWarnings("unchecked")
	public WorkFlow findWorkFlowByWorkFlow(Integer workFlow) {
		List<WorkFlow> found = null;

		Query query = em.createNamedQuery("WorkFlow.findWFByWF");
		query.setParameter("workFlow", workFlow);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (WorkFlow) found.get(0);
		if (found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	@SuppressWarnings("unchecked")
	public List<String> findSLTypes() {
		List<String> found = null;

		Query query = this.em.createNamedQuery("RateGroupPrice.findDistinctCustom");
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		return found;
	}

	@SuppressWarnings("unchecked")
	public WorkEventStatus findWorkEvent(String WorkEventStatusId) {
		List<WorkEventStatus> found = null;

		Query query = this.em.createNamedQuery("WorkEventStatus.findWorkEventById");
		query.setParameter("wesi", WorkEventStatusId);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (WorkEventStatus) found.get(0);
		if (found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	public WorkEventStatus mergeWorkEvent(WorkEventStatus wes) {
		return (WorkEventStatus) this.em.merge(wes);
	}

	@SuppressWarnings("unchecked")
	public GLAccount findGLAccount(BigDecimal account) {
		List<GLAccount> found = null;

		Query query = this.em.createNamedQuery("GLAccount.findGLAccount");
		query.setParameter("account", account);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (GLAccount) found.get(0);
		if (found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	public GLAccount mergeGLAccount(GLAccount gla) {
		return (GLAccount) this.em.merge(gla);
	}

	@SuppressWarnings("unchecked")
	public VPResource findResourceById(int resourceId) {
		List<VPResource> found = null;

		Query query = this.em.createNamedQuery("Resource.findResourceById");
		query.setParameter("resourceId", Integer.valueOf(resourceId));
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (VPResource) found.get(0);
		if (found.isEmpty()) {
			return null;
		}

		List<VPResource> f = (List<VPResource>) found.stream().filter(fnd -> fnd.getActive().equals("Y"))
				.collect(Collectors.toList());
		if (f.size() == 1)
			return (VPResource) f.get(0);
		if (f.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	public VPResource mergeResource(VPResource res) {
		return (VPResource) em.merge(res);
	}

	@SuppressWarnings("unchecked")
	public WorkGroup findWorkGroup(int resourceId, String workGroupName) {
		List<WorkGroup> found = null;

		Query query = this.em.createNamedQuery("WorkGroup.findWorkGroup");
		query.setParameter("resourceId", Integer.valueOf(resourceId));
		query.setParameter("workGroupName", workGroupName);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (WorkGroup) found.get(0);
		if (found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	public WorkGroup mergeWorkGroup(WorkGroup wg) {
		return (WorkGroup) this.em.merge(wg);
	}

	@SuppressWarnings("unchecked")
	public VPResource findResourceByUserId(int syUserId) {
		List<VPResource> found = null;

		Query query = this.em.createNamedQuery("Resource.findResourceByUserId");
		query.setParameter("syUserId", Integer.valueOf(syUserId));
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (VPResource) found.get(0);
		if (found.isEmpty()) {
			return null;
		}

		List<VPResource> f = (List<VPResource>) found.stream().filter(fnd -> fnd.getActive().equals("Y"))
				.collect(Collectors.toList());
		if (f.size() == 1)
			return (VPResource) f.get(0);
		if (f.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	@SuppressWarnings("unchecked")
	public VPResource findResourceByName(String resourceName) {
		List<VPResource> found = null;

		Query query = this.em.createNamedQuery("Resource.findResourceByName");
		query.setParameter("resourceName", resourceName);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (VPResource) found.get(0);
		if (found.isEmpty()) {
			return null;
		}

		List<VPResource> f = (List<VPResource>) found.stream().filter(fnd -> fnd.getActive().equals("Y"))
				.collect(Collectors.toList());
		if (f.size() == 1)
			return (VPResource) f.get(0);
		if (f.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	@SuppressWarnings("unchecked")
	public List<Invoice> findApprovedInvoices() {
		List<Invoice> found = null;

		Query query = this.em.createNamedQuery("Invoice.findApproved");
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		return found;
	}

	@SuppressWarnings("unchecked")
	public List<InvoiceDetail> findInvoiceDetail(int invoiceId) {
		List<InvoiceDetail> found = null;

		Query query = this.em.createNamedQuery("InvoiceDetail.findDetailsByInvoiceId");
		query.setParameter("invoiceId", Integer.valueOf(invoiceId));
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		return found;
	}

	public Invoice updateInvoiceStatus(Invoice invoice) {
		return (Invoice) this.em.merge(invoice);
	}

	public InvoiceDetail updateInvoiceDetailStatus(InvoiceDetail invoiceDetail) {
		return (InvoiceDetail) this.em.merge(invoiceDetail);
	}

	@SuppressWarnings("unchecked")
	public Vendor findVendorById(int vendorId) {
		List<Vendor> found = null;

		Query query = this.em.createNamedQuery("Vendor.findVendorById");
		query.setParameter("vendorId", Integer.valueOf(vendorId));
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (Vendor) found.get(0);
		if (found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	@SuppressWarnings("unchecked")
	public Vendor findVendorByName(String name) {
		List<Vendor> found = null;

		Query query = this.em.createNamedQuery("Vendor.findVendorByName");
		query.setParameter("name", name);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (Vendor) found.get(0);
		if (found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	@SuppressWarnings("unchecked")
	public List<Invoice> findInvoicesForSync() {
		List<Invoice> found = null;

		Query query = this.em.createNamedQuery("Invoice.findInvoiceForSync");
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		return found;
	}

	@SuppressWarnings("unchecked")
	public Invoice findInvoiceById(int invoiceId) {
		List<Invoice> found = null;

		Query query = this.em.createNamedQuery("ApBatchTran.findByInvId");
		query.setParameter("invoiceId", Integer.valueOf(invoiceId));
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (Invoice) found.get(0);
		if (found == null || found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	@SuppressWarnings("unchecked")
	public List<WorkFlowTask> findCompletedWFTask() {
		List<WorkFlowTask> found = null;

		Query query = this.em.createNamedQuery("WorkFlowTask.findWFTaskByCOMP");

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
	public CurrentContractDate findCurrentContractDate() {
		List<CurrentContractDate> found = null;

		Query query = em.createNamedQuery("CurrentContractDate.findAll");
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (CurrentContractDate) found.get(0);
		if (found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

}
