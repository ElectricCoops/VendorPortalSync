package pwr.lcec.sync.entity.nisc;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "BI_RESOURCE_WORKGRPS", schema = "CIS11013")
@NamedQueries({ @NamedQuery(name = "BiResourceWorkgrp.findAll", query = "SELECT b FROM BiResourceWorkgrp b"),
		@NamedQuery(name = "BiResourceWorkgrp.findWorkGroupByResourceName", query = "SELECT b FROM BiResourceWorkgrp b WHERE b.id.biResourceId = :resourceId") })
public class BiResourceWorkgrp implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private BiResourceWorkgrpPK id;
	@Column(name = "BI_EMAIL_LISTEN_SW")
	private String biEmailListenSw;
	@Column(name = "BI_LISTEN_SW")
	private String biListenSw;
	@Column(name = "BI_RESOURCE_WORKGRPS_CTR")
	private BigDecimal biResourceWorkgrpsCtr;

	public BiResourceWorkgrpPK getId() {
		return this.id;
	}

	public void setId(BiResourceWorkgrpPK id) {
		this.id = id;
	}

	public String getBiEmailListenSw() {
		return this.biEmailListenSw;
	}

	public void setBiEmailListenSw(String biEmailListenSw) {
		this.biEmailListenSw = biEmailListenSw;
	}

	public String getBiListenSw() {
		return this.biListenSw;
	}

	public void setBiListenSw(String biListenSw) {
		this.biListenSw = biListenSw;
	}

	public BigDecimal getBiResourceWorkgrpsCtr() {
		return this.biResourceWorkgrpsCtr;
	}

	public void setBiResourceWorkgrpsCtr(BigDecimal biResourceWorkgrpsCtr) {
		this.biResourceWorkgrpsCtr = biResourceWorkgrpsCtr;
	}
}
