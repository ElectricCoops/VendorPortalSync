package pwr.lcec.sync.entity.nisc;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "BI_RESOURCE_REF", schema = "CIS11013")
@NamedQueries({ @NamedQuery(name = "BiResourceRef.findAll", query = "SELECT b FROM BiResourceRef b"),
		@NamedQuery(name = "BiResourceRef.findResourceByUserId", query = "SELECT b FROM BiResourceRef b WHERE b.syUserId = :syUserId") })
public class BiResourceRef implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "BI_RESOURCE_ID")
	private long biResourceId;
	@Column(name = "BI_ACTIVE_SW")
	private String biActiveSw;
	@Column(name = "BI_CREW")
	private String biCrew;
	@Temporal(TemporalType.DATE)
	@Column(name = "BI_EFFECT_BEG_DT")
	private Date biEffectBegDt;
	@Temporal(TemporalType.DATE)
	@Column(name = "BI_EFFECT_END_DT")
	private Date biEffectEndDt;
	@Column(name = "BI_EMPLOYEE_NBR")
	private BigDecimal biEmployeeNbr;
	@Temporal(TemporalType.DATE)
	@Column(name = "BI_END_DT_TM")
	private Date biEndDtTm;
	@Temporal(TemporalType.DATE)
	@Column(name = "BI_LUNCH_END_DT_TM")
	private Date biLunchEndDtTm;
	@Temporal(TemporalType.DATE)
	@Column(name = "BI_LUNCH_START_DT_TM")
	private Date biLunchStartDtTm;
	@Column(name = "BI_RESOURCE_ACTIVE_SW")
	private String biResourceActiveSw;
	@Column(name = "BI_RESOURCE_JOB_TITLE")
	private String biResourceJobTitle;
	@Column(name = "BI_RESOURCE_LOC")
	private String biResourceLoc;
	@Column(name = "BI_RESOURCE_LOC_ID")
	private BigDecimal biResourceLocId;
	@Column(name = "BI_RESOURCE_NM")
	private String biResourceNm;
	@Column(name = "BI_RESOURCE_REF_CTR")
	private BigDecimal biResourceRefCtr;
	@Column(name = "BI_RESOURCE_TYPE_CD")
	private String biResourceTypeCd;
	@Column(name = "BI_RESOURCE_VEND_NBR")
	private BigDecimal biResourceVendNbr;
	@Temporal(TemporalType.DATE)
	@Column(name = "BI_START_DT_TM")
	private Date biStartDtTm;
	@Column(name = "BI_WORK_DAYS")
	private String biWorkDays;
	@Column(name = "SY_USER_ID")
	private int syUserId;
	@Column(name = "WM_X_COORD")
	private String wmXCoord;
	@Column(name = "WM_Y_COORD")
	private String wmYCoord;

	public long getBiResourceId() {
		return this.biResourceId;
	}

	public void setBiResourceId(long biResourceId) {
		this.biResourceId = biResourceId;
	}

	public String getBiActiveSw() {
		return this.biActiveSw;
	}

	public void setBiActiveSw(String biActiveSw) {
		this.biActiveSw = biActiveSw;
	}

	public String getBiCrew() {
		return this.biCrew;
	}

	public void setBiCrew(String biCrew) {
		this.biCrew = biCrew;
	}

	public Date getBiEffectBegDt() {
		return this.biEffectBegDt;
	}

	public void setBiEffectBegDt(Date biEffectBegDt) {
		this.biEffectBegDt = biEffectBegDt;
	}

	public Date getBiEffectEndDt() {
		return this.biEffectEndDt;
	}

	public void setBiEffectEndDt(Date biEffectEndDt) {
		this.biEffectEndDt = biEffectEndDt;
	}

	public BigDecimal getBiEmployeeNbr() {
		return this.biEmployeeNbr;
	}

	public void setBiEmployeeNbr(BigDecimal biEmployeeNbr) {
		this.biEmployeeNbr = biEmployeeNbr;
	}

	public Date getBiEndDtTm() {
		return this.biEndDtTm;
	}

	public void setBiEndDtTm(Date biEndDtTm) {
		this.biEndDtTm = biEndDtTm;
	}

	public Date getBiLunchEndDtTm() {
		return this.biLunchEndDtTm;
	}

	public void setBiLunchEndDtTm(Date biLunchEndDtTm) {
		this.biLunchEndDtTm = biLunchEndDtTm;
	}

	public Date getBiLunchStartDtTm() {
		return this.biLunchStartDtTm;
	}

	public void setBiLunchStartDtTm(Date biLunchStartDtTm) {
		this.biLunchStartDtTm = biLunchStartDtTm;
	}

	public String getBiResourceActiveSw() {
		return this.biResourceActiveSw;
	}

	public void setBiResourceActiveSw(String biResourceActiveSw) {
		this.biResourceActiveSw = biResourceActiveSw;
	}

	public String getBiResourceJobTitle() {
		return this.biResourceJobTitle;
	}

	public void setBiResourceJobTitle(String biResourceJobTitle) {
		this.biResourceJobTitle = biResourceJobTitle;
	}

	public String getBiResourceLoc() {
		return this.biResourceLoc;
	}

	public void setBiResourceLoc(String biResourceLoc) {
		this.biResourceLoc = biResourceLoc;
	}

	public BigDecimal getBiResourceLocId() {
		return this.biResourceLocId;
	}

	public void setBiResourceLocId(BigDecimal biResourceLocId) {
		this.biResourceLocId = biResourceLocId;
	}

	public String getBiResourceNm() {
		return this.biResourceNm;
	}

	public void setBiResourceNm(String biResourceNm) {
		this.biResourceNm = biResourceNm;
	}

	public BigDecimal getBiResourceRefCtr() {
		return this.biResourceRefCtr;
	}

	public void setBiResourceRefCtr(BigDecimal biResourceRefCtr) {
		this.biResourceRefCtr = biResourceRefCtr;
	}

	public String getBiResourceTypeCd() {
		return this.biResourceTypeCd;
	}

	public void setBiResourceTypeCd(String biResourceTypeCd) {
		this.biResourceTypeCd = biResourceTypeCd;
	}

	public BigDecimal getBiResourceVendNbr() {
		return this.biResourceVendNbr;
	}

	public void setBiResourceVendNbr(BigDecimal biResourceVendNbr) {
		this.biResourceVendNbr = biResourceVendNbr;
	}

	public Date getBiStartDtTm() {
		return this.biStartDtTm;
	}

	public void setBiStartDtTm(Date biStartDtTm) {
		this.biStartDtTm = biStartDtTm;
	}

	public String getBiWorkDays() {
		return this.biWorkDays;
	}

	public void setBiWorkDays(String biWorkDays) {
		this.biWorkDays = biWorkDays;
	}

	public int getSyUserId() {
		return this.syUserId;
	}

	public void setSyUserId(int syUserId) {
		this.syUserId = syUserId;
	}

	public String getWmXCoord() {
		return this.wmXCoord;
	}

	public void setWmXCoord(String wmXCoord) {
		this.wmXCoord = wmXCoord;
	}

	public String getWmYCoord() {
		return this.wmYCoord;
	}

	public void setWmYCoord(String wmYCoord) {
		this.wmYCoord = wmYCoord;
	}
}
