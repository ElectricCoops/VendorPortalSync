package pwr.lcec.sync.entity.nisc;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "AP_BATCH_TRAN_DIST", schema = "ABS11013")
@NamedQueries({ @NamedQuery(name = "ApBatchTranDist.findAll", query = "SELECT a FROM ApBatchTranDist a"),
		@NamedQuery(name = "ApBatchTranDist.findByBatchTranKey", query = "SELECT a FROM ApBatchTranDist a WHERE a.id.apBatchTranKey = :apBatchTranKey AND a.id.apSeqNbr = 1") })
public class ApBatchTranDist implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private ApBatchTranDistPK id;
	@Column(name = "AM_ASSET_ID")
	private String amAssetId;
	@Column(name = "AM_BARCODE_ID")
	private String amBarcodeId;
	@Column(name = "AM_DESC")
	private String amDesc;
	@Column(name = "AM_GRP_CD")
	private String amGrpCd;
	@Column(name = "AM_INCR_POS_NBR")
	private BigDecimal amIncrPosNbr;
	@Column(name = "AM_INCR_SEQ_NBR")
	private BigDecimal amIncrSeqNbr;
	@Column(name = "AM_LN_NBR")
	private BigDecimal amLnNbr;
	@Column(name = "AM_MULT_POS_SW")
	private String amMultPosSw;
	@Column(name = "AM_MULT_SEQ_SW")
	private String amMultSeqSw;
	@Column(name = "AM_POS_NBR")
	private BigDecimal amPosNbr;
	@Column(name = "AM_QTY")
	private BigDecimal amQty;
	@Column(name = "AM_SEQ_NBR")
	private BigDecimal amSeqNbr;
	@Column(name = "AM_SER_ID")
	private String amSerId;
	@Column(name = "AM_SPLIT_SEQ_NBR")
	private BigDecimal amSplitSeqNbr;
	@Column(name = "AM_TOT_SALV_AMT")
	private BigDecimal amTotSalvAmt;
	@Column(name = "AP_ADDT_CHG_1_AMT")
	private BigDecimal apAddtChg1Amt;
	@Column(name = "AP_ADDT_CHG_1_APPLY_SW")
	private String apAddtChg1ApplySw;
	@Column(name = "AP_ADDT_CHG_1_EXP_CD")
	private String apAddtChg1ExpCd;
	@Column(name = "AP_ADDT_CHG_2_AMT")
	private BigDecimal apAddtChg2Amt;
	@Column(name = "AP_ADDT_CHG_2_APPLY_SW")
	private String apAddtChg2ApplySw;
	@Column(name = "AP_ADDT_CHG_2_EXP_CD")
	private String apAddtChg2ExpCd;
	@Column(name = "AP_AMT")
	private BigDecimal apAmt;
	@Column(name = "AP_BATCH_TRAN_DIST_CTR")
	private BigDecimal apBatchTranDistCtr;
	@Column(name = "AP_DIFF_GL_ACCT_SW")
	private String apDiffGlAcctSw;
	@Column(name = "AP_INV_DISC_AMT")
	private BigDecimal apInvDiscAmt;
	@Column(name = "AP_SALES_TX_AMT")
	private BigDecimal apSalesTxAmt;
	@Column(name = "AP_TX_EXP_CD")
	private String apTxExpCd;
	@Column(name = "AP_TXBL_SW")
	private String apTxblSw;
	@Column(name = "AP_TYPE_CD")
	private String apTypeCd;
	@Column(name = "AP_USE_TX_AMT")
	private BigDecimal apUseTxAmt;
	@Column(name = "BU_PROJ_ID")
	private String buProjId;
	@Temporal(TemporalType.DATE)
	@Column(name = "CC_RETIRE_DT")
	private Date ccRetireDt;
	@Column(name = "GL_ACCT_SUB_AP_NBR")
	private BigDecimal glAcctSubApNbr;
	@Column(name = "GL_ACCT_SUB_NBR")
	private BigDecimal glAcctSubNbr;
	@Column(name = "GL_ACT_NBR")
	private BigDecimal glActNbr;
	@Column(name = "GL_DEPT_NBR")
	private BigDecimal glDeptNbr;
	@Column(name = "GL_DIV_AP_NBR")
	private BigDecimal glDivApNbr;
	@Column(name = "GL_DIV_CTRL_NBR")
	private BigDecimal glDivCtrlNbr;
	@Column(name = "GL_DIV_NBR")
	private BigDecimal glDivNbr;
	@Column(name = "GL_EXTEND_REF")
	private String glExtendRef;
	@Column(name = "GL_REF")
	private String glRef;
	@Column(name = "MI_MFG_ITEM")
	private String miMfgItem;
	@Column(name = "MI_QTY")
	private BigDecimal miQty;
	@Column(name = "PO_LN_NBR")
	private BigDecimal poLnNbr;
	@Column(name = "SY_1099_SW")
	private String sy1099Sw;
	@Column(name = "SY_AUDIT_PROC_NM")
	private String syAuditProcNm;
	@Column(name = "SY_AUDIT_TRAN_ID")
	private String syAuditTranId;
	@Column(name = "SY_AUDIT_USER_ID")
	private BigDecimal syAuditUserId;

	public ApBatchTranDistPK getId() {
		return this.id;
	}

	public void setId(ApBatchTranDistPK id) {
		this.id = id;
	}

	public String getAmAssetId() {
		return this.amAssetId;
	}

	public void setAmAssetId(String amAssetId) {
		this.amAssetId = amAssetId;
	}

	public String getAmBarcodeId() {
		return this.amBarcodeId;
	}

	public void setAmBarcodeId(String amBarcodeId) {
		this.amBarcodeId = amBarcodeId;
	}

	public String getAmDesc() {
		return this.amDesc;
	}

	public void setAmDesc(String amDesc) {
		this.amDesc = amDesc;
	}

	public String getAmGrpCd() {
		return this.amGrpCd;
	}

	public void setAmGrpCd(String amGrpCd) {
		this.amGrpCd = amGrpCd;
	}

	public BigDecimal getAmIncrPosNbr() {
		return this.amIncrPosNbr;
	}

	public void setAmIncrPosNbr(BigDecimal amIncrPosNbr) {
		this.amIncrPosNbr = amIncrPosNbr;
	}

	public BigDecimal getAmIncrSeqNbr() {
		return this.amIncrSeqNbr;
	}

	public void setAmIncrSeqNbr(BigDecimal amIncrSeqNbr) {
		this.amIncrSeqNbr = amIncrSeqNbr;
	}

	public BigDecimal getAmLnNbr() {
		return this.amLnNbr;
	}

	public void setAmLnNbr(BigDecimal amLnNbr) {
		this.amLnNbr = amLnNbr;
	}

	public String getAmMultPosSw() {
		return this.amMultPosSw;
	}

	public void setAmMultPosSw(String amMultPosSw) {
		this.amMultPosSw = amMultPosSw;
	}

	public String getAmMultSeqSw() {
		return this.amMultSeqSw;
	}

	public void setAmMultSeqSw(String amMultSeqSw) {
		this.amMultSeqSw = amMultSeqSw;
	}

	public BigDecimal getAmPosNbr() {
		return this.amPosNbr;
	}

	public void setAmPosNbr(BigDecimal amPosNbr) {
		this.amPosNbr = amPosNbr;
	}

	public BigDecimal getAmQty() {
		return this.amQty;
	}

	public void setAmQty(BigDecimal amQty) {
		this.amQty = amQty;
	}

	public BigDecimal getAmSeqNbr() {
		return this.amSeqNbr;
	}

	public void setAmSeqNbr(BigDecimal amSeqNbr) {
		this.amSeqNbr = amSeqNbr;
	}

	public String getAmSerId() {
		return this.amSerId;
	}

	public void setAmSerId(String amSerId) {
		this.amSerId = amSerId;
	}

	public BigDecimal getAmSplitSeqNbr() {
		return this.amSplitSeqNbr;
	}

	public void setAmSplitSeqNbr(BigDecimal amSplitSeqNbr) {
		this.amSplitSeqNbr = amSplitSeqNbr;
	}

	public BigDecimal getAmTotSalvAmt() {
		return this.amTotSalvAmt;
	}

	public void setAmTotSalvAmt(BigDecimal amTotSalvAmt) {
		this.amTotSalvAmt = amTotSalvAmt;
	}

	public BigDecimal getApAddtChg1Amt() {
		return this.apAddtChg1Amt;
	}

	public void setApAddtChg1Amt(BigDecimal apAddtChg1Amt) {
		this.apAddtChg1Amt = apAddtChg1Amt;
	}

	public String getApAddtChg1ApplySw() {
		return this.apAddtChg1ApplySw;
	}

	public void setApAddtChg1ApplySw(String apAddtChg1ApplySw) {
		this.apAddtChg1ApplySw = apAddtChg1ApplySw;
	}

	public String getApAddtChg1ExpCd() {
		return this.apAddtChg1ExpCd;
	}

	public void setApAddtChg1ExpCd(String apAddtChg1ExpCd) {
		this.apAddtChg1ExpCd = apAddtChg1ExpCd;
	}

	public BigDecimal getApAddtChg2Amt() {
		return this.apAddtChg2Amt;
	}

	public void setApAddtChg2Amt(BigDecimal apAddtChg2Amt) {
		this.apAddtChg2Amt = apAddtChg2Amt;
	}

	public String getApAddtChg2ApplySw() {
		return this.apAddtChg2ApplySw;
	}

	public void setApAddtChg2ApplySw(String apAddtChg2ApplySw) {
		this.apAddtChg2ApplySw = apAddtChg2ApplySw;
	}

	public String getApAddtChg2ExpCd() {
		return this.apAddtChg2ExpCd;
	}

	public void setApAddtChg2ExpCd(String apAddtChg2ExpCd) {
		this.apAddtChg2ExpCd = apAddtChg2ExpCd;
	}

	public BigDecimal getApAmt() {
		return this.apAmt;
	}

	public void setApAmt(BigDecimal apAmt) {
		this.apAmt = apAmt;
	}

	public BigDecimal getApBatchTranDistCtr() {
		return this.apBatchTranDistCtr;
	}

	public void setApBatchTranDistCtr(BigDecimal apBatchTranDistCtr) {
		this.apBatchTranDistCtr = apBatchTranDistCtr;
	}

	public String getApDiffGlAcctSw() {
		return this.apDiffGlAcctSw;
	}

	public void setApDiffGlAcctSw(String apDiffGlAcctSw) {
		this.apDiffGlAcctSw = apDiffGlAcctSw;
	}

	public BigDecimal getApInvDiscAmt() {
		return this.apInvDiscAmt;
	}

	public void setApInvDiscAmt(BigDecimal apInvDiscAmt) {
		this.apInvDiscAmt = apInvDiscAmt;
	}

	public BigDecimal getApSalesTxAmt() {
		return this.apSalesTxAmt;
	}

	public void setApSalesTxAmt(BigDecimal apSalesTxAmt) {
		this.apSalesTxAmt = apSalesTxAmt;
	}

	public String getApTxExpCd() {
		return this.apTxExpCd;
	}

	public void setApTxExpCd(String apTxExpCd) {
		this.apTxExpCd = apTxExpCd;
	}

	public String getApTxblSw() {
		return this.apTxblSw;
	}

	public void setApTxblSw(String apTxblSw) {
		this.apTxblSw = apTxblSw;
	}

	public String getApTypeCd() {
		return this.apTypeCd;
	}

	public void setApTypeCd(String apTypeCd) {
		this.apTypeCd = apTypeCd;
	}

	public BigDecimal getApUseTxAmt() {
		return this.apUseTxAmt;
	}

	public void setApUseTxAmt(BigDecimal apUseTxAmt) {
		this.apUseTxAmt = apUseTxAmt;
	}

	public String getBuProjId() {
		return this.buProjId;
	}

	public void setBuProjId(String buProjId) {
		this.buProjId = buProjId;
	}

	public Date getCcRetireDt() {
		return this.ccRetireDt;
	}

	public void setCcRetireDt(Date ccRetireDt) {
		this.ccRetireDt = ccRetireDt;
	}

	public BigDecimal getGlAcctSubApNbr() {
		return this.glAcctSubApNbr;
	}

	public void setGlAcctSubApNbr(BigDecimal glAcctSubApNbr) {
		this.glAcctSubApNbr = glAcctSubApNbr;
	}

	public BigDecimal getGlAcctSubNbr() {
		return this.glAcctSubNbr;
	}

	public void setGlAcctSubNbr(BigDecimal glAcctSubNbr) {
		this.glAcctSubNbr = glAcctSubNbr;
	}

	public BigDecimal getGlActNbr() {
		return this.glActNbr;
	}

	public void setGlActNbr(BigDecimal glActNbr) {
		this.glActNbr = glActNbr;
	}

	public BigDecimal getGlDeptNbr() {
		return this.glDeptNbr;
	}

	public void setGlDeptNbr(BigDecimal glDeptNbr) {
		this.glDeptNbr = glDeptNbr;
	}

	public BigDecimal getGlDivApNbr() {
		return this.glDivApNbr;
	}

	public void setGlDivApNbr(BigDecimal glDivApNbr) {
		this.glDivApNbr = glDivApNbr;
	}

	public BigDecimal getGlDivCtrlNbr() {
		return this.glDivCtrlNbr;
	}

	public void setGlDivCtrlNbr(BigDecimal glDivCtrlNbr) {
		this.glDivCtrlNbr = glDivCtrlNbr;
	}

	public BigDecimal getGlDivNbr() {
		return this.glDivNbr;
	}

	public void setGlDivNbr(BigDecimal glDivNbr) {
		this.glDivNbr = glDivNbr;
	}

	public String getGlExtendRef() {
		return this.glExtendRef;
	}

	public void setGlExtendRef(String glExtendRef) {
		this.glExtendRef = glExtendRef;
	}

	public String getGlRef() {
		return this.glRef;
	}

	public void setGlRef(String glRef) {
		this.glRef = glRef;
	}

	public String getMiMfgItem() {
		return this.miMfgItem;
	}

	public void setMiMfgItem(String miMfgItem) {
		this.miMfgItem = miMfgItem;
	}

	public BigDecimal getMiQty() {
		return this.miQty;
	}

	public void setMiQty(BigDecimal miQty) {
		this.miQty = miQty;
	}

	public BigDecimal getPoLnNbr() {
		return this.poLnNbr;
	}

	public void setPoLnNbr(BigDecimal poLnNbr) {
		this.poLnNbr = poLnNbr;
	}

	public String getSy1099Sw() {
		return this.sy1099Sw;
	}

	public void setSy1099Sw(String sy1099Sw) {
		this.sy1099Sw = sy1099Sw;
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
}
