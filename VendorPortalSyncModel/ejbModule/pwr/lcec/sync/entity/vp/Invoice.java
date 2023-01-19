package pwr.lcec.sync.entity.vp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Invoice.findAll", query = "SELECT i FROM Invoice i"),
		@NamedQuery(name = "Invoice.findInvoiceById", query = "SELECT i FROM Invoice i WHERE i.invoiceId = :invoiceId"),
		@NamedQuery(name = "Invoice.findApproved", query = "SELECT i FROM Invoice i WHERE i.invoiceStatusId = 4"),
		@NamedQuery(name = "Invoice.findInvoiceForSync", query = "SELECT i FROM Invoice i WHERE i.invoiceStatusId IN (6,7,8,9,10) AND i.invoiceType = 'SS'")
})
public class Invoice implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "InvoiceId")
	private int invoiceId;
	@Column(name = "AP_INV_ID")
	private String apInvId;
	@Column(name = "ApprovedBy")
	private String approvedBy;
	@Column(name = "ApprovedComment")
	private String approvedComment;
	@Column(name = "ApprovedDt")
	private Timestamp approvedDt;
	@Column(name = "BusinessRuleFlg")
	private String businessRuleFlg;
	@Column(name = "DesignCost")
	private BigDecimal designCost;
	@Column(name = "DesignTotalAssembly")
	private int designTotalAssembly;
	@Column(name = "DesignTotalStation")
	private int designTotalStation;
	@Column(name = "DesignUniqueAssembly")
	private int designUniqueAssembly;
	@Column(name = "InvoiceAmount")
	private BigDecimal invoiceAmount;
	@Column(name = "InvoicedBy")
	private String invoicedBy;
	@Column(name = "InvoicedDt")
	private Timestamp invoicedDt;
	@Column(name = "InvoiceStatusId")
	private int invoiceStatusId;
	@Column(name = "InvoiceTotalAssembly")
	private int invoiceTotalAssembly;
	@Column(name = "InvoiceTotalStation")
	private int invoiceTotalStation;
	@Column(name = "InvoiceType")
	private String invoiceType;
	@Column(name = "InvoiceUniqueAssembly")
	private int invoiceUniqueAssembly;
	@Column(name = "InvoiceVoucherCost")
	private BigDecimal invoiceVoucherCost;
	@Column(name = "InvoiceVoucherQty")
	private int invoiceVoucherQty;
	@Column(name = "PaymentDt")
	private Timestamp paymentDt;
	@Column(name = "PaymentStatus")
	private String paymentStatus;
	@Column(name = "ServiceOrderId")
	private String serviceOrderId;
	@Column(name = "VendorId")
	private int vendorId;
	@Column(name = "VendorReference")
	private String vendorReference;
	@Column(name = "WorkFlowId")
	private String workFlowId;
	@Column(name = "WorkOrderId")
	private String workOrderId;

	public int getInvoiceId() {
		return this.invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getApInvId() {
		return this.apInvId;
	}

	public void setApInvId(String apInvId) {
		this.apInvId = apInvId;
	}

	public String getApprovedBy() {
		return this.approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public String getApprovedComment() {
		return this.approvedComment;
	}

	public void setApprovedComment(String approvedComment) {
		this.approvedComment = approvedComment;
	}

	public Timestamp getApprovedDt() {
		return this.approvedDt;
	}

	public void setApprovedDt(Timestamp approvedDt) {
		this.approvedDt = approvedDt;
	}

	public String getBusinessRuleFlg() {
		return this.businessRuleFlg;
	}

	public void setBusinessRuleFlg(String businessRuleFlg) {
		this.businessRuleFlg = businessRuleFlg;
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

	public BigDecimal getInvoiceAmount() {
		return this.invoiceAmount;
	}

	public void setInvoiceAmount(BigDecimal invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getInvoicedBy() {
		return this.invoicedBy;
	}

	public void setInvoicedBy(String invoicedBy) {
		this.invoicedBy = invoicedBy;
	}

	public Timestamp getInvoicedDt() {
		return this.invoicedDt;
	}

	public void setInvoicedDt(Timestamp invoicedDt) {
		this.invoicedDt = invoicedDt;
	}

	public int getInvoiceStatusId() {
		return this.invoiceStatusId;
	}

	public void setInvoiceStatusId(int invoiceStatusId) {
		this.invoiceStatusId = invoiceStatusId;
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

	public String getInvoiceType() {
		return this.invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
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

	public Timestamp getPaymentDt() {
		return this.paymentDt;
	}

	public void setPaymentDt(Timestamp paymentDt) {
		this.paymentDt = paymentDt;
	}

	public String getPaymentStatus() {
		return this.paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getServiceOrderId() {
		return this.serviceOrderId;
	}

	public void setServiceOrderId(String serviceOrderId) {
		this.serviceOrderId = serviceOrderId;
	}

	public int getVendorId() {
		return this.vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorReference() {
		return this.vendorReference;
	}

	public void setVendorReference(String vendorReference) {
		this.vendorReference = vendorReference;
	}

	public String getWorkFlowId() {
		return this.workFlowId;
	}

	public void setWorkFlowId(String workFlowId) {
		this.workFlowId = workFlowId;
	}

	public String getWorkOrderId() {
		return this.workOrderId;
	}

	public void setWorkOrderId(String workOrderId) {
		this.workOrderId = workOrderId;
	}
}
