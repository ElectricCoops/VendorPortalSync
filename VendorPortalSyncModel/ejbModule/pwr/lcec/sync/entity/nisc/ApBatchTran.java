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

@Entity
@Table(name = "AP_BATCH_TRAN", schema = "ABS11013")
@NamedQueries({ @NamedQuery(name = "ApBatchTran.findAll", query = "SELECT a FROM ApBatchTran a"),
		@NamedQuery(name = "ApBatchTran.findByInvId", query = "SELECT a FROM ApBatchTran a WHERE a.apInvId = :apInvId") })
public class ApBatchTran implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "AP_BATCH_TRAN_KEY")
	private String apBatchTranKey;
	@Column(name = "AP_ACCT_CAPTURIS_NBR")
	private String apAcctCapturisNbr;
	@Column(name = "AP_ADDENDA_INFO")
	private String apAddendaInfo;
	@Column(name = "AP_ADDT_CHG_1_AMT")
	private BigDecimal apAddtChg1Amt;
	@Column(name = "AP_ADDT_CHG_1_CD")
	private String apAddtChg1Cd;
	@Column(name = "AP_ADDT_CHG_1_TXBL_SW")
	private String apAddtChg1TxblSw;
	@Column(name = "AP_ADDT_CHG_2_AMT")
	private BigDecimal apAddtChg2Amt;
	@Column(name = "AP_ADDT_CHG_2_CD")
	private String apAddtChg2Cd;
	@Column(name = "AP_ADDT_CHG_2_TXBL_SW")
	private String apAddtChg2TxblSw;
	@Column(name = "AP_AMT")
	private BigDecimal apAmt;
	@Column(name = "AP_AUTH_STAT_CD")
	private String apAuthStatCd;
	@Column(name = "AP_AUTH_TYPE_CD")
	private String apAuthTypeCd;
	@Column(name = "AP_BATCH_TRAN_CTR")
	private BigDecimal apBatchTranCtr;
	@Column(name = "AP_CASH_BASIS_SW")
	private String apCashBasisSw;
	@Column(name = "AP_CHG_DT")
	private Date apChgDt;
	@Column(name = "AP_CLR_AMT_SW")
	private String apClrAmtSw;
	@Column(name = "AP_CRED_CARD_CD")
	private String apCredCardCd;
	@Column(name = "AP_DESC")
	private String apDesc;
	@Column(name = "AP_DISPUTE_SW")
	private String apDisputeSw;
	@Column(name = "AP_DT")
	private Date apDt;
	@Column(name = "AP_DUE_DT")
	private Date apDueDt;
	@Column(name = "AP_EARLY_PMT_DISC_AMT")
	private BigDecimal apEarlyPmtDiscAmt;
	@Column(name = "AP_EARLY_PMT_DISC_DT")
	private Date apEarlyPmtDiscDt;
	@Column(name = "AP_EARLY_PMT_DISC_PCT")
	private BigDecimal apEarlyPmtDiscPct;
	@Column(name = "AP_EXP_BILLABLE_SW")
	private String apExpBillableSw;
	@Column(name = "AP_EXP_CD")
	private String apExpCd;
	@Column(name = "AP_EXP_QTY")
	private BigDecimal apExpQty;
	@Column(name = "AP_EXP_RATE_AMT")
	private BigDecimal apExpRateAmt;
	@Column(name = "AP_EXP_RATE_MAN_ENTER_SW")
	private String apExpRateManEnterSw;
	@Column(name = "AP_EXP_RATE_TYPE_CD")
	private String apExpRateTypeCd;
	@Column(name = "AP_EXP_TYPE_CD")
	private String apExpTypeCd;
	@Column(name = "AP_INV_DISC_AMT")
	private BigDecimal apInvDiscAmt;
	@Column(name = "AP_INV_ID")
	private String apInvId;
	@Column(name = "AP_INV_TYPE_CD")
	private String apInvTypeCd;
	@Column(name = "AP_LN_NBR")
	private BigDecimal apLnNbr;
	@Column(name = "AP_PMT_TYPE_CD")
	private String apPmtTypeCd;
	@Column(name = "AP_READY_TO_POST_SW")
	private String apReadyToPostSw;
	@Column(name = "AP_RECON_ACT_KEY")
	private BigDecimal apReconActKey;
	@Column(name = "AP_SALES_TX_AMT")
	private BigDecimal apSalesTxAmt;
	@Column(name = "AP_SEPARATE_CHK_SW")
	private String apSeparateChkSw;
	@Column(name = "AP_TM_TO_POST_NBR")
	private BigDecimal apTmToPostNbr;
	@Column(name = "AP_TRAN_TYPE_CD")
	private String apTranTypeCd;
	@Column(name = "AP_VEND_ID")
	private String apVendId;
	@Column(name = "AP_VEND_MSTR_ADDR_KEY")
	private BigDecimal apVendMstrAddrKey;
	@Column(name = "AP_VEND_PAID_SW")
	private String apVendPaidSw;
	@Column(name = "BR_BANK_ACCT_NBR")
	private BigDecimal brBankAcctNbr;
	@Column(name = "CC_CHARITY_CD")
	private String ccCharityCd;
	@Column(name = "GL_ACCT_SUB_AR_NBR")
	private BigDecimal glAcctSubArNbr;
	@Column(name = "GL_ACCT_SUB_NBR")
	private BigDecimal glAcctSubNbr;
	@Column(name = "GL_ACT_AR_NBR")
	private BigDecimal glActArNbr;
	@Column(name = "GL_DEPT_AR_NBR")
	private BigDecimal glDeptArNbr;
	@Column(name = "GL_DIV_AR_NBR")
	private BigDecimal glDivArNbr;
	@Column(name = "GL_DIV_NBR")
	private BigDecimal glDivNbr;
	@Column(name = "GL_POST_DT")
	private Date glPostDt;
	@Column(name = "PO_HIST_SEQ_NBR")
	private BigDecimal poHistSeqNbr;
	@Column(name = "PO_ID")
	private String poId;
	@Column(name = "SY_AUDIT_PROC_NM")
	private String syAuditProcNm;
	@Column(name = "SY_AUDIT_TRAN_ID")
	private String syAuditTranId;
	@Column(name = "SY_AUDIT_USER_ID")
	private BigDecimal syAuditUserId;
	@Column(name = "SY_BATCH_NM")
	private String syBatchNm;
	@Column(name = "SY_CITY_EXP")
	private String syCityExp;
	@Column(name = "SY_DISC_PCT")
	private BigDecimal syDiscPct;
	@Column(name = "SY_SRCE_APP")
	private String sySrceApp;
	@Column(name = "SY_ST_EXP")
	private String syStExp;
	@Column(name = "SY_TERMS_CD")
	private String syTermsCd;
	@Column(name = "SY_USER_CREATE_ID")
	private BigDecimal syUserCreateId;
	@Column(name = "SY_USER_ID")
	private BigDecimal syUserId;
	@Column(name = "SY_ZIP_EXP_CD")
	private String syZipExpCd;

	public String getApBatchTranKey() {
		return this.apBatchTranKey;
	}

	public void setApBatchTranKey(String apBatchTranKey) {
		this.apBatchTranKey = apBatchTranKey;
	}

	public String getApAcctCapturisNbr() {
		return this.apAcctCapturisNbr;
	}

	public void setApAcctCapturisNbr(String apAcctCapturisNbr) {
		this.apAcctCapturisNbr = apAcctCapturisNbr;
	}

	public String getApAddendaInfo() {
		return this.apAddendaInfo;
	}

	public void setApAddendaInfo(String apAddendaInfo) {
		this.apAddendaInfo = apAddendaInfo;
	}

	public BigDecimal getApAddtChg1Amt() {
		return this.apAddtChg1Amt;
	}

	public void setApAddtChg1Amt(BigDecimal apAddtChg1Amt) {
		this.apAddtChg1Amt = apAddtChg1Amt;
	}

	public String getApAddtChg1Cd() {
		return this.apAddtChg1Cd;
	}

	public void setApAddtChg1Cd(String apAddtChg1Cd) {
		this.apAddtChg1Cd = apAddtChg1Cd;
	}

	public String getApAddtChg1TxblSw() {
		return this.apAddtChg1TxblSw;
	}

	public void setApAddtChg1TxblSw(String apAddtChg1TxblSw) {
		this.apAddtChg1TxblSw = apAddtChg1TxblSw;
	}

	public BigDecimal getApAddtChg2Amt() {
		return this.apAddtChg2Amt;
	}

	public void setApAddtChg2Amt(BigDecimal apAddtChg2Amt) {
		this.apAddtChg2Amt = apAddtChg2Amt;
	}

	public String getApAddtChg2Cd() {
		return this.apAddtChg2Cd;
	}

	public void setApAddtChg2Cd(String apAddtChg2Cd) {
		this.apAddtChg2Cd = apAddtChg2Cd;
	}

	public String getApAddtChg2TxblSw() {
		return this.apAddtChg2TxblSw;
	}

	public void setApAddtChg2TxblSw(String apAddtChg2TxblSw) {
		this.apAddtChg2TxblSw = apAddtChg2TxblSw;
	}

	public BigDecimal getApAmt() {
		return this.apAmt;
	}

	public void setApAmt(BigDecimal apAmt) {
		this.apAmt = apAmt;
	}

	public String getApAuthStatCd() {
		return this.apAuthStatCd;
	}

	public void setApAuthStatCd(String apAuthStatCd) {
		this.apAuthStatCd = apAuthStatCd;
	}

	public String getApAuthTypeCd() {
		return this.apAuthTypeCd;
	}

	public void setApAuthTypeCd(String apAuthTypeCd) {
		this.apAuthTypeCd = apAuthTypeCd;
	}

	public BigDecimal getApBatchTranCtr() {
		return this.apBatchTranCtr;
	}

	public void setApBatchTranCtr(BigDecimal apBatchTranCtr) {
		this.apBatchTranCtr = apBatchTranCtr;
	}

	public String getApCashBasisSw() {
		return this.apCashBasisSw;
	}

	public void setApCashBasisSw(String apCashBasisSw) {
		this.apCashBasisSw = apCashBasisSw;
	}

	public Date getApChgDt() {
		return this.apChgDt;
	}

	public void setApChgDt(Date apChgDt) {
		this.apChgDt = apChgDt;
	}

	public String getApClrAmtSw() {
		return this.apClrAmtSw;
	}

	public void setApClrAmtSw(String apClrAmtSw) {
		this.apClrAmtSw = apClrAmtSw;
	}

	public String getApCredCardCd() {
		return this.apCredCardCd;
	}

	public void setApCredCardCd(String apCredCardCd) {
		this.apCredCardCd = apCredCardCd;
	}

	public String getApDesc() {
		return this.apDesc;
	}

	public void setApDesc(String apDesc) {
		this.apDesc = apDesc;
	}

	public String getApDisputeSw() {
		return this.apDisputeSw;
	}

	public void setApDisputeSw(String apDisputeSw) {
		this.apDisputeSw = apDisputeSw;
	}

	public Date getApDt() {
		return this.apDt;
	}

	public void setApDt(Date apDt) {
		this.apDt = apDt;
	}

	public Date getApDueDt() {
		return this.apDueDt;
	}

	public void setApDueDt(Date apDueDt) {
		this.apDueDt = apDueDt;
	}

	public BigDecimal getApEarlyPmtDiscAmt() {
		return this.apEarlyPmtDiscAmt;
	}

	public void setApEarlyPmtDiscAmt(BigDecimal apEarlyPmtDiscAmt) {
		this.apEarlyPmtDiscAmt = apEarlyPmtDiscAmt;
	}

	public Date getApEarlyPmtDiscDt() {
		return this.apEarlyPmtDiscDt;
	}

	public void setApEarlyPmtDiscDt(Date apEarlyPmtDiscDt) {
		this.apEarlyPmtDiscDt = apEarlyPmtDiscDt;
	}

	public BigDecimal getApEarlyPmtDiscPct() {
		return this.apEarlyPmtDiscPct;
	}

	public void setApEarlyPmtDiscPct(BigDecimal apEarlyPmtDiscPct) {
		this.apEarlyPmtDiscPct = apEarlyPmtDiscPct;
	}

	public String getApExpBillableSw() {
		return this.apExpBillableSw;
	}

	public void setApExpBillableSw(String apExpBillableSw) {
		this.apExpBillableSw = apExpBillableSw;
	}

	public String getApExpCd() {
		return this.apExpCd;
	}

	public void setApExpCd(String apExpCd) {
		this.apExpCd = apExpCd;
	}

	public BigDecimal getApExpQty() {
		return this.apExpQty;
	}

	public void setApExpQty(BigDecimal apExpQty) {
		this.apExpQty = apExpQty;
	}

	public BigDecimal getApExpRateAmt() {
		return this.apExpRateAmt;
	}

	public void setApExpRateAmt(BigDecimal apExpRateAmt) {
		this.apExpRateAmt = apExpRateAmt;
	}

	public String getApExpRateManEnterSw() {
		return this.apExpRateManEnterSw;
	}

	public void setApExpRateManEnterSw(String apExpRateManEnterSw) {
		this.apExpRateManEnterSw = apExpRateManEnterSw;
	}

	public String getApExpRateTypeCd() {
		return this.apExpRateTypeCd;
	}

	public void setApExpRateTypeCd(String apExpRateTypeCd) {
		this.apExpRateTypeCd = apExpRateTypeCd;
	}

	public String getApExpTypeCd() {
		return this.apExpTypeCd;
	}

	public void setApExpTypeCd(String apExpTypeCd) {
		this.apExpTypeCd = apExpTypeCd;
	}

	public BigDecimal getApInvDiscAmt() {
		return this.apInvDiscAmt;
	}

	public void setApInvDiscAmt(BigDecimal apInvDiscAmt) {
		this.apInvDiscAmt = apInvDiscAmt;
	}

	public String getApInvId() {
		return this.apInvId;
	}

	public void setApInvId(String apInvId) {
		this.apInvId = apInvId;
	}

	public String getApInvTypeCd() {
		return this.apInvTypeCd;
	}

	public void setApInvTypeCd(String apInvTypeCd) {
		this.apInvTypeCd = apInvTypeCd;
	}

	public BigDecimal getApLnNbr() {
		return this.apLnNbr;
	}

	public void setApLnNbr(BigDecimal apLnNbr) {
		this.apLnNbr = apLnNbr;
	}

	public String getApPmtTypeCd() {
		return this.apPmtTypeCd;
	}

	public void setApPmtTypeCd(String apPmtTypeCd) {
		this.apPmtTypeCd = apPmtTypeCd;
	}

	public String getApReadyToPostSw() {
		return this.apReadyToPostSw;
	}

	public void setApReadyToPostSw(String apReadyToPostSw) {
		this.apReadyToPostSw = apReadyToPostSw;
	}

	public BigDecimal getApReconActKey() {
		return this.apReconActKey;
	}

	public void setApReconActKey(BigDecimal apReconActKey) {
		this.apReconActKey = apReconActKey;
	}

	public BigDecimal getApSalesTxAmt() {
		return this.apSalesTxAmt;
	}

	public void setApSalesTxAmt(BigDecimal apSalesTxAmt) {
		this.apSalesTxAmt = apSalesTxAmt;
	}

	public String getApSeparateChkSw() {
		return this.apSeparateChkSw;
	}

	public void setApSeparateChkSw(String apSeparateChkSw) {
		this.apSeparateChkSw = apSeparateChkSw;
	}

	public BigDecimal getApTmToPostNbr() {
		return this.apTmToPostNbr;
	}

	public void setApTmToPostNbr(BigDecimal apTmToPostNbr) {
		this.apTmToPostNbr = apTmToPostNbr;
	}

	public String getApTranTypeCd() {
		return this.apTranTypeCd;
	}

	public void setApTranTypeCd(String apTranTypeCd) {
		this.apTranTypeCd = apTranTypeCd;
	}

	public String getApVendId() {
		return this.apVendId;
	}

	public void setApVendId(String apVendId) {
		this.apVendId = apVendId;
	}

	public BigDecimal getApVendMstrAddrKey() {
		return this.apVendMstrAddrKey;
	}

	public void setApVendMstrAddrKey(BigDecimal apVendMstrAddrKey) {
		this.apVendMstrAddrKey = apVendMstrAddrKey;
	}

	public String getApVendPaidSw() {
		return this.apVendPaidSw;
	}

	public void setApVendPaidSw(String apVendPaidSw) {
		this.apVendPaidSw = apVendPaidSw;
	}

	public BigDecimal getBrBankAcctNbr() {
		return this.brBankAcctNbr;
	}

	public void setBrBankAcctNbr(BigDecimal brBankAcctNbr) {
		this.brBankAcctNbr = brBankAcctNbr;
	}

	public String getCcCharityCd() {
		return this.ccCharityCd;
	}

	public void setCcCharityCd(String ccCharityCd) {
		this.ccCharityCd = ccCharityCd;
	}

	public BigDecimal getGlAcctSubArNbr() {
		return this.glAcctSubArNbr;
	}

	public void setGlAcctSubArNbr(BigDecimal glAcctSubArNbr) {
		this.glAcctSubArNbr = glAcctSubArNbr;
	}

	public BigDecimal getGlAcctSubNbr() {
		return this.glAcctSubNbr;
	}

	public void setGlAcctSubNbr(BigDecimal glAcctSubNbr) {
		this.glAcctSubNbr = glAcctSubNbr;
	}

	public BigDecimal getGlActArNbr() {
		return this.glActArNbr;
	}

	public void setGlActArNbr(BigDecimal glActArNbr) {
		this.glActArNbr = glActArNbr;
	}

	public BigDecimal getGlDeptArNbr() {
		return this.glDeptArNbr;
	}

	public void setGlDeptArNbr(BigDecimal glDeptArNbr) {
		this.glDeptArNbr = glDeptArNbr;
	}

	public BigDecimal getGlDivArNbr() {
		return this.glDivArNbr;
	}

	public void setGlDivArNbr(BigDecimal glDivArNbr) {
		this.glDivArNbr = glDivArNbr;
	}

	public BigDecimal getGlDivNbr() {
		return this.glDivNbr;
	}

	public void setGlDivNbr(BigDecimal glDivNbr) {
		this.glDivNbr = glDivNbr;
	}

	public Date getGlPostDt() {
		return this.glPostDt;
	}

	public void setGlPostDt(Date glPostDt) {
		this.glPostDt = glPostDt;
	}

	public BigDecimal getPoHistSeqNbr() {
		return this.poHistSeqNbr;
	}

	public void setPoHistSeqNbr(BigDecimal poHistSeqNbr) {
		this.poHistSeqNbr = poHistSeqNbr;
	}

	public String getPoId() {
		return this.poId;
	}

	public void setPoId(String poId) {
		this.poId = poId;
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

	public String getSyBatchNm() {
		return this.syBatchNm;
	}

	public void setSyBatchNm(String syBatchNm) {
		this.syBatchNm = syBatchNm;
	}

	public String getSyCityExp() {
		return this.syCityExp;
	}

	public void setSyCityExp(String syCityExp) {
		this.syCityExp = syCityExp;
	}

	public BigDecimal getSyDiscPct() {
		return this.syDiscPct;
	}

	public void setSyDiscPct(BigDecimal syDiscPct) {
		this.syDiscPct = syDiscPct;
	}

	public String getSySrceApp() {
		return this.sySrceApp;
	}

	public void setSySrceApp(String sySrceApp) {
		this.sySrceApp = sySrceApp;
	}

	public String getSyStExp() {
		return this.syStExp;
	}

	public void setSyStExp(String syStExp) {
		this.syStExp = syStExp;
	}

	public String getSyTermsCd() {
		return this.syTermsCd;
	}

	public void setSyTermsCd(String syTermsCd) {
		this.syTermsCd = syTermsCd;
	}

	public BigDecimal getSyUserCreateId() {
		return this.syUserCreateId;
	}

	public void setSyUserCreateId(BigDecimal syUserCreateId) {
		this.syUserCreateId = syUserCreateId;
	}

	public BigDecimal getSyUserId() {
		return this.syUserId;
	}

	public void setSyUserId(BigDecimal syUserId) {
		this.syUserId = syUserId;
	}

	public String getSyZipExpCd() {
		return this.syZipExpCd;
	}

	public void setSyZipExpCd(String syZipExpCd) {
		this.syZipExpCd = syZipExpCd;
	}
}
