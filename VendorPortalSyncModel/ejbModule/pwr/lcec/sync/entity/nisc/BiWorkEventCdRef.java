package pwr.lcec.sync.entity.nisc;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "BI_WORK_EVENT_CD_REF", schema = "CIS11013")
@NamedQuery(name = "BiWorkEventCdRef.findAll", query = "SELECT b FROM BiWorkEventCdRef b")
public class BiWorkEventCdRef implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "BI_WORK_EVENT_CD")
	private String biWorkEventCd;
	@Column(name = "BI_APPL_CD")
	private String biApplCd;
	@Column(name = "BI_EVENT_DESC")
	private String biEventDesc;
	@Column(name = "BI_WORK_EVENT_CD_REF_CTR")
	private BigDecimal biWorkEventCdRefCtr;

	public String getBiWorkEventCd() {
		return this.biWorkEventCd;
	}

	public void setBiWorkEventCd(String biWorkEventCd) {
		this.biWorkEventCd = biWorkEventCd;
	}

	public String getBiApplCd() {
		return this.biApplCd;
	}

	public void setBiApplCd(String biApplCd) {
		this.biApplCd = biApplCd;
	}

	public String getBiEventDesc() {
		return this.biEventDesc;
	}

	public void setBiEventDesc(String biEventDesc) {
		this.biEventDesc = biEventDesc;
	}

	public BigDecimal getBiWorkEventCdRefCtr() {
		return this.biWorkEventCdRefCtr;
	}

	public void setBiWorkEventCdRefCtr(BigDecimal biWorkEventCdRefCtr) {
		this.biWorkEventCdRefCtr = biWorkEventCdRefCtr;
	}
}
