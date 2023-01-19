package pwr.lcec.sync.entity.gis;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "ST_STATUS_REF")
@NamedQuery(name = "StStatusRef.findAll", query = "SELECT s FROM StStatusRef s")
public class StStatusRef implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "gs_guid")
	private String gsGuid;
	@Column(name = "gs_vc_modified_sw")
	private String gsVcModifiedSw;
	@Column(name = "gs_vc_revision")
	private int gsVcRevision;
	@Id
	@Column(name = "OBJECTID")
	private int objectid;
	@Column(name = "st_abs_wo_status_code")
	private String stAbsWoStatusCode;
	@Column(name = "st_default_abs_wo_status_sw")
	private String stDefaultAbsWoStatusSw;
	@Column(name = "st_status_description")
	private String stStatusDescription;

	public String getGsGuid() {
		return this.gsGuid;
	}

	public void setGsGuid(String gsGuid) {
		this.gsGuid = gsGuid;
	}

	public String getGsVcModifiedSw() {
		return this.gsVcModifiedSw;
	}

	public void setGsVcModifiedSw(String gsVcModifiedSw) {
		this.gsVcModifiedSw = gsVcModifiedSw;
	}

	public int getGsVcRevision() {
		return this.gsVcRevision;
	}

	public void setGsVcRevision(int gsVcRevision) {
		this.gsVcRevision = gsVcRevision;
	}

	public String getStAbsWoStatusCode() {
		return this.stAbsWoStatusCode;
	}

	public void setStAbsWoStatusCode(String stAbsWoStatusCode) {
		this.stAbsWoStatusCode = stAbsWoStatusCode;
	}

	public String getStDefaultAbsWoStatusSw() {
		return this.stDefaultAbsWoStatusSw;
	}

	public void setStDefaultAbsWoStatusSw(String stDefaultAbsWoStatusSw) {
		this.stDefaultAbsWoStatusSw = stDefaultAbsWoStatusSw;
	}

	public String getStStatusDescription() {
		return this.stStatusDescription;
	}

	public void setStStatusDescription(String stStatusDescription) {
		this.stStatusDescription = stStatusDescription;
	}

	public int getObjectid() {
		return this.objectid;
	}

	public void setObjectid(int objectid) {
		this.objectid = objectid;
	}
}
