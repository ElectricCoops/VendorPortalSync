package pwr.lcec.sync.entity.vp;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "InvoiceDetail.findAll", query = "SELECT i FROM InvoiceDetail i"),
		@NamedQuery(name = "InvoiceDetail.findDetailsByInvoiceId", query = "SELECT i FROM InvoiceDetail i WHERE i.invoiceId = :invoiceId") })
public class InvoiceDetail implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "InvoiceDetailId")
	private int invoiceDetailId;
	@Column(name = "Amount")
	private BigDecimal amount;
	@Column(name = "AP_INV_DTL_ID")
	private String apInvDtlId;
	@Column(name = "CategoryCode")
	private String categoryCode;
	@Column(name = "Description")
	private String description;
	private String GL_Code;
	private BigDecimal GLActivity;
	private BigDecimal GLDepartment;
	@Column(name = "InvoiceId")
	private int invoiceId;
	@Column(name = "Quantity")
	private int quantity;

	public int getInvoiceDetailId() {
		return this.invoiceDetailId;
	}

	public void setInvoiceDetailId(int invoiceDetailId) {
		this.invoiceDetailId = invoiceDetailId;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getApInvDtlId() {
		return this.apInvDtlId;
	}

	public void setApInvDtlId(String apInvDtlId) {
		this.apInvDtlId = apInvDtlId;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGL_Code() {
		return this.GL_Code;
	}

	public void setGL_Code(String GL_Code) {
		this.GL_Code = GL_Code;
	}

	public BigDecimal getGLActivity() {
		return this.GLActivity;
	}

	public void setGLActivity(BigDecimal GLActivity) {
		this.GLActivity = GLActivity;
	}

	public BigDecimal getGLDepartment() {
		return this.GLDepartment;
	}

	public void setGLDepartment(BigDecimal GLDepartment) {
		this.GLDepartment = GLDepartment;
	}

	public int getInvoiceId() {
		return this.invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
