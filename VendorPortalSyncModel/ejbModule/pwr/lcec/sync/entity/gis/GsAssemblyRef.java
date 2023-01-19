package pwr.lcec.sync.entity.gis;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "GS_ASSEMBLY_REF")
@NamedQuery(name = "GsAssemblyRef.findAll", query = "SELECT g FROM GsAssemblyRef g")
public class GsAssemblyRef implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "gs_abs_assembly_ref_guid")
	private String gsAbsAssemblyRefGuid;
	
	@Column(name = "gs_assembly_description")
	private String gsAssemblyDescription;
	
	@Column(name = "gs_assembly_name")
	private String gsAssemblyName;
	
	@Column(name = "gs_concentric_sw")
	private String gsConcentricSw;
	
	@Column(name = "gs_display_feature_name")
	private String gsDisplayFeatureName;
	
	@Column(name = "gs_engineering_analysis_name")
	private String gsEngineeringAnalysisName;
	
	@Column(name = "gs_guid")
	private String gsGuid;
	
	@Column(name = "gs_industry")
	private int gsIndustry;
	
	@Column(name = "gs_is_assembly_approved")
	private String gsIsAssemblyApproved;
	
	@Column(name = "gs_is_fes_assembly")
	private String gsIsFesAssembly;
	
	@Column(name = "gs_is_flow_assembly")
	private String gsIsFlowAssembly;
	
	@Column(name = "gs_misc_design_code")
	private String gsMiscDesignCode;
	
	@Column(name = "gs_misc_required_code")
	private String gsMiscRequiredCode;
	
	@Column(name = "gs_neutral_design_code")
	private String gsNeutralDesignCode;
	
	@Column(name = "gs_neutral_required_code")
	private String gsNeutralRequiredCode;
	
	@Column(name = "gs_pole_design_code")
	private String gsPoleDesignCode;
	
	@Column(name = "gs_ref_1_required_code")
	private String gsRef1RequiredCode;
	
	@Column(name = "gs_ref_2_required_code")
	private String gsRef2RequiredCode;
	
	@Column(name = "gs_sendable_to_sis")
	private String gsSendableToSis;
	
	@Column(name = "gs_vc_modified_sw")
	private String gsVcModifiedSw;
	
	@Column(name = "gs_vc_revision")
	private int gsVcRevision;
	
	@Column(name = "gs_wire_design_code")
	private String gsWireDesignCode;
	
	@Id
	@Column(name = "OBJECTID")
	private int objectid;
	
	@Column(name = "st_assembly_type_ref_guid")
	private String stAssemblyTypeRefGuid;

	public String getGsAbsAssemblyRefGuid() {
		return this.gsAbsAssemblyRefGuid;
	}

	public void setGsAbsAssemblyRefGuid(String gsAbsAssemblyRefGuid) {
		this.gsAbsAssemblyRefGuid = gsAbsAssemblyRefGuid;
	}

	public String getGsAssemblyDescription() {
		return this.gsAssemblyDescription;
	}

	public void setGsAssemblyDescription(String gsAssemblyDescription) {
		this.gsAssemblyDescription = gsAssemblyDescription;
	}

	public String getGsAssemblyName() {
		return this.gsAssemblyName;
	}

	public void setGsAssemblyName(String gsAssemblyName) {
		this.gsAssemblyName = gsAssemblyName;
	}

	public String getGsConcentricSw() {
		return this.gsConcentricSw;
	}

	public void setGsConcentricSw(String gsConcentricSw) {
		this.gsConcentricSw = gsConcentricSw;
	}

	public String getGsDisplayFeatureName() {
		return this.gsDisplayFeatureName;
	}

	public void setGsDisplayFeatureName(String gsDisplayFeatureName) {
		this.gsDisplayFeatureName = gsDisplayFeatureName;
	}

	public String getGsEngineeringAnalysisName() {
		return this.gsEngineeringAnalysisName;
	}

	public void setGsEngineeringAnalysisName(String gsEngineeringAnalysisName) {
		this.gsEngineeringAnalysisName = gsEngineeringAnalysisName;
	}

	public String getGsGuid() {
		return this.gsGuid;
	}

	public void setGsGuid(String gsGuid) {
		this.gsGuid = gsGuid;
	}

	public int getGsIndustry() {
		return this.gsIndustry;
	}

	public void setGsIndustry(int gsIndustry) {
		this.gsIndustry = gsIndustry;
	}

	public String getGsIsAssemblyApproved() {
		return this.gsIsAssemblyApproved;
	}

	public void setGsIsAssemblyApproved(String gsIsAssemblyApproved) {
		this.gsIsAssemblyApproved = gsIsAssemblyApproved;
	}

	public String getGsIsFesAssembly() {
		return this.gsIsFesAssembly;
	}

	public void setGsIsFesAssembly(String gsIsFesAssembly) {
		this.gsIsFesAssembly = gsIsFesAssembly;
	}

	public String getGsIsFlowAssembly() {
		return this.gsIsFlowAssembly;
	}

	public void setGsIsFlowAssembly(String gsIsFlowAssembly) {
		this.gsIsFlowAssembly = gsIsFlowAssembly;
	}

	public String getGsMiscDesignCode() {
		return this.gsMiscDesignCode;
	}

	public void setGsMiscDesignCode(String gsMiscDesignCode) {
		this.gsMiscDesignCode = gsMiscDesignCode;
	}

	public String getGsMiscRequiredCode() {
		return this.gsMiscRequiredCode;
	}

	public void setGsMiscRequiredCode(String gsMiscRequiredCode) {
		this.gsMiscRequiredCode = gsMiscRequiredCode;
	}

	public String getGsNeutralDesignCode() {
		return this.gsNeutralDesignCode;
	}

	public void setGsNeutralDesignCode(String gsNeutralDesignCode) {
		this.gsNeutralDesignCode = gsNeutralDesignCode;
	}

	public String getGsNeutralRequiredCode() {
		return this.gsNeutralRequiredCode;
	}

	public void setGsNeutralRequiredCode(String gsNeutralRequiredCode) {
		this.gsNeutralRequiredCode = gsNeutralRequiredCode;
	}

	public String getGsPoleDesignCode() {
		return this.gsPoleDesignCode;
	}

	public void setGsPoleDesignCode(String gsPoleDesignCode) {
		this.gsPoleDesignCode = gsPoleDesignCode;
	}

	public String getGsRef1RequiredCode() {
		return this.gsRef1RequiredCode;
	}

	public void setGsRef1RequiredCode(String gsRef1RequiredCode) {
		this.gsRef1RequiredCode = gsRef1RequiredCode;
	}

	public String getGsRef2RequiredCode() {
		return this.gsRef2RequiredCode;
	}

	public void setGsRef2RequiredCode(String gsRef2RequiredCode) {
		this.gsRef2RequiredCode = gsRef2RequiredCode;
	}

	public String getGsSendableToSis() {
		return this.gsSendableToSis;
	}

	public void setGsSendableToSis(String gsSendableToSis) {
		this.gsSendableToSis = gsSendableToSis;
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

	public String getGsWireDesignCode() {
		return this.gsWireDesignCode;
	}

	public void setGsWireDesignCode(String gsWireDesignCode) {
		this.gsWireDesignCode = gsWireDesignCode;
	}

	public String getStAssemblyTypeRefGuid() {
		return this.stAssemblyTypeRefGuid;
	}

	public void setStAssemblyTypeRefGuid(String stAssemblyTypeRefGuid) {
		this.stAssemblyTypeRefGuid = stAssemblyTypeRefGuid;
	}

	public int getObjectid() {
		return this.objectid;
	}

	public void setObjectid(int objectid) {
		this.objectid = objectid;
	}
}
