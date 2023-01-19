package pwr.lcec.sync.entity.nisc;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class WoMstrPK implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "WO_ID")
	private String woId;
	@Column(name = "WO_HIST_SEQ_NBR")
	private long woHistSeqNbr;

	public String getWoId() {
		return this.woId;
	}

	public void setWoId(String woId) {
		this.woId = woId;
	}

	public long getWoHistSeqNbr() {
		return this.woHistSeqNbr;
	}

	public void setWoHistSeqNbr(long woHistSeqNbr) {
		this.woHistSeqNbr = woHistSeqNbr;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof WoMstrPK)) {
			return false;
		}
		WoMstrPK castOther = (WoMstrPK) other;
		return (this.woId.equals(castOther.woId) && this.woHistSeqNbr == castOther.woHistSeqNbr);
	}

	public int hashCode() {
		int prime = 31;
		int hash = 17;
		hash = hash * 31 + this.woId.hashCode();
		return hash * 31 + (int) (this.woHistSeqNbr ^ this.woHistSeqNbr >>> 32);
	}
}
