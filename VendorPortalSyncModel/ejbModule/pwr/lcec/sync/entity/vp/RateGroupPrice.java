package pwr.lcec.sync.entity.vp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "RateGroupPrice.findAll", query = "SELECT r FROM RateGroupPrice r"),
		@NamedQuery(name = "RateGroupPrice.findCauByCauGrpDate", query = "SELECT r FROM RateGroupPrice r WHERE r.assemblyGuid = :cau and r.rateGroup.rateGroupId = :grpId AND :syncDate BETWEEN r.effectiveStartDt AND r.effectiveEndDt"),
		@NamedQuery(name = "RateGroupPrice.findDistinctCustom", query = "SELECT DISTINCT r.assemblyGuid FROM RateGroupPrice r WHERE r.assemblySource = 'CUST'") })
public class RateGroupPrice implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RateGroupPriceId")
	private int rateGroupPriceId;
	@Column(name = "AssemblyAction")
	private String assemblyAction;
	@Column(name = "AssemblyDescription")
	private String assemblyDescription;
	@Column(name = "AssemblyGuid")
	private String assemblyGuid;
	@Column(name = "AssemblySource")
	private String assemblySource;
	@Column(name = "EffectiveEndDt")
	private Timestamp effectiveEndDt;
	@Column(name = "EffectiveStartDt")
	private Timestamp effectiveStartDt;
	@Column(name = "FixedCost")
	private String fixedCost;
	private int GL_Department;
	private int GLActivity;
	private int GLConstAccountId;
	private BigDecimal GLPercent;
	private int GLRetireAccountId;
	private int GLRetireActivity;
	private int GLRetireDepartment;
	@Column(name = "LaborConstCost")
	private String laborConstCost;
	@Column(name = "LaborConstHours")
	private BigDecimal laborConstHours;
	@Column(name = "LaborRetireCost")
	private String laborRetireCost;
	@Column(name = "LaborRetireHours")
	private BigDecimal laborRetireHours;
	@ManyToOne
	@JoinColumn(name = "RateGroupId")
	private RateGroup rateGroup;

	public int getRateGroupPriceId() {
		return this.rateGroupPriceId;
	}

	public void setRateGroupPriceId(int rateGroupPriceId) {
		this.rateGroupPriceId = rateGroupPriceId;
	}

	public String getAssemblyAction() {
		return this.assemblyAction;
	}

	public void setAssemblyAction(String assemblyAction) {
		this.assemblyAction = assemblyAction;
	}

	public String getAssemblyDescription() {
		return this.assemblyDescription;
	}

	public void setAssemblyDescription(String assemblyDescription) {
		this.assemblyDescription = assemblyDescription;
	}

	public String getAssemblyGuid() {
		return this.assemblyGuid;
	}

	public void setAssemblyGuid(String assemblyGuid) {
		this.assemblyGuid = assemblyGuid;
	}

	public String getAssemblySource() {
		return this.assemblySource;
	}

	public void setAssemblySource(String assemblySource) {
		this.assemblySource = assemblySource;
	}

	public Timestamp getEffectiveEndDt() {
		return this.effectiveEndDt;
	}

	public void setEffectiveEndDt(Timestamp effectiveEndDt) {
		this.effectiveEndDt = effectiveEndDt;
	}

	public Timestamp getEffectiveStartDt() {
		return this.effectiveStartDt;
	}

	public void setEffectiveStartDt(Timestamp effectiveStartDt) {
		this.effectiveStartDt = effectiveStartDt;
	}

	public String getFixedCost() {
		return this.fixedCost;
	}

	public void setFixedCost(String fixedCost) {
		this.fixedCost = fixedCost;
	}

	public int getGL_Department() {
		return this.GL_Department;
	}

	public void setGL_Department(int GL_Department) {
		this.GL_Department = GL_Department;
	}

	public int getGLActivity() {
		return this.GLActivity;
	}

	public void setGLActivity(int GLActivity) {
		this.GLActivity = GLActivity;
	}

	public int getGLConstAccountId() {
		return this.GLConstAccountId;
	}

	public void setGLConstAccountId(int GLConstAccountId) {
		this.GLConstAccountId = GLConstAccountId;
	}

	public BigDecimal getGLPercent() {
		return this.GLPercent;
	}

	public void setGLPercent(BigDecimal GLPercent) {
		this.GLPercent = GLPercent;
	}

	public int getGLRetireAccountId() {
		return this.GLRetireAccountId;
	}

	public void setGLRetireAccountId(int GLRetireAccountId) {
		this.GLRetireAccountId = GLRetireAccountId;
	}

	public int getGLRetireActivity() {
		return this.GLRetireActivity;
	}

	public void setGLRetireActivity(int GLRetireActivity) {
		this.GLRetireActivity = GLRetireActivity;
	}

	public int getGLRetireDepartment() {
		return this.GLRetireDepartment;
	}

	public void setGLRetireDepartment(int GLRetireDepartment) {
		this.GLRetireDepartment = GLRetireDepartment;
	}

	public String getLaborConstCost() {
		return this.laborConstCost;
	}

	public void setLaborConstCost(String laborConstCost) {
		this.laborConstCost = laborConstCost;
	}

	public BigDecimal getLaborConstHours() {
		return this.laborConstHours;
	}

	public void setLaborConstHours(BigDecimal laborConstHours) {
		this.laborConstHours = laborConstHours;
	}

	public String getLaborRetireCost() {
		return this.laborRetireCost;
	}

	public void setLaborRetireCost(String laborRetireCost) {
		this.laborRetireCost = laborRetireCost;
	}

	public BigDecimal getLaborRetireHours() {
		return this.laborRetireHours;
	}

	public void setLaborRetireHours(BigDecimal laborRetireHours) {
		this.laborRetireHours = laborRetireHours;
	}

	public RateGroup getRateGroup() {
		return this.rateGroup;
	}

	public void setRateGroup(RateGroup rateGroup) {
		this.rateGroup = rateGroup;
	}
}
