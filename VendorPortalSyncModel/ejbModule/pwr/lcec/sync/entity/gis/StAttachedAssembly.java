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
@Table(name = "ST_ATTACHED_ASSEMBLIES")
@NamedQuery(name = "StAttachedAssembly.findAll", query = "SELECT s FROM StAttachedAssembly s")
public class StAttachedAssembly implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "gs_asmb_identifier")
	private String gsAsmbIdentifier;
	
	@Column(name = "gs_asmb_last_modified_user")
	private String gsAsmbLastModifiedUser;
	
	@Column(name = "gs_assembly_comments")
	private String gsAssemblyComments;
	
	@Column(name = "gs_assembly_created_by_user")
	private String gsAssemblyCreatedByUser;
	
	@Column(name = "gs_assembly_date_created")
	private Timestamp gsAssemblyDateCreated;
	
	@Column(name = "gs_assembly_date_installed")
	private Timestamp gsAssemblyDateInstalled;
	
	@Column(name = "gs_assembly_date_modified")
	private Timestamp gsAssemblyDateModified;
	
	@Column(name = "gs_assembly_guid")
	private String gsAssemblyGuid;
	
	@Column(name = "gs_assembly_height")
	private BigDecimal gsAssemblyHeight;
	
	@Column(name = "gs_assembly_misc_code")
	private String gsAssemblyMiscCode;
	
	@Column(name = "gs_assembly_neutral_code")
	private String gsAssemblyNeutralCode;
	
	@Column(name = "gs_assembly_quantity")
	private int gsAssemblyQuantity;
	
	@Column(name = "gs_assembly_reference_code_1")
	private String gsAssemblyReferenceCode1;
	
	@Column(name = "gs_assembly_reference_code_2")
	private String gsAssemblyReferenceCode2;
	
	@Column(name = "gs_assembly_rotation")
	private BigDecimal gsAssemblyRotation;
	
	@Column(name = "gs_display_feature_guid")
	private String gsDisplayFeatureGuid;
	
	@Column(name = "gs_display_feature_name")
	private String gsDisplayFeatureName;
	
	@Column(name = "gs_guid")
	private String gsGuid;
	
	@Column(name = "gs_ignore_flow_check")
	private String gsIgnoreFlowCheck;
	
	@Column(name = "gs_is_neutral")
	private String gsIsNeutral;
	
	@Column(name = "gs_legacy_theme_name")
	private String gsLegacyThemeName;
	
	@Column(name = "gs_legacy_theme_prikey")
	private int gsLegacyThemePrikey;
	
	@Column(name = "gs_legacy_uawo")
	private int gsLegacyUawo;
	
	@Column(name = "gs_legacy_workcrewid")
	private String gsLegacyWorkcrewid;
	
	@Column(name = "gs_network_feature_guid")
	private String gsNetworkFeatureGuid;
	
	@Column(name = "gs_network_feature_name")
	private String gsNetworkFeatureName;
	
	@Column(name = "gs_vc_modified_sw")
	private String gsVcModifiedSw;
	
	@Column(name = "gs_vc_revision")
	private int gsVcRevision;
	
	@Column(name = "LocationFactorID")
	private String locationFactorID;
	
	@Id
	@Column(name = "OBJECTID")
	private int objectid;
	
	@Column(name = "st_asmb_type_override_guid")
	private String stAsmbTypeOverrideGuid;
	
	@Column(name = "st_assembly_action_code")
	private String stAssemblyActionCode;
	
	@Column(name = "st_assembly_amps")
	private BigDecimal stAssemblyAmps;
	
	@Column(name = "st_assembly_estimate_code")
	private String stAssemblyEstimateCode;
	
	@Column(name = "st_assembly_guy_lead")
	private String stAssemblyGuyLead;
	
	@Column(name = "st_assembly_kva")
	private String stAssemblyKva;
	
	@Column(name = "st_assembly_miscellaneous")
	private String stAssemblyMiscellaneous;
	
	@Column(name = "st_assembly_number_of_lines")
	private int stAssemblyNumberOfLines;
	
	@Column(name = "st_asset_group")
	private String stAssetGroup;
	
	@Column(name = "st_damage_reference_guid")
	private String stDamageReferenceGuid;
	
	@Column(name = "st_original_gs_guid")
	private String stOriginalGsGuid;
	
	@Column(name = "st_pick_list_id")
	private String stPickListId;

	public String getGsAsmbIdentifier() {
		return this.gsAsmbIdentifier;
	}

	public void setGsAsmbIdentifier(String gsAsmbIdentifier) {
		this.gsAsmbIdentifier = gsAsmbIdentifier;
	}

	public String getGsAsmbLastModifiedUser() {
		return this.gsAsmbLastModifiedUser;
	}

	public void setGsAsmbLastModifiedUser(String gsAsmbLastModifiedUser) {
		this.gsAsmbLastModifiedUser = gsAsmbLastModifiedUser;
	}

	public String getGsAssemblyComments() {
		return this.gsAssemblyComments;
	}

	public void setGsAssemblyComments(String gsAssemblyComments) {
		this.gsAssemblyComments = gsAssemblyComments;
	}

	public String getGsAssemblyCreatedByUser() {
		return this.gsAssemblyCreatedByUser;
	}

	public void setGsAssemblyCreatedByUser(String gsAssemblyCreatedByUser) {
		this.gsAssemblyCreatedByUser = gsAssemblyCreatedByUser;
	}

	public Timestamp getGsAssemblyDateCreated() {
		return this.gsAssemblyDateCreated;
	}

	public void setGsAssemblyDateCreated(Timestamp gsAssemblyDateCreated) {
		this.gsAssemblyDateCreated = gsAssemblyDateCreated;
	}

	public Timestamp getGsAssemblyDateInstalled() {
		return this.gsAssemblyDateInstalled;
	}

	public void setGsAssemblyDateInstalled(Timestamp gsAssemblyDateInstalled) {
		this.gsAssemblyDateInstalled = gsAssemblyDateInstalled;
	}

	public Timestamp getGsAssemblyDateModified() {
		return this.gsAssemblyDateModified;
	}

	public void setGsAssemblyDateModified(Timestamp gsAssemblyDateModified) {
		this.gsAssemblyDateModified = gsAssemblyDateModified;
	}

	public String getGsAssemblyGuid() {
		return this.gsAssemblyGuid;
	}

	public void setGsAssemblyGuid(String gsAssemblyGuid) {
		this.gsAssemblyGuid = gsAssemblyGuid;
	}

	public BigDecimal getGsAssemblyHeight() {
		return this.gsAssemblyHeight;
	}

	public void setGsAssemblyHeight(BigDecimal gsAssemblyHeight) {
		this.gsAssemblyHeight = gsAssemblyHeight;
	}

	public String getGsAssemblyMiscCode() {
		return this.gsAssemblyMiscCode;
	}

	public void setGsAssemblyMiscCode(String gsAssemblyMiscCode) {
		this.gsAssemblyMiscCode = gsAssemblyMiscCode;
	}

	public String getGsAssemblyNeutralCode() {
		return this.gsAssemblyNeutralCode;
	}

	public void setGsAssemblyNeutralCode(String gsAssemblyNeutralCode) {
		this.gsAssemblyNeutralCode = gsAssemblyNeutralCode;
	}

	public int getGsAssemblyQuantity() {
		return this.gsAssemblyQuantity;
	}

	public void setGsAssemblyQuantity(int gsAssemblyQuantity) {
		this.gsAssemblyQuantity = gsAssemblyQuantity;
	}

	public String getGsAssemblyReferenceCode1() {
		return this.gsAssemblyReferenceCode1;
	}

	public void setGsAssemblyReferenceCode1(String gsAssemblyReferenceCode1) {
		this.gsAssemblyReferenceCode1 = gsAssemblyReferenceCode1;
	}

	public String getGsAssemblyReferenceCode2() {
		return this.gsAssemblyReferenceCode2;
	}

	public void setGsAssemblyReferenceCode2(String gsAssemblyReferenceCode2) {
		this.gsAssemblyReferenceCode2 = gsAssemblyReferenceCode2;
	}

	public BigDecimal getGsAssemblyRotation() {
		return this.gsAssemblyRotation;
	}

	public void setGsAssemblyRotation(BigDecimal gsAssemblyRotation) {
		this.gsAssemblyRotation = gsAssemblyRotation;
	}

	public String getGsDisplayFeatureGuid() {
		return this.gsDisplayFeatureGuid;
	}

	public void setGsDisplayFeatureGuid(String gsDisplayFeatureGuid) {
		this.gsDisplayFeatureGuid = gsDisplayFeatureGuid;
	}

	public String getGsDisplayFeatureName() {
		return this.gsDisplayFeatureName;
	}

	public void setGsDisplayFeatureName(String gsDisplayFeatureName) {
		this.gsDisplayFeatureName = gsDisplayFeatureName;
	}

	public String getGsGuid() {
		return this.gsGuid;
	}

	public void setGsGuid(String gsGuid) {
		this.gsGuid = gsGuid;
	}

	public String getGsIgnoreFlowCheck() {
		return this.gsIgnoreFlowCheck;
	}

	public void setGsIgnoreFlowCheck(String gsIgnoreFlowCheck) {
		this.gsIgnoreFlowCheck = gsIgnoreFlowCheck;
	}

	public String getGsIsNeutral() {
		return this.gsIsNeutral;
	}

	public void setGsIsNeutral(String gsIsNeutral) {
		this.gsIsNeutral = gsIsNeutral;
	}

	public String getGsLegacyThemeName() {
		return this.gsLegacyThemeName;
	}

	public void setGsLegacyThemeName(String gsLegacyThemeName) {
		this.gsLegacyThemeName = gsLegacyThemeName;
	}

	public int getGsLegacyThemePrikey() {
		return this.gsLegacyThemePrikey;
	}

	public void setGsLegacyThemePrikey(int gsLegacyThemePrikey) {
		this.gsLegacyThemePrikey = gsLegacyThemePrikey;
	}

	public int getGsLegacyUawo() {
		return this.gsLegacyUawo;
	}

	public void setGsLegacyUawo(int gsLegacyUawo) {
		this.gsLegacyUawo = gsLegacyUawo;
	}

	public String getGsLegacyWorkcrewid() {
		return this.gsLegacyWorkcrewid;
	}

	public void setGsLegacyWorkcrewid(String gsLegacyWorkcrewid) {
		this.gsLegacyWorkcrewid = gsLegacyWorkcrewid;
	}

	public String getGsNetworkFeatureName() {
		return this.gsNetworkFeatureName;
	}

	public void setGsNetworkFeatureName(String gsNetworkFeatureName) {
		this.gsNetworkFeatureName = gsNetworkFeatureName;
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

	public String getLocationFactorID() {
		return this.locationFactorID;
	}

	public void setLocationFactorID(String locationFactorID) {
		this.locationFactorID = locationFactorID;
	}

	public String getStAsmbTypeOverrideGuid() {
		return this.stAsmbTypeOverrideGuid;
	}

	public void setStAsmbTypeOverrideGuid(String stAsmbTypeOverrideGuid) {
		this.stAsmbTypeOverrideGuid = stAsmbTypeOverrideGuid;
	}

	public String getStAssemblyActionCode() {
		return this.stAssemblyActionCode;
	}

	public void setStAssemblyActionCode(String stAssemblyActionCode) {
		this.stAssemblyActionCode = stAssemblyActionCode;
	}

	public BigDecimal getStAssemblyAmps() {
		return this.stAssemblyAmps;
	}

	public void setStAssemblyAmps(BigDecimal stAssemblyAmps) {
		this.stAssemblyAmps = stAssemblyAmps;
	}

	public String getStAssemblyEstimateCode() {
		return this.stAssemblyEstimateCode;
	}

	public void setStAssemblyEstimateCode(String stAssemblyEstimateCode) {
		this.stAssemblyEstimateCode = stAssemblyEstimateCode;
	}

	public String getStAssemblyGuyLead() {
		return this.stAssemblyGuyLead;
	}

	public void setStAssemblyGuyLead(String stAssemblyGuyLead) {
		this.stAssemblyGuyLead = stAssemblyGuyLead;
	}

	public String getStAssemblyKva() {
		return this.stAssemblyKva;
	}

	public void setStAssemblyKva(String stAssemblyKva) {
		this.stAssemblyKva = stAssemblyKva;
	}

	public String getStAssemblyMiscellaneous() {
		return this.stAssemblyMiscellaneous;
	}

	public void setStAssemblyMiscellaneous(String stAssemblyMiscellaneous) {
		this.stAssemblyMiscellaneous = stAssemblyMiscellaneous;
	}

	public int getStAssemblyNumberOfLines() {
		return this.stAssemblyNumberOfLines;
	}

	public void setStAssemblyNumberOfLines(int stAssemblyNumberOfLines) {
		this.stAssemblyNumberOfLines = stAssemblyNumberOfLines;
	}

	public String getStAssetGroup() {
		return this.stAssetGroup;
	}

	public void setStAssetGroup(String stAssetGroup) {
		this.stAssetGroup = stAssetGroup;
	}

	public String getStDamageReferenceGuid() {
		return this.stDamageReferenceGuid;
	}

	public void setStDamageReferenceGuid(String stDamageReferenceGuid) {
		this.stDamageReferenceGuid = stDamageReferenceGuid;
	}

	public String getStOriginalGsGuid() {
		return this.stOriginalGsGuid;
	}

	public void setStOriginalGsGuid(String stOriginalGsGuid) {
		this.stOriginalGsGuid = stOriginalGsGuid;
	}

	public String getStPickListId() {
		return this.stPickListId;
	}

	public void setStPickListId(String stPickListId) {
		this.stPickListId = stPickListId;
	}

	public String getGsNetworkFeatureGuid() {
		return this.gsNetworkFeatureGuid;
	}

	public void setGsNetworkFeatureGuid(String gsNetworkFeatureGuid) {
		this.gsNetworkFeatureGuid = gsNetworkFeatureGuid;
	}

	public int getObjectid() {
		return this.objectid;
	}

	public void setObjectid(int objectid) {
		this.objectid = objectid;
	}
}
