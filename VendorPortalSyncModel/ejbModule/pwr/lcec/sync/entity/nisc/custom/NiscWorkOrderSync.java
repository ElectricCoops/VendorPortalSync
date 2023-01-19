package pwr.lcec.sync.entity.nisc.custom;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class NiscWorkOrderSync implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer biWrkflwKey;
	private int biWorkFlowTaskKey;
	private Date biNeededDtTm;
	private String biTaskCd;
	private String biTaskDesc;
	private String biWorkEventCd;
	private Date biEventDtTm;
	private String biWorkGroup;
	private String biWoWorkOrder;
	private BigDecimal syUserId;
	private String biResourceName;
	private String biSoNbr;
	private String biSoFunctionCd;
	private String biSoTypeCd;
	private String biSoTypeFunctionDesc;
	private String biSoStatCd;
	private Date biOpenDt;
	private Date biCloseDt;
	private int biSrvLocNbr;
	private BigDecimal biAccountNbr;
	private BigDecimal biCustToAcc;
	private String woDesc;
	private String woTypeCd;
	private String biSoCom;

	public NiscWorkOrderSync() {
	}

	public NiscWorkOrderSync(Integer biWrkflwKey, int biWorkFlowTaskKey, Date biNeededDtTm, String biTaskCd,
			String biTaskDesc, String biWorkEventCd, Date biEventDtTm, String biWorkGroup, String biWoWorkOrder,
			BigDecimal syUserId, String biResourceName, String biSoNbr, String biSoFunctionCd, String biSoTypeCd,
			String biSoTypeFunctionDesc, String biSoStatCd, Date biOpenDt, Date biCloseDt, int biSrvLocNbr,
			BigDecimal biAccountNbr, BigDecimal biCustToAcc, String woDesc, String woTypeCd, String biSoCom) {
		this.biWrkflwKey = biWrkflwKey;
		this.biWorkFlowTaskKey = biWorkFlowTaskKey;
		this.biNeededDtTm = biNeededDtTm;
		this.biTaskCd = biTaskCd;
		this.biTaskDesc = biTaskDesc;
		this.biWorkEventCd = biWorkEventCd;
		this.biEventDtTm = biEventDtTm;
		this.biWorkGroup = biWorkGroup;
		this.biWoWorkOrder = biWoWorkOrder;
		this.syUserId = syUserId;
		this.biResourceName = biResourceName;
		this.biSoNbr = biSoNbr;
		this.biSoFunctionCd = biSoFunctionCd;
		this.biSoTypeCd = biSoTypeCd;
		this.biSoTypeFunctionDesc = biSoTypeFunctionDesc;
		this.biSoStatCd = biSoStatCd;
		this.biOpenDt = biOpenDt;
		this.biCloseDt = biCloseDt;
		this.biSrvLocNbr = biSrvLocNbr;
		this.biAccountNbr = biAccountNbr;
		this.biCustToAcc = biCustToAcc;
		this.woDesc = woDesc;
		this.woTypeCd = woTypeCd;
		this.biSoCom = biSoCom;
	}

	public Integer getBiWrkflwKey() {
		return this.biWrkflwKey;
	}

	public void setBiWrkflwKey(Integer biWrkflwKey) {
		this.biWrkflwKey = biWrkflwKey;
	}

	public int getBiWorkFlowTaskKey() {
		return this.biWorkFlowTaskKey;
	}

	public void setBiWorkFlowTaskKey(int biWorkFlowTaskKey) {
		this.biWorkFlowTaskKey = biWorkFlowTaskKey;
	}

	public Date getBiNeededDtTm() {
		return this.biNeededDtTm;
	}

	public void setBiNeededDtTm(Date biNeededDtTm) {
		this.biNeededDtTm = biNeededDtTm;
	}

	public String getBiTaskCd() {
		return this.biTaskCd;
	}

	public void setBiTaskCd(String biTaskCd) {
		this.biTaskCd = biTaskCd;
	}

	public String getBiTaskDesc() {
		return this.biTaskDesc;
	}

	public void setBiTaskDesc(String biTaskDesc) {
		this.biTaskDesc = biTaskDesc;
	}

	public String getBiWorkEventCd() {
		return this.biWorkEventCd;
	}

	public void setBiWorkEventCd(String biWorkEventCd) {
		this.biWorkEventCd = biWorkEventCd;
	}

	public Date getBiEventDtTm() {
		return this.biEventDtTm;
	}

	public void setBiEventDtTm(Date biEventDtTm) {
		this.biEventDtTm = biEventDtTm;
	}

	public String getBiWorkGroup() {
		return this.biWorkGroup;
	}

	public void setBiWorkGroup(String biWorkGroup) {
		this.biWorkGroup = biWorkGroup;
	}

	public String getBiWoWorkOrder() {
		return this.biWoWorkOrder;
	}

	public void setBiWoWorkOrder(String biWoWorkOrder) {
		this.biWoWorkOrder = biWoWorkOrder;
	}

	public BigDecimal getSyUserId() {
		return this.syUserId;
	}

	public void setSyUserId(BigDecimal syUserId) {
		this.syUserId = syUserId;
	}

	public String getBiResourceName() {
		return this.biResourceName;
	}

	public void setBiResourceName(String biResourceName) {
		this.biResourceName = biResourceName;
	}

	public String getBiSoNbr() {
		return this.biSoNbr;
	}

	public void setBiSoNbr(String biSoNbr) {
		this.biSoNbr = biSoNbr;
	}

	public String getBiSoFunctionCd() {
		return this.biSoFunctionCd;
	}

	public void setBiSoFunctionCd(String biSoFunctionCd) {
		this.biSoFunctionCd = biSoFunctionCd;
	}

	public String getBiSoTypeCd() {
		return this.biSoTypeCd;
	}

	public void setBiSoTypeCd(String biSoTypeCd) {
		this.biSoTypeCd = biSoTypeCd;
	}

	public String getBiSoTypeFunctionDesc() {
		return this.biSoTypeFunctionDesc;
	}

	public void setBiSoTypeFunctionDesc(String biSoTypeFunctionDesc) {
		this.biSoTypeFunctionDesc = biSoTypeFunctionDesc;
	}

	public String getBiSoStatCd() {
		return this.biSoStatCd;
	}

	public void setBiSoStatCd(String biSoStatCd) {
		this.biSoStatCd = biSoStatCd;
	}

	public Date getBiOpenDt() {
		return this.biOpenDt;
	}

	public void setBiOpenDt(Date biOpenDt) {
		this.biOpenDt = biOpenDt;
	}

	public Date getBiCloseDt() {
		return this.biCloseDt;
	}

	public void setBiCloseDt(Date biCloseDt) {
		this.biCloseDt = biCloseDt;
	}

	public int getBiSrvLocNbr() {
		return this.biSrvLocNbr;
	}

	public void setBiSrvLocNbr(int biSrvLocNbr) {
		this.biSrvLocNbr = biSrvLocNbr;
	}

	public BigDecimal getBiAccountNbr() {
		return this.biAccountNbr;
	}

	public void setBiAccountNbr(BigDecimal biAccountNbr) {
		this.biAccountNbr = biAccountNbr;
	}

	public BigDecimal getBiCustToAcc() {
		return this.biCustToAcc;
	}

	public void setBiCustToAcc(BigDecimal biCustToAcc) {
		this.biCustToAcc = biCustToAcc;
	}

	public String getWoDesc() {
		return this.woDesc;
	}

	public void setWoDesc(String woDesc) {
		this.woDesc = woDesc;
	}

	public String getBiSoCom() {
		return this.biSoCom;
	}

	public void setBiSoCom(String biSoCom) {
		this.biSoCom = biSoCom;
	}

	public String getWoTypeCd() {
		return this.woTypeCd;
	}

	public void setWoTypeCd(String woTypeCd) {
		this.woTypeCd = woTypeCd;
	}
}
