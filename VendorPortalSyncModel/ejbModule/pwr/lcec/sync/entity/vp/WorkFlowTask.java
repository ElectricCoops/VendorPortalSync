package pwr.lcec.sync.entity.vp;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "WorkFlowTask.findAll", query = "SELECT w FROM WorkFlowTask w"),
		@NamedQuery(name = "WorkFlowTask.findWFTaskByWOId", query = "SELECT w FROM WorkFlowTask w WHERE w.workOrderId = :workOrderId"),
		@NamedQuery(name = "WorkFlowTask.findWFTaskByCOMP", query = "SELECT w FROM WorkFlowTask w WHERE w.workOrderId = 'COMP'") })
public class WorkFlowTask implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "WorkFlowTaskId")
	private int workFlowTaskId;
	private String WFCriticalTask;
	private Timestamp WFEventDt;
	private String WFTaskCode;
	private String WFTaskDescription;
	private int WFTasksCtr;
	@Column(name = "WorkEventStatusId")
	private String workEventStatusId;
	@Column(name = "WorkFlowTaskSeq")
	private String workFlowTaskSeq;
	@Column(name = "WorkGroup")
	private String workGroup;
	@Column(name = "WorkOrderId")
	private String workOrderId;
	@ManyToOne
	@JoinColumn(name = "WorkFlowId")
	private WorkFlow workFlow;

	public int getWorkFlowTaskId() {
		return this.workFlowTaskId;
	}

	public void setWorkFlowTaskId(int workFlowTaskId) {
		this.workFlowTaskId = workFlowTaskId;
	}

	public String getWFCriticalTask() {
		return this.WFCriticalTask;
	}

	public void setWFCriticalTask(String WFCriticalTask) {
		this.WFCriticalTask = WFCriticalTask;
	}

	public Timestamp getWFEventDt() {
		return this.WFEventDt;
	}

	public void setWFEventDt(Timestamp WFEventDt) {
		this.WFEventDt = WFEventDt;
	}

	public String getWFTaskCode() {
		return this.WFTaskCode;
	}

	public void setWFTaskCode(String WFTaskCode) {
		this.WFTaskCode = WFTaskCode;
	}

	public String getWFTaskDescription() {
		return this.WFTaskDescription;
	}

	public void setWFTaskDescription(String WFTaskDescription) {
		this.WFTaskDescription = WFTaskDescription;
	}

	public int getWFTasksCtr() {
		return this.WFTasksCtr;
	}

	public void setWFTasksCtr(int WFTasksCtr) {
		this.WFTasksCtr = WFTasksCtr;
	}

	public String getWorkEventStatusId() {
		return this.workEventStatusId;
	}

	public void setWorkEventStatusId(String workEventStatusId) {
		this.workEventStatusId = workEventStatusId;
	}

	public String getWorkFlowTaskSeq() {
		return this.workFlowTaskSeq;
	}

	public void setWorkFlowTaskSeq(String workFlowTaskSeq) {
		this.workFlowTaskSeq = workFlowTaskSeq;
	}

	public String getWorkGroup() {
		return this.workGroup;
	}

	public void setWorkGroup(String workGroup) {
		this.workGroup = workGroup;
	}

	public String getWorkOrderId() {
		return this.workOrderId;
	}

	public void setWorkOrderId(String workOrderId) {
		this.workOrderId = workOrderId;
	}

	public WorkFlow getWorkFlow() {
		return this.workFlow;
	}

	public void setWorkFlow(WorkFlow workFlow) {
		this.workFlow = workFlow;
	}
}
