package pwr.lcec.sync.entity.vp;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "WorkEventStatus.findAll", query = "SELECT w FROM WorkEventStatus w"),
		@NamedQuery(name = "WorkEventStatus.findWorkEventById", query = "SELECT w FROM WorkEventStatus w WHERE w.workEventStatusId = :wesi") })
public class WorkEventStatus implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "WorkEventStatusId")
	private String workEventStatusId;
	@Column(name = "Active")
	private boolean active;
	@Column(name = "ApplicationCode")
	private String applicationCode;
	@Column(name = "Description")
	private String description;

	public String getWorkEventStatusId() {
		return this.workEventStatusId;
	}

	public void setWorkEventStatusId(String workEventStatusId) {
		this.workEventStatusId = workEventStatusId;
	}

	public boolean getActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getApplicationCode() {
		return this.applicationCode;
	}

	public void setApplicationCode(String applicationCode) {
		this.applicationCode = applicationCode;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
