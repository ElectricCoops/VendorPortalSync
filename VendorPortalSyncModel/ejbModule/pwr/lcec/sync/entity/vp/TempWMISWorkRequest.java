package pwr.lcec.sync.entity.vp;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "TempWMISWorkRequest.findAll", query = "SELECT t FROM TempWMISWorkRequest t"),
		@NamedQuery(name = "TempWMISWorkRequest.findWRToSync", query = "SELECT t FROM TempWMISWorkRequest t WHERE t.syncDate IS NULL") })
public class TempWMISWorkRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "WorkRequest")
	private String workRequest;
	@Column(name = "SyncDate")
	private Timestamp syncDate;

	public String getWorkRequest() {
		return this.workRequest;
	}

	public void setWorkRequest(String workRequest) {
		this.workRequest = workRequest;
	}

	public Timestamp getSyncDate() {
		return this.syncDate;
	}

	public void setSyncDate(Timestamp syncDate) {
		this.syncDate = syncDate;
	}
}
