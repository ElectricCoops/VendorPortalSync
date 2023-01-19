package pwr.lcec.sync.entity.nisc;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ApBatchTranDistPK implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "AP_BATCH_TRAN_KEY")
	private long apBatchTranKey;
	@Column(name = "AP_SEQ_NBR")
	private long apSeqNbr;

	public long getApBatchTranKey() {
		return this.apBatchTranKey;
	}

	public void setApBatchTranKey(long apBatchTranKey) {
		this.apBatchTranKey = apBatchTranKey;
	}

	public long getApSeqNbr() {
		return this.apSeqNbr;
	}

	public void setApSeqNbr(long apSeqNbr) {
		this.apSeqNbr = apSeqNbr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (apBatchTranKey ^ (apBatchTranKey >>> 32));
		result = prime * result + (int) (apSeqNbr ^ (apSeqNbr >>> 32));
		return result;
	}

	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApBatchTranDistPK other = (ApBatchTranDistPK) obj;
		if (apBatchTranKey != other.apBatchTranKey)
			return false;
		if (apSeqNbr != other.apSeqNbr)
			return false;
		return true;
	}
	*/

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ApBatchTranDistPK)) {
			return false;
		}
		ApBatchTranDistPK castOther = (ApBatchTranDistPK) other;
		return (this.apBatchTranKey == castOther.apBatchTranKey && this.apSeqNbr == castOther.apSeqNbr);
	}
/*
	public int hashCode() {
		int prime = 31;
		hash = 17;
		hash = hash * 31 + (int) (this.apBatchTranKey ^ this.apBatchTranKey >>> 32);
		return hash * 31 + (int) (this.apSeqNbr ^ this.apSeqNbr >>> 32);
	}*/
	
}
