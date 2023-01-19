package pwr.lcec.sync.entity.nisc;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the WO_TRAN_INQ_VIEW database table.
 * 
 */
@Entity
@Table(name="WO_TRAN_INQ_VIEW",schema="ABS11013")
@NamedQueries({
	@NamedQuery(name="WoTranInqView.findAll", query="SELECT w FROM WoTranInqView w"),
	@NamedQuery(name="WoTranInqView.findActualsByPrjIdWoId", query="SELECT w.woPrdYrmo, SUM(w.woAmt) FROM WoTranInqView w WHERE w.woProjId = :woProjId AND w.woId = :woId GROUP BY w.woPrdYrmo ORDER BY w.woPrdYrmo DESC"),
	@NamedQuery(name="WoTranInqView.findTransactionsByPrjIdWoId", query="SELECT w FROM WoTranInqView w WHERE w.woProjId = :woProjId AND w.woId = :woId ORDER BY w.woPrdYrmo DESC")
})
public class WoTranInqView implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AP_CRED_ACT_KEY")
	private BigDecimal apCredActKey;

	@Column(name="AP_INV_ACT_KEY")
	private BigDecimal apInvActKey;

	@Column(name="AP_INV_ID")
	private String apInvId;

	@Column(name="AP_NM")
	private String apNm;

	@Column(name="AP_SEQ_NBR")
	private BigDecimal apSeqNbr;

	@Column(name="AP_VEND_ID")
	private String apVendId;

	@Column(name="BR_TRAN_NBR")
	private BigDecimal brTranNbr;

	@Column(name="BU_DESC")
	private String buDesc;

	@Column(name="BU_PROJ_ID")
	private String buProjId;

	@Column(name="FM_ASSET_ID")
	private String fmAssetId;

	@Column(name="FM_DESC")
	private String fmDesc;

	@Column(name="FM_USG")
	private BigDecimal fmUsg;

	@Column(name="GL_ACCT_SUB_ASSET_NBR")
	private BigDecimal glAcctSubAssetNbr;

	@Column(name="GL_ACCT_SUB_NBR")
	private BigDecimal glAcctSubNbr;

	@Column(name="GL_ACCT_SUB_OFFSET_NBR")
	private BigDecimal glAcctSubOffsetNbr;

	@Column(name="GL_ACT_DESC")
	private String glActDesc;

	@Column(name="GL_ACT_NBR")
	private BigDecimal glActNbr;

	@Column(name="GL_ACT_OFFSET_NBR")
	private BigDecimal glActOffsetNbr;

	@Column(name="GL_DEPT_ASSET_DESC")
	private String glDeptAssetDesc;

	@Column(name="GL_DEPT_ASSET_NBR")
	private BigDecimal glDeptAssetNbr;

	@Column(name="GL_DEPT_DESC")
	private String glDeptDesc;

	@Column(name="GL_DEPT_NBR")
	private BigDecimal glDeptNbr;

	@Column(name="GL_DEPT_OFFSET_NBR")
	private BigDecimal glDeptOffsetNbr;

	@Column(name="GL_DESC")
	private String glDesc;

	@Column(name="GL_DIV_ASSET_NBR")
	private BigDecimal glDivAssetNbr;

	@Column(name="GL_DIV_DESC")
	private String glDivDesc;

	@Column(name="GL_DIV_NBR")
	private BigDecimal glDivNbr;

	@Column(name="GL_DIV_OFFSET_DESC")
	private String glDivOffsetDesc;

	@Column(name="GL_DIV_OFFSET_NBR")
	private BigDecimal glDivOffsetNbr;

	@Column(name="GL_JRL_ACT_CD")
	private String glJrlActCd;

	@Column(name="GL_JRL_ACT_DESC")
	private String glJrlActDesc;

	@Column(name="GL_JRL_NBR")
	private BigDecimal glJrlNbr;

	@Column(name="GL_OFFSET_DESC")
	private String glOffsetDesc;

	@Column(name="GL_REF")
	private String glRef;

	@Column(name="MI_DESC")
	private String miDesc;

	@Column(name="MI_ITEM_ID")
	private String miItemId;

	@Column(name="MI_LOC_CD")
	private String miLocCd;

	@Column(name="MI_LOC_SUB_CD")
	private String miLocSubCd;

	@Column(name="MI_OVHD_TYPE_CD")
	private String miOvhdTypeCd;

	@Column(name="MI_QTY")
	private BigDecimal miQty;

	@Column(name="MI_TRAN_ACT_KEY")
	private BigDecimal miTranActKey;

	@Column(name="MR_ACCT_NBR")
	private BigDecimal mrAcctNbr;

	@Column(name="MR_INV_NBR")
	private BigDecimal mrInvNbr;

	@Column(name="MR_INV_STAT_CD")
	private String mrInvStatCd;

	@Column(name="MR_NM")
	private String mrNm;

	@Column(name="PL_EMP_NBR")
	private BigDecimal plEmpNbr;

	@Column(name="PL_HRS")
	private BigDecimal plHrs;

	@Column(name="PO_ID")
	private String poId;

	@Column(name="SY_SRCE_APP")
	private String sySrceApp;

	@Column(name="SY_UOM_CD")
	private String syUomCd;

	@Column(name="UI_NBR_OF_PYMTS")
	private BigDecimal uiNbrOfPymts;

	@Column(name="WO_AMT")
	private BigDecimal woAmt;

	@Column(name="WO_BLANKET_SW")
	private String woBlanketSw;

	@Column(name="WO_CAT_CD")
	private String woCatCd;

	@Column(name="WO_CHG_CD")
	private BigDecimal woChgCd;

	@Column(name="WO_CHG_DESC")
	private String woChgDesc;

	@Column(name="WO_COM")
	private String woCom;

	@Column(name="WO_CONST_RET_CD")
	private String woConstRetCd;

	@Column(name="WO_DESC")
	private String woDesc;

	@Column(name="WO_FROM_ID")
	private String woFromId;

	@Column(name="WO_GRP_CD")
	private String woGrpCd;

	@Column(name="WO_HIST_SEQ_FROM_NBR")
	private BigDecimal woHistSeqFromNbr;

	@Column(name="WO_HIST_SEQ_NBR")
	private BigDecimal woHistSeqNbr;

	@Column(name="WO_ID")
	private String woId;

	@Column(name="WO_MAN_CLOSE_SW")
	private String woManCloseSw;

	@Column(name="WO_PICK_LIST_ID")
	private String woPickListId;

	@Column(name="WO_PRD_YRMO")
	private BigDecimal woPrdYrmo;

	@Column(name="WO_PROJ_ID")
	private String woProjId;

	@Column(name="WO_STAT_CD")
	private String woStatCd;

	@Id
	@Column(name="WO_TRAN_ACT_KEY")
	private BigDecimal woTranActKey;

	@Temporal(TemporalType.DATE)
	@Column(name="WO_TRAN_DT")
	private Date woTranDt;

	@Column(name="WO_TYPE_CD")
	private String woTypeCd;

	public WoTranInqView() {
	}

	public BigDecimal getApCredActKey() {
		return this.apCredActKey;
	}

	public void setApCredActKey(BigDecimal apCredActKey) {
		this.apCredActKey = apCredActKey;
	}

	public BigDecimal getApInvActKey() {
		return this.apInvActKey;
	}

	public void setApInvActKey(BigDecimal apInvActKey) {
		this.apInvActKey = apInvActKey;
	}

	public String getApInvId() {
		return this.apInvId;
	}

	public void setApInvId(String apInvId) {
		this.apInvId = apInvId;
	}

	public String getApNm() {
		return this.apNm;
	}

	public void setApNm(String apNm) {
		this.apNm = apNm;
	}

	public BigDecimal getApSeqNbr() {
		return this.apSeqNbr;
	}

	public void setApSeqNbr(BigDecimal apSeqNbr) {
		this.apSeqNbr = apSeqNbr;
	}

	public String getApVendId() {
		return this.apVendId;
	}

	public void setApVendId(String apVendId) {
		this.apVendId = apVendId;
	}

	public BigDecimal getBrTranNbr() {
		return this.brTranNbr;
	}

	public void setBrTranNbr(BigDecimal brTranNbr) {
		this.brTranNbr = brTranNbr;
	}

	public String getBuDesc() {
		return this.buDesc;
	}

	public void setBuDesc(String buDesc) {
		this.buDesc = buDesc;
	}

	public String getBuProjId() {
		return this.buProjId;
	}

	public void setBuProjId(String buProjId) {
		this.buProjId = buProjId;
	}

	public String getFmAssetId() {
		return this.fmAssetId;
	}

	public void setFmAssetId(String fmAssetId) {
		this.fmAssetId = fmAssetId;
	}

	public String getFmDesc() {
		return this.fmDesc;
	}

	public void setFmDesc(String fmDesc) {
		this.fmDesc = fmDesc;
	}

	public BigDecimal getFmUsg() {
		return this.fmUsg;
	}

	public void setFmUsg(BigDecimal fmUsg) {
		this.fmUsg = fmUsg;
	}

	public BigDecimal getGlAcctSubAssetNbr() {
		return this.glAcctSubAssetNbr;
	}

	public void setGlAcctSubAssetNbr(BigDecimal glAcctSubAssetNbr) {
		this.glAcctSubAssetNbr = glAcctSubAssetNbr;
	}

	public BigDecimal getGlAcctSubNbr() {
		return this.glAcctSubNbr;
	}

	public void setGlAcctSubNbr(BigDecimal glAcctSubNbr) {
		this.glAcctSubNbr = glAcctSubNbr;
	}

	public BigDecimal getGlAcctSubOffsetNbr() {
		return this.glAcctSubOffsetNbr;
	}

	public void setGlAcctSubOffsetNbr(BigDecimal glAcctSubOffsetNbr) {
		this.glAcctSubOffsetNbr = glAcctSubOffsetNbr;
	}

	public String getGlActDesc() {
		return this.glActDesc;
	}

	public void setGlActDesc(String glActDesc) {
		this.glActDesc = glActDesc;
	}

	public BigDecimal getGlActNbr() {
		return this.glActNbr;
	}

	public void setGlActNbr(BigDecimal glActNbr) {
		this.glActNbr = glActNbr;
	}

	public BigDecimal getGlActOffsetNbr() {
		return this.glActOffsetNbr;
	}

	public void setGlActOffsetNbr(BigDecimal glActOffsetNbr) {
		this.glActOffsetNbr = glActOffsetNbr;
	}

	public String getGlDeptAssetDesc() {
		return this.glDeptAssetDesc;
	}

	public void setGlDeptAssetDesc(String glDeptAssetDesc) {
		this.glDeptAssetDesc = glDeptAssetDesc;
	}

	public BigDecimal getGlDeptAssetNbr() {
		return this.glDeptAssetNbr;
	}

	public void setGlDeptAssetNbr(BigDecimal glDeptAssetNbr) {
		this.glDeptAssetNbr = glDeptAssetNbr;
	}

	public String getGlDeptDesc() {
		return this.glDeptDesc;
	}

	public void setGlDeptDesc(String glDeptDesc) {
		this.glDeptDesc = glDeptDesc;
	}

	public BigDecimal getGlDeptNbr() {
		return this.glDeptNbr;
	}

	public void setGlDeptNbr(BigDecimal glDeptNbr) {
		this.glDeptNbr = glDeptNbr;
	}

	public BigDecimal getGlDeptOffsetNbr() {
		return this.glDeptOffsetNbr;
	}

	public void setGlDeptOffsetNbr(BigDecimal glDeptOffsetNbr) {
		this.glDeptOffsetNbr = glDeptOffsetNbr;
	}

	public String getGlDesc() {
		return this.glDesc;
	}

	public void setGlDesc(String glDesc) {
		this.glDesc = glDesc;
	}

	public BigDecimal getGlDivAssetNbr() {
		return this.glDivAssetNbr;
	}

	public void setGlDivAssetNbr(BigDecimal glDivAssetNbr) {
		this.glDivAssetNbr = glDivAssetNbr;
	}

	public String getGlDivDesc() {
		return this.glDivDesc;
	}

	public void setGlDivDesc(String glDivDesc) {
		this.glDivDesc = glDivDesc;
	}

	public BigDecimal getGlDivNbr() {
		return this.glDivNbr;
	}

	public void setGlDivNbr(BigDecimal glDivNbr) {
		this.glDivNbr = glDivNbr;
	}

	public String getGlDivOffsetDesc() {
		return this.glDivOffsetDesc;
	}

	public void setGlDivOffsetDesc(String glDivOffsetDesc) {
		this.glDivOffsetDesc = glDivOffsetDesc;
	}

	public BigDecimal getGlDivOffsetNbr() {
		return this.glDivOffsetNbr;
	}

	public void setGlDivOffsetNbr(BigDecimal glDivOffsetNbr) {
		this.glDivOffsetNbr = glDivOffsetNbr;
	}

	public String getGlJrlActCd() {
		return this.glJrlActCd;
	}

	public void setGlJrlActCd(String glJrlActCd) {
		this.glJrlActCd = glJrlActCd;
	}

	public String getGlJrlActDesc() {
		return this.glJrlActDesc;
	}

	public void setGlJrlActDesc(String glJrlActDesc) {
		this.glJrlActDesc = glJrlActDesc;
	}

	public BigDecimal getGlJrlNbr() {
		return this.glJrlNbr;
	}

	public void setGlJrlNbr(BigDecimal glJrlNbr) {
		this.glJrlNbr = glJrlNbr;
	}

	public String getGlOffsetDesc() {
		return this.glOffsetDesc;
	}

	public void setGlOffsetDesc(String glOffsetDesc) {
		this.glOffsetDesc = glOffsetDesc;
	}

	public String getGlRef() {
		return this.glRef;
	}

	public void setGlRef(String glRef) {
		this.glRef = glRef;
	}

	public String getMiDesc() {
		return this.miDesc;
	}

	public void setMiDesc(String miDesc) {
		this.miDesc = miDesc;
	}

	public String getMiItemId() {
		return this.miItemId;
	}

	public void setMiItemId(String miItemId) {
		this.miItemId = miItemId;
	}

	public String getMiLocCd() {
		return this.miLocCd;
	}

	public void setMiLocCd(String miLocCd) {
		this.miLocCd = miLocCd;
	}

	public String getMiLocSubCd() {
		return this.miLocSubCd;
	}

	public void setMiLocSubCd(String miLocSubCd) {
		this.miLocSubCd = miLocSubCd;
	}

	public String getMiOvhdTypeCd() {
		return this.miOvhdTypeCd;
	}

	public void setMiOvhdTypeCd(String miOvhdTypeCd) {
		this.miOvhdTypeCd = miOvhdTypeCd;
	}

	public BigDecimal getMiQty() {
		return this.miQty;
	}

	public void setMiQty(BigDecimal miQty) {
		this.miQty = miQty;
	}

	public BigDecimal getMiTranActKey() {
		return this.miTranActKey;
	}

	public void setMiTranActKey(BigDecimal miTranActKey) {
		this.miTranActKey = miTranActKey;
	}

	public BigDecimal getMrAcctNbr() {
		return this.mrAcctNbr;
	}

	public void setMrAcctNbr(BigDecimal mrAcctNbr) {
		this.mrAcctNbr = mrAcctNbr;
	}

	public BigDecimal getMrInvNbr() {
		return this.mrInvNbr;
	}

	public void setMrInvNbr(BigDecimal mrInvNbr) {
		this.mrInvNbr = mrInvNbr;
	}

	public String getMrInvStatCd() {
		return this.mrInvStatCd;
	}

	public void setMrInvStatCd(String mrInvStatCd) {
		this.mrInvStatCd = mrInvStatCd;
	}

	public String getMrNm() {
		return this.mrNm;
	}

	public void setMrNm(String mrNm) {
		this.mrNm = mrNm;
	}

	public BigDecimal getPlEmpNbr() {
		return this.plEmpNbr;
	}

	public void setPlEmpNbr(BigDecimal plEmpNbr) {
		this.plEmpNbr = plEmpNbr;
	}

	public BigDecimal getPlHrs() {
		return this.plHrs;
	}

	public void setPlHrs(BigDecimal plHrs) {
		this.plHrs = plHrs;
	}

	public String getPoId() {
		return this.poId;
	}

	public void setPoId(String poId) {
		this.poId = poId;
	}

	public String getSySrceApp() {
		return this.sySrceApp;
	}

	public void setSySrceApp(String sySrceApp) {
		this.sySrceApp = sySrceApp;
	}

	public String getSyUomCd() {
		return this.syUomCd;
	}

	public void setSyUomCd(String syUomCd) {
		this.syUomCd = syUomCd;
	}

	public BigDecimal getUiNbrOfPymts() {
		return this.uiNbrOfPymts;
	}

	public void setUiNbrOfPymts(BigDecimal uiNbrOfPymts) {
		this.uiNbrOfPymts = uiNbrOfPymts;
	}

	public BigDecimal getWoAmt() {
		return this.woAmt;
	}

	public void setWoAmt(BigDecimal woAmt) {
		this.woAmt = woAmt;
	}

	public String getWoBlanketSw() {
		return this.woBlanketSw;
	}

	public void setWoBlanketSw(String woBlanketSw) {
		this.woBlanketSw = woBlanketSw;
	}

	public String getWoCatCd() {
		return this.woCatCd;
	}

	public void setWoCatCd(String woCatCd) {
		this.woCatCd = woCatCd;
	}

	public BigDecimal getWoChgCd() {
		return this.woChgCd;
	}

	public void setWoChgCd(BigDecimal woChgCd) {
		this.woChgCd = woChgCd;
	}

	public String getWoChgDesc() {
		return this.woChgDesc;
	}

	public void setWoChgDesc(String woChgDesc) {
		this.woChgDesc = woChgDesc;
	}

	public String getWoCom() {
		return this.woCom;
	}

	public void setWoCom(String woCom) {
		this.woCom = woCom;
	}

	public String getWoConstRetCd() {
		return this.woConstRetCd;
	}

	public void setWoConstRetCd(String woConstRetCd) {
		this.woConstRetCd = woConstRetCd;
	}

	public String getWoDesc() {
		return this.woDesc;
	}

	public void setWoDesc(String woDesc) {
		this.woDesc = woDesc;
	}

	public String getWoFromId() {
		return this.woFromId;
	}

	public void setWoFromId(String woFromId) {
		this.woFromId = woFromId;
	}

	public String getWoGrpCd() {
		return this.woGrpCd;
	}

	public void setWoGrpCd(String woGrpCd) {
		this.woGrpCd = woGrpCd;
	}

	public BigDecimal getWoHistSeqFromNbr() {
		return this.woHistSeqFromNbr;
	}

	public void setWoHistSeqFromNbr(BigDecimal woHistSeqFromNbr) {
		this.woHistSeqFromNbr = woHistSeqFromNbr;
	}

	public BigDecimal getWoHistSeqNbr() {
		return this.woHistSeqNbr;
	}

	public void setWoHistSeqNbr(BigDecimal woHistSeqNbr) {
		this.woHistSeqNbr = woHistSeqNbr;
	}

	public String getWoId() {
		return this.woId;
	}

	public void setWoId(String woId) {
		this.woId = woId;
	}

	public String getWoManCloseSw() {
		return this.woManCloseSw;
	}

	public void setWoManCloseSw(String woManCloseSw) {
		this.woManCloseSw = woManCloseSw;
	}

	public String getWoPickListId() {
		return this.woPickListId;
	}

	public void setWoPickListId(String woPickListId) {
		this.woPickListId = woPickListId;
	}

	public BigDecimal getWoPrdYrmo() {
		return this.woPrdYrmo;
	}

	public void setWoPrdYrmo(BigDecimal woPrdYrmo) {
		this.woPrdYrmo = woPrdYrmo;
	}

	public String getWoProjId() {
		return this.woProjId;
	}

	public void setWoProjId(String woProjId) {
		this.woProjId = woProjId;
	}

	public String getWoStatCd() {
		return this.woStatCd;
	}

	public void setWoStatCd(String woStatCd) {
		this.woStatCd = woStatCd;
	}

	public BigDecimal getWoTranActKey() {
		return this.woTranActKey;
	}

	public void setWoTranActKey(BigDecimal woTranActKey) {
		this.woTranActKey = woTranActKey;
	}

	public Date getWoTranDt() {
		return this.woTranDt;
	}

	public void setWoTranDt(Date woTranDt) {
		this.woTranDt = woTranDt;
	}

	public String getWoTypeCd() {
		return this.woTypeCd;
	}

	public void setWoTypeCd(String woTypeCd) {
		this.woTypeCd = woTypeCd;
	}

}