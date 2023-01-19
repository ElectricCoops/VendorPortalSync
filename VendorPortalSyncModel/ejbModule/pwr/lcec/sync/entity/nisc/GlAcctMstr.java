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
@Table(name = "GL_ACCT_MSTR", schema = "ABS11013")
@NamedQueries({ @NamedQuery(name = "GlAcctMstr.findAll", query = "SELECT g FROM GlAcctMstr g"),
		@NamedQuery(name = "GlAcctMstr.findVPAccounts", query = "SELECT g FROM GlAcctMstr g WHERE g.id.glAcctSubNbr IN :glAccounts") })
public class GlAcctMstr implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private GlAcctMstrPK id;
	@Column(name = "GL_ACCT_GRP_CD")
	private String glAcctGrpCd;
	@Column(name = "GL_ACCT_MSTR_CTR")
	private BigDecimal glAcctMstrCtr;
	@Column(name = "GL_ACCT_SUB_MATRIX_NBR")
	private BigDecimal glAcctSubMatrixNbr;
	@Column(name = "GL_ACCT_TYPE_CD")
	private String glAcctTypeCd;
	@Column(name = "GL_COM")
	private String glCom;
	@Column(name = "GL_DESC")
	private String glDesc;
	@Column(name = "GL_DIV_MATRIX_NBR")
	private BigDecimal glDivMatrixNbr;
	@Column(name = "GL_MATRIX_CD")
	private String glMatrixCd;
	@Column(name = "GL_OPERATING_CD")
	private String glOperatingCd;
	@Column(name = "GL_RUS_CD")
	private String glRusCd;
	@Column(name = "GL_STAT_CD")
	private String glStatCd;
	@Column(name = "GL_SUM_DTL_SW")
	private String glSumDtlSw;
	@Column(name = "SY_AUDIT_PROC_NM")
	private String syAuditProcNm;
	@Column(name = "SY_AUDIT_TRAN_ID")
	private String syAuditTranId;
	@Column(name = "SY_AUDIT_USER_ID")
	private BigDecimal syAuditUserId;

	public GlAcctMstrPK getId() {
		return this.id;
	}

	public void setId(GlAcctMstrPK id) {
		this.id = id;
	}

	public String getGlAcctGrpCd() {
		return this.glAcctGrpCd;
	}

	public void setGlAcctGrpCd(String glAcctGrpCd) {
		this.glAcctGrpCd = glAcctGrpCd;
	}

	public BigDecimal getGlAcctMstrCtr() {
		return this.glAcctMstrCtr;
	}

	public void setGlAcctMstrCtr(BigDecimal glAcctMstrCtr) {
		this.glAcctMstrCtr = glAcctMstrCtr;
	}

	public BigDecimal getGlAcctSubMatrixNbr() {
		return this.glAcctSubMatrixNbr;
	}

	public void setGlAcctSubMatrixNbr(BigDecimal glAcctSubMatrixNbr) {
		this.glAcctSubMatrixNbr = glAcctSubMatrixNbr;
	}

	public String getGlAcctTypeCd() {
		return this.glAcctTypeCd;
	}

	public void setGlAcctTypeCd(String glAcctTypeCd) {
		this.glAcctTypeCd = glAcctTypeCd;
	}

	public String getGlCom() {
		return this.glCom;
	}

	public void setGlCom(String glCom) {
		this.glCom = glCom;
	}

	public String getGlDesc() {
		return this.glDesc;
	}

	public void setGlDesc(String glDesc) {
		this.glDesc = glDesc;
	}

	public BigDecimal getGlDivMatrixNbr() {
		return this.glDivMatrixNbr;
	}

	public void setGlDivMatrixNbr(BigDecimal glDivMatrixNbr) {
		this.glDivMatrixNbr = glDivMatrixNbr;
	}

	public String getGlMatrixCd() {
		return this.glMatrixCd;
	}

	public void setGlMatrixCd(String glMatrixCd) {
		this.glMatrixCd = glMatrixCd;
	}

	public String getGlOperatingCd() {
		return this.glOperatingCd;
	}

	public void setGlOperatingCd(String glOperatingCd) {
		this.glOperatingCd = glOperatingCd;
	}

	public String getGlRusCd() {
		return this.glRusCd;
	}

	public void setGlRusCd(String glRusCd) {
		this.glRusCd = glRusCd;
	}

	public String getGlStatCd() {
		return this.glStatCd;
	}

	public void setGlStatCd(String glStatCd) {
		this.glStatCd = glStatCd;
	}

	public String getGlSumDtlSw() {
		return this.glSumDtlSw;
	}

	public void setGlSumDtlSw(String glSumDtlSw) {
		this.glSumDtlSw = glSumDtlSw;
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
