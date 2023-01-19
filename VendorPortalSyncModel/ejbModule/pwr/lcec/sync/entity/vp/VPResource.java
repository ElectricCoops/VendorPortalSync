package pwr.lcec.sync.entity.vp;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Resource")
@NamedQueries({ @NamedQuery(name = "Resource.findAll", query = "SELECT r FROM VPResource r"),
		@NamedQuery(name = "Resource.findResourceById", query = "SELECT r FROM VPResource r WHERE r.resourceId = :resourceId"),
		@NamedQuery(name = "Resource.findResourceByName", query = "SELECT r FROM VPResource r WHERE r.resourceName = :resourceName"),
		@NamedQuery(name = "Resource.findResourceByUserId", query = "SELECT r FROM VPResource r WHERE r.userID = :syUserId") })
public class VPResource implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ResourceId")
	private int resourceId;
	@Column(name = "AbsPersonId")
	private String absPersonId;
	@Column(name = "Active")
	private String active;
	@Column(name = "CisPersonId")
	private String cisPersonId;
	@Column(name = "Crew")
	private String crew;
	@Column(name = "DocVaultPersonId")
	private String docVaultPersonId;
	@Column(name = "EffectiveBeginDt")
	private Timestamp effectiveBeginDt;
	@Column(name = "EffectiveEndDt")
	private Timestamp effectiveEndDt;
	@Column(name = "EmployeeNumber")
	private int employeeNumber;
	@Column(name = "GisPersonId")
	private String gisPersonId;
	@Column(name = "ResourceName")
	private String resourceName;
	@Column(name = "ResourceTypeCd")
	private String resourceTypeCd;
	@Column(name = "SourceSystem")
	private String sourceSystem;
	@Column(name = "UserID")
	private int userID;
	@Column(name = "VpUserID")
	private int vpUserID;

	public int getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public String getAbsPersonId() {
		return this.absPersonId;
	}

	public void setAbsPersonId(String absPersonId) {
		this.absPersonId = absPersonId;
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getCisPersonId() {
		return this.cisPersonId;
	}

	public void setCisPersonId(String cisPersonId) {
		this.cisPersonId = cisPersonId;
	}

	public String getCrew() {
		return this.crew;
	}

	public void setCrew(String crew) {
		this.crew = crew;
	}

	public String getDocVaultPersonId() {
		return this.docVaultPersonId;
	}

	public void setDocVaultPersonId(String docVaultPersonId) {
		this.docVaultPersonId = docVaultPersonId;
	}

	public Timestamp getEffectiveBeginDt() {
		return this.effectiveBeginDt;
	}

	public void setEffectiveBeginDt(Timestamp effectiveBeginDt) {
		this.effectiveBeginDt = effectiveBeginDt;
	}

	public Timestamp getEffectiveEndDt() {
		return this.effectiveEndDt;
	}

	public void setEffectiveEndDt(Timestamp effectiveEndDt) {
		this.effectiveEndDt = effectiveEndDt;
	}

	public int getEmployeeNumber() {
		return this.employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getGisPersonId() {
		return this.gisPersonId;
	}

	public void setGisPersonId(String gisPersonId) {
		this.gisPersonId = gisPersonId;
	}

	public String getResourceName() {
		return this.resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceTypeCd() {
		return this.resourceTypeCd;
	}

	public void setResourceTypeCd(String resourceTypeCd) {
		this.resourceTypeCd = resourceTypeCd;
	}

	public String getSourceSystem() {
		return this.sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public int getUserID() {
		return this.userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public int getVpUserID() {
		return this.vpUserID;
	}

	public void setVpUserID(int vpUserID) {
		this.vpUserID = vpUserID;
	}
}
