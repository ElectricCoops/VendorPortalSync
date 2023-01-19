package pwr.lcec.sync.entity.nisc.custom;

import java.io.Serializable;
import java.math.BigDecimal;

public class NiscRateRef implements Serializable {
	private static final long serialVersionUID = 1L;
	private String woCauId;
	private String woDesc;
	private String woRateGrpCd;
	private BigDecimal woConsHrs;
	private String woLaborRateConsCd;
	private BigDecimal woAmtConst;
	private BigDecimal woRetireHrs;
	private String woLaborRateRetireCd;
	private BigDecimal woAmtRetire;
	private BigDecimal woCauRefRateCtr;
	//private BigDecimal woFixedAmt;

	public NiscRateRef(String woCauId, String woDesc, String woRateGrpCd, BigDecimal woConsHrs,
			String woLaborRateConsCd, BigDecimal woAmtConst, BigDecimal woRetireHrs, String woLaborRateRetireCd,
			BigDecimal woAmtRetire, BigDecimal woCauRefRateCtr) {
		this.woCauId = woCauId;
		this.woDesc = woDesc;
		this.woRateGrpCd = woRateGrpCd;
		this.woConsHrs = woConsHrs;
		this.woLaborRateConsCd = woLaborRateConsCd;
		this.woAmtConst = woAmtConst;
		this.woRetireHrs = woRetireHrs;
		this.woLaborRateRetireCd = woLaborRateRetireCd;
		this.woAmtRetire = woAmtRetire;
		this.woCauRefRateCtr = woCauRefRateCtr;
		//this.woFixedAmt = woFixedAmt;
	}

	public String getWoCauId() {
		return this.woCauId;
	}

	public void setWoCauId(String woCauId) {
		this.woCauId = woCauId;
	}

	public String getWoDesc() {
		return this.woDesc;
	}

	public void setWoDesc(String woDesc) {
		this.woDesc = woDesc;
	}

	public String getWoRateGrpCd() {
		return this.woRateGrpCd;
	}

	public void setWoRateGrpCd(String woRateGrpCd) {
		this.woRateGrpCd = woRateGrpCd;
	}

	public BigDecimal getWoConsHrs() {
		return this.woConsHrs;
	}

	public void setWoConsHrs(BigDecimal woConsHrs) {
		this.woConsHrs = woConsHrs;
	}

	public String getWoLaborRateConsCd() {
		return this.woLaborRateConsCd;
	}

	public void setWoLaborRateConsCd(String woLaborRateConsCd) {
		this.woLaborRateConsCd = woLaborRateConsCd;
	}

	public BigDecimal getWoAmtConst() {
		return this.woAmtConst;
	}

	public void setWoAmtConst(BigDecimal woAmtConst) {
		this.woAmtConst = woAmtConst;
	}

	public BigDecimal getWoRetireHrs() {
		return this.woRetireHrs;
	}

	public void setWoRetireHrs(BigDecimal woRetireHrs) {
		this.woRetireHrs = woRetireHrs;
	}

	public String getWoLaborRateRetireCd() {
		return this.woLaborRateRetireCd;
	}

	public void setWoLaborRateRetireCd(String woLaborRateRetireCd) {
		this.woLaborRateRetireCd = woLaborRateRetireCd;
	}

	public BigDecimal getWoAmtRetire() {
		return this.woAmtRetire;
	}

	public void setWoAmtRetire(BigDecimal woAmtRetire) {
		this.woAmtRetire = woAmtRetire;
	}

	public BigDecimal getWoCauRefRateCtr() {
		return this.woCauRefRateCtr;
	}

	public void setWoCauRefRateCtr(BigDecimal woCauRefRateCtr) {
		this.woCauRefRateCtr = woCauRefRateCtr;
	}

	/*public BigDecimal getWoFixedAmt() {
		return this.woFixedAmt;
	}

	public void setWoFixedAmt(BigDecimal woFixedAmt) {
		this.woFixedAmt = woFixedAmt;
	}*/
}
