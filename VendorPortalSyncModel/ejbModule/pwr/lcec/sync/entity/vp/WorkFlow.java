package pwr.lcec.sync.entity.vp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.OneToMany;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@Entity
@NamedQueries({ @NamedQuery(name = "WorkFlow.findAll", query = "SELECT w FROM WorkFlow w"),
		@NamedQuery(name = "WorkFlow.findWFByWO", query = "SELECT w FROM WorkFlow w WHERE w.workOrderId = :workOrderId"),
		@NamedQuery(name = "WorkFlow.findWFByWF", query = "SELECT w FROM WorkFlow w WHERE w.workFlowId = :workFlow") })
@NamedStoredProcedureQueries({
		@NamedStoredProcedureQuery(name = "UPDATE_WORKFLOW_CALC", procedureName = "UPDATE_WORKFLOW_CALC", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "IN_StakingSheetId"),
				@StoredProcedureParameter(mode = ParameterMode.IN, type = Timestamp.class, name = "IN_RateDate"),
				@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "IN_TypeFlag"),
				@StoredProcedureParameter(mode = ParameterMode.OUT, type = Integer.class, name = "OUT_Response") }) })
public class WorkFlow implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "WorkFlowId")
	private int workFlowId;
	@Column(name = "AccountId")
	private String accountId;
	@Column(name = "AssignedVendorId")
	private int assignedVendorId;
	@Column(name = "DesignCost")
	private BigDecimal designCost;
	@Column(name = "DesignTotalAssembly")
	private int designTotalAssembly;
	@Column(name = "DesignTotalStation")
	private int designTotalStation;
	@Column(name = "DesignUniqueAssembly")
	private int designUniqueAssembly;
	@Column(name = "InvoiceCost")
	private BigDecimal invoiceCost;
	@Column(name = "InvoiceTotalAssembly")
	private int invoiceTotalAssembly;
	@Column(name = "InvoiceTotalStation")
	private int invoiceTotalStation;
	@Column(name = "InvoiceUniqueAssembly")
	private int invoiceUniqueAssembly;
	@Column(name = "InvoiceVoucherCost")
	private BigDecimal invoiceVoucherCost;
	@Column(name = "InvoiceVoucherQty")
	private int invoiceVoucherQty;
	@Column(name = "InvoiceVoucherStation")
	private int invoiceVoucherStation;
	@Column(name = "NeededDt")
	private Timestamp neededDt;
	@Column(name = "OpenDt")
	private Timestamp openDt;
	@Column(name = "OverallAsBuiltStatusId")
	private int overallAsBuiltStatusId;
	@Column(name = "OverallInspectionStatusId")
	private int overallInspectionStatusId;
	@Column(name = "OverallInvoiceStatusId")
	private int overallInvoiceStatusId;
	@Column(name = "OverallPaymentStatusId")
	private String overallPaymentStatusId;
	@Column(name = "ResourceId")
	private int resourceId;
	@Column(name = "ResourceName")
	private String resourceName;
	@Column(name = "ServiceLocationId")
	private int serviceLocationId;
	@Column(name = "ServiceOrderId")
	private String serviceOrderId;
	@Column(name = "ServiceOrderPriority")
	private String serviceOrderPriority;
	@Column(name = "ServiceOrderType")
	private String serviceOrderType;
	private String WONotFound;
	@Column(name = "WorkEventDt")
	private Timestamp workEventDt;
	@Column(name = "WorkEventStatusId")
	private String workEventStatusId;
	@Column(name = "WorkGroup")
	private String workGroup;
	@Column(name = "WorkOrderId")
	private String workOrderId;
	@Column(name = "WorkOrderName")
	private String workOrderName;
	@OneToMany(mappedBy = "workFlow")
	private List<WorkFlowTask> workFlowTasks;

	public int getWorkFlowId() {
		return this.workFlowId;
	}

	public void setWorkFlowId(int workFlowId) {
		this.workFlowId = workFlowId;
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public int getAssignedVendorId() {
		return this.assignedVendorId;
	}

	public void setAssignedVendorId(int assignedVendorId) {
		this.assignedVendorId = assignedVendorId;
	}

	public BigDecimal getDesignCost() {
		return this.designCost;
	}

	public void setDesignCost(BigDecimal designCost) {
		this.designCost = designCost;
	}

	public int getDesignTotalAssembly() {
		return this.designTotalAssembly;
	}

	public void setDesignTotalAssembly(int designTotalAssembly) {
		this.designTotalAssembly = designTotalAssembly;
	}

	public int getDesignTotalStation() {
		return this.designTotalStation;
	}

	public void setDesignTotalStation(int designTotalStation) {
		this.designTotalStation = designTotalStation;
	}

	public int getDesignUniqueAssembly() {
		return this.designUniqueAssembly;
	}

	public void setDesignUniqueAssembly(int designUniqueAssembly) {
		this.designUniqueAssembly = designUniqueAssembly;
	}

	public BigDecimal getInvoiceCost() {
		return this.invoiceCost;
	}

	public void setInvoiceCost(BigDecimal invoiceCost) {
		this.invoiceCost = invoiceCost;
	}

	public int getInvoiceTotalAssembly() {
		return this.invoiceTotalAssembly;
	}

	public void setInvoiceTotalAssembly(int invoiceTotalAssembly) {
		this.invoiceTotalAssembly = invoiceTotalAssembly;
	}

	public int getInvoiceTotalStation() {
		return this.invoiceTotalStation;
	}

	public void setInvoiceTotalStation(int invoiceTotalStation) {
		this.invoiceTotalStation = invoiceTotalStation;
	}

	public int getInvoiceUniqueAssembly() {
		return this.invoiceUniqueAssembly;
	}

	public void setInvoiceUniqueAssembly(int invoiceUniqueAssembly) {
		this.invoiceUniqueAssembly = invoiceUniqueAssembly;
	}

	public BigDecimal getInvoiceVoucherCost() {
		return this.invoiceVoucherCost;
	}

	public void setInvoiceVoucherCost(BigDecimal invoiceVoucherCost) {
		this.invoiceVoucherCost = invoiceVoucherCost;
	}

	public int getInvoiceVoucherQty() {
		return this.invoiceVoucherQty;
	}

	public void setInvoiceVoucherQty(int invoiceVoucherQty) {
		this.invoiceVoucherQty = invoiceVoucherQty;
	}

	public int getInvoiceVoucherStation() {
		return this.invoiceVoucherStation;
	}

	public void setInvoiceVoucherStation(int invoiceVoucherStation) {
		this.invoiceVoucherStation = invoiceVoucherStation;
	}

	public Timestamp getNeededDt() {
		return this.neededDt;
	}

	public void setNeededDt(Timestamp neededDt) {
		this.neededDt = neededDt;
	}

	public Timestamp getOpenDt() {
		return this.openDt;
	}

	public void setOpenDt(Timestamp openDt) {
		this.openDt = openDt;
	}

	public int getOverallAsBuiltStatusId() {
		return this.overallAsBuiltStatusId;
	}

	public void setOverallAsBuiltStatusId(int overallAsBuiltStatusId) {
		this.overallAsBuiltStatusId = overallAsBuiltStatusId;
	}

	public int getOverallInspectionStatusId() {
		return this.overallInspectionStatusId;
	}

	public void setOverallInspectionStatusId(int overallInspectionStatusId) {
		this.overallInspectionStatusId = overallInspectionStatusId;
	}

	public int getOverallInvoiceStatusId() {
		return this.overallInvoiceStatusId;
	}

	public void setOverallInvoiceStatusId(int overallInvoiceStatusId) {
		this.overallInvoiceStatusId = overallInvoiceStatusId;
	}

	public String getOverallPaymentStatusId() {
		return this.overallPaymentStatusId;
	}

	public void setOverallPaymentStatusId(String overallPaymentStatusId) {
		this.overallPaymentStatusId = overallPaymentStatusId;
	}

	public int getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceName() {
		return this.resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public int getServiceLocationId() {
		return this.serviceLocationId;
	}

	public void setServiceLocationId(int serviceLocationId) {
		this.serviceLocationId = serviceLocationId;
	}

	public String getServiceOrderId() {
		return this.serviceOrderId;
	}

	public void setServiceOrderId(String serviceOrderId) {
		this.serviceOrderId = serviceOrderId;
	}

	public String getServiceOrderPriority() {
		return this.serviceOrderPriority;
	}

	public void setServiceOrderPriority(String serviceOrderPriority) {
		this.serviceOrderPriority = serviceOrderPriority;
	}

	public String getServiceOrderType() {
		return this.serviceOrderType;
	}

	public void setServiceOrderType(String serviceOrderType) {
		this.serviceOrderType = serviceOrderType;
	}

	public String getWONotFound() {
		return this.WONotFound;
	}

	public void setWONotFound(String WONotFound) {
		this.WONotFound = WONotFound;
	}

	public Timestamp getWorkEventDt() {
		return this.workEventDt;
	}

	public void setWorkEventDt(Timestamp workEventDt) {
		this.workEventDt = workEventDt;
	}

	public String getWorkEventStatusId() {
		return this.workEventStatusId;
	}

	public void setWorkEventStatusId(String workEventStatusId) {
		this.workEventStatusId = workEventStatusId;
	}

	public String getWorkGroup() {
		return this.workGroup;
	}

	public void setWorkGroup(String workGroup) {
		this.workGroup = workGroup;
	}

	public String getWorkOrderId() {
		return this.workOrderId;
	}

	public void setWorkOrderId(String workOrderId) {
		this.workOrderId = workOrderId;
	}

	public String getWorkOrderName() {
		return this.workOrderName;
	}

	public void setWorkOrderName(String workOrderName) {
		this.workOrderName = workOrderName;
	}

	public List<WorkFlowTask> getWorkFlowTasks() {
		return this.workFlowTasks;
	}

	public void setWorkFlowTasks(List<WorkFlowTask> workFlowTasks) {
		this.workFlowTasks = workFlowTasks;
	}

	public WorkFlowTask addWorkFlowTask(WorkFlowTask workFlowTask) {
		getWorkFlowTasks().add(workFlowTask);
		workFlowTask.setWorkFlow(this);

		return workFlowTask;
	}

	public WorkFlowTask removeWorkFlowTask(WorkFlowTask workFlowTask) {
		getWorkFlowTasks().remove(workFlowTask);
		workFlowTask.setWorkFlow(null);

		return workFlowTask;
	}
}
