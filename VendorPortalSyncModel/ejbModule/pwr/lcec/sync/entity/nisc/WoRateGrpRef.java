package pwr.lcec.sync.entity.nisc;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "WO_RATE_GRP_REF", schema = "ABS11013")
@NamedQuery(name = "WoRateGrpRef.findAll", query = "SELECT w FROM WoRateGrpRef w")
public class WoRateGrpRef implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "WO_RATE_GRP_CD")
	private String woRateGrpCd;
	@Column(name = "SY_AUDIT_PROC_NM")
	private String syAuditProcNm;
	@Column(name = "SY_AUDIT_TRAN_ID")
	private String syAuditTranId;
	@Column(name = "SY_AUDIT_USER_ID")
	private BigDecimal syAuditUserId;
	@Column(name = "WO_CHG_CD")
	private BigDecimal woChgCd;
	@Column(name = "WO_DESC")
	private String woDesc;
	@Column(name = "WO_FIXED_RATE_SW")
	private String woFixedRateSw;
	@Column(name = "WO_RATE_GRP_REF_CTR")
	private BigDecimal woRateGrpRefCtr;
	@Column(name = "WO_STAT_CD")
	private String woStatCd;

	public String getWoRateGrpCd() {
		return this.woRateGrpCd;
	}

	public void setWoRateGrpCd(String woRateGrpCd) {
		this.woRateGrpCd = woRateGrpCd;
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

	public String getWoFixedRateSw() {
		return this.woFixedRateSw;
	}

	public void setWoFixedRateSw(String woFixedRateSw) {
		this.woFixedRateSw = woFixedRateSw;
	}

	public BigDecimal getWoRateGrpRefCtr() {
		return this.woRateGrpRefCtr;
	}

	public void setWoRateGrpRefCtr(BigDecimal woRateGrpRefCtr) {
		this.woRateGrpRefCtr = woRateGrpRefCtr;
	}

	public String getWoStatCd() {
		return this.woStatCd;
	}

	public void setWoStatCd(String woStatCd) {
		this.woStatCd = woStatCd;
	}
}
