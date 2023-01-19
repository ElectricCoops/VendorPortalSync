package pwr.lcec.sync.entity.vp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({ @NamedQuery(name = "RateGroup.findAll", query = "SELECT r FROM RateGroup r"),
		@NamedQuery(name = "RateGroup.findRateGrpByName", query = "SELECT r FROM RateGroup r WHERE r.rateGroupName = :grpName"),
		@NamedQuery(name = "RateGroup.findRateGrpByVendorId", query = "SELECT r FROM RateGroup r WHERE r.vendorId = :vendorId") })
public class RateGroup implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RateGroupId")
	private int rateGroupId;
	@Column(name = "Description")
	private String description;
	@Column(name = "EffectiveEndDt")
	private Timestamp effectiveEndDt;
	@Column(name = "EffectiveStartDt")
	private Timestamp effectiveStartDt;
	@Column(name = "FixedRateSW")
	private String fixedRateSW;
	@Column(name = "RateGroupName")
	private String rateGroupName;
	@Column(name = "StatusCode")
	private String statusCode;
	@Column(name = "VendorId")
	private int vendorId;
	@OneToMany(mappedBy = "rateGroup")
	private List<RateGroupPrice> rateGroupPrices;

	public int getRateGroupId() {
		return this.rateGroupId;
	}

	public void setRateGroupId(int rateGroupId) {
		this.rateGroupId = rateGroupId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getFixedRateSW() {
		return this.fixedRateSW;
	}

	public void setFixedRateSW(String fixedRateSW) {
		this.fixedRateSW = fixedRateSW;
	}

	public String getRateGroupName() {
		return this.rateGroupName;
	}

	public void setRateGroupName(String rateGroupName) {
		this.rateGroupName = rateGroupName;
	}

	public String getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public int getVendorId() {
		return this.vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public List<RateGroupPrice> getRateGroupPrices() {
		return this.rateGroupPrices;
	}

	public void setRateGroupPrices(List<RateGroupPrice> rateGroupPrices) {
		this.rateGroupPrices = rateGroupPrices;
	}

	public RateGroupPrice addRateGroupPrice(RateGroupPrice rateGroupPrice) {
		getRateGroupPrices().add(rateGroupPrice);
		rateGroupPrice.setRateGroup(this);

		return rateGroupPrice;
	}

	public RateGroupPrice removeRateGroupPrice(RateGroupPrice rateGroupPrice) {
		getRateGroupPrices().remove(rateGroupPrice);
		rateGroupPrice.setRateGroup(null);

		return rateGroupPrice;
	}
}
