package pwr.lcec.sync.entity.vp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "StakingSheetDetail.findAll", query = "SELECT s FROM StakingSheetDetail s"),
		@NamedQuery(name = "StakingSheetDetail.findStakingSheetDetailByCUID", query = "SELECT s FROM StakingSheetDetail s WHERE s.stakingSheetDetailId = :pointSpanCuSeqNo AND s.stakingSheetId = :stakingSheetId") })
public class StakingSheetDetail implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "StakingSheetDetailId")
	private String stakingSheetDetailId;
	@Column(name = "AsBuiltAmount")
	private BigDecimal asBuiltAmount;
	@Column(name = "AsBuiltBy")
	private String asBuiltBy;
	@Column(name = "AsBuiltComments")
	private String asBuiltComments;
	@Column(name = "AsBuiltDt")
	private Timestamp asBuiltDt;
	@Column(name = "AsBuiltQuantity")
	private int asBuiltQuantity;
	@Column(name = "AsBuiltStatusId")
	private int asBuiltStatusId;
	@Column(name = "AssemblyActionCode")
	private String assemblyActionCode;
	@Column(name = "AssemblyAmount")
	private BigDecimal assemblyAmount;
	@Column(name = "AssemblyCreatedDt")
	private Timestamp assemblyCreatedDt;
	@Column(name = "AssemblyDescription")
	private String assemblyDescription;
	@Column(name = "AssemblyGuid")
	private String assemblyGuid;
	@Column(name = "AssemblyModifiedDt")
	private Timestamp assemblyModifiedDt;
	@Column(name = "AssemblyQuantity")
	private int assemblyQuantity;
	@Column(name = "AssemblyRateGroupId")
	private int assemblyRateGroupId;
	@Column(name = "CurrentInspectedDetailBy")
	private String currentInspectedDetailBy;
	@Column(name = "CurrentInspectionDetailDt")
	private Timestamp currentInspectionDetailDt;
	@Column(name = "CurrentInspectionDetailId")
	private int currentInspectionDetailId;
	@Column(name = "CurrentInspectionDetailStatusId")
	private int currentInspectionDetailStatusId;
	@Column(name = "CurrentInspectorDetailComments")
	private String currentInspectorDetailComments;
	private Integer GL_AccountId;
	@Column(name = "InvoiceApprovedBy")
	private String invoiceApprovedBy;
	@Column(name = "InvoiceApprovedComment")
	private String invoiceApprovedComment;
	@Column(name = "InvoiceApprovedDt")
	private Timestamp invoiceApprovedDt;
	@Column(name = "InvoiceDetailId")
	private int invoiceDetailId;
	@Column(name = "InvoiceId")
	private Integer invoiceId;
	@Column(name = "InvoiceStatusId")
	private int invoiceStatusId;
	@Column(name = "InvoiceSubmitGuid")
	private String invoiceSubmitGuid;
	@Column(name = "LcecNotes")
	private String lcecNotes;
	@Column(name = "StakingSheetId")
	private int stakingSheetId;
	@Column(name = "StakingSource")
	private String stakingSource;
	@Column(name = "StationDescription")
	private String stationDescription;
	@Column(name = "StatusDescription")
	private String statusDescription;
	@Column(name = "StStatusRefGuid")
	private String stStatusRefGuid;

	public String getStakingSheetDetailId() {
		return this.stakingSheetDetailId;
	}

	public void setStakingSheetDetailId(String stakingSheetDetailId) {
		this.stakingSheetDetailId = stakingSheetDetailId;
	}

	public BigDecimal getAsBuiltAmount() {
		return this.asBuiltAmount;
	}

	public void setAsBuiltAmount(BigDecimal asBuiltAmount) {
		this.asBuiltAmount = asBuiltAmount;
	}

	public String getAsBuiltBy() {
		return this.asBuiltBy;
	}

	public void setAsBuiltBy(String asBuiltBy) {
		this.asBuiltBy = asBuiltBy;
	}

	public String getAsBuiltComments() {
		return this.asBuiltComments;
	}

	public void setAsBuiltComments(String asBuiltComments) {
		this.asBuiltComments = asBuiltComments;
	}

	public Timestamp getAsBuiltDt() {
		return this.asBuiltDt;
	}

	public void setAsBuiltDt(Timestamp asBuiltDt) {
		this.asBuiltDt = asBuiltDt;
	}

	public int getAsBuiltQuantity() {
		return this.asBuiltQuantity;
	}

	public void setAsBuiltQuantity(int asBuiltQuantity) {
		this.asBuiltQuantity = asBuiltQuantity;
	}

	public int getAsBuiltStatusId() {
		return this.asBuiltStatusId;
	}

	public void setAsBuiltStatusId(int asBuiltStatusId) {
		this.asBuiltStatusId = asBuiltStatusId;
	}

	public String getAssemblyActionCode() {
		return this.assemblyActionCode;
	}

	public void setAssemblyActionCode(String assemblyActionCode) {
		this.assemblyActionCode = assemblyActionCode;
	}

	public BigDecimal getAssemblyAmount() {
		return this.assemblyAmount;
	}

	public void setAssemblyAmount(BigDecimal assemblyAmount) {
		this.assemblyAmount = assemblyAmount;
	}

	public Timestamp getAssemblyCreatedDt() {
		return this.assemblyCreatedDt;
	}

	public void setAssemblyCreatedDt(Timestamp assemblyCreatedDt) {
		this.assemblyCreatedDt = assemblyCreatedDt;
	}

	public String getAssemblyDescription() {
		return this.assemblyDescription;
	}

	public void setAssemblyDescription(String assemblyDescription) {
		this.assemblyDescription = assemblyDescription;
	}

	public String getAssemblyGuid() {
		return this.assemblyGuid;
	}

	public void setAssemblyGuid(String assemblyGuid) {
		this.assemblyGuid = assemblyGuid;
	}

	public Timestamp getAssemblyModifiedDt() {
		return this.assemblyModifiedDt;
	}

	public void setAssemblyModifiedDt(Timestamp assemblyModifiedDt) {
		this.assemblyModifiedDt = assemblyModifiedDt;
	}

	public int getAssemblyQuantity() {
		return this.assemblyQuantity;
	}

	public void setAssemblyQuantity(int assemblyQuantity) {
		this.assemblyQuantity = assemblyQuantity;
	}

	public String getCurrentInspectedDetailBy() {
		return this.currentInspectedDetailBy;
	}

	public void setCurrentInspectedDetailBy(String currentInspectedDetailBy) {
		this.currentInspectedDetailBy = currentInspectedDetailBy;
	}

	public Timestamp getCurrentInspectionDetailDt() {
		return this.currentInspectionDetailDt;
	}

	public void setCurrentInspectionDetailDt(Timestamp currentInspectionDetailDt) {
		this.currentInspectionDetailDt = currentInspectionDetailDt;
	}

	public int getCurrentInspectionDetailId() {
		return this.currentInspectionDetailId;
	}

	public void setCurrentInspectionDetailId(int currentInspectionDetailId) {
		this.currentInspectionDetailId = currentInspectionDetailId;
	}

	public int getCurrentInspectionDetailStatusId() {
		return this.currentInspectionDetailStatusId;
	}

	public void setCurrentInspectionDetailStatusId(int currentInspectionDetailStatusId) {
		this.currentInspectionDetailStatusId = currentInspectionDetailStatusId;
	}

	public String getCurrentInspectorDetailComments() {
		return this.currentInspectorDetailComments;
	}

	public void setCurrentInspectorDetailComments(String currentInspectorDetailComments) {
		this.currentInspectorDetailComments = currentInspectorDetailComments;
	}

	public Integer getGL_AccountId() {
		return this.GL_AccountId;
	}

	public void setGL_AccountId(Integer GL_AccountId) {
		this.GL_AccountId = GL_AccountId;
	}

	public String getInvoiceApprovedBy() {
		return this.invoiceApprovedBy;
	}

	public void setInvoiceApprovedBy(String invoiceApprovedBy) {
		this.invoiceApprovedBy = invoiceApprovedBy;
	}

	public String getInvoiceApprovedComment() {
		return this.invoiceApprovedComment;
	}

	public void setInvoiceApprovedComment(String invoiceApprovedComment) {
		this.invoiceApprovedComment = invoiceApprovedComment;
	}

	public Timestamp getInvoiceApprovedDt() {
		return this.invoiceApprovedDt;
	}

	public void setInvoiceApprovedDt(Timestamp invoiceApprovedDt) {
		this.invoiceApprovedDt = invoiceApprovedDt;
	}

	public int getInvoiceDetailId() {
		return this.invoiceDetailId;
	}

	public void setInvoiceDetailId(int invoiceDetailId) {
		this.invoiceDetailId = invoiceDetailId;
	}

	public Integer getInvoiceId() {
		return this.invoiceId;
	}

	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
	}

	public int getInvoiceStatusId() {
		return this.invoiceStatusId;
	}

	public void setInvoiceStatusId(int invoiceStatusId) {
		this.invoiceStatusId = invoiceStatusId;
	}

	public String getInvoiceSubmitGuid() {
		return this.invoiceSubmitGuid;
	}

	public void setInvoiceSubmitGuid(String invoiceSubmitGuid) {
		this.invoiceSubmitGuid = invoiceSubmitGuid;
	}

	public String getLcecNotes() {
		return this.lcecNotes;
	}

	public void setLcecNotes(String lcecNotes) {
		this.lcecNotes = lcecNotes;
	}

	public String getStakingSource() {
		return this.stakingSource;
	}

	public void setStakingSource(String stakingSource) {
		this.stakingSource = stakingSource;
	}

	public String getStationDescription() {
		return this.stationDescription;
	}

	public void setStationDescription(String stationDescription) {
		this.stationDescription = stationDescription;
	}

	public String getStatusDescription() {
		return this.statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public String getStStatusRefGuid() {
		return this.stStatusRefGuid;
	}

	public void setStStatusRefGuid(String stStatusRefGuid) {
		this.stStatusRefGuid = stStatusRefGuid;
	}

	public int getAssemblyRateGroupId() {
		return this.assemblyRateGroupId;
	}

	public void setAssemblyRateGroupId(int assemblyRateGroupId) {
		this.assemblyRateGroupId = assemblyRateGroupId;
	}

	public int getStakingSheetId() {
		return this.stakingSheetId;
	}

	public void setStakingSheetId(int stakingSheetId) {
		this.stakingSheetId = stakingSheetId;
	}
}
