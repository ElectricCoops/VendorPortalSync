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
@Table(name = "CIS11013.BI_WRKFLW")
@NamedQueries({ @NamedQuery(name = "BiWrkflw.findAll", query = "SELECT b FROM BiWrkflw b"),
		@NamedQuery(name = "BiWrkflw.findWFByKey", query = "SELECT b FROM BiWrkflw b WHERE b.biWrkflwKey = :workflow") })
public class BiWrkflw implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "BI_WRKFLW_KEY")
	private Integer biWrkflwKey;
	@Column(name = "BI_CLOSE_MANNER_CD")
	private String biCloseMannerCd;
	@Column(name = "BI_DIST_OFC_CD")
	private String biDistOfcCd;
	@Column(name = "BI_DT_TM_CD")
	private String biDtTmCd;
	@Temporal(TemporalType.DATE)
	@Column(name = "BI_EVENT_DT_TM")
	private Date biEventDtTm;
	@Column(name = "BI_LAST_ACT_KEY")
	private BigDecimal biLastActKey;
	@Column(name = "BI_LMN_SRV_AREA")
	private String biLmnSrvArea;
	@Column(name = "BI_NEEDED_CD")
	private String biNeededCd;
	@Temporal(TemporalType.DATE)
	@Column(name = "BI_NEEDED_DT_TM")
	private Date biNeededDtTm;
	@Column(name = "BI_OWNED_BY_CD")
	private String biOwnedByCd;
	@Column(name = "BI_SO_PRTY_CD")
	private String biSoPrtyCd;
	@Temporal(TemporalType.DATE)
	@Column(name = "BI_TARGET_DT")
	private Date biTargetDt;
	@Column(name = "BI_WORK_EVENT_CD")
	private String biWorkEventCd;
	@Column(name = "BI_WRKFLW_CTR")
	private BigDecimal biWrkflwCtr;
	@Column(name = "BI_WRKFLW_DESC")
	private String biWrkflwDesc;
	@Column(name = "BI_WRKFLW_TMPLT_ID")
	private BigDecimal biWrkflwTmpltId;

	public Integer getBiWrkflwKey() {
		return this.biWrkflwKey;
	}

	public void setBiWrkflwKey(Integer biWrkflwKey) {
		this.biWrkflwKey = biWrkflwKey;
	}

	public String getBiCloseMannerCd() {
		return this.biCloseMannerCd;
	}

	public void setBiCloseMannerCd(String biCloseMannerCd) {
		this.biCloseMannerCd = biCloseMannerCd;
	}

	public String getBiDistOfcCd() {
		return this.biDistOfcCd;
	}

	public void setBiDistOfcCd(String biDistOfcCd) {
		this.biDistOfcCd = biDistOfcCd;
	}

	public String getBiDtTmCd() {
		return this.biDtTmCd;
	}

	public void setBiDtTmCd(String biDtTmCd) {
		this.biDtTmCd = biDtTmCd;
	}

	public Date getBiEventDtTm() {
		return this.biEventDtTm;
	}

	public void setBiEventDtTm(Date biEventDtTm) {
		this.biEventDtTm = biEventDtTm;
	}

	public BigDecimal getBiLastActKey() {
		return this.biLastActKey;
	}

	public void setBiLastActKey(BigDecimal biLastActKey) {
		this.biLastActKey = biLastActKey;
	}

	public String getBiLmnSrvArea() {
		return this.biLmnSrvArea;
	}

	public void setBiLmnSrvArea(String biLmnSrvArea) {
		this.biLmnSrvArea = biLmnSrvArea;
	}

	public String getBiNeededCd() {
		return this.biNeededCd;
	}

	public void setBiNeededCd(String biNeededCd) {
		this.biNeededCd = biNeededCd;
	}

	public Date getBiNeededDtTm() {
		return this.biNeededDtTm;
	}

	public void setBiNeededDtTm(Date biNeededDtTm) {
		this.biNeededDtTm = biNeededDtTm;
	}

	public String getBiOwnedByCd() {
		return this.biOwnedByCd;
	}

	public void setBiOwnedByCd(String biOwnedByCd) {
		this.biOwnedByCd = biOwnedByCd;
	}

	public String getBiSoPrtyCd() {
		return this.biSoPrtyCd;
	}

	public void setBiSoPrtyCd(String biSoPrtyCd) {
		this.biSoPrtyCd = biSoPrtyCd;
	}

	public Date getBiTargetDt() {
		return this.biTargetDt;
	}

	public void setBiTargetDt(Date biTargetDt) {
		this.biTargetDt = biTargetDt;
	}

	public String getBiWorkEventCd() {
		return this.biWorkEventCd;
	}

	public void setBiWorkEventCd(String biWorkEventCd) {
		this.biWorkEventCd = biWorkEventCd;
	}

	public BigDecimal getBiWrkflwCtr() {
		return this.biWrkflwCtr;
	}

	public void setBiWrkflwCtr(BigDecimal biWrkflwCtr) {
		this.biWrkflwCtr = biWrkflwCtr;
	}

	public String getBiWrkflwDesc() {
		return this.biWrkflwDesc;
	}

	public void setBiWrkflwDesc(String biWrkflwDesc) {
		this.biWrkflwDesc = biWrkflwDesc;
	}

	public BigDecimal getBiWrkflwTmpltId() {
		return this.biWrkflwTmpltId;
	}

	public void setBiWrkflwTmpltId(BigDecimal biWrkflwTmpltId) {
		this.biWrkflwTmpltId = biWrkflwTmpltId;
	}
}
