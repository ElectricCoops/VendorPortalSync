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
@Table(name = "WO_CAU_REF", schema = "ABS11013")
@NamedQueries({ @NamedQuery(name = "WoCauRef.findAll", query = "SELECT w FROM WoCauRef w"),
		@NamedQuery(name = "WoCauRef.findDescByCau", query = "SELECT w FROM WoCauRef w WHERE w.woCauId = :cauId") })
public class WoCauRef implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "WO_CAU_ID")
	private String woCauId;
	@Column(name = "SY_AUDIT_PROC_NM")
	private String syAuditProcNm;
	@Column(name = "SY_AUDIT_TRAN_ID")
	private String syAuditTranId;
	@Column(name = "SY_AUDIT_USER_ID")
	private BigDecimal syAuditUserId;
	@Column(name = "SY_IMAGE_KEY")
	private BigDecimal syImageKey;
	@Column(name = "WO_CAU_CD")
	private String woCauCd;
	@Column(name = "WO_CAU_REF_CTR")
	private BigDecimal woCauRefCtr;
	@Column(name = "WO_DESC")
	private String woDesc;
	@Column(name = "WO_MISC_REQ_CD")
	private String woMiscReqCd;
	@Column(name = "WO_MS_EXTRACT_SW")
	private String woMsExtractSw;
	@Column(name = "WO_NEUTRAL_REQ_CD")
	private String woNeutralReqCd;
	@Column(name = "WO_POLE_REQ_CD")
	private String woPoleReqCd;
	@Column(name = "WO_REQ_PICK_LIST_ID_SW")
	private String woReqPickListIdSw;
	@Column(name = "WO_STAT_CD")
	private String woStatCd;
	@Column(name = "WO_WIRE_REQ_CD")
	private String woWireReqCd;

	public String getWoCauId() {
		return this.woCauId;
	}

	public void setWoCauId(String woCauId) {
		this.woCauId = woCauId;
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

	public BigDecimal getSyImageKey() {
		return this.syImageKey;
	}

	public void setSyImageKey(BigDecimal syImageKey) {
		this.syImageKey = syImageKey;
	}

	public String getWoCauCd() {
		return this.woCauCd;
	}

	public void setWoCauCd(String woCauCd) {
		this.woCauCd = woCauCd;
	}

	public BigDecimal getWoCauRefCtr() {
		return this.woCauRefCtr;
	}

	public void setWoCauRefCtr(BigDecimal woCauRefCtr) {
		this.woCauRefCtr = woCauRefCtr;
	}

	public String getWoDesc() {
		return this.woDesc;
	}

	public void setWoDesc(String woDesc) {
		this.woDesc = woDesc;
	}

	public String getWoMiscReqCd() {
		return this.woMiscReqCd;
	}

	public void setWoMiscReqCd(String woMiscReqCd) {
		this.woMiscReqCd = woMiscReqCd;
	}

	public String getWoMsExtractSw() {
		return this.woMsExtractSw;
	}

	public void setWoMsExtractSw(String woMsExtractSw) {
		this.woMsExtractSw = woMsExtractSw;
	}

	public String getWoNeutralReqCd() {
		return this.woNeutralReqCd;
	}

	public void setWoNeutralReqCd(String woNeutralReqCd) {
		this.woNeutralReqCd = woNeutralReqCd;
	}

	public String getWoPoleReqCd() {
		return this.woPoleReqCd;
	}

	public void setWoPoleReqCd(String woPoleReqCd) {
		this.woPoleReqCd = woPoleReqCd;
	}

	public String getWoReqPickListIdSw() {
		return this.woReqPickListIdSw;
	}

	public void setWoReqPickListIdSw(String woReqPickListIdSw) {
		this.woReqPickListIdSw = woReqPickListIdSw;
	}

	public String getWoStatCd() {
		return this.woStatCd;
	}

	public void setWoStatCd(String woStatCd) {
		this.woStatCd = woStatCd;
	}

	public String getWoWireReqCd() {
		return this.woWireReqCd;
	}

	public void setWoWireReqCd(String woWireReqCd) {
		this.woWireReqCd = woWireReqCd;
	}
}
