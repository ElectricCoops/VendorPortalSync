package pwr.lcec.sync.interfaces;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

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

@Remote
public interface VpWorkFlowRemote {
	
	public WorkFlow findWorkFlowByWorkOrder(String paramString);

	public WorkFlow findWorkFlowByWorkFlow(Integer paramInteger);

	public void updateWorkFlow(WorkFlow paramWorkFlow);

	public void insertWorkFlow(WorkFlow paramWorkFlow);

	public RateGroup findRateGroupByName(String paramString);

	public RateGroup mergeRateGroup(RateGroup paramRateGroup);

	public RateGroupPrice findRatePriceByCauGrp(String paramString, int paramInt, Date paramDate);

	public void mergeRateGroupPrice(RateGroupPrice paramRateGroupPrice);

	public StakingSheet mergeStakingSheet(StakingSheet paramStakingSheet);

	public void mergeWFTasks(WorkFlowTask paramWorkFlowTask);

	public StakingSheetDetail mergeStakingSheetDetail(StakingSheetDetail paramStakingSheetDetail);

	public ServiceOrder findServiceOrderById(String paramString);

	public ServiceOrder mergeServiceOrder(ServiceOrder paramServiceOrder);

	public List<TempWMISWorkRequest> findWRToSync();

	public void updateTempWmisWR(TempWMISWorkRequest paramTempWMISWorkRequest);

	public StakingSheet findStakingSheetByWF(int paramInt);

	public StakingSheetDetail findStakingSheetDetailByCUID(String paramString, int paramInt);

	public int updateWorkflowCalc(Integer paramInteger, Timestamp paramTimestamp, String paramString);

	public List<String> findSLTypes();

	public WorkEventStatus findWorkEvent(String paramString);

	public WorkEventStatus mergeWorkEvent(WorkEventStatus paramWorkEventStatus);

	public GLAccount findGLAccount(BigDecimal paramBigDecimal);

	public GLAccount mergeGLAccount(GLAccount paramGLAccount);

	public VPResource findResourceById(int paramInt);

	public VPResource findResourceByName(String paramString);

	public VPResource findResourceByUserId(int paramInt);

	public VPResource mergeResource(VPResource paramVPResource);

	public WorkGroup findWorkGroup(int paramInt, String paramString);

	public WorkGroup mergeWorkGroup(WorkGroup paramWorkGroup);

	public List<Invoice> findApprovedInvoices();

	public List<InvoiceDetail> findInvoiceDetail(int paramInt);

	public Invoice updateInvoiceStatus(Invoice paramInvoice);

	public InvoiceDetail updateInvoiceDetailStatus(InvoiceDetail paramInvoiceDetail);

	public Vendor findVendorById(int paramInt);

	public Vendor findVendorByName(String paramString);

	public List<Invoice> findInvoicesForSync();

	public Invoice findInvoiceById(int paramInt);

	public List<WorkFlowTask> findCompletedWFTask();
	
	public CurrentContractDate findCurrentContractDate();
	
}
