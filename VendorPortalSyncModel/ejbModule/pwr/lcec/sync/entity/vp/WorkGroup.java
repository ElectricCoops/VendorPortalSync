package pwr.lcec.sync.entity.vp;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "WorkGroup.findAll", query = "SELECT w FROM WorkGroup w"),
		@NamedQuery(name = "WorkGroup.findWorkGroup", query = "SELECT w FROM WorkGroup w WHERE w.resourceId = :resourceId AND w.workGroupName = :workGroupName") })
public class WorkGroup implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "WorkGroupId")
	private int workGroupId;
	@Column(name = "ListenSw")
	private String listenSw;
	@Column(name = "ResourceId")
	private int resourceId;
	@Column(name = "WorkGroupName")
	private String workGroupName;

	public int getWorkGroupId() {
		return this.workGroupId;
	}

	public void setWorkGroupId(int workGroupId) {
		this.workGroupId = workGroupId;
	}

	public String getListenSw() {
		return this.listenSw;
	}

	public void setListenSw(String listenSw) {
		this.listenSw = listenSw;
	}

	public int getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public String getWorkGroupName() {
		return this.workGroupName;
	}

	public void setWorkGroupName(String workGroupName) {
		this.workGroupName = workGroupName;
	}
}
