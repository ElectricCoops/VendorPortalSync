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
@Table(name = "ST_STATION")
@NamedQuery(name = "StStation.findAll", query = "SELECT s FROM StStation s")
public class StStation implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "OBJECTID")
	private int objectid;
	@Column(name = "AncillaryRole")
	private String ancillaryRole;
	@Column(name = "gs_assemb_framing_guide")
	private String gsAssembFramingGuide;
	@Column(name = "gs_asset_group")
	private String gsAssetGroup;
	@Column(name = "gs_date_created")
	private Timestamp gsDateCreated;
	@Column(name = "gs_date_modified")
	private Timestamp gsDateModified;
	@Column(name = "gs_dist_line_to_obstacle")
	private String gsDistLineToObstacle;
	@Column(name = "gs_dist_to_obstacle")
	private String gsDistToObstacle;
	@Column(name = "gs_feeder_number")
	private String gsFeederNumber;
	@Column(name = "gs_gps_x")
	private BigDecimal gsGpsX;
	@Column(name = "gs_gps_y")
	private BigDecimal gsGpsY;
	@Column(name = "gs_grade_of_construct")
	private String gsGradeOfConstruct;
	@Column(name = "gs_ground_type_1")
	private String gsGroundType1;
	@Column(name = "gs_ground_type_2")
	private String gsGroundType2;
	@Column(name = "gs_guid")
	private String gsGuid;
	@Column(name = "gs_is_electric_source")
	private String gsIsElectricSource;
	@Column(name = "gs_loc_from_main_line")
	private String gsLocFromMainLine;
	@Column(name = "gs_lower_neutral_attach")
	private String gsLowerNeutralAttach;
	@Column(name = "gs_num_fa_attached")
	private int gsNumFaAttached;
	@Column(name = "gs_obstacle_type")
	private String gsObstacleType;
	@Column(name = "gs_related_staking_guid")
	private String gsRelatedStakingGuid;
	@Column(name = "gs_revised_min_clear_1")
	private String gsRevisedMinClear1;
	@Column(name = "gs_revised_min_clear_2")
	private String gsRevisedMinClear2;
	@Column(name = "gs_shape_from_gps_sw")
	private String gsShapeFromGpsSw;
	@Column(name = "gs_station_mapping_state_code")
	private int gsStationMappingStateCode;
	@Column(name = "gs_station_name")
	private String gsStationName;
	@Column(name = "gs_station_notes")
	private String gsStationNotes;
	@Column(name = "gs_station_phase")
	private String gsStationPhase;
	@Column(name = "gs_substation")
	private String gsSubstation;
	@Column(name = "gs_telecom_from_neutral")
	private String gsTelecomFromNeutral;
	@Column(name = "gs_vc_modified_sw")
	private String gsVcModifiedSw;
	@Column(name = "gs_vc_revision")
	private int gsVcRevision;
	@Column(name = "gs_work_initiation_id")
	private String gsWorkInitiationId;
	@Column(name = "gs_z_coord")
	private BigDecimal gsZCoord;
	@Column(name = "SHAPE")
	private byte[] shape;
	@Column(name = "st_workorder_ref_guid")
	private String stWorkorderRefGuid;
	@Column(name = "st_action_code")
	private String stActionCode;
	@Column(name = "st_original_gs_guid")
	private String stOriginalGsGuid;
	@Column(name = "st_report_order_index")
	private int stReportOrderIndex;

	public int getStringid() {
		return this.objectid;
	}

	public void setStringid(int objectid) {
		this.objectid = objectid;
	}

	public String getAncillaryRole() {
		return this.ancillaryRole;
	}

	public void setAncillaryRole(String ancillaryRole) {
		this.ancillaryRole = ancillaryRole;
	}

	public String getGsAssembFramingGuide() {
		return this.gsAssembFramingGuide;
	}

	public void setGsAssembFramingGuide(String gsAssembFramingGuide) {
		this.gsAssembFramingGuide = gsAssembFramingGuide;
	}

	public String getGsAssetGroup() {
		return this.gsAssetGroup;
	}

	public void setGsAssetGroup(String gsAssetGroup) {
		this.gsAssetGroup = gsAssetGroup;
	}

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

	public String getGsDistLineToObstacle() {
		return this.gsDistLineToObstacle;
	}

	public void setGsDistLineToObstacle(String gsDistLineToObstacle) {
		this.gsDistLineToObstacle = gsDistLineToObstacle;
	}

	public String getGsDistToObstacle() {
		return this.gsDistToObstacle;
	}

	public void setGsDistToObstacle(String gsDistToObstacle) {
		this.gsDistToObstacle = gsDistToObstacle;
	}

	public String getGsFeederNumber() {
		return this.gsFeederNumber;
	}

	public void setGsFeederNumber(String gsFeederNumber) {
		this.gsFeederNumber = gsFeederNumber;
	}

	public BigDecimal getGsGpsX() {
		return this.gsGpsX;
	}

	public void setGsGpsX(BigDecimal gsGpsX) {
		this.gsGpsX = gsGpsX;
	}

	public BigDecimal getGsGpsY() {
		return this.gsGpsY;
	}

	public void setGsGpsY(BigDecimal gsGpsY) {
		this.gsGpsY = gsGpsY;
	}

	public String getGsGradeOfConstruct() {
		return this.gsGradeOfConstruct;
	}

	public void setGsGradeOfConstruct(String gsGradeOfConstruct) {
		this.gsGradeOfConstruct = gsGradeOfConstruct;
	}

	public String getGsGroundType1() {
		return this.gsGroundType1;
	}

	public void setGsGroundType1(String gsGroundType1) {
		this.gsGroundType1 = gsGroundType1;
	}

	public String getGsGroundType2() {
		return this.gsGroundType2;
	}

	public void setGsGroundType2(String gsGroundType2) {
		this.gsGroundType2 = gsGroundType2;
	}

	public String getGsGuid() {
		return this.gsGuid;
	}

	public void setGsGuid(String gsGuid) {
		this.gsGuid = gsGuid;
	}

	public String getGsIsElectricSource() {
		return this.gsIsElectricSource;
	}

	public void setGsIsElectricSource(String gsIsElectricSource) {
		this.gsIsElectricSource = gsIsElectricSource;
	}

	public String getGsLocFromMainLine() {
		return this.gsLocFromMainLine;
	}

	public void setGsLocFromMainLine(String gsLocFromMainLine) {
		this.gsLocFromMainLine = gsLocFromMainLine;
	}

	public String getGsLowerNeutralAttach() {
		return this.gsLowerNeutralAttach;
	}

	public void setGsLowerNeutralAttach(String gsLowerNeutralAttach) {
		this.gsLowerNeutralAttach = gsLowerNeutralAttach;
	}

	public int getGsNumFaAttached() {
		return this.gsNumFaAttached;
	}

	public void setGsNumFaAttached(int gsNumFaAttached) {
		this.gsNumFaAttached = gsNumFaAttached;
	}

	public String getGsObstacleType() {
		return this.gsObstacleType;
	}

	public void setGsObstacleType(String gsObstacleType) {
		this.gsObstacleType = gsObstacleType;
	}

	public String getGsRelatedStakingGuid() {
		return this.gsRelatedStakingGuid;
	}

	public void setGsRelatedStakingGuid(String gsRelatedStakingGuid) {
		this.gsRelatedStakingGuid = gsRelatedStakingGuid;
	}

	public String getGsRevisedMinClear1() {
		return this.gsRevisedMinClear1;
	}

	public void setGsRevisedMinClear1(String gsRevisedMinClear1) {
		this.gsRevisedMinClear1 = gsRevisedMinClear1;
	}

	public String getGsRevisedMinClear2() {
		return this.gsRevisedMinClear2;
	}

	public void setGsRevisedMinClear2(String gsRevisedMinClear2) {
		this.gsRevisedMinClear2 = gsRevisedMinClear2;
	}

	public String getGsShapeFromGpsSw() {
		return this.gsShapeFromGpsSw;
	}

	public void setGsShapeFromGpsSw(String gsShapeFromGpsSw) {
		this.gsShapeFromGpsSw = gsShapeFromGpsSw;
	}

	public int getGsStationMappingStateCode() {
		return this.gsStationMappingStateCode;
	}

	public void setGsStationMappingStateCode(int gsStationMappingStateCode) {
		this.gsStationMappingStateCode = gsStationMappingStateCode;
	}

	public String getGsStationName() {
		return this.gsStationName;
	}

	public void setGsStationName(String gsStationName) {
		this.gsStationName = gsStationName;
	}

	public String getGsStationNotes() {
		return this.gsStationNotes;
	}

	public void setGsStationNotes(String gsStationNotes) {
		this.gsStationNotes = gsStationNotes;
	}

	public String getGsStationPhase() {
		return this.gsStationPhase;
	}

	public void setGsStationPhase(String gsStationPhase) {
		this.gsStationPhase = gsStationPhase;
	}

	public String getGsSubstation() {
		return this.gsSubstation;
	}

	public void setGsSubstation(String gsSubstation) {
		this.gsSubstation = gsSubstation;
	}

	public String getGsTelecomFromNeutral() {
		return this.gsTelecomFromNeutral;
	}

	public void setGsTelecomFromNeutral(String gsTelecomFromNeutral) {
		this.gsTelecomFromNeutral = gsTelecomFromNeutral;
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

	public String getGsWorkInitiationId() {
		return this.gsWorkInitiationId;
	}

	public void setGsWorkInitiationId(String gsWorkInitiationId) {
		this.gsWorkInitiationId = gsWorkInitiationId;
	}

	public BigDecimal getGsZCoord() {
		return this.gsZCoord;
	}

	public void setGsZCoord(BigDecimal gsZCoord) {
		this.gsZCoord = gsZCoord;
	}

	public byte[] getShape() {
		return this.shape;
	}

	public void setShape(byte[] shape) {
		this.shape = shape;
	}

	public String getStActionCode() {
		return this.stActionCode;
	}

	public void setStActionCode(String stActionCode) {
		this.stActionCode = stActionCode;
	}

	public String getStOriginalGsGuid() {
		return this.stOriginalGsGuid;
	}

	public void setStOriginalGsGuid(String stOriginalGsGuid) {
		this.stOriginalGsGuid = stOriginalGsGuid;
	}

	public int getStReportOrderIndex() {
		return this.stReportOrderIndex;
	}

	public void setStReportOrderIndex(int stReportOrderIndex) {
		this.stReportOrderIndex = stReportOrderIndex;
	}

	public int getObjectid() {
		return this.objectid;
	}

	public void setObjectid(int objectid) {
		this.objectid = objectid;
	}

	public String getStWorkorderRefGuid() {
		return this.stWorkorderRefGuid;
	}

	public void setStWorkorderRefGuid(String stWorkorderRefGuid) {
		this.stWorkorderRefGuid = stWorkorderRefGuid;
	}
}
