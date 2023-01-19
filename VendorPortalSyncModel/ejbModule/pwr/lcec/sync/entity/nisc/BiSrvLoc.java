package pwr.lcec.sync.entity.nisc;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "BI_SRV_LOC", schema = "CIS11013")
@NamedQuery(name = "BiSrvLoc.findLocById", query = "SELECT b FROM BiSrvLoc b WHERE b.biSrvLocNbr = :biSrvLocNbr")
public class BiSrvLoc implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "BI_SRV_LOC_NBR")
	private int biSrvLocNbr;
	@Column(name = "BI_911_ADDR_NBR")
	private BigDecimal bi911AddrNbr;
	@Column(name = "BI_ADDR1")
	private String biAddr1;
	@Column(name = "BI_ADDR2")
	private String biAddr2;
	@Column(name = "BI_ADDR3")
	private String biAddr3;
	@Column(name = "BI_BOARD_DIST_CD")
	private String biBoardDistCd;
	@Column(name = "BI_CARR_RT_NBR")
	private String biCarrRtNbr;
	@Column(name = "BI_CENSUS_BLOCK_NBR")
	private BigDecimal biCensusBlockNbr;
	@Column(name = "BI_CENSUS_BLOCK_TRACT")
	private String biCensusBlockTract;
	@Column(name = "BI_CENSUS_TRACT_BLKS_ID")
	private BigDecimal biCensusTractBlksId;
	@Column(name = "BI_CENSUS_TRACT_ID_NBR")
	private BigDecimal biCensusTractIdNbr;
	@Column(name = "BI_CITY")
	private String biCity;
	@Column(name = "BI_CLIMATE_ZONE_CD")
	private String biClimateZoneCd;
	@Column(name = "BI_CNTY_CD")
	private String biCntyCd;
	@Column(name = "BI_CONST_COST")
	private BigDecimal biConstCost;
	@Temporal(TemporalType.DATE)
	@Column(name = "BI_CONST_DT")
	private Date biConstDt;
	@Column(name = "BI_DIST_OFC_CD")
	private String biDistOfcCd;
	@Temporal(TemporalType.DATE)
	@Column(name = "BI_EDI_ELIG_DT")
	private Date biEdiEligDt;
	@Column(name = "BI_EDI_UNIVERSAL_ID")
	private String biEdiUniversalId;
	@Column(name = "BI_ELECTRICIAN")
	private String biElectrician;
	@Column(name = "BI_ELECTRICIAN_CERT")
	private String biElectricianCert;
	@Column(name = "BI_EMER_ADDR")
	private String biEmerAddr;
	@Column(name = "BI_FRAN_TAX_CD")
	private String biFranTaxCd;
	@Column(name = "BI_GPS_SESN_ID")
	private String biGpsSesnId;
	@Column(name = "BI_HEAT_TYPE_PRI")
	private String biHeatTypePri;
	@Column(name = "BI_HEAT_TYPE_SEC")
	private String biHeatTypeSec;
	@Column(name = "BI_LMN_SRV_AREA")
	private String biLmnSrvArea;
	@Column(name = "BI_LOC_TYPE")
	private String biLocType;
	@Column(name = "BI_MAP_BOOK")
	private String biMapBook;
	@Column(name = "BI_MOTOR_HP1")
	private BigDecimal biMotorHp1;
	@Column(name = "BI_MOTOR_HP2")
	private BigDecimal biMotorHp2;
	@Column(name = "BI_MULTI_DWLG")
	private BigDecimal biMultiDwlg;
	@Column(name = "BI_MULTI_DWLG_TYPE")
	private String biMultiDwlgType;
	@Column(name = "BI_OTH_TAX_CD")
	private String biOthTaxCd;
	@Column(name = "BI_OWNER_AGREE_IF_DIS_SW")
	private String biOwnerAgreeIfDisSw;
	@Column(name = "BI_OWNER_CUST_NBR")
	private BigDecimal biOwnerCustNbr;
	@Column(name = "BI_PERMIT_NBR")
	private String biPermitNbr;
	@Column(name = "BI_PLUS_2")
	private String biPlus2;
	@Column(name = "BI_PLUS_4")
	private String biPlus4;
	@Column(name = "BI_PRIMARY_METER_SW")
	private String biPrimaryMeterSw;
	@Column(name = "BI_RANGE")
	private String biRange;
	@Column(name = "BI_REMARK")
	private String biRemark;
	@Column(name = "BI_REV_AREA_CTL_ID_NBR")
	private BigDecimal biRevAreaCtlIdNbr;
	@Column(name = "BI_ROW_EASEMENT")
	private String biRowEasement;
	@Column(name = "BI_ROW_LEN")
	private BigDecimal biRowLen;
	@Column(name = "BI_ROW_WIDTH")
	private BigDecimal biRowWidth;
	@Column(name = "BI_SCHL_DIST_CD")
	private String biSchlDistCd;
	@Column(name = "BI_SECT")
	private String biSect;
	@Column(name = "BI_SOIL")
	private String biSoil;
	@Column(name = "BI_SRV_CONDUCT")
	private String biSrvConduct;
	@Column(name = "BI_SRV_DESC")
	private String biSrvDesc;
	@Column(name = "BI_SRV_LOC_CTR")
	private BigDecimal biSrvLocCtr;
	@Column(name = "BI_SRV_MAP_LOC")
	private String biSrvMapLoc;
	@Column(name = "BI_SRV_OH_UG")
	private String biSrvOhUg;
	@Column(name = "BI_SRV_SPAN_LEN")
	private BigDecimal biSrvSpanLen;
	@Column(name = "BI_ST")
	private String biSt;
	@Column(name = "BI_SUBD_BLK")
	private String biSubdBlk;
	@Column(name = "BI_SUBD_LOT")
	private String biSubdLot;
	@Column(name = "BI_SUBD_NAME")
	private String biSubdName;
	@Column(name = "BI_TAX_DIST_CD")
	private String biTaxDistCd;
	@Column(name = "BI_TEMP_PERM_CD")
	private String biTempPermCd;
	@Column(name = "BI_TERRAIN")
	private String biTerrain;
	@Column(name = "BI_TOWN_CD")
	private String biTownCd;
	@Column(name = "BI_TRF_CUTOFF_SW")
	private String biTrfCutoffSw;
	@Column(name = "BI_TV_REGION_ID_NBR")
	private BigDecimal biTvRegionIdNbr;
	@Column(name = "BI_TWNSHP")
	private String biTwnshp;
	@Column(name = "BI_TYPE_CARR")
	private String biTypeCarr;
	@Column(name = "BI_USE_CD")
	private String biUseCd;
	@Column(name = "BI_WTR_HTR_TYPE_1")
	private String biWtrHtrType1;
	@Column(name = "BI_WTR_HTR_TYPE_2")
	private String biWtrHtrType2;
	@Column(name = "BI_X_COORD")
	private String biXCoord;
	@Column(name = "BI_Y_COORD")
	private String biYCoord;
	@Column(name = "BI_ZIP")
	private String biZip;

	public int getBiSrvLocNbr() {
		return this.biSrvLocNbr;
	}

	public void setBiSrvLocNbr(int biSrvLocNbr) {
		this.biSrvLocNbr = biSrvLocNbr;
	}

	public BigDecimal getBi911AddrNbr() {
		return this.bi911AddrNbr;
	}

	public void setBi911AddrNbr(BigDecimal bi911AddrNbr) {
		this.bi911AddrNbr = bi911AddrNbr;
	}

	public String getBiAddr1() {
		return this.biAddr1;
	}

	public void setBiAddr1(String biAddr1) {
		this.biAddr1 = biAddr1;
	}

	public String getBiAddr2() {
		return this.biAddr2;
	}

	public void setBiAddr2(String biAddr2) {
		this.biAddr2 = biAddr2;
	}

	public String getBiAddr3() {
		return this.biAddr3;
	}

	public void setBiAddr3(String biAddr3) {
		this.biAddr3 = biAddr3;
	}

	public String getBiBoardDistCd() {
		return this.biBoardDistCd;
	}

	public void setBiBoardDistCd(String biBoardDistCd) {
		this.biBoardDistCd = biBoardDistCd;
	}

	public String getBiCarrRtNbr() {
		return this.biCarrRtNbr;
	}

	public void setBiCarrRtNbr(String biCarrRtNbr) {
		this.biCarrRtNbr = biCarrRtNbr;
	}

	public BigDecimal getBiCensusBlockNbr() {
		return this.biCensusBlockNbr;
	}

	public void setBiCensusBlockNbr(BigDecimal biCensusBlockNbr) {
		this.biCensusBlockNbr = biCensusBlockNbr;
	}

	public String getBiCensusBlockTract() {
		return this.biCensusBlockTract;
	}

	public void setBiCensusBlockTract(String biCensusBlockTract) {
		this.biCensusBlockTract = biCensusBlockTract;
	}

	public BigDecimal getBiCensusTractBlksId() {
		return this.biCensusTractBlksId;
	}

	public void setBiCensusTractBlksId(BigDecimal biCensusTractBlksId) {
		this.biCensusTractBlksId = biCensusTractBlksId;
	}

	public BigDecimal getBiCensusTractIdNbr() {
		return this.biCensusTractIdNbr;
	}

	public void setBiCensusTractIdNbr(BigDecimal biCensusTractIdNbr) {
		this.biCensusTractIdNbr = biCensusTractIdNbr;
	}

	public String getBiCity() {
		return this.biCity;
	}

	public void setBiCity(String biCity) {
		this.biCity = biCity;
	}

	public String getBiClimateZoneCd() {
		return this.biClimateZoneCd;
	}

	public void setBiClimateZoneCd(String biClimateZoneCd) {
		this.biClimateZoneCd = biClimateZoneCd;
	}

	public String getBiCntyCd() {
		return this.biCntyCd;
	}

	public void setBiCntyCd(String biCntyCd) {
		this.biCntyCd = biCntyCd;
	}

	public BigDecimal getBiConstCost() {
		return this.biConstCost;
	}

	public void setBiConstCost(BigDecimal biConstCost) {
		this.biConstCost = biConstCost;
	}

	public Date getBiConstDt() {
		return this.biConstDt;
	}

	public void setBiConstDt(Date biConstDt) {
		this.biConstDt = biConstDt;
	}

	public String getBiDistOfcCd() {
		return this.biDistOfcCd;
	}

	public void setBiDistOfcCd(String biDistOfcCd) {
		this.biDistOfcCd = biDistOfcCd;
	}

	public Date getBiEdiEligDt() {
		return this.biEdiEligDt;
	}

	public void setBiEdiEligDt(Date biEdiEligDt) {
		this.biEdiEligDt = biEdiEligDt;
	}

	public String getBiEdiUniversalId() {
		return this.biEdiUniversalId;
	}

	public void setBiEdiUniversalId(String biEdiUniversalId) {
		this.biEdiUniversalId = biEdiUniversalId;
	}

	public String getBiElectrician() {
		return this.biElectrician;
	}

	public void setBiElectrician(String biElectrician) {
		this.biElectrician = biElectrician;
	}

	public String getBiElectricianCert() {
		return this.biElectricianCert;
	}

	public void setBiElectricianCert(String biElectricianCert) {
		this.biElectricianCert = biElectricianCert;
	}

	public String getBiEmerAddr() {
		return this.biEmerAddr;
	}

	public void setBiEmerAddr(String biEmerAddr) {
		this.biEmerAddr = biEmerAddr;
	}

	public String getBiFranTaxCd() {
		return this.biFranTaxCd;
	}

	public void setBiFranTaxCd(String biFranTaxCd) {
		this.biFranTaxCd = biFranTaxCd;
	}

	public String getBiGpsSesnId() {
		return this.biGpsSesnId;
	}

	public void setBiGpsSesnId(String biGpsSesnId) {
		this.biGpsSesnId = biGpsSesnId;
	}

	public String getBiHeatTypePri() {
		return this.biHeatTypePri;
	}

	public void setBiHeatTypePri(String biHeatTypePri) {
		this.biHeatTypePri = biHeatTypePri;
	}

	public String getBiHeatTypeSec() {
		return this.biHeatTypeSec;
	}

	public void setBiHeatTypeSec(String biHeatTypeSec) {
		this.biHeatTypeSec = biHeatTypeSec;
	}

	public String getBiLmnSrvArea() {
		return this.biLmnSrvArea;
	}

	public void setBiLmnSrvArea(String biLmnSrvArea) {
		this.biLmnSrvArea = biLmnSrvArea;
	}

	public String getBiLocType() {
		return this.biLocType;
	}

	public void setBiLocType(String biLocType) {
		this.biLocType = biLocType;
	}

	public String getBiMapBook() {
		return this.biMapBook;
	}

	public void setBiMapBook(String biMapBook) {
		this.biMapBook = biMapBook;
	}

	public BigDecimal getBiMotorHp1() {
		return this.biMotorHp1;
	}

	public void setBiMotorHp1(BigDecimal biMotorHp1) {
		this.biMotorHp1 = biMotorHp1;
	}

	public BigDecimal getBiMotorHp2() {
		return this.biMotorHp2;
	}

	public void setBiMotorHp2(BigDecimal biMotorHp2) {
		this.biMotorHp2 = biMotorHp2;
	}

	public BigDecimal getBiMultiDwlg() {
		return this.biMultiDwlg;
	}

	public void setBiMultiDwlg(BigDecimal biMultiDwlg) {
		this.biMultiDwlg = biMultiDwlg;
	}

	public String getBiMultiDwlgType() {
		return this.biMultiDwlgType;
	}

	public void setBiMultiDwlgType(String biMultiDwlgType) {
		this.biMultiDwlgType = biMultiDwlgType;
	}

	public String getBiOthTaxCd() {
		return this.biOthTaxCd;
	}

	public void setBiOthTaxCd(String biOthTaxCd) {
		this.biOthTaxCd = biOthTaxCd;
	}

	public String getBiOwnerAgreeIfDisSw() {
		return this.biOwnerAgreeIfDisSw;
	}

	public void setBiOwnerAgreeIfDisSw(String biOwnerAgreeIfDisSw) {
		this.biOwnerAgreeIfDisSw = biOwnerAgreeIfDisSw;
	}

	public BigDecimal getBiOwnerCustNbr() {
		return this.biOwnerCustNbr;
	}

	public void setBiOwnerCustNbr(BigDecimal biOwnerCustNbr) {
		this.biOwnerCustNbr = biOwnerCustNbr;
	}

	public String getBiPermitNbr() {
		return this.biPermitNbr;
	}

	public void setBiPermitNbr(String biPermitNbr) {
		this.biPermitNbr = biPermitNbr;
	}

	public String getBiPlus2() {
		return this.biPlus2;
	}

	public void setBiPlus2(String biPlus2) {
		this.biPlus2 = biPlus2;
	}

	public String getBiPlus4() {
		return this.biPlus4;
	}

	public void setBiPlus4(String biPlus4) {
		this.biPlus4 = biPlus4;
	}

	public String getBiPrimaryMeterSw() {
		return this.biPrimaryMeterSw;
	}

	public void setBiPrimaryMeterSw(String biPrimaryMeterSw) {
		this.biPrimaryMeterSw = biPrimaryMeterSw;
	}

	public String getBiRange() {
		return this.biRange;
	}

	public void setBiRange(String biRange) {
		this.biRange = biRange;
	}

	public String getBiRemark() {
		return this.biRemark;
	}

	public void setBiRemark(String biRemark) {
		this.biRemark = biRemark;
	}

	public BigDecimal getBiRevAreaCtlIdNbr() {
		return this.biRevAreaCtlIdNbr;
	}

	public void setBiRevAreaCtlIdNbr(BigDecimal biRevAreaCtlIdNbr) {
		this.biRevAreaCtlIdNbr = biRevAreaCtlIdNbr;
	}

	public String getBiRowEasement() {
		return this.biRowEasement;
	}

	public void setBiRowEasement(String biRowEasement) {
		this.biRowEasement = biRowEasement;
	}

	public BigDecimal getBiRowLen() {
		return this.biRowLen;
	}

	public void setBiRowLen(BigDecimal biRowLen) {
		this.biRowLen = biRowLen;
	}

	public BigDecimal getBiRowWidth() {
		return this.biRowWidth;
	}

	public void setBiRowWidth(BigDecimal biRowWidth) {
		this.biRowWidth = biRowWidth;
	}

	public String getBiSchlDistCd() {
		return this.biSchlDistCd;
	}

	public void setBiSchlDistCd(String biSchlDistCd) {
		this.biSchlDistCd = biSchlDistCd;
	}

	public String getBiSect() {
		return this.biSect;
	}

	public void setBiSect(String biSect) {
		this.biSect = biSect;
	}

	public String getBiSoil() {
		return this.biSoil;
	}

	public void setBiSoil(String biSoil) {
		this.biSoil = biSoil;
	}

	public String getBiSrvConduct() {
		return this.biSrvConduct;
	}

	public void setBiSrvConduct(String biSrvConduct) {
		this.biSrvConduct = biSrvConduct;
	}

	public String getBiSrvDesc() {
		return this.biSrvDesc;
	}

	public void setBiSrvDesc(String biSrvDesc) {
		this.biSrvDesc = biSrvDesc;
	}

	public BigDecimal getBiSrvLocCtr() {
		return this.biSrvLocCtr;
	}

	public void setBiSrvLocCtr(BigDecimal biSrvLocCtr) {
		this.biSrvLocCtr = biSrvLocCtr;
	}

	public String getBiSrvMapLoc() {
		return this.biSrvMapLoc;
	}

	public void setBiSrvMapLoc(String biSrvMapLoc) {
		this.biSrvMapLoc = biSrvMapLoc;
	}

	public String getBiSrvOhUg() {
		return this.biSrvOhUg;
	}

	public void setBiSrvOhUg(String biSrvOhUg) {
		this.biSrvOhUg = biSrvOhUg;
	}

	public BigDecimal getBiSrvSpanLen() {
		return this.biSrvSpanLen;
	}

	public void setBiSrvSpanLen(BigDecimal biSrvSpanLen) {
		this.biSrvSpanLen = biSrvSpanLen;
	}

	public String getBiSt() {
		return this.biSt;
	}

	public void setBiSt(String biSt) {
		this.biSt = biSt;
	}

	public String getBiSubdBlk() {
		return this.biSubdBlk;
	}

	public void setBiSubdBlk(String biSubdBlk) {
		this.biSubdBlk = biSubdBlk;
	}

	public String getBiSubdLot() {
		return this.biSubdLot;
	}

	public void setBiSubdLot(String biSubdLot) {
		this.biSubdLot = biSubdLot;
	}

	public String getBiSubdName() {
		return this.biSubdName;
	}

	public void setBiSubdName(String biSubdName) {
		this.biSubdName = biSubdName;
	}

	public String getBiTaxDistCd() {
		return this.biTaxDistCd;
	}

	public void setBiTaxDistCd(String biTaxDistCd) {
		this.biTaxDistCd = biTaxDistCd;
	}

	public String getBiTempPermCd() {
		return this.biTempPermCd;
	}

	public void setBiTempPermCd(String biTempPermCd) {
		this.biTempPermCd = biTempPermCd;
	}

	public String getBiTerrain() {
		return this.biTerrain;
	}

	public void setBiTerrain(String biTerrain) {
		this.biTerrain = biTerrain;
	}

	public String getBiTownCd() {
		return this.biTownCd;
	}

	public void setBiTownCd(String biTownCd) {
		this.biTownCd = biTownCd;
	}

	public String getBiTrfCutoffSw() {
		return this.biTrfCutoffSw;
	}

	public void setBiTrfCutoffSw(String biTrfCutoffSw) {
		this.biTrfCutoffSw = biTrfCutoffSw;
	}

	public BigDecimal getBiTvRegionIdNbr() {
		return this.biTvRegionIdNbr;
	}

	public void setBiTvRegionIdNbr(BigDecimal biTvRegionIdNbr) {
		this.biTvRegionIdNbr = biTvRegionIdNbr;
	}

	public String getBiTwnshp() {
		return this.biTwnshp;
	}

	public void setBiTwnshp(String biTwnshp) {
		this.biTwnshp = biTwnshp;
	}

	public String getBiTypeCarr() {
		return this.biTypeCarr;
	}

	public void setBiTypeCarr(String biTypeCarr) {
		this.biTypeCarr = biTypeCarr;
	}

	public String getBiUseCd() {
		return this.biUseCd;
	}

	public void setBiUseCd(String biUseCd) {
		this.biUseCd = biUseCd;
	}

	public String getBiWtrHtrType1() {
		return this.biWtrHtrType1;
	}

	public void setBiWtrHtrType1(String biWtrHtrType1) {
		this.biWtrHtrType1 = biWtrHtrType1;
	}

	public String getBiWtrHtrType2() {
		return this.biWtrHtrType2;
	}

	public void setBiWtrHtrType2(String biWtrHtrType2) {
		this.biWtrHtrType2 = biWtrHtrType2;
	}

	public String getBiXCoord() {
		return this.biXCoord;
	}

	public void setBiXCoord(String biXCoord) {
		this.biXCoord = biXCoord;
	}

	public String getBiYCoord() {
		return this.biYCoord;
	}

	public void setBiYCoord(String biYCoord) {
		this.biYCoord = biYCoord;
	}

	public String getBiZip() {
		return this.biZip;
	}

	public void setBiZip(String biZip) {
		this.biZip = biZip;
	}
}
