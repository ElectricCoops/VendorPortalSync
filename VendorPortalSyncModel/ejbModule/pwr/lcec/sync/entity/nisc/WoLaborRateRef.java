package pwr.lcec.sync.entity.nisc;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "WO_LABOR_RATE_REF", schema = "ABS11013")
@NamedQueries({ @NamedQuery(name = "WoLaborRateRef.findAll", query = "SELECT w FROM WoLaborRateRef w"),
		@NamedQuery(name = "WoLaborRateRef.findWoAmountByRateCd", query = "SELECT w FROM WoLaborRateRef w WHERE w.woLaborRateCd = :laborRate") })
public class WoLaborRateRef implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "WO_LABOR_RATE_CD")
	private String woLaborRateCd;
	@Column(name = "SY_AUDIT_PROC_NM")
	private String syAuditProcNm;
	@Column(name = "SY_AUDIT_TRAN_ID")
	private String syAuditTranId;
	@Column(name = "SY_AUDIT_USER_ID")
	private BigDecimal syAuditUserId;
	@Column(name = "WO_AMT")
	private BigDecimal woAmt;
	@Column(name = "WO_CHG_CD")
	private BigDecimal woChgCd;
	@Column(name = "WO_DESC")
	private String woDesc;
	@Column(name = "WO_LABOR_RATE_REF_CTR")
	private BigDecimal woLaborRateRefCtr;
	@Column(name = "WO_STAT_CD")
	private String woStatCd;

	public String getWoLaborRateCd() {
		return this.woLaborRateCd;
	}

	public void setWoLaborRateCd(String woLaborRateCd) {
		this.woLaborRateCd = woLaborRateCd;
	}

	public String getSyAuditProcNm() {
		return this.syAuditProcNm;
	}

	public void setSyAuditProcNm(String syAuditProcNm) {
		this.syAuditProcNm = syAuditProcNm;
	}

	public String getSyAuditTranId() {
		return this.syAuditTranId;
	}

	public void setSyAuditTranId(String syAuditTranId) {
		this.syAuditTranId = syAuditTranId;
	}

	public BigDecimal getSyAuditUserId() {
		return this.syAuditUserId;
	}

	public void setSyAuditUserId(BigDecimal syAuditUserId) {
		this.syAuditUserId = syAuditUserId;
	}

	public BigDecimal getWoAmt() {
		return this.woAmt;
	}

	public void setWoAmt(BigDecimal woAmt) {
		this.woAmt = woAmt;
	}

	public BigDecimal getWoChgCd() {
		return this.woChgCd;
	}

	public void setWoChgCd(BigDecimal woChgCd) {
		this.woChgCd = woChgCd;
	}

	public String getWoDesc() {
		return this.woDesc;
	}

	public void setWoDesc(String woDesc) {
		this.woDesc = woDesc;
	}

	public BigDecimal getWoLaborRateRefCtr() {
		return this.woLaborRateRefCtr;
	}

	public void setWoLaborRateRefCtr(BigDecimal woLaborRateRefCtr) {
		this.woLaborRateRefCtr = woLaborRateRefCtr;
	}

	public String getWoStatCd() {
		return this.woStatCd;
	}

	public void setWoStatCd(String woStatCd) {
		this.woStatCd = woStatCd;
	}
}
