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
@Table(name = "BI_SO_TYPE_FUNCTION_REF", schema = "CIS11013")
@NamedQueries({ @NamedQuery(name = "BiSoTypeFunctionRef.findAll", query = "SELECT b FROM BiSoTypeFunctionRef b"),
		@NamedQuery(name = "BiSoTypeFunctionRef.findTypeFunctionById", query = "SELECT b FROM BiSoTypeFunctionRef b WHERE b.id = :id") })
public class BiSoTypeFunctionRef implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private BiSoTypeFunctionRefPK id;
	@Column(name = "BI_ACTIVE_SW")
	private String biActiveSw;
	@Column(name = "BI_ALLOW_MULTI_SW")
	private String biAllowMultiSw;
	@Column(name = "BI_ALLOW_SH_SO_CREATE_SW")
	private String biAllowShSoCreateSw;
	@Column(name = "BI_ALLOW_WO_GROUP_SEL_SW")
	private String biAllowWoGroupSelSw;
	@Column(name = "BI_ALLOWANCE_RDG_DAYS")
	private BigDecimal biAllowanceRdgDays;
	@Column(name = "BI_AUTO_CLOSE_DAYS")
	private BigDecimal biAutoCloseDays;
	@Column(name = "BI_AUTO_PROCESS_SW")
	private String biAutoProcessSw;
	@Column(name = "BI_CLOSE_ON_SO_CLOSE_SW")
	private String biCloseOnSoCloseSw;
	@Column(name = "BI_CONN_SRV_STAT_CD")
	private BigDecimal biConnSrvStatCd;
	@Column(name = "BI_DISC_SRV_STAT_CD")
	private BigDecimal biDiscSrvStatCd;
	@Column(name = "BI_EDI_CD")
	private String biEdiCd;
	@Column(name = "BI_REQUIRE_REVIEW_SW")
	private String biRequireReviewSw;
	@Column(name = "BI_REV_CLASS_CD")
	private BigDecimal biRevClassCd;
	@Column(name = "BI_SO_DAYS_PRO_MTHD")
	private String biSoDaysProMthd;
	@Column(name = "BI_SO_PRTY_CD")
	private String biSoPrtyCd;
	@Column(name = "BI_SO_TYPE_FUNCTION_DESC")
	private String biSoTypeFunctionDesc;
	@Column(name = "BI_SO_TYPE_FUNCTION_REF_CTR")
	private BigDecimal biSoTypeFunctionRefCtr;
	@Column(name = "BI_SO_WEB_CD")
	private String biSoWebCd;
	@Column(name = "BI_USE_AS_DEFAULT_SW")
	private String biUseAsDefaultSw;
	@Column(name = "BI_WM_STD_RESP_HRS")
	private BigDecimal biWmStdRespHrs;
	@Column(name = "BI_WO_ASSIGN_SW")
	private String biWoAssignSw;
	@Column(name = "BI_WO_DESC_CD")
	private String biWoDescCd;
	@Column(name = "BI_WO_DT_OPTION_CD")
	private String biWoDtOptionCd;
	@Column(name = "BI_WO_GROUP")
	private String biWoGroup;
	@Column(name = "BI_WO_PROJ_VERIFY_CD")
	private String biWoProjVerifyCd;
	@Column(name = "BI_WO_TYPE")
	private String biWoType;
	@Column(name = "BI_WO_VERIFY_CD")
	private String biWoVerifyCd;
	@Column(name = "BI_WRKFLW_TMPLT_ID")
	private BigDecimal biWrkflwTmpltId;

	public BiSoTypeFunctionRefPK getId() {
		return this.id;
	}

	public void setId(BiSoTypeFunctionRefPK id) {
		this.id = id;
	}

	public String getBiActiveSw() {
		return this.biActiveSw;
	}

	public void setBiActiveSw(String biActiveSw) {
		this.biActiveSw = biActiveSw;
	}

	public String getBiAllowMultiSw() {
		return this.biAllowMultiSw;
	}

	public void setBiAllowMultiSw(String biAllowMultiSw) {
		this.biAllowMultiSw = biAllowMultiSw;
	}

	public String getBiAllowShSoCreateSw() {
		return this.biAllowShSoCreateSw;
	}

	public void setBiAllowShSoCreateSw(String biAllowShSoCreateSw) {
		this.biAllowShSoCreateSw = biAllowShSoCreateSw;
	}

	public String getBiAllowWoGroupSelSw() {
		return this.biAllowWoGroupSelSw;
	}

	public void setBiAllowWoGroupSelSw(String biAllowWoGroupSelSw) {
		this.biAllowWoGroupSelSw = biAllowWoGroupSelSw;
	}

	public BigDecimal getBiAllowanceRdgDays() {
		return this.biAllowanceRdgDays;
	}

	public void setBiAllowanceRdgDays(BigDecimal biAllowanceRdgDays) {
		this.biAllowanceRdgDays = biAllowanceRdgDays;
	}

	public BigDecimal getBiAutoCloseDays() {
		return this.biAutoCloseDays;
	}

	public void setBiAutoCloseDays(BigDecimal biAutoCloseDays) {
		this.biAutoCloseDays = biAutoCloseDays;
	}

	public String getBiAutoProcessSw() {
		return this.biAutoProcessSw;
	}

	public void setBiAutoProcessSw(String biAutoProcessSw) {
		this.biAutoProcessSw = biAutoProcessSw;
	}

	public String getBiCloseOnSoCloseSw() {
		return this.biCloseOnSoCloseSw;
	}

	public void setBiCloseOnSoCloseSw(String biCloseOnSoCloseSw) {
		this.biCloseOnSoCloseSw = biCloseOnSoCloseSw;
	}

	public BigDecimal getBiConnSrvStatCd() {
		return this.biConnSrvStatCd;
	}

	public void setBiConnSrvStatCd(BigDecimal biConnSrvStatCd) {
		this.biConnSrvStatCd = biConnSrvStatCd;
	}

	public BigDecimal getBiDiscSrvStatCd() {
		return this.biDiscSrvStatCd;
	}

	public void setBiDiscSrvStatCd(BigDecimal biDiscSrvStatCd) {
		this.biDiscSrvStatCd = biDiscSrvStatCd;
	}

	public String getBiEdiCd() {
		return this.biEdiCd;
	}

	public void setBiEdiCd(String biEdiCd) {
		this.biEdiCd = biEdiCd;
	}

	public String getBiRequireReviewSw() {
		return this.biRequireReviewSw;
	}

	public void setBiRequireReviewSw(String biRequireReviewSw) {
		this.biRequireReviewSw = biRequireReviewSw;
	}

	public BigDecimal getBiRevClassCd() {
		return this.biRevClassCd;
	}

	public void setBiRevClassCd(BigDecimal biRevClassCd) {
		this.biRevClassCd = biRevClassCd;
	}

	public String getBiSoDaysProMthd() {
		return this.biSoDaysProMthd;
	}

	public void setBiSoDaysProMthd(String biSoDaysProMthd) {
		this.biSoDaysProMthd = biSoDaysProMthd;
	}

	public String getBiSoPrtyCd() {
		return this.biSoPrtyCd;
	}

	public void setBiSoPrtyCd(String biSoPrtyCd) {
		this.biSoPrtyCd = biSoPrtyCd;
	}

	public String getBiSoTypeFunctionDesc() {
		return this.biSoTypeFunctionDesc;
	}

	public void setBiSoTypeFunctionDesc(String biSoTypeFunctionDesc) {
		this.biSoTypeFunctionDesc = biSoTypeFunctionDesc;
	}

	public BigDecimal getBiSoTypeFunctionRefCtr() {
		return this.biSoTypeFunctionRefCtr;
	}

	public void setBiSoTypeFunctionRefCtr(BigDecimal biSoTypeFunctionRefCtr) {
		this.biSoTypeFunctionRefCtr = biSoTypeFunctionRefCtr;
	}

	public String getBiSoWebCd() {
		return this.biSoWebCd;
	}

	public void setBiSoWebCd(String biSoWebCd) {
		this.biSoWebCd = biSoWebCd;
	}

	public String getBiUseAsDefaultSw() {
		return this.biUseAsDefaultSw;
	}

	public void setBiUseAsDefaultSw(String biUseAsDefaultSw) {
		this.biUseAsDefaultSw = biUseAsDefaultSw;
	}

	public BigDecimal getBiWmStdRespHrs() {
		return this.biWmStdRespHrs;
	}

	public void setBiWmStdRespHrs(BigDecimal biWmStdRespHrs) {
		this.biWmStdRespHrs = biWmStdRespHrs;
	}

	public String getBiWoAssignSw() {
		return this.biWoAssignSw;
	}

	public void setBiWoAssignSw(String biWoAssignSw) {
		this.biWoAssignSw = biWoAssignSw;
	}

	public String getBiWoDescCd() {
		return this.biWoDescCd;
	}

	public void setBiWoDescCd(String biWoDescCd) {
		this.biWoDescCd = biWoDescCd;
	}

	public String getBiWoDtOptionCd() {
		return this.biWoDtOptionCd;
	}

	public void setBiWoDtOptionCd(String biWoDtOptionCd) {
		this.biWoDtOptionCd = biWoDtOptionCd;
	}

	public String getBiWoGroup() {
		return this.biWoGroup;
	}

	public void setBiWoGroup(String biWoGroup) {
		this.biWoGroup = biWoGroup;
	}

	public String getBiWoProjVerifyCd() {
		return this.biWoProjVerifyCd;
	}

	public void setBiWoProjVerifyCd(String biWoProjVerifyCd) {
		this.biWoProjVerifyCd = biWoProjVerifyCd;
	}

	public String getBiWoType() {
		return this.biWoType;
	}

	public void setBiWoType(String biWoType) {
		this.biWoType = biWoType;
	}

	public String getBiWoVerifyCd() {
		return this.biWoVerifyCd;
	}

	public void setBiWoVerifyCd(String biWoVerifyCd) {
		this.biWoVerifyCd = biWoVerifyCd;
	}

	public BigDecimal getBiWrkflwTmpltId() {
		return this.biWrkflwTmpltId;
	}

	public void setBiWrkflwTmpltId(BigDecimal biWrkflwTmpltId) {
		this.biWrkflwTmpltId = biWrkflwTmpltId;
	}
}
