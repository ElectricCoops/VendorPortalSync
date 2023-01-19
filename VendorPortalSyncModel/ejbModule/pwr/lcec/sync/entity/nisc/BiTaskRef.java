package pwr.lcec.sync.entity.nisc;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "CIS11013.BI_TASK_REF")
@NamedQueries({ @NamedQuery(name = "BiTaskRef.findAll", query = "SELECT b FROM BiTaskRef b"),
		@NamedQuery(name = "BiTaskRef.findTaskByTaskCd", query = "SELECT b FROM BiTaskRef b WHERE b.biTaskCd = :biTaskCd") })
public class BiTaskRef implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "BI_TASK_CD")
	private String biTaskCd;
	@Column(name = "BI_ACTIVE_SW")
	private String biActiveSw;
	@Column(name = "BI_ALERT_PRTY_CD")
	private BigDecimal biAlertPrtyCd;
	@Column(name = "BI_CLOSE_CD")
	private String biCloseCd;
	@Column(name = "BI_CRITICAL_SW")
	private String biCriticalSw;
	@Column(name = "BI_DEPEND_ON_PREV_SW")
	private String biDependOnPrevSw;
	@Column(name = "BI_DURATION_DAYS")
	private BigDecimal biDurationDays;
	@Column(name = "BI_ELECT_SIG_SW")
	private String biElectSigSw;
	@Column(name = "BI_INITIATE_SCREEN_ID")
	private String biInitiateScreenId;
	@Column(name = "BI_INITIATE_SCREEN_PARAMS")
	private String biInitiateScreenParams;
	@Column(name = "BI_MINI_CREW_SIZE")
	private BigDecimal biMiniCrewSize;
	@Column(name = "BI_MINI_HRS")
	private BigDecimal biMiniHrs;
	@Column(name = "BI_MSG_TARGET_CD")
	private String biMsgTargetCd;
	@Column(name = "BI_NISC_CTL_SW")
	private String biNiscCtlSw;
	@Column(name = "BI_OPTIMUM_CREW_SIZE")
	private BigDecimal biOptimumCrewSize;
	@Column(name = "BI_PRT_FROM")
	private String biPrtFrom;
	@Column(name = "BI_PRT_TASK_ONSRVORD_SW")
	private String biPrtTaskOnsrvordSw;
	@Column(name = "BI_REQUIRED_SW")
	private String biRequiredSw;
	@Column(name = "BI_SO_PRTY_CD")
	private String biSoPrtyCd;
	@Column(name = "BI_TASK_ACTIVE_SW")
	private String biTaskActiveSw;
	@Column(name = "BI_TASK_DESC")
	private String biTaskDesc;
	@Column(name = "BI_TASK_EST_COST")
	private BigDecimal biTaskEstCost;
	@Column(name = "BI_TASK_EST_HRS")
	private BigDecimal biTaskEstHrs;
	@Column(name = "BI_TASK_HANDLE_CD")
	private String biTaskHandleCd;
	@Column(name = "BI_TASK_REF_CTR")
	private BigDecimal biTaskRefCtr;
	@Column(name = "BI_TASK_SCHED_CD")
	private String biTaskSchedCd;
	@Column(name = "BI_TASK_TYPE_CD")
	private String biTaskTypeCd;
	@Column(name = "BI_USAGE_BATCH_SW")
	private String biUsageBatchSw;
	@Column(name = "BI_USAGE_CT_SW")
	private String biUsageCtSw;
	@Column(name = "BI_USAGE_INDPNDT_SW")
	private String biUsageIndpndtSw;
	@Column(name = "BI_USAGE_IVR_SW")
	private String biUsageIvrSw;
	@Column(name = "BI_USAGE_SO_SW")
	private String biUsageSoSw;
	@Column(name = "BI_USE_TCKT_SW")
	private String biUseTcktSw;
	@Column(name = "BI_WORKGRP")
	private String biWorkgrp;
	@Column(name = "SI_PRT_ON_SRV_ORD_SW")
	private String siPrtOnSrvOrdSw;
	@Column(name = "SY_HIERARCHY_NBR")
	private BigDecimal syHierarchyNbr;
	@Column(name = "SY_JOB_DEFINITION_ID")
	private BigDecimal syJobDefinitionId;
	@Column(name = "SY_REPORT_ID")
	private String syReportId;
	@Column(name = "SY_REPORT_PARAMS")
	private String syReportParams;
	@Column(name = "SY_USE_ADDT_KEYS_SW")
	private String syUseAddtKeysSw;

	public String getBiTaskCd() {
		return this.biTaskCd;
	}

	public void setBiTaskCd(String biTaskCd) {
		this.biTaskCd = biTaskCd;
	}

	public String getBiActiveSw() {
		return this.biActiveSw;
	}

	public void setBiActiveSw(String biActiveSw) {
		this.biActiveSw = biActiveSw;
	}

	public BigDecimal getBiAlertPrtyCd() {
		return this.biAlertPrtyCd;
	}

	public void setBiAlertPrtyCd(BigDecimal biAlertPrtyCd) {
		this.biAlertPrtyCd = biAlertPrtyCd;
	}

	public String getBiCloseCd() {
		return this.biCloseCd;
	}

	public void setBiCloseCd(String biCloseCd) {
		this.biCloseCd = biCloseCd;
	}

	public String getBiCriticalSw() {
		return this.biCriticalSw;
	}

	public void setBiCriticalSw(String biCriticalSw) {
		this.biCriticalSw = biCriticalSw;
	}

	public String getBiDependOnPrevSw() {
		return this.biDependOnPrevSw;
	}

	public void setBiDependOnPrevSw(String biDependOnPrevSw) {
		this.biDependOnPrevSw = biDependOnPrevSw;
	}

	public BigDecimal getBiDurationDays() {
		return this.biDurationDays;
	}

	public void setBiDurationDays(BigDecimal biDurationDays) {
		this.biDurationDays = biDurationDays;
	}

	public String getBiElectSigSw() {
		return this.biElectSigSw;
	}

	public void setBiElectSigSw(String biElectSigSw) {
		this.biElectSigSw = biElectSigSw;
	}

	public String getBiInitiateScreenId() {
		return this.biInitiateScreenId;
	}

	public void setBiInitiateScreenId(String biInitiateScreenId) {
		this.biInitiateScreenId = biInitiateScreenId;
	}

	public String getBiInitiateScreenParams() {
		return this.biInitiateScreenParams;
	}

	public void setBiInitiateScreenParams(String biInitiateScreenParams) {
		this.biInitiateScreenParams = biInitiateScreenParams;
	}

	public BigDecimal getBiMiniCrewSize() {
		return this.biMiniCrewSize;
	}

	public void setBiMiniCrewSize(BigDecimal biMiniCrewSize) {
		this.biMiniCrewSize = biMiniCrewSize;
	}

	public BigDecimal getBiMiniHrs() {
		return this.biMiniHrs;
	}

	public void setBiMiniHrs(BigDecimal biMiniHrs) {
		this.biMiniHrs = biMiniHrs;
	}

	public String getBiMsgTargetCd() {
		return this.biMsgTargetCd;
	}

	public void setBiMsgTargetCd(String biMsgTargetCd) {
		this.biMsgTargetCd = biMsgTargetCd;
	}

	public String getBiNiscCtlSw() {
		return this.biNiscCtlSw;
	}

	public void setBiNiscCtlSw(String biNiscCtlSw) {
		this.biNiscCtlSw = biNiscCtlSw;
	}

	public BigDecimal getBiOptimumCrewSize() {
		return this.biOptimumCrewSize;
	}

	public void setBiOptimumCrewSize(BigDecimal biOptimumCrewSize) {
		this.biOptimumCrewSize = biOptimumCrewSize;
	}

	public String getBiPrtFrom() {
		return this.biPrtFrom;
	}

	public void setBiPrtFrom(String biPrtFrom) {
		this.biPrtFrom = biPrtFrom;
	}

	public String getBiPrtTaskOnsrvordSw() {
		return this.biPrtTaskOnsrvordSw;
	}

	public void setBiPrtTaskOnsrvordSw(String biPrtTaskOnsrvordSw) {
		this.biPrtTaskOnsrvordSw = biPrtTaskOnsrvordSw;
	}

	public String getBiRequiredSw() {
		return this.biRequiredSw;
	}

	public void setBiRequiredSw(String biRequiredSw) {
		this.biRequiredSw = biRequiredSw;
	}

	public String getBiSoPrtyCd() {
		return this.biSoPrtyCd;
	}

	public void setBiSoPrtyCd(String biSoPrtyCd) {
		this.biSoPrtyCd = biSoPrtyCd;
	}

	public String getBiTaskActiveSw() {
		return this.biTaskActiveSw;
	}

	public void setBiTaskActiveSw(String biTaskActiveSw) {
		this.biTaskActiveSw = biTaskActiveSw;
	}

	public String getBiTaskDesc() {
		return this.biTaskDesc;
	}

	public void setBiTaskDesc(String biTaskDesc) {
		this.biTaskDesc = biTaskDesc;
	}

	public BigDecimal getBiTaskEstCost() {
		return this.biTaskEstCost;
	}

	public void setBiTaskEstCost(BigDecimal biTaskEstCost) {
		this.biTaskEstCost = biTaskEstCost;
	}

	public BigDecimal getBiTaskEstHrs() {
		return this.biTaskEstHrs;
	}

	public void setBiTaskEstHrs(BigDecimal biTaskEstHrs) {
		this.biTaskEstHrs = biTaskEstHrs;
	}

	public String getBiTaskHandleCd() {
		return this.biTaskHandleCd;
	}

	public void setBiTaskHandleCd(String biTaskHandleCd) {
		this.biTaskHandleCd = biTaskHandleCd;
	}

	public BigDecimal getBiTaskRefCtr() {
		return this.biTaskRefCtr;
	}

	public void setBiTaskRefCtr(BigDecimal biTaskRefCtr) {
		this.biTaskRefCtr = biTaskRefCtr;
	}

	public String getBiTaskSchedCd() {
		return this.biTaskSchedCd;
	}

	public void setBiTaskSchedCd(String biTaskSchedCd) {
		this.biTaskSchedCd = biTaskSchedCd;
	}

	public String getBiTaskTypeCd() {
		return this.biTaskTypeCd;
	}

	public void setBiTaskTypeCd(String biTaskTypeCd) {
		this.biTaskTypeCd = biTaskTypeCd;
	}

	public String getBiUsageBatchSw() {
		return this.biUsageBatchSw;
	}

	public void setBiUsageBatchSw(String biUsageBatchSw) {
		this.biUsageBatchSw = biUsageBatchSw;
	}

	public String getBiUsageCtSw() {
		return this.biUsageCtSw;
	}

	public void setBiUsageCtSw(String biUsageCtSw) {
		this.biUsageCtSw = biUsageCtSw;
	}

	public String getBiUsageIndpndtSw() {
		return this.biUsageIndpndtSw;
	}

	public void setBiUsageIndpndtSw(String biUsageIndpndtSw) {
		this.biUsageIndpndtSw = biUsageIndpndtSw;
	}

	public String getBiUsageIvrSw() {
		return this.biUsageIvrSw;
	}

	public void setBiUsageIvrSw(String biUsageIvrSw) {
		this.biUsageIvrSw = biUsageIvrSw;
	}

	public String getBiUsageSoSw() {
		return this.biUsageSoSw;
	}

	public void setBiUsageSoSw(String biUsageSoSw) {
		this.biUsageSoSw = biUsageSoSw;
	}

	public String getBiUseTcktSw() {
		return this.biUseTcktSw;
	}

	public void setBiUseTcktSw(String biUseTcktSw) {
		this.biUseTcktSw = biUseTcktSw;
	}

	public String getBiWorkgrp() {
		return this.biWorkgrp;
	}

	public void setBiWorkgrp(String biWorkgrp) {
		this.biWorkgrp = biWorkgrp;
	}

	public String getSiPrtOnSrvOrdSw() {
		return this.siPrtOnSrvOrdSw;
	}

	public void setSiPrtOnSrvOrdSw(String siPrtOnSrvOrdSw) {
		this.siPrtOnSrvOrdSw = siPrtOnSrvOrdSw;
	}

	public BigDecimal getSyHierarchyNbr() {
		return this.syHierarchyNbr;
	}

	public void setSyHierarchyNbr(BigDecimal syHierarchyNbr) {
		this.syHierarchyNbr = syHierarchyNbr;
	}

	public BigDecimal getSyJobDefinitionId() {
		return this.syJobDefinitionId;
	}

	public void setSyJobDefinitionId(BigDecimal syJobDefinitionId) {
		this.syJobDefinitionId = syJobDefinitionId;
	}

	public String getSyReportId() {
		return this.syReportId;
	}

	public void setSyReportId(String syReportId) {
		this.syReportId = syReportId;
	}

	public String getSyReportParams() {
		return this.syReportParams;
	}

	public void setSyReportParams(String syReportParams) {
		this.syReportParams = syReportParams;
	}

	public String getSyUseAddtKeysSw() {
		return this.syUseAddtKeysSw;
	}

	public void setSyUseAddtKeysSw(String syUseAddtKeysSw) {
		this.syUseAddtKeysSw = syUseAddtKeysSw;
	}
}
