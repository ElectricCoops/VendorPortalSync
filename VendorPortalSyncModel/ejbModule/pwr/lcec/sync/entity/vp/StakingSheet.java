package pwr.lcec.sync.entity.vp;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "StakingSheet.findAll", query = "SELECT s FROM StakingSheet s"),
		@NamedQuery(name = "StakingSheet.findStakingSheetByWF", query = "SELECT s FROM StakingSheet s WHERE s.workFlowId = :workFlowId") })
public class StakingSheet implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "StakingSheetId")
	private int stakingSheetId;
	@Column(name = "ServiceOrderId")
	private String serviceOrderId;
	@Column(name = "StServiceAddress")
	private String stServiceAddress;
	@Column(name = "StServiceAddressCity")
	private String stServiceAddressCity;
	@Column(name = "StServiceAddressPhone")
	private String stServiceAddressPhone;
	@Column(name = "StServiceName")
	private String stServiceName;
	@Column(name = "StServiceZip")
	private String stServiceZip;
	@Column(name = "WorkOrderComments")
	private String workOrderComments;
	@Column(name = "WorkOrderDescription")
	private String workOrderDescription;
	@Column(name = "WorkOrderGuid")
	private String workOrderGuid;
	@Column(name = "WorkOrderId")
	private String workOrderId;
	@Column(name = "WorkOrderTypeCode")
	private String workOrderTypeCode;
	@Column(name = "WorkFlowId")
	private int workFlowId;

	public int getStakingSheetId() {
		return this.stakingSheetId;
	}

	public void setStakingSheetId(int stakingSheetId) {
		this.stakingSheetId = stakingSheetId;
	}

	public String getServiceOrderId() {
		return this.serviceOrderId;
	}

	public void setServiceOrderId(String serviceOrderId) {
		this.serviceOrderId = serviceOrderId;
	}

	public String getStServiceAddress() {
		return this.stServiceAddress;
	}

	public void setStServiceAddress(String stServiceAddress) {
		this.stServiceAddress = stServiceAddress;
	}

	public String getStServiceAddressCity() {
		return this.stServiceAddressCity;
	}

	public void setStServiceAddressCity(String stServiceAddressCity) {
		this.stServiceAddressCity = stServiceAddressCity;
	}

	public String getStServiceAddressPhone() {
		return this.stServiceAddressPhone;
	}

	public void setStServiceAddressPhone(String stServiceAddressPhone) {
		this.stServiceAddressPhone = stServiceAddressPhone;
	}

	public String getStServiceName() {
		return this.stServiceName;
	}

	public void setStServiceName(String stServiceName) {
		this.stServiceName = stServiceName;
	}

	public String getStServiceZip() {
		return this.stServiceZip;
	}

	public void setStServiceZip(String stServiceZip) {
		this.stServiceZip = stServiceZip;
	}

	public String getWorkOrderComments() {
		return this.workOrderComments;
	}

	public void setWorkOrderComments(String workOrderComments) {
		this.workOrderComments = workOrderComments;
	}

	public String getWorkOrderDescription() {
		return this.workOrderDescription;
	}

	public void setWorkOrderDescription(String workOrderDescription) {
		this.workOrderDescription = workOrderDescription;
	}

	public String getWorkOrderGuid() {
		return this.workOrderGuid;
	}

	public void setWorkOrderGuid(String workOrderGuid) {
		this.workOrderGuid = workOrderGuid;
	}

	public String getWorkOrderId() {
		return this.workOrderId;
	}

	public void setWorkOrderId(String workOrderId) {
		this.workOrderId = workOrderId;
	}

	public String getWorkOrderTypeCode() {
		return this.workOrderTypeCode;
	}

	public void setWorkOrderTypeCode(String workOrderTypeCode) {
		this.workOrderTypeCode = workOrderTypeCode;
	}

	public int getWorkFlowId() {
		return this.workFlowId;
	}

	public void setWorkFlowId(int workFlowId) {
		this.workFlowId = workFlowId;
	}
}
