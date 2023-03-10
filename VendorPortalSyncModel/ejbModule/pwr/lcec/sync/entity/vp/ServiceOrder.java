package pwr.lcec.sync.entity.vp;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "ServiceOrder.findAll", query = "SELECT s FROM ServiceOrder s"),
		@NamedQuery(name = "ServiceOrder.findServiceOrderById", query = "SELECT s FROM ServiceOrder s WHERE s.serviceOrderId = :serviceOrderId") })
public class ServiceOrder implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ServiceOrderId")
	private String serviceOrderId;
	@Column(name = "EnterTypeCode")
	private String enterTypeCode;
	@Column(name = "InspectedBy")
	private String inspectedBy;
	@Column(name = "InspectedComment")
	private String inspectedComment;
	@Column(name = "InspectedDt")
	private Timestamp inspectedDt;
	@Column(name = "InspectionId")
	private Integer inspectionId;
	@Column(name = "InspectionStatusId")
	private int inspectionStatusId;
	@Column(name = "InvoiceApprovedBy")
	private String invoiceApprovedBy;
	@Column(name = "InvoiceApprovedComments")
	private String invoiceApprovedComments;
	@Column(name = "InvoiceApprovedDt")
	private Timestamp invoiceApprovedDt;
	@Column(name = "InvoiceDetailId")
	private Integer invoiceDetailId;
	@Column(name = "InvoiceId")
	private Integer invoiceId;
	@Column(name = "InvoiceStatusId")
	private Integer invoiceStatusId;
	@Column(name = "InvoiceSubmitGuid")
	private String invoiceSubmitGuid;
	@Column(name = "NeededDt")
	private Timestamp neededDt;
	@Column(name = "OpenDt")
	private Timestamp openDt;
	@Column(name = "Quantity")
	private int quantity;
	@Column(name = "ServiceAddress")
	private String serviceAddress;
	@Column(name = "ServiceCity")
	private String serviceCity;
	@Column(name = "ServiceDesc")
	private String serviceDesc;
	@Column(name = "ServiceLocationId")
	private int serviceLocationId;
	@Column(name = "ServiceMapLocation")
	private String serviceMapLocation;
	@Column(name = "Servicezip")
	private String servicezip;
	@Column(name = "SoCloseDt")
	private Timestamp soCloseDt;
	@Column(name = "SoComments")
	private String soComments;
	@Column(name = "SoCrewId")
	private String soCrewId;
	@Column(name = "SoDescription")
	private String soDescription;
	@Column(name = "SoFullName")
	private String soFullName;
	@Column(name = "SoFunction")
	private String soFunction;
	@Column(name = "SoStatCode")
	private String soStatCode;
	@Column(name = "SoTypeCode")
	private String soTypeCode;
	@Column(name = "SoTypeCodeDescription")
	private String soTypeCodeDescription;
	@Column(name = "StakingSheetId")
	private Integer stakingSheetId;
	@Column(name = "UserName")
	private String userName;
	@Column(name = "WorkFlowId")
	private int workFlowId;
	@Column(name = "WorkOrderId")
	private String workOrderId;

	public String getServiceOrderId() {
		return this.serviceOrderId;
	}

	public void setServiceOrderId(String serviceOrderId) {
		this.serviceOrderId = serviceOrderId;
	}

	public String getEnterTypeCode() {
		return this.enterTypeCode;
	}

	public void setEnterTypeCode(String enterTypeCode) {
		this.enterTypeCode = enterTypeCode;
	}

	public String getInspectedBy() {
		return this.inspectedBy;
	}

	public void setInspectedBy(String inspectedBy) {
		this.inspectedBy = inspectedBy;
	}

	public String getInspectedComment() {
		return this.inspectedComment;
	}

	public void setInspectedComment(String inspectedComment) {
		this.inspectedComment = inspectedComment;
	}

	public Timestamp getInspectedDt() {
		return this.inspectedDt;
	}

	public void setInspectedDt(Timestamp inspectedDt) {
		this.inspectedDt = inspectedDt;
	}

	public Integer getInspectionId() {
		return this.inspectionId;
	}

	public void setInspectionId(Integer inspectionId) {
		this.inspectionId = inspectionId;
	}

	public int getInspectionStatusId() {
		return this.inspectionStatusId;
	}

	public void setInspectionStatusId(int inspectionStatusId) {
		this.inspectionStatusId = inspectionStatusId;
	}

	public String getInvoiceApprovedBy() {
		return this.invoiceApprovedBy;
	}

	public void setInvoiceApprovedBy(String invoiceApprovedBy) {
		this.invoiceApprovedBy = invoiceApprovedBy;
	}

	public String getInvoiceApprovedComments() {
		return this.invoiceApprovedComments;
	}

	public void setInvoiceApprovedComments(String invoiceApprovedComments) {
		this.invoiceApprovedComments = invoiceApprovedComments;
	}

	public Timestamp getInvoiceApprovedDt() {
		return this.invoiceApprovedDt;
	}

	public void setInvoiceApprovedDt(Timestamp invoiceApprovedDt) {
		this.invoiceApprovedDt = invoiceApprovedDt;
	}

	public Integer getInvoiceDetailId() {
		return this.invoiceDetailId;
	}

	public void setInvoiceDetailId(Integer invoiceDetailId) {
		this.invoiceDetailId = invoiceDetailId;
	}

	public Integer getInvoiceId() {
		return this.invoiceId;
	}

	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Integer getInvoiceStatusId() {
		return this.invoiceStatusId;
	}

	public void setInvoiceStatusId(Integer invoiceStatusId) {
		this.invoiceStatusId = invoiceStatusId;
	}

	public String getInvoiceSubmitGuid() {
		return this.invoiceSubmitGuid;
	}

	public void setInvoiceSubmitGuid(String invoiceSubmitGuid) {
		this.invoiceSubmitGuid = invoiceSubmitGuid;
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

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getServiceAddress() {
		return this.serviceAddress;
	}

	public void setServiceAddress(String serviceAddress) {
		this.serviceAddress = serviceAddress;
	}

	public String getServiceCity() {
		return this.serviceCity;
	}

	public void setServiceCity(String serviceCity) {
		this.serviceCity = serviceCity;
	}

	public String getServiceDesc() {
		return this.serviceDesc;
	}

	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}

	public int getServiceLocationId() {
		return this.serviceLocationId;
	}

	public void setServiceLocationId(int serviceLocationId) {
		this.serviceLocationId = serviceLocationId;
	}

	public String getServiceMapLocation() {
		return this.serviceMapLocation;
	}

	public void setServiceMapLocation(String serviceMapLocation) {
		this.serviceMapLocation = serviceMapLocation;
	}

	public String getServicezip() {
		return this.servicezip;
	}

	public void setServicezip(String servicezip) {
		this.servicezip = servicezip;
	}

	public Timestamp getSoCloseDt() {
		return this.soCloseDt;
	}

	public void setSoCloseDt(Timestamp soCloseDt) {
		this.soCloseDt = soCloseDt;
	}

	public String getSoComments() {
		return this.soComments;
	}

	public void setSoComments(String soComments) {
		this.soComments = soComments;
	}

	public String getSoCrewId() {
		return this.soCrewId;
	}

	public void setSoCrewId(String soCrewId) {
		this.soCrewId = soCrewId;
	}

	public String getSoDescription() {
		return this.soDescription;
	}

	public void setSoDescription(String soDescription) {
		this.soDescription = soDescription;
	}

	public String getSoFullName() {
		return this.soFullName;
	}

	public void setSoFullName(String soFullName) {
		this.soFullName = soFullName;
	}

	public String getSoFunction() {
		return this.soFunction;
	}

	public void setSoFunction(String soFunction) {
		this.soFunction = soFunction;
	}

	public String getSoStatCode() {
		return this.soStatCode;
	}

	public void setSoStatCode(String soStatCode) {
		this.soStatCode = soStatCode;
	}

	public String getSoTypeCode() {
		return this.soTypeCode;
	}

	public void setSoTypeCode(String soTypeCode) {
		this.soTypeCode = soTypeCode;
	}

	public String getSoTypeCodeDescription() {
		return this.soTypeCodeDescription;
	}

	public void setSoTypeCodeDescription(String soTypeCodeDescription) {
		this.soTypeCodeDescription = soTypeCodeDescription;
	}

	public Integer getStakingSheetId() {
		return this.stakingSheetId;
	}

	public void setStakingSheetId(Integer stakingSheetId) {
		this.stakingSheetId = stakingSheetId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getWorkFlowId() {
		return this.workFlowId;
	}

	public void setWorkFlowId(int workFlowId) {
		this.workFlowId = workFlowId;
	}

	public String getWorkOrderId() {
		return this.workOrderId;
	}

	public void setWorkOrderId(String workOrderId) {
		this.workOrderId = workOrderId;
	}
}
