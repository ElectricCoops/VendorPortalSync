package pwr.lcec.sync.entity.gis;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "ST_WORKORDER_REF")
@NamedQuery(name = "StWorkorderRef.findAll", query = "SELECT s FROM StWorkorderRef s")
public class StWorkorderRef implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "OBJECTID")
	private int objectid;
	@Column(name = "gs_date_created")
	private Timestamp gsDateCreated;
	@Column(name = "gs_date_modified")
	private Timestamp gsDateModified;
	@Column(name = "gs_guid")
	private String gsGuid;
	@Column(name = "gs_phase")
	private String gsPhase;
	@Column(name = "gs_reference_scale")
	private BigDecimal gsReferenceScale;
	@Column(name = "gs_shape_from_gps_sw")
	private String gsShapeFromGpsSw;
	@Column(name = "gs_vc_modified_sw")
	private String gsVcModifiedSw;
	@Column(name = "gs_vc_revision")
	private int gsVcRevision;
	@Column(name = "SHAPE")
	private byte[] shape;
	@Column(name = "st_accounting_code")
	private String stAccountingCode;
	@Column(name = "st_action_code")
	private String stActionCode;
	@Column(name = "st_activity_code")
	private String stActivityCode;
	@Column(name = "st_aid_to_construct")
	private String stAidToConstruct;
	@Column(name = "st_bi_cust_id")
	private String stBiCustId;
	@Column(name = "st_budget_code")
	private String stBudgetCode;
	@Column(name = "st_call_before_dig")
	private String stCallBeforeDig;
	@Column(name = "st_cfms_plant_code")
	private String stCfmsPlantCode;
	@Column(name = "st_checked_auth_by")
	private String stCheckedAuthBy;
	@Column(name = "st_contractor_code")
	private String stContractorCode;
	@Column(name = "st_county_ref_guid")
	private String stCountyRefGuid;
	@Column(name = "st_crew")
	private String stCrew;
	@Column(name = "st_department")
	private String stDepartment;
	@Column(name = "st_design_code")
	private String stDesignCode;
	@Column(name = "st_easement_num")
	private String stEasementNum;
	@Column(name = "st_engineering_line_num")
	private String stEngineeringLineNum;
	@Column(name = "st_export_to_abs_date")
	private Timestamp stExportToAbsDate;
	@Column(name = "st_feeder_name")
	private String stFeederName;
	@Column(name = "st_feeder_ref_guid")
	private String stFeederRefGuid;
	@Column(name = "st_group_number")
	private String stGroupNumber;
	@Column(name = "st_ivue_seq_num")
	private String stIvueSeqNum;
	@Column(name = "st_job_project_num")
	private String stJobProjectNum;
	@Column(name = "st_labor_category")
	private String stLaborCategory;
	@Column(name = "st_line_section_number")
	private String stLineSectionNumber;
	@Column(name = "st_loan_project")
	private String stLoanProject;
	@Column(name = "st_loan_project_ext")
	private String stLoanProjectExt;
	@Column(name = "st_map_location")
	private String stMapLocation;
	@Column(name = "st_map_range")
	private String stMapRange;
	@Column(name = "st_map_section")
	private String stMapSection;
	@Column(name = "st_map_township")
	private String stMapTownship;
	@Column(name = "st_maximum_aid_to_construct")
	private BigDecimal stMaximumAidToConstruct;
	@Column(name = "st_membership_comment")
	private String stMembershipComment;
	@Column(name = "st_minimum_aid_to_construct")
	private BigDecimal stMinimumAidToConstruct;
	@Column(name = "st_multispeak_objectid")
	private String stMultispeakStringid;
	@Column(name = "st_permits_comment")
	private String stPermitsComment;
	@Column(name = "st_pick_list_id")
	private String stPickListId;
	@Column(name = "st_rate_group_code")
	private String stRateGroupCode;
	@Column(name = "st_rea_loan_year")
	private String stReaLoanYear;
	@Column(name = "st_released_by_date")
	private Timestamp stReleasedByDate;
	@Column(name = "st_released_by_user")
	private String stReleasedByUser;
	@Column(name = "st_rus_construct_acct")
	private String stRusConstructAcct;
	@Column(name = "st_rus_retirement_acct")
	private String stRusRetirementAcct;
	@Column(name = "st_service_addr_1")
	private String stServiceAddr1;
	@Column(name = "st_service_addr_2")
	private String stServiceAddr2;
	@Column(name = "st_service_addr_3")
	private String stServiceAddr3;
	@Column(name = "st_service_addr_city")
	private String stServiceAddrCity;
	@Column(name = "st_service_addr_phone")
	private String stServiceAddrPhone;
	@Column(name = "st_service_addr_phone_2")
	private String stServiceAddrPhone2;
	@Column(name = "st_service_addr_state")
	private String stServiceAddrState;
	@Column(name = "st_service_addr_zip")
	private String stServiceAddrZip;
	@Column(name = "st_service_directions")
	private String stServiceDirections;
	@Column(name = "st_service_name")
	private String stServiceName;
	@Column(name = "st_so_comments")
	private String stSoComments;
	@Column(name = "st_so_num")
	private String stSoNum;
	@Column(name = "st_status_ref_guid")
	private String stStatusRefGuid;
	@Column(name = "st_substation_name")
	private String stSubstationName;
	@Column(name = "st_substation_ref_guid")
	private String stSubstationRefGuid;
	@Column(name = "st_tax_district")
	private String stTaxDistrict;
	@Column(name = "st_warehouse_location")
	private String stWarehouseLocation;
	@Column(name = "st_wo_abandoned_by_user")
	private String stWoAbandonedByUser;
	@Column(name = "st_wo_abandoned_date")
	private Timestamp stWoAbandonedDate;
	@Column(name = "st_wo_abandoned_reason")
	private String stWoAbandonedReason;
	@Column(name = "st_wo_as_built_date")
	private Timestamp stWoAsBuiltDate;
	@Column(name = "st_wo_close_date")
	private Timestamp stWoCloseDate;
	@Column(name = "st_wo_comment")
	private String stWoComment;
	@Column(name = "st_wo_completed_by_user")
	private String stWoCompletedByUser;
	@Column(name = "st_wo_completed_date")
	private Timestamp stWoCompletedDate;
	@Column(name = "st_wo_created_date")
	private Timestamp stWoCreatedDate;
	@Column(name = "st_wo_description")
	private String stWoDescription;
	@Column(name = "st_wo_eng_review_date")
	private Timestamp stWoEngReviewDate;
	@Column(name = "st_wo_eng_reviewed_by_user")
	private String stWoEngReviewedByUser;
	@Column(name = "st_wo_estimate_date")
	private Timestamp stWoEstimateDate;
	@Column(name = "st_wo_estimated_by_user")
	private String stWoEstimatedByUser;
	@Column(name = "st_wo_group_code")
	private String stWoGroupCode;
	@Column(name = "st_wo_image_path")
	private String stWoImagePath;
	@Column(name = "st_wo_is_archived")
	private String stWoIsArchived;
	@Column(name = "st_wo_is_dmg_assessmnt")
	private String stWoIsDmgAssessmnt;
	@Column(name = "st_wo_is_estimate")
	private String stWoIsEstimate;
	@Column(name = "st_wo_is_upload_header_only")
	private String stWoIsUploadHeaderOnly;
	@Column(name = "st_wo_labor_completed_by")
	private String stWoLaborCompletedBy;
	@Column(name = "st_wo_labor_completed_date")
	private Timestamp stWoLaborCompletedDate;
	@Column(name = "st_wo_mapping_state_code")
	private int stWoMappingStateCode;
	@Column(name = "st_wo_mat_completed_by")
	private String stWoMatCompletedBy;
	@Column(name = "st_wo_material_completed_date")
	private Timestamp stWoMaterialCompletedDate;
	@Column(name = "st_wo_mi_location")
	private String stWoMiLocation;
	@Column(name = "st_wo_number")
	private String stWoNumber;
	@Column(name = "st_wo_process_date")
	private Timestamp stWoProcessDate;
	@Column(name = "st_wo_processed_by_user")
	private String stWoProcessedByUser;
	@Column(name = "st_wo_staked_by_user")
	private String stWoStakedByUser;
	@Column(name = "st_wo_staked_date")
	private Timestamp stWoStakedDate;
	@Column(name = "st_wo_start_date")
	private Timestamp stWoStartDate;
	@Column(name = "st_wo_type_code")
	private String stWoTypeCode;
	@Column(name = "st_workplan_loan_design")
	private String stWorkplanLoanDesign;

	public Timestamp getGsDateCreated() {
		return this.gsDateCreated;
	}

	public void setGsDateCreated(Timestamp gsDateCreated) {
		this.gsDateCreated = gsDateCreated;
	}

	public Timestamp getGsDateModified() {
		return this.gsDateModified;
	}

	public void setGsDateModified(Timestamp gsDateModified) {
		this.gsDateModified = gsDateModified;
	}

	public String getGsGuid() {
		return this.gsGuid;
	}

	public void setGsGuid(String gsGuid) {
		this.gsGuid = gsGuid;
	}

	public String getGsPhase() {
		return this.gsPhase;
	}

	public void setGsPhase(String gsPhase) {
		this.gsPhase = gsPhase;
	}

	public BigDecimal getGsReferenceScale() {
		return this.gsReferenceScale;
	}

	public void setGsReferenceScale(BigDecimal gsReferenceScale) {
		this.gsReferenceScale = gsReferenceScale;
	}

	public String getGsShapeFromGpsSw() {
		return this.gsShapeFromGpsSw;
	}

	public void setGsShapeFromGpsSw(String gsShapeFromGpsSw) {
		this.gsShapeFromGpsSw = gsShapeFromGpsSw;
	}

	public String getGsVcModifiedSw() {
		return this.gsVcModifiedSw;
	}

	public void setGsVcModifiedSw(String gsVcModifiedSw) {
		this.gsVcModifiedSw = gsVcModifiedSw;
	}

	public int getGsVcRevision() {
		return this.gsVcRevision;
	}

	public void setGsVcRevision(int gsVcRevision) {
		this.gsVcRevision = gsVcRevision;
	}

	public byte[] getShape() {
		return this.shape;
	}

	public void setShape(byte[] shape) {
		this.shape = shape;
	}

	public String getStAccountingCode() {
		return this.stAccountingCode;
	}

	public void setStAccountingCode(String stAccountingCode) {
		this.stAccountingCode = stAccountingCode;
	}

	public String getStActionCode() {
		return this.stActionCode;
	}

	public void setStActionCode(String stActionCode) {
		this.stActionCode = stActionCode;
	}

	public String getStActivityCode() {
		return this.stActivityCode;
	}

	public void setStActivityCode(String stActivityCode) {
		this.stActivityCode = stActivityCode;
	}

	public String getStAidToConstruct() {
		return this.stAidToConstruct;
	}

	public void setStAidToConstruct(String stAidToConstruct) {
		this.stAidToConstruct = stAidToConstruct;
	}

	public String getStBiCustId() {
		return this.stBiCustId;
	}

	public void setStBiCustId(String stBiCustId) {
		this.stBiCustId = stBiCustId;
	}

	public String getStBudgetCode() {
		return this.stBudgetCode;
	}

	public void setStBudgetCode(String stBudgetCode) {
		this.stBudgetCode = stBudgetCode;
	}

	public String getStCallBeforeDig() {
		return this.stCallBeforeDig;
	}

	public void setStCallBeforeDig(String stCallBeforeDig) {
		this.stCallBeforeDig = stCallBeforeDig;
	}

	public String getStCfmsPlantCode() {
		return this.stCfmsPlantCode;
	}

	public void setStCfmsPlantCode(String stCfmsPlantCode) {
		this.stCfmsPlantCode = stCfmsPlantCode;
	}

	public String getStCheckedAuthBy() {
		return this.stCheckedAuthBy;
	}

	public void setStCheckedAuthBy(String stCheckedAuthBy) {
		this.stCheckedAuthBy = stCheckedAuthBy;
	}

	public String getStContractorCode() {
		return this.stContractorCode;
	}

	public void setStContractorCode(String stContractorCode) {
		this.stContractorCode = stContractorCode;
	}

	public String getStCountyRefGuid() {
		return this.stCountyRefGuid;
	}

	public void setStCountyRefGuid(String stCountyRefGuid) {
		this.stCountyRefGuid = stCountyRefGuid;
	}

	public String getStCrew() {
		return this.stCrew;
	}

	public void setStCrew(String stCrew) {
		this.stCrew = stCrew;
	}

	public String getStDepartment() {
		return this.stDepartment;
	}

	public void setStDepartment(String stDepartment) {
		this.stDepartment = stDepartment;
	}

	public String getStDesignCode() {
		return this.stDesignCode;
	}

	public void setStDesignCode(String stDesignCode) {
		this.stDesignCode = stDesignCode;
	}

	public String getStEasementNum() {
		return this.stEasementNum;
	}

	public void setStEasementNum(String stEasementNum) {
		this.stEasementNum = stEasementNum;
	}

	public String getStEngineeringLineNum() {
		return this.stEngineeringLineNum;
	}

	public void setStEngineeringLineNum(String stEngineeringLineNum) {
		this.stEngineeringLineNum = stEngineeringLineNum;
	}

	public Timestamp getStExportToAbsDate() {
		return this.stExportToAbsDate;
	}

	public void setStExportToAbsDate(Timestamp stExportToAbsDate) {
		this.stExportToAbsDate = stExportToAbsDate;
	}

	public String getStFeederName() {
		return this.stFeederName;
	}

	public void setStFeederName(String stFeederName) {
		this.stFeederName = stFeederName;
	}

	public String getStFeederRefGuid() {
		return this.stFeederRefGuid;
	}

	public void setStFeederRefGuid(String stFeederRefGuid) {
		this.stFeederRefGuid = stFeederRefGuid;
	}

	public String getStGroupNumber() {
		return this.stGroupNumber;
	}

	public void setStGroupNumber(String stGroupNumber) {
		this.stGroupNumber = stGroupNumber;
	}

	public String getStIvueSeqNum() {
		return this.stIvueSeqNum;
	}

	public void setStIvueSeqNum(String stIvueSeqNum) {
		this.stIvueSeqNum = stIvueSeqNum;
	}

	public String getStJobProjectNum() {
		return this.stJobProjectNum;
	}

	public void setStJobProjectNum(String stJobProjectNum) {
		this.stJobProjectNum = stJobProjectNum;
	}

	public String getStLaborCategory() {
		return this.stLaborCategory;
	}

	public void setStLaborCategory(String stLaborCategory) {
		this.stLaborCategory = stLaborCategory;
	}

	public String getStLineSectionNumber() {
		return this.stLineSectionNumber;
	}

	public void setStLineSectionNumber(String stLineSectionNumber) {
		this.stLineSectionNumber = stLineSectionNumber;
	}

	public String getStLoanProject() {
		return this.stLoanProject;
	}

	public void setStLoanProject(String stLoanProject) {
		this.stLoanProject = stLoanProject;
	}

	public String getStLoanProjectExt() {
		return this.stLoanProjectExt;
	}

	public void setStLoanProjectExt(String stLoanProjectExt) {
		this.stLoanProjectExt = stLoanProjectExt;
	}

	public String getStMapLocation() {
		return this.stMapLocation;
	}

	public void setStMapLocation(String stMapLocation) {
		this.stMapLocation = stMapLocation;
	}

	public String getStMapRange() {
		return this.stMapRange;
	}

	public void setStMapRange(String stMapRange) {
		this.stMapRange = stMapRange;
	}

	public String getStMapSection() {
		return this.stMapSection;
	}

	public void setStMapSection(String stMapSection) {
		this.stMapSection = stMapSection;
	}

	public String getStMapTownship() {
		return this.stMapTownship;
	}

	public void setStMapTownship(String stMapTownship) {
		this.stMapTownship = stMapTownship;
	}

	public BigDecimal getStMaximumAidToConstruct() {
		return this.stMaximumAidToConstruct;
	}

	public void setStMaximumAidToConstruct(BigDecimal stMaximumAidToConstruct) {
		this.stMaximumAidToConstruct = stMaximumAidToConstruct;
	}

	public String getStMembershipComment() {
		return this.stMembershipComment;
	}

	public void setStMembershipComment(String stMembershipComment) {
		this.stMembershipComment = stMembershipComment;
	}

	public BigDecimal getStMinimumAidToConstruct() {
		return this.stMinimumAidToConstruct;
	}

	public void setStMinimumAidToConstruct(BigDecimal stMinimumAidToConstruct) {
		this.stMinimumAidToConstruct = stMinimumAidToConstruct;
	}

	public String getStMultispeakStringid() {
		return this.stMultispeakStringid;
	}

	public void setStMultispeakStringid(String stMultispeakStringid) {
		this.stMultispeakStringid = stMultispeakStringid;
	}

	public String getStPermitsComment() {
		return this.stPermitsComment;
	}

	public void setStPermitsComment(String stPermitsComment) {
		this.stPermitsComment = stPermitsComment;
	}

	public String getStPickListId() {
		return this.stPickListId;
	}

	public void setStPickListId(String stPickListId) {
		this.stPickListId = stPickListId;
	}

	public String getStRateGroupCode() {
		return this.stRateGroupCode;
	}

	public void setStRateGroupCode(String stRateGroupCode) {
		this.stRateGroupCode = stRateGroupCode;
	}

	public String getStReaLoanYear() {
		return this.stReaLoanYear;
	}

	public void setStReaLoanYear(String stReaLoanYear) {
		this.stReaLoanYear = stReaLoanYear;
	}

	public Timestamp getStReleasedByDate() {
		return this.stReleasedByDate;
	}

	public void setStReleasedByDate(Timestamp stReleasedByDate) {
		this.stReleasedByDate = stReleasedByDate;
	}

	public String getStReleasedByUser() {
		return this.stReleasedByUser;
	}

	public void setStReleasedByUser(String stReleasedByUser) {
		this.stReleasedByUser = stReleasedByUser;
	}

	public String getStRusConstructAcct() {
		return this.stRusConstructAcct;
	}

	public void setStRusConstructAcct(String stRusConstructAcct) {
		this.stRusConstructAcct = stRusConstructAcct;
	}

	public String getStRusRetirementAcct() {
		return this.stRusRetirementAcct;
	}

	public void setStRusRetirementAcct(String stRusRetirementAcct) {
		this.stRusRetirementAcct = stRusRetirementAcct;
	}

	public String getStServiceAddr1() {
		return this.stServiceAddr1;
	}

	public void setStServiceAddr1(String stServiceAddr1) {
		this.stServiceAddr1 = stServiceAddr1;
	}

	public String getStServiceAddr2() {
		return this.stServiceAddr2;
	}

	public void setStServiceAddr2(String stServiceAddr2) {
		this.stServiceAddr2 = stServiceAddr2;
	}

	public String getStServiceAddr3() {
		return this.stServiceAddr3;
	}

	public void setStServiceAddr3(String stServiceAddr3) {
		this.stServiceAddr3 = stServiceAddr3;
	}

	public String getStServiceAddrCity() {
		return this.stServiceAddrCity;
	}

	public void setStServiceAddrCity(String stServiceAddrCity) {
		this.stServiceAddrCity = stServiceAddrCity;
	}

	public String getStServiceAddrPhone() {
		return this.stServiceAddrPhone;
	}

	public void setStServiceAddrPhone(String stServiceAddrPhone) {
		this.stServiceAddrPhone = stServiceAddrPhone;
	}

	public String getStServiceAddrPhone2() {
		return this.stServiceAddrPhone2;
	}

	public void setStServiceAddrPhone2(String stServiceAddrPhone2) {
		this.stServiceAddrPhone2 = stServiceAddrPhone2;
	}

	public String getStServiceAddrState() {
		return this.stServiceAddrState;
	}

	public void setStServiceAddrState(String stServiceAddrState) {
		this.stServiceAddrState = stServiceAddrState;
	}

	public String getStServiceAddrZip() {
		return this.stServiceAddrZip;
	}

	public void setStServiceAddrZip(String stServiceAddrZip) {
		this.stServiceAddrZip = stServiceAddrZip;
	}

	public String getStServiceDirections() {
		return this.stServiceDirections;
	}

	public void setStServiceDirections(String stServiceDirections) {
		this.stServiceDirections = stServiceDirections;
	}

	public String getStServiceName() {
		return this.stServiceName;
	}

	public void setStServiceName(String stServiceName) {
		this.stServiceName = stServiceName;
	}

	public String getStSoComments() {
		return this.stSoComments;
	}

	public void setStSoComments(String stSoComments) {
		this.stSoComments = stSoComments;
	}

	public String getStSoNum() {
		return this.stSoNum;
	}

	public void setStSoNum(String stSoNum) {
		this.stSoNum = stSoNum;
	}

	public String getStSubstationName() {
		return this.stSubstationName;
	}

	public void setStSubstationName(String stSubstationName) {
		this.stSubstationName = stSubstationName;
	}

	public String getStSubstationRefGuid() {
		return this.stSubstationRefGuid;
	}

	public void setStSubstationRefGuid(String stSubstationRefGuid) {
		this.stSubstationRefGuid = stSubstationRefGuid;
	}

	public String getStTaxDistrict() {
		return this.stTaxDistrict;
	}

	public void setStTaxDistrict(String stTaxDistrict) {
		this.stTaxDistrict = stTaxDistrict;
	}

	public String getStWarehouseLocation() {
		return this.stWarehouseLocation;
	}

	public void setStWarehouseLocation(String stWarehouseLocation) {
		this.stWarehouseLocation = stWarehouseLocation;
	}

	public String getStWoAbandonedByUser() {
		return this.stWoAbandonedByUser;
	}

	public void setStWoAbandonedByUser(String stWoAbandonedByUser) {
		this.stWoAbandonedByUser = stWoAbandonedByUser;
	}

	public Timestamp getStWoAbandonedDate() {
		return this.stWoAbandonedDate;
	}

	public void setStWoAbandonedDate(Timestamp stWoAbandonedDate) {
		this.stWoAbandonedDate = stWoAbandonedDate;
	}

	public String getStWoAbandonedReason() {
		return this.stWoAbandonedReason;
	}

	public void setStWoAbandonedReason(String stWoAbandonedReason) {
		this.stWoAbandonedReason = stWoAbandonedReason;
	}

	public Timestamp getStWoAsBuiltDate() {
		return this.stWoAsBuiltDate;
	}

	public void setStWoAsBuiltDate(Timestamp stWoAsBuiltDate) {
		this.stWoAsBuiltDate = stWoAsBuiltDate;
	}

	public Timestamp getStWoCloseDate() {
		return this.stWoCloseDate;
	}

	public void setStWoCloseDate(Timestamp stWoCloseDate) {
		this.stWoCloseDate = stWoCloseDate;
	}

	public String getStWoComment() {
		return this.stWoComment;
	}

	public void setStWoComment(String stWoComment) {
		this.stWoComment = stWoComment;
	}

	public String getStWoCompletedByUser() {
		return this.stWoCompletedByUser;
	}

	public void setStWoCompletedByUser(String stWoCompletedByUser) {
		this.stWoCompletedByUser = stWoCompletedByUser;
	}

	public Timestamp getStWoCompletedDate() {
		return this.stWoCompletedDate;
	}

	public void setStWoCompletedDate(Timestamp stWoCompletedDate) {
		this.stWoCompletedDate = stWoCompletedDate;
	}

	public Timestamp getStWoCreatedDate() {
		return this.stWoCreatedDate;
	}

	public void setStWoCreatedDate(Timestamp stWoCreatedDate) {
		this.stWoCreatedDate = stWoCreatedDate;
	}

	public String getStWoDescription() {
		return this.stWoDescription;
	}

	public void setStWoDescription(String stWoDescription) {
		this.stWoDescription = stWoDescription;
	}

	public Timestamp getStWoEngReviewDate() {
		return this.stWoEngReviewDate;
	}

	public void setStWoEngReviewDate(Timestamp stWoEngReviewDate) {
		this.stWoEngReviewDate = stWoEngReviewDate;
	}

	public String getStWoEngReviewedByUser() {
		return this.stWoEngReviewedByUser;
	}

	public void setStWoEngReviewedByUser(String stWoEngReviewedByUser) {
		this.stWoEngReviewedByUser = stWoEngReviewedByUser;
	}

	public Timestamp getStWoEstimateDate() {
		return this.stWoEstimateDate;
	}

	public void setStWoEstimateDate(Timestamp stWoEstimateDate) {
		this.stWoEstimateDate = stWoEstimateDate;
	}

	public String getStWoEstimatedByUser() {
		return this.stWoEstimatedByUser;
	}

	public void setStWoEstimatedByUser(String stWoEstimatedByUser) {
		this.stWoEstimatedByUser = stWoEstimatedByUser;
	}

	public String getStWoGroupCode() {
		return this.stWoGroupCode;
	}

	public void setStWoGroupCode(String stWoGroupCode) {
		this.stWoGroupCode = stWoGroupCode;
	}

	public String getStWoImagePath() {
		return this.stWoImagePath;
	}

	public void setStWoImagePath(String stWoImagePath) {
		this.stWoImagePath = stWoImagePath;
	}

	public String getStWoIsArchived() {
		return this.stWoIsArchived;
	}

	public void setStWoIsArchived(String stWoIsArchived) {
		this.stWoIsArchived = stWoIsArchived;
	}

	public String getStWoIsDmgAssessmnt() {
		return this.stWoIsDmgAssessmnt;
	}

	public void setStWoIsDmgAssessmnt(String stWoIsDmgAssessmnt) {
		this.stWoIsDmgAssessmnt = stWoIsDmgAssessmnt;
	}

	public String getStWoIsEstimate() {
		return this.stWoIsEstimate;
	}

	public void setStWoIsEstimate(String stWoIsEstimate) {
		this.stWoIsEstimate = stWoIsEstimate;
	}

	public String getStWoIsUploadHeaderOnly() {
		return this.stWoIsUploadHeaderOnly;
	}

	public void setStWoIsUploadHeaderOnly(String stWoIsUploadHeaderOnly) {
		this.stWoIsUploadHeaderOnly = stWoIsUploadHeaderOnly;
	}

	public String getStWoLaborCompletedBy() {
		return this.stWoLaborCompletedBy;
	}

	public void setStWoLaborCompletedBy(String stWoLaborCompletedBy) {
		this.stWoLaborCompletedBy = stWoLaborCompletedBy;
	}

	public Timestamp getStWoLaborCompletedDate() {
		return this.stWoLaborCompletedDate;
	}

	public void setStWoLaborCompletedDate(Timestamp stWoLaborCompletedDate) {
		this.stWoLaborCompletedDate = stWoLaborCompletedDate;
	}

	public int getStWoMappingStateCode() {
		return this.stWoMappingStateCode;
	}

	public void setStWoMappingStateCode(int stWoMappingStateCode) {
		this.stWoMappingStateCode = stWoMappingStateCode;
	}

	public String getStWoMatCompletedBy() {
		return this.stWoMatCompletedBy;
	}

	public void setStWoMatCompletedBy(String stWoMatCompletedBy) {
		this.stWoMatCompletedBy = stWoMatCompletedBy;
	}

	public Timestamp getStWoMaterialCompletedDate() {
		return this.stWoMaterialCompletedDate;
	}

	public void setStWoMaterialCompletedDate(Timestamp stWoMaterialCompletedDate) {
		this.stWoMaterialCompletedDate = stWoMaterialCompletedDate;
	}

	public String getStWoMiLocation() {
		return this.stWoMiLocation;
	}

	public void setStWoMiLocation(String stWoMiLocation) {
		this.stWoMiLocation = stWoMiLocation;
	}

	public String getStWoNumber() {
		return this.stWoNumber;
	}

	public void setStWoNumber(String stWoNumber) {
		this.stWoNumber = stWoNumber;
	}

	public Timestamp getStWoProcessDate() {
		return this.stWoProcessDate;
	}

	public void setStWoProcessDate(Timestamp stWoProcessDate) {
		this.stWoProcessDate = stWoProcessDate;
	}

	public String getStWoProcessedByUser() {
		return this.stWoProcessedByUser;
	}

	public void setStWoProcessedByUser(String stWoProcessedByUser) {
		this.stWoProcessedByUser = stWoProcessedByUser;
	}

	public String getStWoStakedByUser() {
		return this.stWoStakedByUser;
	}

	public void setStWoStakedByUser(String stWoStakedByUser) {
		this.stWoStakedByUser = stWoStakedByUser;
	}

	public Timestamp getStWoStakedDate() {
		return this.stWoStakedDate;
	}

	public void setStWoStakedDate(Timestamp stWoStakedDate) {
		this.stWoStakedDate = stWoStakedDate;
	}

	public Timestamp getStWoStartDate() {
		return this.stWoStartDate;
	}

	public void setStWoStartDate(Timestamp stWoStartDate) {
		this.stWoStartDate = stWoStartDate;
	}

	public String getStWoTypeCode() {
		return this.stWoTypeCode;
	}

	public void setStWoTypeCode(String stWoTypeCode) {
		this.stWoTypeCode = stWoTypeCode;
	}

	public String getStWorkplanLoanDesign() {
		return this.stWorkplanLoanDesign;
	}

	public void setStWorkplanLoanDesign(String stWorkplanLoanDesign) {
		this.stWorkplanLoanDesign = stWorkplanLoanDesign;
	}

	public int getObjectid() {
		return this.objectid;
	}

	public void setObjectid(int objectid) {
		this.objectid = objectid;
	}

	public String getStStatusRefGuid() {
		return this.stStatusRefGuid;
	}

	public void setStStatusRefGuid(String stStatusRefGuid) {
		this.stStatusRefGuid = stStatusRefGuid;
	}
}
