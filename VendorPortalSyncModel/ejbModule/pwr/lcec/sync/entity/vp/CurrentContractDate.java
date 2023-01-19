package pwr.lcec.sync.entity.vp;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the CurrentContractDate database table.
 * 
 */
@Entity
@NamedQuery(name="CurrentContractDate.findAll", query="SELECT c FROM CurrentContractDate c")
public class CurrentContractDate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CurrentContractDateId")
	private int currentContractDateId;

	@Column(name="EffectiveEndDt")
	private Timestamp effectiveEndDt;

	@Column(name="EffectiveStartDt")
	private Timestamp effectiveStartDt;

	public CurrentContractDate() {
	}

	public int getCurrentContractDateId() {
		return this.currentContractDateId;
	}

	public void setCurrentContractDateId(int currentContractDateId) {
		this.currentContractDateId = currentContractDateId;
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

}