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
@Table(name = "BI_SO_MASTER", schema = "CIS11013")
@NamedQueries({ @NamedQuery(name = "BiSoMaster.findAll", query = "SELECT b FROM BiSoMaster b"),
		@NamedQuery(name = "BiSoMaster.findSoBySOID", query = "SELECT b FROM BiSoMaster b WHERE b.biSoNbr = :biSoNbr") })
public class BiSoMaster implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "BI_SO_NBR")
	private String biSoNbr;
	@Column(name = "BI_ALLOW_PURGE_SW")
	private String biAllowPurgeSw;
	@Column(name = "BI_CLOSE_BILL_CYC_NBR")
	private BigDecimal biCloseBillCycNbr;
	@Column(name = "BI_CLOSE_BY")
	private String biCloseBy;
	@Temporal(TemporalType.DATE)
	@Column(name = "BI_CLOSE_DT")
	private Date biCloseDt;
	@Column(name = "BI_COMMISSION_TYPE")
	private String biCommissionType;
	@Column(name = "BI_DELAY_TYPE")
	private String biDelayType;
	@Column(name = "BI_DESC_40")
	private String biDesc40;
	@Column(name = "BI_ENTER_TYPE_CD")
	private String biEnterTypeCd;
	@Column(name = "BI_IN_SWTALK_SW")
	private String biInSwtalkSw;
	@Column(name = "BI_INTERNAL_ORD_SW")
	private String biInternalOrdSw;
	@Column(name = "BI_MULTI_SELECT_SW")
	private String biMultiSelectSw;
	@Temporal(TemporalType.DATE)
	@Column(name = "BI_NEEDED_DT_TM")
	private Date biNeededDtTm;
	@Temporal(TemporalType.DATE)
	@Column(name = "BI_OPEN_DT")
	private Date biOpenDt;
	@Column(name = "BI_OPER_ID")
	private String biOperId;
	@Column(name = "BI_ORIG_PROCESS")
	private String biOrigProcess;
	@Column(name = "BI_OVERRIDE_RULE_SW")
	private String biOverrideRuleSw;
	@Column(name = "BI_PAID_AMT")
	private BigDecimal biPaidAmt;
	@Column(name = "BI_REAS_CD_IN")
	private String biReasCdIn;
	@Column(name = "BI_REAS_CD_OUT")
	private String biReasCdOut;
	@Column(name = "BI_REAS_TYPE_IN")
	private String biReasTypeIn;
	@Column(name = "BI_REAS_TYPE_OUT")
	private String biReasTypeOut;
	@Column(name = "BI_REQ_AMT")
	private BigDecimal biReqAmt;
	@Column(name = "BI_REQUESTED_BY")
	private String biRequestedBy;
	@Column(name = "BI_REVIEW_STAT_CD")
	private String biReviewStatCd;
	@Column(name = "BI_SALES_REP")
	private String biSalesRep;
	@Column(name = "BI_SO_DESC")
	private String biSoDesc;
	@Column(name = "BI_SO_FULL_NM")
	private String biSoFullNm;
	@Column(name = "BI_SO_GRP_MSTR_NBR")
	private String biSoGrpMstrNbr;
	@Column(name = "BI_SO_HOLD_SW")
	private String biSoHoldSw;
	@Column(name = "BI_SO_MASTER_CTR")
	private BigDecimal biSoMasterCtr;
	@Column(name = "BI_SO_RESPONSE")
	private String biSoResponse;
	@Column(name = "BI_SO_SRCE")
	private String biSoSrce;
	@Column(name = "BI_SO_STAT_CD")
	private String biSoStatCd;
	@Column(name = "BI_SO_TYPE_CD")
	private String biSoTypeCd;
	@Column(name = "BI_SW_UPDT_SW")
	private String biSwUpdtSw;
	@Column(name = "BI_TAKEN_BY")
	private String biTakenBy;
	@Column(name = "BI_USER_NM")
	private String biUserNm;
	@Temporal(TemporalType.DATE)
	@Column(name = "BI_WO_DT")
	private Date biWoDt;
	@Column(name = "BI_WO_LOAN_DESGN")
	private String biWoLoanDesgn;
	@Column(name = "BI_WO_LOAN_PROJ")
	private String biWoLoanProj;
	@Column(name = "BI_WO_LOAN_PROJ_EXT")
	private String biWoLoanProjExt;
	@Column(name = "BI_WO_LOAN_YR")
	private BigDecimal biWoLoanYr;
	@Column(name = "BI_WO_PROJECT")
	private String biWoProject;
	@Column(name = "BI_WO_WORKORD")
	private String biWoWorkord;

	public String getBiSoNbr() {
		return this.biSoNbr;
	}

	public void setBiSoNbr(String biSoNbr) {
		this.biSoNbr = biSoNbr;
	}

	public String getBiAllowPurgeSw() {
		return this.biAllowPurgeSw;
	}

	public void setBiAllowPurgeSw(String biAllowPurgeSw) {
		this.biAllowPurgeSw = biAllowPurgeSw;
	}

	public BigDecimal getBiCloseBillCycNbr() {
		return this.biCloseBillCycNbr;
	}

	public void setBiCloseBillCycNbr(BigDecimal biCloseBillCycNbr) {
		this.biCloseBillCycNbr = biCloseBillCycNbr;
	}

	public String getBiCloseBy() {
		return this.biCloseBy;
	}

	public void setBiCloseBy(String biCloseBy) {
		this.biCloseBy = biCloseBy;
	}

	public Date getBiCloseDt() {
		return this.biCloseDt;
	}

	public void setBiCloseDt(Date biCloseDt) {
		this.biCloseDt = biCloseDt;
	}

	public String getBiCommissionType() {
		return this.biCommissionType;
	}

	public void setBiCommissionType(String biCommissionType) {
		this.biCommissionType = biCommissionType;
	}

	public String getBiDelayType() {
		return this.biDelayType;
	}

	public void setBiDelayType(String biDelayType) {
		this.biDelayType = biDelayType;
	}

	public String getBiDesc40() {
		return this.biDesc40;
	}

	public void setBiDesc40(String biDesc40) {
		this.biDesc40 = biDesc40;
	}

	public String getBiEnterTypeCd() {
		return this.biEnterTypeCd;
	}

	public void setBiEnterTypeCd(String biEnterTypeCd) {
		this.biEnterTypeCd = biEnterTypeCd;
	}

	public String getBiInSwtalkSw() {
		return this.biInSwtalkSw;
	}

	public void setBiInSwtalkSw(String biInSwtalkSw) {
		this.biInSwtalkSw = biInSwtalkSw;
	}

	public String getBiInternalOrdSw() {
		return this.biInternalOrdSw;
	}

	public void setBiInternalOrdSw(String biInternalOrdSw) {
		this.biInternalOrdSw = biInternalOrdSw;
	}

	public String getBiMultiSelectSw() {
		return this.biMultiSelectSw;
	}

	public void setBiMultiSelectSw(String biMultiSelectSw) {
		this.biMultiSelectSw = biMultiSelectSw;
	}

	public Date getBiNeededDtTm() {
		return this.biNeededDtTm;
	}

	public void setBiNeededDtTm(Date biNeededDtTm) {
		this.biNeededDtTm = biNeededDtTm;
	}

	public Date getBiOpenDt() {
		return this.biOpenDt;
	}

	public void setBiOpenDt(Date biOpenDt) {
		this.biOpenDt = biOpenDt;
	}

	public String getBiOperId() {
		return this.biOperId;
	}

	public void setBiOperId(String biOperId) {
		this.biOperId = biOperId;
	}

	public String getBiOrigProcess() {
		return this.biOrigProcess;
	}

	public void setBiOrigProcess(String biOrigProcess) {
		this.biOrigProcess = biOrigProcess;
	}

	public String getBiOverrideRuleSw() {
		return this.biOverrideRuleSw;
	}

	public void setBiOverrideRuleSw(String biOverrideRuleSw) {
		this.biOverrideRuleSw = biOverrideRuleSw;
	}

	public BigDecimal getBiPaidAmt() {
		return this.biPaidAmt;
	}

	public void setBiPaidAmt(BigDecimal biPaidAmt) {
		this.biPaidAmt = biPaidAmt;
	}

	public String getBiReasCdIn() {
		return this.biReasCdIn;
	}

	public void setBiReasCdIn(String biReasCdIn) {
		this.biReasCdIn = biReasCdIn;
	}

	public String getBiReasCdOut() {
		return this.biReasCdOut;
	}

	public void setBiReasCdOut(String biReasCdOut) {
		this.biReasCdOut = biReasCdOut;
	}

	public String getBiReasTypeIn() {
		return this.biReasTypeIn;
	}

	public void setBiReasTypeIn(String biReasTypeIn) {
		this.biReasTypeIn = biReasTypeIn;
	}

	public String getBiReasTypeOut() {
		return this.biReasTypeOut;
	}

	public void setBiReasTypeOut(String biReasTypeOut) {
		this.biReasTypeOut = biReasTypeOut;
	}

	public BigDecimal getBiReqAmt() {
		return this.biReqAmt;
	}

	public void setBiReqAmt(BigDecimal biReqAmt) {
		this.biReqAmt = biReqAmt;
	}

	public String getBiRequestedBy() {
		return this.biRequestedBy;
	}

	public void setBiRequestedBy(String biRequestedBy) {
		this.biRequestedBy = biRequestedBy;
	}

	public String getBiReviewStatCd() {
		return this.biReviewStatCd;
	}

	public void setBiReviewStatCd(String biReviewStatCd) {
		this.biReviewStatCd = biReviewStatCd;
	}

	public String getBiSalesRep() {
		return this.biSalesRep;
	}

	public void setBiSalesRep(String biSalesRep) {
		this.biSalesRep = biSalesRep;
	}

	public String getBiSoDesc() {
		return this.biSoDesc;
	}

	public void setBiSoDesc(String biSoDesc) {
		this.biSoDesc = biSoDesc;
	}

	public String getBiSoFullNm() {
		return this.biSoFullNm;
	}

	public void setBiSoFullNm(String biSoFullNm) {
		this.biSoFullNm = biSoFullNm;
	}

	public String getBiSoGrpMstrNbr() {
		return this.biSoGrpMstrNbr;
	}

	public void setBiSoGrpMstrNbr(String biSoGrpMstrNbr) {
		this.biSoGrpMstrNbr = biSoGrpMstrNbr;
	}

	public String getBiSoHoldSw() {
		return this.biSoHoldSw;
	}

	public void setBiSoHoldSw(String biSoHoldSw) {
		this.biSoHoldSw = biSoHoldSw;
	}

	public BigDecimal getBiSoMasterCtr() {
		return this.biSoMasterCtr;
	}

	public void setBiSoMasterCtr(BigDecimal biSoMasterCtr) {
		this.biSoMasterCtr = biSoMasterCtr;
	}

	public String getBiSoResponse() {
		return this.biSoResponse;
	}

	public void setBiSoResponse(String biSoResponse) {
		this.biSoResponse = biSoResponse;
	}

	public String getBiSoSrce() {
		return this.biSoSrce;
	}

	public void setBiSoSrce(String biSoSrce) {
		this.biSoSrce = biSoSrce;
	}

	public String getBiSoStatCd() {
		return this.biSoStatCd;
	}

	public void setBiSoStatCd(String biSoStatCd) {
		this.biSoStatCd = biSoStatCd;
	}

	public String getBiSoTypeCd() {
		return this.biSoTypeCd;
	}

	public void setBiSoTypeCd(String biSoTypeCd) {
		this.biSoTypeCd = biSoTypeCd;
	}

	public String getBiSwUpdtSw() {
		return this.biSwUpdtSw;
	}

	public void setBiSwUpdtSw(String biSwUpdtSw) {
		this.biSwUpdtSw = biSwUpdtSw;
	}

	public String getBiTakenBy() {
		return this.biTakenBy;
	}

	public void setBiTakenBy(String biTakenBy) {
		this.biTakenBy = biTakenBy;
	}

	public String getBiUserNm() {
		return this.biUserNm;
	}

	public void setBiUserNm(String biUserNm) {
		this.biUserNm = biUserNm;
	}

	public Date getBiWoDt() {
		return this.biWoDt;
	}

	public void setBiWoDt(Date biWoDt) {
		this.biWoDt = biWoDt;
	}

	public String getBiWoLoanDesgn() {
		return this.biWoLoanDesgn;
	}

	public void setBiWoLoanDesgn(String biWoLoanDesgn) {
		this.biWoLoanDesgn = biWoLoanDesgn;
	}

	public String getBiWoLoanProj() {
		return this.biWoLoanProj;
	}

	public void setBiWoLoanProj(String biWoLoanProj) {
		this.biWoLoanProj = biWoLoanProj;
	}

	public String getBiWoLoanProjExt() {
		return this.biWoLoanProjExt;
	}

	public void setBiWoLoanProjExt(String biWoLoanProjExt) {
		this.biWoLoanProjExt = biWoLoanProjExt;
	}

	public BigDecimal getBiWoLoanYr() {
		return this.biWoLoanYr;
	}

	public void setBiWoLoanYr(BigDecimal biWoLoanYr) {
		this.biWoLoanYr = biWoLoanYr;
	}

	public String getBiWoProject() {
		return this.biWoProject;
	}

	public void setBiWoProject(String biWoProject) {
		this.biWoProject = biWoProject;
	}

	public String getBiWoWorkord() {
		return this.biWoWorkord;
	}

	public void setBiWoWorkord(String biWoWorkord) {
		this.biWoWorkord = biWoWorkord;
	}
}
