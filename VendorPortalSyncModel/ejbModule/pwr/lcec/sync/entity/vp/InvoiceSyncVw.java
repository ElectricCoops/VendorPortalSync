package pwr.lcec.sync.entity.vp;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "InvoiceSyncVw.findInvoicesForSync", query = "SELECT i FROM InvoiceSyncVw i WHERE i.invoiceStatusId IN (6,7,8,9,10,11) AND i.invoiceType = 'SS'")
public class InvoiceSyncVw implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "AP_INV_DTL_ID")
	private String apInvDtlId;
	@Id
	@Column(name = "InvoiceDetailId")
	private int invoiceDetailId;
	@Id
	@Column(name = "InvoiceId")
	private int invoiceId;
	@Column(name = "InvoiceStatusId")
	private int invoiceStatusId;
	@Column(name = "InvoiceType")
	private String invoiceType;

	public String getApInvDtlId() {
		return this.apInvDtlId;
	}

	public void setApInvDtlId(String apInvDtlId) {
		this.apInvDtlId = apInvDtlId;
	}

	public int getInvoiceDetailId() {
		return this.invoiceDetailId;
	}

	public void setInvoiceDetailId(int invoiceDetailId) {
		this.invoiceDetailId = invoiceDetailId;
	}

	public int getInvoiceId() {
		return this.invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public int getInvoiceStatusId() {
		return this.invoiceStatusId;
	}

	public void setInvoiceStatusId(int invoiceStatusId) {
		this.invoiceStatusId = invoiceStatusId;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
}
