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
@Table(name = "WO_MSTR", schema = "ABS11013")
	@NamedQueries({ @NamedQuery(name = "WoMstr.findAll", query = "SELECT w FROM WoMstr w"),
	@NamedQuery(name = "WoMstr.findMasterByWoId", query = "SELECT w FROM WoMstr w WHERE w.id.woId = :woId"),
	@NamedQuery(name = "WoMstr.findMasterByProjectId", query = "SELECT w FROM WoMstr w WHERE w.woProjId = :projectId")
})
public class WoMstr implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private WoMstrPK id;
	@Column(name = "AM_GRP_CD")
	private String amGrpCd;
	@Column(name = "BI_ACCT")
	private BigDecimal biAcct;
	@Column(name = "BI_CUST_NBR")
	private BigDecimal biCustNbr;
	@Column(name = "BI_MAP_LOC_NBR")
	private String biMapLocNbr;
	@Column(name = "BI_SRV_LOC_NBR")
	private BigDecimal biSrvLocNbr;
	@Column(name = "BU_PROJ_ID")
	private String buProjId;
	@Temporal(TemporalType.DATE)
	@Column(name = "MI_COMP_DT")
	private Date miCompDt;
	@Column(name = "MI_LOC_CD")
	private String miLocCd;
	@Temporal(TemporalType.DATE)
	@Column(name = "PL_COMPL_DT")
	private Date plComplDt;
	@Column(name = "PL_EMP_ABANDONED_BY_NBR")
	private BigDecimal plEmpAbandonedByNbr;
	@Column(name = "PL_EMP_CLOSE_BY_NBR")
	private BigDecimal plEmpCloseByNbr;
	@Column(name = "PL_EMP_COMP_BY_NBR")
	private BigDecimal plEmpCompByNbr;
	@Column(name = "PL_EMP_ENG_REVIEW_BY_NBR")
	private BigDecimal plEmpEngReviewByNbr;
	@Column(name = "PL_EMP_EST_BY_NBR")
	private BigDecimal plEmpEstByNbr;
	@Column(name = "PL_EMP_MI_COMP_BY_NBR")
	private BigDecimal plEmpMiCompByNbr;
	@Column(name = "PL_EMP_PL_COMPL_BY_NBR")
	private BigDecimal plEmpPlComplByNbr;
	@Column(name = "PL_EMP_REL_BY_NBR")
	private BigDecimal plEmpRelByNbr;
	@Column(name = "PL_EMP_STAKE_BY_NBR")
	private BigDecimal plEmpStakeByNbr;
	@Column(name = "PL_TX_LOC_CD")
	private String plTxLocCd;
	@Column(name = "SY_AUDIT_PROC_NM")
	private String syAuditProcNm;
	@Column(name = "SY_AUDIT_TRAN_ID")
	private String syAuditTranId;
	@Column(name = "SY_AUDIT_USER_ID")
	private BigDecimal syAuditUserId;
	@Temporal(TemporalType.DATE)
	@Column(name = "WO_ABANDONED_CLOSE_DT")
	private Date woAbandonedCloseDt;
	@Temporal(TemporalType.DATE)
	@Column(name = "WO_ABANDONED_DT")
	private Date woAbandonedDt;
	@Column(name = "WO_ABANDONED_REAS")
	private String woAbandonedReas;
	@Column(name = "WO_AFUDC_SW")
	private String woAfudcSw;
	@Column(name = "WO_ALLOW_COST_REDIST_SW")
	private String woAllowCostRedistSw;
	@Column(name = "WO_BLANKET_ID")
	private String woBlanketId;
	@Column(name = "WO_BLANKET_SW")
	private String woBlanketSw;
	@Column(name = "WO_BUD_NBR")
	private BigDecimal woBudNbr;
	@Temporal(TemporalType.DATE)
	@Column(name = "WO_CAPITALIZED_DT")
	private Date woCapitalizedDt;
	@Column(name = "WO_CAPTURE_SW")
	private String woCaptureSw;
	@Temporal(TemporalType.DATE)
	@Column(name = "WO_CLOSE_DT")
	private Date woCloseDt;
	@Column(name = "WO_COE_SW")
	private String woCoeSw;
	@Column(name = "WO_COM")
	private String woCom;
	@Temporal(TemporalType.DATE)
	@Column(name = "WO_COMP_DT")
	private Date woCompDt;
	@Column(name = "WO_CONTRIB_MAX_AMT")
	private BigDecimal woContribMaxAmt;
	@Column(name = "WO_CONTRIB_MIN_AMT")
	private BigDecimal woContribMinAmt;
	@Column(name = "WO_CUST_NM")
	private String woCustNm;
	@Column(name = "WO_DESC")
	private String woDesc;
	@Column(name = "WO_DESC_LOAN_ADJ")
	private String woDescLoanAdj;
	@Column(name = "WO_DIST_TYPE_CD")
	private String woDistTypeCd;
	@Temporal(TemporalType.DATE)
	@Column(name = "WO_ENG_REVIEW_DT")
	private Date woEngReviewDt;
	@Temporal(TemporalType.DATE)
	@Column(name = "WO_EST_DT")
	private Date woEstDt;
	@Column(name = "WO_GRP_CD")
	private String woGrpCd;
	@Column(name = "WO_HIST_SEQ_PREV_REV")
	private String woHistSeqPrevRev;
	@Column(name = "WO_INVT_ID")
	private String woInvtId;
	@Column(name = "WO_LOAN_ADJ_AMT")
	private BigDecimal woLoanAdjAmt;
	@Column(name = "WO_LOAN_ID")
	private String woLoanId;
	@Column(name = "WO_LOAN_PROJ_EXT")
	private String woLoanProjExt;
	@Column(name = "WO_LOAN_PROJ_ID")
	private String woLoanProjId;
	@Column(name = "WO_LOAN_YR")
	private BigDecimal woLoanYr;
	@Column(name = "WO_MAN_CLOSE_SW")
	private String woManCloseSw;
	@Column(name = "WO_MS_EXTRACT_SW")
	private String woMsExtractSw;
	@Column(name = "WO_MSTR_CTR")
	private BigDecimal woMstrCtr;
	@Temporal(TemporalType.DATE)
	@Column(name = "WO_OPEN_DT")
	private Date woOpenDt;
	@Column(name = "WO_PCT")
	private BigDecimal woPct;
	@Temporal(TemporalType.DATE)
	@Column(name = "WO_PROCESS_DT")
	private Date woProcessDt;
	@Column(name = "WO_PROCESS_SW")
	private String woProcessSw;
	@Column(name = "WO_PROJ_ID")
	private String woProjId;
	@Temporal(TemporalType.DATE)
	@Column(name = "WO_REL_DT")
	private Date woRelDt;
	@Temporal(TemporalType.DATE)
	@Column(name = "WO_STAKE_DT")
	private Date woStakeDt;
	@Column(name = "WO_STAT_CD")
	private String woStatCd;
	@Column(name = "WO_TYPE_CD")
	private String woTypeCd;
	@Column(name = "WO_UPDT_EST_SW")
	private String woUpdtEstSw;
	@Column(name = "WO_USE_PREV_REV_SW")
	private String woUsePrevRevSw;

	public WoMstrPK getId() {
		return this.id;
	}

	public void setId(WoMstrPK id) {
		this.id = id;
	}

	public String getAmGrpCd() {
		return this.amGrpCd;
	}

	public void setAmGrpCd(String amGrpCd) {
		this.amGrpCd = amGrpCd;
	}

	public BigDecimal getBiAcct() {
		return this.biAcct;
	}

	public void setBiAcct(BigDecimal biAcct) {
		this.biAcct = biAcct;
	}

	public BigDecimal getBiCustNbr() {
		return this.biCustNbr;
	}

	public void setBiCustNbr(BigDecimal biCustNbr) {
		this.biCustNbr = biCustNbr;
	}

	public String getBiMapLocNbr() {
		return this.biMapLocNbr;
	}

	public void setBiMapLocNbr(String biMapLocNbr) {
		this.biMapLocNbr = biMapLocNbr;
	}

	public BigDecimal getBiSrvLocNbr() {
		return this.biSrvLocNbr;
	}

	public void setBiSrvLocNbr(BigDecimal biSrvLocNbr) {
		this.biSrvLocNbr = biSrvLocNbr;
	}

	public String getBuProjId() {
		return this.buProjId;
	}

	public void setBuProjId(String buProjId) {
		this.buProjId = buProjId;
	}

	public Date getMiCompDt() {
		return this.miCompDt;
	}

	public void setMiCompDt(Date miCompDt) {
		this.miCompDt = miCompDt;
	}

	public String getMiLocCd() {
		return this.miLocCd;
	}

	public void setMiLocCd(String miLocCd) {
		this.miLocCd = miLocCd;
	}

	public Date getPlComplDt() {
		return this.plComplDt;
	}

	public void setPlComplDt(Date plComplDt) {
		this.plComplDt = plComplDt;
	}

	public BigDecimal getPlEmpAbandonedByNbr() {
		return this.plEmpAbandonedByNbr;
	}

	public void setPlEmpAbandonedByNbr(BigDecimal plEmpAbandonedByNbr) {
		this.plEmpAbandonedByNbr = plEmpAbandonedByNbr;
	}

	public BigDecimal getPlEmpCloseByNbr() {
		return this.plEmpCloseByNbr;
	}

	public void setPlEmpCloseByNbr(BigDecimal plEmpCloseByNbr) {
		this.plEmpCloseByNbr = plEmpCloseByNbr;
	}

	public BigDecimal getPlEmpCompByNbr() {
		return this.plEmpCompByNbr;
	}

	public void setPlEmpCompByNbr(BigDecimal plEmpCompByNbr) {
		this.plEmpCompByNbr = plEmpCompByNbr;
	}

	public BigDecimal getPlEmpEngReviewByNbr() {
		return this.plEmpEngReviewByNbr;
	}

	public void setPlEmpEngReviewByNbr(BigDecimal plEmpEngReviewByNbr) {
		this.plEmpEngReviewByNbr = plEmpEngReviewByNbr;
	}

	public BigDecimal getPlEmpEstByNbr() {
		return this.plEmpEstByNbr;
	}

	public void setPlEmpEstByNbr(BigDecimal plEmpEstByNbr) {
		this.plEmpEstByNbr = plEmpEstByNbr;
	}

	public BigDecimal getPlEmpMiCompByNbr() {
		return this.plEmpMiCompByNbr;
	}

	public void setPlEmpMiCompByNbr(BigDecimal plEmpMiCompByNbr) {
		this.plEmpMiCompByNbr = plEmpMiCompByNbr;
	}

	public BigDecimal getPlEmpPlComplByNbr() {
		return this.plEmpPlComplByNbr;
	}

	public void setPlEmpPlComplByNbr(BigDecimal plEmpPlComplByNbr) {
		this.plEmpPlComplByNbr = plEmpPlComplByNbr;
	}

	public BigDecimal getPlEmpRelByNbr() {
		return this.plEmpRelByNbr;
	}

	public void setPlEmpRelByNbr(BigDecimal plEmpRelByNbr) {
		this.plEmpRelByNbr = plEmpRelByNbr;
	}

	public BigDecimal getPlEmpStakeByNbr() {
		return this.plEmpStakeByNbr;
	}

	public void setPlEmpStakeByNbr(BigDecimal plEmpStakeByNbr) {
		this.plEmpStakeByNbr = plEmpStakeByNbr;
	}

	public String getPlTxLocCd() {
		return this.plTxLocCd;
	}

	public void setPlTxLocCd(String plTxLocCd) {
		this.plTxLocCd = plTxLocCd;
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

	public Date getWoAbandonedCloseDt() {
		return this.woAbandonedCloseDt;
	}

	public void setWoAbandonedCloseDt(Date woAbandonedCloseDt) {
		this.woAbandonedCloseDt = woAbandonedCloseDt;
	}

	public Date getWoAbandonedDt() {
		return this.woAbandonedDt;
	}

	public void setWoAbandonedDt(Date woAbandonedDt) {
		this.woAbandonedDt = woAbandonedDt;
	}

	public String getWoAbandonedReas() {
		return this.woAbandonedReas;
	}

	public void setWoAbandonedReas(String woAbandonedReas) {
		this.woAbandonedReas = woAbandonedReas;
	}

	public String getWoAfudcSw() {
		return this.woAfudcSw;
	}

	public void setWoAfudcSw(String woAfudcSw) {
		this.woAfudcSw = woAfudcSw;
	}

	public String getWoAllowCostRedistSw() {
		return this.woAllowCostRedistSw;
	}

	public void setWoAllowCostRedistSw(String woAllowCostRedistSw) {
		this.woAllowCostRedistSw = woAllowCostRedistSw;
	}

	public String getWoBlanketId() {
		return this.woBlanketId;
	}

	public void setWoBlanketId(String woBlanketId) {
		this.woBlanketId = woBlanketId;
	}

	public String getWoBlanketSw() {
		return this.woBlanketSw;
	}

	public void setWoBlanketSw(String woBlanketSw) {
		this.woBlanketSw = woBlanketSw;
	}

	public BigDecimal getWoBudNbr() {
		return this.woBudNbr;
	}

	public void setWoBudNbr(BigDecimal woBudNbr) {
		this.woBudNbr = woBudNbr;
	}

	public Date getWoCapitalizedDt() {
		return this.woCapitalizedDt;
	}

	public void setWoCapitalizedDt(Date woCapitalizedDt) {
		this.woCapitalizedDt = woCapitalizedDt;
	}

	public String getWoCaptureSw() {
		return this.woCaptureSw;
	}

	public void setWoCaptureSw(String woCaptureSw) {
		this.woCaptureSw = woCaptureSw;
	}

	public Date getWoCloseDt() {
		return this.woCloseDt;
	}

	public void setWoCloseDt(Date woCloseDt) {
		this.woCloseDt = woCloseDt;
	}

	public String getWoCoeSw() {
		return this.woCoeSw;
	}

	public void setWoCoeSw(String woCoeSw) {
		this.woCoeSw = woCoeSw;
	}

	public String getWoCom() {
		return this.woCom;
	}

	public void setWoCom(String woCom) {
		this.woCom = woCom;
	}

	public Date getWoCompDt() {
		return this.woCompDt;
	}

	public void setWoCompDt(Date woCompDt) {
		this.woCompDt = woCompDt;
	}

	public BigDecimal getWoContribMaxAmt() {
		return this.woContribMaxAmt;
	}

	public void setWoContribMaxAmt(BigDecimal woContribMaxAmt) {
		this.woContribMaxAmt = woContribMaxAmt;
	}

	public BigDecimal getWoContribMinAmt() {
		return this.woContribMinAmt;
	}

	public void setWoContribMinAmt(BigDecimal woContribMinAmt) {
		this.woContribMinAmt = woContribMinAmt;
	}

	public String getWoCustNm() {
		return this.woCustNm;
	}

	public void setWoCustNm(String woCustNm) {
		this.woCustNm = woCustNm;
	}

	public String getWoDesc() {
		return this.woDesc;
	}

	public void setWoDesc(String woDesc) {
		this.woDesc = woDesc;
	}

	public String getWoDescLoanAdj() {
		return this.woDescLoanAdj;
	}

	public void setWoDescLoanAdj(String woDescLoanAdj) {
		this.woDescLoanAdj = woDescLoanAdj;
	}

	public String getWoDistTypeCd() {
		return this.woDistTypeCd;
	}

	public void setWoDistTypeCd(String woDistTypeCd) {
		this.woDistTypeCd = woDistTypeCd;
	}

	public Date getWoEngReviewDt() {
		return this.woEngReviewDt;
	}

	public void setWoEngReviewDt(Date woEngReviewDt) {
		this.woEngReviewDt = woEngReviewDt;
	}

	public Date getWoEstDt() {
		return this.woEstDt;
	}

	public void setWoEstDt(Date woEstDt) {
		this.woEstDt = woEstDt;
	}

	public String getWoGrpCd() {
		return this.woGrpCd;
	}

	public void setWoGrpCd(String woGrpCd) {
		this.woGrpCd = woGrpCd;
	}

	public String getWoHistSeqPrevRev() {
		return this.woHistSeqPrevRev;
	}

	public void setWoHistSeqPrevRev(String woHistSeqPrevRev) {
		this.woHistSeqPrevRev = woHistSeqPrevRev;
	}

	public String getWoInvtId() {
		return this.woInvtId;
	}

	public void setWoInvtId(String woInvtId) {
		this.woInvtId = woInvtId;
	}

	public BigDecimal getWoLoanAdjAmt() {
		return this.woLoanAdjAmt;
	}

	public void setWoLoanAdjAmt(BigDecimal woLoanAdjAmt) {
		this.woLoanAdjAmt = woLoanAdjAmt;
	}

	public String getWoLoanId() {
		return this.woLoanId;
	}

	public void setWoLoanId(String woLoanId) {
		this.woLoanId = woLoanId;
	}

	public String getWoLoanProjExt() {
		return this.woLoanProjExt;
	}

	public void setWoLoanProjExt(String woLoanProjExt) {
		this.woLoanProjExt = woLoanProjExt;
	}

	public String getWoLoanProjId() {
		return this.woLoanProjId;
	}

	public void setWoLoanProjId(String woLoanProjId) {
		this.woLoanProjId = woLoanProjId;
	}

	public BigDecimal getWoLoanYr() {
		return this.woLoanYr;
	}

	public void setWoLoanYr(BigDecimal woLoanYr) {
		this.woLoanYr = woLoanYr;
	}

	public String getWoManCloseSw() {
		return this.woManCloseSw;
	}

	public void setWoManCloseSw(String woManCloseSw) {
		this.woManCloseSw = woManCloseSw;
	}

	public String getWoMsExtractSw() {
		return this.woMsExtractSw;
	}

	public void setWoMsExtractSw(String woMsExtractSw) {
		this.woMsExtractSw = woMsExtractSw;
	}

	public BigDecimal getWoMstrCtr() {
		return this.woMstrCtr;
	}

	public void setWoMstrCtr(BigDecimal woMstrCtr) {
		this.woMstrCtr = woMstrCtr;
	}

	public Date getWoOpenDt() {
		return this.woOpenDt;
	}

	public void setWoOpenDt(Date woOpenDt) {
		this.woOpenDt = woOpenDt;
	}

	public BigDecimal getWoPct() {
		return this.woPct;
	}

	public void setWoPct(BigDecimal woPct) {
		this.woPct = woPct;
	}

	public Date getWoProcessDt() {
		return this.woProcessDt;
	}

	public void setWoProcessDt(Date woProcessDt) {
		this.woProcessDt = woProcessDt;
	}

	public String getWoProcessSw() {
		return this.woProcessSw;
	}

	public void setWoProcessSw(String woProcessSw) {
		this.woProcessSw = woProcessSw;
	}

	public String getWoProjId() {
		return this.woProjId;
	}

	public void setWoProjId(String woProjId) {
		this.woProjId = woProjId;
	}

	public Date getWoRelDt() {
		return this.woRelDt;
	}

	public void setWoRelDt(Date woRelDt) {
		this.woRelDt = woRelDt;
	}

	public Date getWoStakeDt() {
		return this.woStakeDt;
	}

	public void setWoStakeDt(Date woStakeDt) {
		this.woStakeDt = woStakeDt;
	}

	public String getWoStatCd() {
		return this.woStatCd;
	}

	public void setWoStatCd(String woStatCd) {
		this.woStatCd = woStatCd;
	}

	public String getWoTypeCd() {
		return this.woTypeCd;
	}

	public void setWoTypeCd(String woTypeCd) {
		this.woTypeCd = woTypeCd;
	}

	public String getWoUpdtEstSw() {
		return this.woUpdtEstSw;
	}

	public void setWoUpdtEstSw(String woUpdtEstSw) {
		this.woUpdtEstSw = woUpdtEstSw;
	}

	public String getWoUsePrevRevSw() {
		return this.woUsePrevRevSw;
	}

	public void setWoUsePrevRevSw(String woUsePrevRevSw) {
		this.woUsePrevRevSw = woUsePrevRevSw;
	}
}
