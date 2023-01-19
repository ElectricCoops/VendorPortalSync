package pwr.lcec.sync.entity.nisc;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "WO_CAU_REF_RATE", schema = "ABS11013")
@NamedQueries({ @NamedQuery(name = "WoCauRefRate.findAll", query = "SELECT w FROM WoCauRefRate w"),
		@NamedQuery(name = "WoCauRefRate.findRateByGrp", query = "SELECT w FROM WoCauRefRate w WHERE w.id.woRateGrpCd = :rateGrp"),
		@NamedQuery(name = "WoCauRefRate.findRateByGrpCau", query = "SELECT w FROM WoCauRefRate w WHERE w.id.woRateGrpCd = :grpName AND w.id.woCauId = :cau") })
public class WoCauRefRate implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private WoCauRefRatePK id;
	@Column(name = "SY_AUDIT_PROC_NM")
	private String syAuditProcNm;
	@Column(name = "SY_AUDIT_TRAN_ID")
	private String syAuditTranId;
	@Column(name = "SY_AUDIT_USER_ID")
	private BigDecimal syAuditUserId;
	@Column(name = "WO_CAU_REF_RATE_CTR")
	private BigDecimal woCauRefRateCtr;
	@Column(name = "WO_CONS_HRS")
	private BigDecimal woConsHrs;
	//@Column(name = "WO_FIXED_AMT")
	//private BigDecimal woFixedAmt;
	@Column(name = "WO_LABOR_RATE_CONS_CD")
	private String woLaborRateConsCd;
	@Column(name = "WO_LABOR_RATE_RETIRE_CD")
	private String woLaborRateRetireCd;
	@Column(name = "WO_MEA_HRS")
	private BigDecimal woMeaHrs;
	@Column(name = "WO_OVHD_RATE_GRP_CONS_CD")
	private String woOvhdRateGrpConsCd;
	@Column(name = "WO_OVHD_RATE_GRP_RET_CD")
	private String woOvhdRateGrpRetCd;
	@Column(name = "WO_RETIRE_HRS")
	private BigDecimal woRetireHrs;

	public WoCauRefRatePK getId() {
		return this.id;
	}

	public void setId(WoCauRefRatePK id) {
		this.id = id;
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

	public BigDecimal getWoCauRefRateCtr() {
		return this.woCauRefRateCtr;
	}

	public void setWoCauRefRateCtr(BigDecimal woCauRefRateCtr) {
		this.woCauRefRateCtr = woCauRefRateCtr;
	}

	public BigDecimal getWoConsHrs() {
		return this.woConsHrs;
	}

	public void setWoConsHrs(BigDecimal woConsHrs) {
		this.woConsHrs = woConsHrs;
	}

	/*public BigDecimal getWoFixedAmt() {
		return this.woFixedAmt;
	}

	public void setWoFixedAmt(BigDecimal woFixedAmt) {
		this.woFixedAmt = woFixedAmt;
	}*/

	public String getWoLaborRateConsCd() {
		return this.woLaborRateConsCd;
	}

	public void setWoLaborRateConsCd(String woLaborRateConsCd) {
		this.woLaborRateConsCd = woLaborRateConsCd;
	}

	public String getWoLaborRateRetireCd() {
		return this.woLaborRateRetireCd;
	}

	public void setWoLaborRateRetireCd(String woLaborRateRetireCd) {
		this.woLaborRateRetireCd = woLaborRateRetireCd;
	}

	public BigDecimal getWoMeaHrs() {
		return this.woMeaHrs;
	}

	public void setWoMeaHrs(BigDecimal woMeaHrs) {
		this.woMeaHrs = woMeaHrs;
	}

	public String getWoOvhdRateGrpConsCd() {
		return this.woOvhdRateGrpConsCd;
	}

	public void setWoOvhdRateGrpConsCd(String woOvhdRateGrpConsCd) {
		this.woOvhdRateGrpConsCd = woOvhdRateGrpConsCd;
	}

	public String getWoOvhdRateGrpRetCd() {
		return this.woOvhdRateGrpRetCd;
	}

	public void setWoOvhdRateGrpRetCd(String woOvhdRateGrpRetCd) {
		this.woOvhdRateGrpRetCd = woOvhdRateGrpRetCd;
	}

	public BigDecimal getWoRetireHrs() {
		return this.woRetireHrs;
	}

	public void setWoRetireHrs(BigDecimal woRetireHrs) {
		this.woRetireHrs = woRetireHrs;
	}
}
