package pwr.lcec.sync.entity.nisc.custom;

import java.io.Serializable;
import java.math.BigDecimal;

public class NiscWoTransActualsGroupbyVw implements Serializable {

	private static final long serialVersionUID = 1L;

	private BigDecimal woPrdYrmo;
	
	private BigDecimal woAmt;

	public NiscWoTransActualsGroupbyVw(BigDecimal woPrdYrmo, BigDecimal woAmt) {
		super();
		this.woPrdYrmo = woPrdYrmo;
		this.woAmt = woAmt;
	}

	public NiscWoTransActualsGroupbyVw() {

	}

	public BigDecimal getWoPrdYrmo() {
		return woPrdYrmo;
	}

	public void setWoPrdYrmo(BigDecimal woPrdYrmo) {
		this.woPrdYrmo = woPrdYrmo;
	}

	public BigDecimal getWoAmt() {
		return woAmt;
	}

	public void setWoAmt(BigDecimal woAmt) {
		this.woAmt = woAmt;
	}

}
