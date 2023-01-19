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
@Table(name = "CIS11013.BI_SO_DET")
@NamedQueries({ @NamedQuery(name = "BiSoDet.findAll", query = "SELECT b FROM BiSoDet b"),
		@NamedQuery(name = "BiSoDet.findSOByworkFlowId", query = "SELECT b FROM BiSoDet b WHERE b.biWrkflwKey = :wrkFlowId"),
		@NamedQuery(name = "BiSoDet.findSOSyncByWFID", query = "SELECT b FROM BiSoDet b WHERE b.biWrkflwKey = :wrkFlowId AND b.biSoTypeCd NOT IN ('APT','CNMNR','CNTB','DCLAIM','DMTNC','ER','HP','PSC','OSP','TPOH')") })
public class BiSoDet implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "BI_SO_DET_KEY")
	private long biSoDetKey;
	@Column(name = "BI_ACCT")
	private BigDecimal biAcct;
	@Column(name = "BI_ALLOWANCE_RDG_DAYS")
	private BigDecimal biAllowanceRdgDays;
	@Column(name = "BI_APPLY_CCS_SW")
	private String biApplyCcsSw;
	@Temporal(TemporalType.DATE)
	@Column(name = "BI_AUTO_CLOSE_DT")
	private Date biAutoCloseDt;
	@Column(name = "BI_AUTO_PROCESS_SW")
	private String biAutoProcessSw;
	@Column(name = "BI_BLDR_AREA_CD")
	private String biBldrAreaCd;
	@Column(name = "BI_BLDR_NAME")
	private String biBldrName;
	@Column(name = "BI_BLDR_PHN")
	private String biBldrPhn;
	@Temporal(TemporalType.DATE)
	@Column(name = "BI_CLOSE_DT")
	private Date biCloseDt;
	@Column(name = "BI_COMMISSION_TYPE")
	private String biCommissionType;
	@Column(name = "BI_CREATE_PRORATE_SW")
	private String biCreateProrateSw;
	@Column(name = "BI_CUST_NBR")
	private BigDecimal biCustNbr;
	@Column(name = "BI_DELAY_TYPE")
	private String biDelayType;
	@Column(name = "BI_DEP_PROC_SW")
	private String biDepProcSw;
	@Column(name = "BI_DESC_40")
	private String biDesc40;
	@Column(name = "BI_DNP_SW")
	private String biDnpSw;
	@Temporal(TemporalType.DATE)
	@Column(name = "BI_EDI_PROC_DT_TM")
	private Date biEdiProcDtTm;
	@Column(name = "BI_EDI_TRACKING_NBR")
	private String biEdiTrackingNbr;
	@Column(name = "BI_HIST_USAGE_TYPE")
	private String biHistUsageType;
	@Column(name = "BI_IN_SWTALK_SW")
	private String biInSwtalkSw;
	@Column(name = "BI_MAP_LOC_NBR")
	private String biMapLocNbr;
	@Column(name = "BI_MISC_CHGS_PROC_CD")
	private String biMiscChgsProcCd;
	@Column(name = "BI_MOVE_CNTRCT_SW")
	private String biMoveCntrctSw;
	@Column(name = "BI_MTR_READ_OFF_CYC_SW")
	private String biMtrReadOffCycSw;
	@Column(name = "BI_MV_CNTRCT_SW")
	private String biMvCntrctSw;
	@Column(name = "BI_NOTIF_CD")
	private String biNotifCd;
	@Temporal(TemporalType.DATE)
	@Column(name = "BI_OPEN_DT")
	private Date biOpenDt;
	@Column(name = "BI_ORIG_TRAN_ID")
	private String biOrigTranId;
	@Column(name = "BI_PERMIT_REQ_SW")
	private String biPermitReqSw;
	@Column(name = "BI_PRIOR_SO_STAT_CD")
	private String biPriorSoStatCd;
	@Temporal(TemporalType.DATE)
	@Column(name = "BI_PRORATE_DT")
	private Date biProrateDt;
	@Temporal(TemporalType.DATE)
	@Column(name = "BI_PRORATE_TO_DT")
	private Date biProrateToDt;
	@Column(name = "BI_REAS_CD_IN")
	private String biReasCdIn;
	@Column(name = "BI_REAS_CD_OUT")
	private String biReasCdOut;
	@Column(name = "BI_REAS_TYPE_IN")
	private String biReasTypeIn;
	@Column(name = "BI_REAS_TYPE_OUT")
	private String biReasTypeOut;
	@Column(name = "BI_SALES_REP")
	private String biSalesRep;
	@Column(name = "BI_SCHED_REM_PROC_SW")
	private String biSchedRemProcSw;
	@Column(name = "BI_SO_COM")
	private String biSoCom;
	@Column(name = "BI_SO_DET_CTR")
	private BigDecimal biSoDetCtr;
	@Column(name = "BI_SO_FUNCTION_CD")
	private String biSoFunctionCd;
	@Column(name = "BI_SO_NBR")
	private String biSoNbr;
	@Column(name = "BI_SO_PROC_LOC_CD")
	private String biSoProcLocCd;
	@Column(name = "BI_SO_STACK_SEQ_NBR")
	private BigDecimal biSoStackSeqNbr;
	@Column(name = "BI_SO_STAT_CD")
	private String biSoStatCd;
	@Column(name = "BI_SO_TO_ACCT")
	private BigDecimal biSoToAcct;
	@Column(name = "BI_SO_TO_CUST_NBR")
	private BigDecimal biSoToCustNbr;
	@Column(name = "BI_SO_TYPE_CD")
	private String biSoTypeCd;
	@Temporal(TemporalType.DATE)
	@Column(name = "BI_SRV_LOC_CONN_DT")
	private Date biSrvLocConnDt;
	@Temporal(TemporalType.DATE)
	@Column(name = "BI_SRV_LOC_DISC_DT")
	private Date biSrvLocDiscDt;
	@Column(name = "BI_SRV_LOC_NBR")
	private int biSrvLocNbr;
	@Column(name = "BI_SW_UPDT_SW")
	private String biSwUpdtSw;
	@Column(name = "BI_TYPE_SRV_GRP")
	private String biTypeSrvGrp;
	@Temporal(TemporalType.DATE)
	@Column(name = "BI_WORK_COMPLETE_DT_TM")
	private Date biWorkCompleteDtTm;
	@Column(name = "BI_WRKFLW_KEY")
	private Integer biWrkflwKey;

	public long getBiSoDetKey() {
		return this.biSoDetKey;
	}

	public void setBiSoDetKey(long biSoDetKey) {
		this.biSoDetKey = biSoDetKey;
	}

	public BigDecimal getBiAcct() {
		return this.biAcct;
	}

	public void setBiAcct(BigDecimal biAcct) {
		this.biAcct = biAcct;
	}

	public BigDecimal getBiAllowanceRdgDays() {
		return this.biAllowanceRdgDays;
	}

	public void setBiAllowanceRdgDays(BigDecimal biAllowanceRdgDays) {
		this.biAllowanceRdgDays = biAllowanceRdgDays;
	}

	public String getBiApplyCcsSw() {
		return this.biApplyCcsSw;
	}

	public void setBiApplyCcsSw(String biApplyCcsSw) {
		this.biApplyCcsSw = biApplyCcsSw;
	}

	public Date getBiAutoCloseDt() {
		return this.biAutoCloseDt;
	}

	public void setBiAutoCloseDt(Date biAutoCloseDt) {
		this.biAutoCloseDt = biAutoCloseDt;
	}

	public String getBiAutoProcessSw() {
		return this.biAutoProcessSw;
	}

	public void setBiAutoProcessSw(String biAutoProcessSw) {
		this.biAutoProcessSw = biAutoProcessSw;
	}

	public String getBiBldrAreaCd() {
		return this.biBldrAreaCd;
	}

	public void setBiBldrAreaCd(String biBldrAreaCd) {
		this.biBldrAreaCd = biBldrAreaCd;
	}

	public String getBiBldrName() {
		return this.biBldrName;
	}

	public void setBiBldrName(String biBldrName) {
		this.biBldrName = biBldrName;
	}

	public String getBiBldrPhn() {
		return this.biBldrPhn;
	}

	public void setBiBldrPhn(String biBldrPhn) {
		this.biBldrPhn = biBldrPhn;
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

	public String getBiCreateProrateSw() {
		return this.biCreateProrateSw;
	}

	public void setBiCreateProrateSw(String biCreateProrateSw) {
		this.biCreateProrateSw = biCreateProrateSw;
	}

	public BigDecimal getBiCustNbr() {
		return this.biCustNbr;
	}

	public void setBiCustNbr(BigDecimal biCustNbr) {
		this.biCustNbr = biCustNbr;
	}

	public String getBiDelayType() {
		return this.biDelayType;
	}

	public void setBiDelayType(String biDelayType) {
		this.biDelayType = biDelayType;
	}

	public String getBiDepProcSw() {
		return this.biDepProcSw;
	}

	public void setBiDepProcSw(String biDepProcSw) {
		this.biDepProcSw = biDepProcSw;
	}

	public String getBiDesc40() {
		return this.biDesc40;
	}

	public void setBiDesc40(String biDesc40) {
		this.biDesc40 = biDesc40;
	}

	public String getBiDnpSw() {
		return this.biDnpSw;
	}

	public void setBiDnpSw(String biDnpSw) {
		this.biDnpSw = biDnpSw;
	}

	public Date getBiEdiProcDtTm() {
		return this.biEdiProcDtTm;
	}

	public void setBiEdiProcDtTm(Date biEdiProcDtTm) {
		this.biEdiProcDtTm = biEdiProcDtTm;
	}

	public String getBiEdiTrackingNbr() {
		return this.biEdiTrackingNbr;
	}

	public void setBiEdiTrackingNbr(String biEdiTrackingNbr) {
		this.biEdiTrackingNbr = biEdiTrackingNbr;
	}

	public String getBiHistUsageType() {
		return this.biHistUsageType;
	}

	public void setBiHistUsageType(String biHistUsageType) {
		this.biHistUsageType = biHistUsageType;
	}

	public String getBiInSwtalkSw() {
		return this.biInSwtalkSw;
	}

	public void setBiInSwtalkSw(String biInSwtalkSw) {
		this.biInSwtalkSw = biInSwtalkSw;
	}

	public String getBiMapLocNbr() {
		return this.biMapLocNbr;
	}

	public void setBiMapLocNbr(String biMapLocNbr) {
		this.biMapLocNbr = biMapLocNbr;
	}

	public String getBiMiscChgsProcCd() {
		return this.biMiscChgsProcCd;
	}

	public void setBiMiscChgsProcCd(String biMiscChgsProcCd) {
		this.biMiscChgsProcCd = biMiscChgsProcCd;
	}

	public String getBiMoveCntrctSw() {
		return this.biMoveCntrctSw;
	}

	public void setBiMoveCntrctSw(String biMoveCntrctSw) {
		this.biMoveCntrctSw = biMoveCntrctSw;
	}

	public String getBiMtrReadOffCycSw() {
		return this.biMtrReadOffCycSw;
	}

	public void setBiMtrReadOffCycSw(String biMtrReadOffCycSw) {
		this.biMtrReadOffCycSw = biMtrReadOffCycSw;
	}

	public String getBiMvCntrctSw() {
		return this.biMvCntrctSw;
	}

	public void setBiMvCntrctSw(String biMvCntrctSw) {
		this.biMvCntrctSw = biMvCntrctSw;
	}

	public String getBiNotifCd() {
		return this.biNotifCd;
	}

	public void setBiNotifCd(String biNotifCd) {
		this.biNotifCd = biNotifCd;
	}

	public Date getBiOpenDt() {
		return this.biOpenDt;
	}

	public void setBiOpenDt(Date biOpenDt) {
		this.biOpenDt = biOpenDt;
	}

	public String getBiOrigTranId() {
		return this.biOrigTranId;
	}

	public void setBiOrigTranId(String biOrigTranId) {
		this.biOrigTranId = biOrigTranId;
	}

	public String getBiPermitReqSw() {
		return this.biPermitReqSw;
	}

	public void setBiPermitReqSw(String biPermitReqSw) {
		this.biPermitReqSw = biPermitReqSw;
	}

	public String getBiPriorSoStatCd() {
		return this.biPriorSoStatCd;
	}

	public void setBiPriorSoStatCd(String biPriorSoStatCd) {
		this.biPriorSoStatCd = biPriorSoStatCd;
	}

	public Date getBiProrateDt() {
		return this.biProrateDt;
	}

	public void setBiProrateDt(Date biProrateDt) {
		this.biProrateDt = biProrateDt;
	}

	public Date getBiProrateToDt() {
		return this.biProrateToDt;
	}

	public void setBiProrateToDt(Date biProrateToDt) {
		this.biProrateToDt = biProrateToDt;
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

	public String getBiSalesRep() {
		return this.biSalesRep;
	}

	public void setBiSalesRep(String biSalesRep) {
		this.biSalesRep = biSalesRep;
	}

	public String getBiSchedRemProcSw() {
		return this.biSchedRemProcSw;
	}

	public void setBiSchedRemProcSw(String biSchedRemProcSw) {
		this.biSchedRemProcSw = biSchedRemProcSw;
	}

	public String getBiSoCom() {
		return this.biSoCom;
	}

	public void setBiSoCom(String biSoCom) {
		this.biSoCom = biSoCom;
	}

	public BigDecimal getBiSoDetCtr() {
		return this.biSoDetCtr;
	}

	public void setBiSoDetCtr(BigDecimal biSoDetCtr) {
		this.biSoDetCtr = biSoDetCtr;
	}

	public String getBiSoFunctionCd() {
		return this.biSoFunctionCd;
	}

	public void setBiSoFunctionCd(String biSoFunctionCd) {
		this.biSoFunctionCd = biSoFunctionCd;
	}

	public String getBiSoNbr() {
		return this.biSoNbr;
	}

	public void setBiSoNbr(String biSoNbr) {
		this.biSoNbr = biSoNbr;
	}

	public String getBiSoProcLocCd() {
		return this.biSoProcLocCd;
	}

	public void setBiSoProcLocCd(String biSoProcLocCd) {
		this.biSoProcLocCd = biSoProcLocCd;
	}

	public BigDecimal getBiSoStackSeqNbr() {
		return this.biSoStackSeqNbr;
	}

	public void setBiSoStackSeqNbr(BigDecimal biSoStackSeqNbr) {
		this.biSoStackSeqNbr = biSoStackSeqNbr;
	}

	public String getBiSoStatCd() {
		return this.biSoStatCd;
	}

	public void setBiSoStatCd(String biSoStatCd) {
		this.biSoStatCd = biSoStatCd;
	}

	public BigDecimal getBiSoToAcct() {
		return this.biSoToAcct;
	}

	public void setBiSoToAcct(BigDecimal biSoToAcct) {
		this.biSoToAcct = biSoToAcct;
	}

	public BigDecimal getBiSoToCustNbr() {
		return this.biSoToCustNbr;
	}

	public void setBiSoToCustNbr(BigDecimal biSoToCustNbr) {
		this.biSoToCustNbr = biSoToCustNbr;
	}

	public String getBiSoTypeCd() {
		return this.biSoTypeCd;
	}

	public void setBiSoTypeCd(String biSoTypeCd) {
		this.biSoTypeCd = biSoTypeCd;
	}

	public Date getBiSrvLocConnDt() {
		return this.biSrvLocConnDt;
	}

	public void setBiSrvLocConnDt(Date biSrvLocConnDt) {
		this.biSrvLocConnDt = biSrvLocConnDt;
	}

	public Date getBiSrvLocDiscDt() {
		return this.biSrvLocDiscDt;
	}

	public void setBiSrvLocDiscDt(Date biSrvLocDiscDt) {
		this.biSrvLocDiscDt = biSrvLocDiscDt;
	}

	public int getBiSrvLocNbr() {
		return this.biSrvLocNbr;
	}

	public void setBiSrvLocNbr(int biSrvLocNbr) {
		this.biSrvLocNbr = biSrvLocNbr;
	}

	public String getBiSwUpdtSw() {
		return this.biSwUpdtSw;
	}

	public void setBiSwUpdtSw(String biSwUpdtSw) {
		this.biSwUpdtSw = biSwUpdtSw;
	}

	public String getBiTypeSrvGrp() {
		return this.biTypeSrvGrp;
	}

	public void setBiTypeSrvGrp(String biTypeSrvGrp) {
		this.biTypeSrvGrp = biTypeSrvGrp;
	}

	public Date getBiWorkCompleteDtTm() {
		return this.biWorkCompleteDtTm;
	}

	public void setBiWorkCompleteDtTm(Date biWorkCompleteDtTm) {
		this.biWorkCompleteDtTm = biWorkCompleteDtTm;
	}

	public Integer getBiWrkflwKey() {
		return this.biWrkflwKey;
	}

	public void setBiWrkflwKey(Integer biWrkflwKey) {
		this.biWrkflwKey = biWrkflwKey;
	}
}
