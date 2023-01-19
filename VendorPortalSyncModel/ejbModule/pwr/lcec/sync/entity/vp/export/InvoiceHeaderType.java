package pwr.lcec.sync.entity.vp.export;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceHeaderType", propOrder = { "glDivision", "glDepartment", "glAccount", "glActivity", "reference",
		"amount", "vendor", "organizationName", "firstName", "lastName", "jointName", "addressLine1", "addressLine2",
		"addressLine3", "city", "state", "zip", "bankAccount", "dueDate", "invoice", "customer", "paymentType",
		"us1099", "type", "invoiceDate", "glPostDate", "discount", "salesTax", "additionalCharge1Code",
		"additionalCharge1Amount", "additionalCharge1Taxable", "additionalCharge2Code", "additionalCharge2Amount",
		"additionalCharge2Taxable", "useTax1Code", "useTax1Amount", "useTax2Code", "useTax2Amount", "useTax3Code",
		"useTax3Amount", "useTax4Code", "useTax4Amount", "taxable", "applyAdditionalCharge1", "applyAdditionalCharge2",
		"distributeTax", "distributeAddlChg1", "distributeAddlChg2", "apglDivision", "apglAccount", "dispute",
		"seperateCheckDirectDeposit", "timeToPost", "invoiceType", "extendedReference", "authorizationType",
		"creditCard", "paidVendor", "chargeDt", "buProject", "glDistributionReference" })
public class InvoiceHeaderType {
	@XmlElement(name = "GL_Division")
	protected int glDivision;
	@XmlElement(name = "GL_Department")
	protected int glDepartment;
	@XmlElement(name = "GL_Account", required = true)
	protected String glAccount;
	@XmlElement(name = "GL_Activity")
	protected int glActivity;
	@XmlElement(name = "Reference", required = true)
	protected String reference;
	@XmlElement(name = "Amount", required = true)
	protected BigDecimal amount;
	@XmlElement(name = "Vendor")
	protected int vendor;
	@XmlElement(name = "OrganizationName", required = true)
	protected String organizationName;
	@XmlElement(name = "FirstName", required = true)
	protected String firstName;
	@XmlElement(name = "LastName", required = true)
	protected String lastName;
	@XmlElement(name = "JointName", required = true)
	protected String jointName;
	@XmlElement(name = "AddressLine1", required = true)
	protected String addressLine1;
	@XmlElement(name = "AddressLine2", required = true)
	protected String addressLine2;
	@XmlElement(name = "AddressLine3", required = true)
	protected String addressLine3;
	@XmlElement(name = "City", required = true)
	protected String city;
	@XmlElement(name = "State", required = true)
	protected String state;
	@XmlElement(name = "Zip", required = true)
	protected String zip;
	@XmlElement(name = "BankAccount", required = true)
	protected String bankAccount;
	@XmlElement(name = "DueDate", required = true)
	protected String dueDate;
	@XmlElement(name = "Invoice", required = true)
	protected String invoice;
	@XmlElement(name = "Customer", required = true)
	protected String customer;
	@XmlElement(name = "PaymentType", required = true)
	protected String paymentType;
	@XmlElement(name = "US1099", required = true)
	protected String us1099;
	@XmlElement(name = "Type", required = true)
	protected String type;
	@XmlElement(name = "InvoiceDate", required = true)
	protected String invoiceDate;
	@XmlElement(name = "GL_PostDate", required = true)
	protected String glPostDate;
	@XmlElement(name = "Discount", required = true)
	protected String discount;
	@XmlElement(name = "SalesTax", required = true)
	protected String salesTax;
	@XmlElement(name = "AdditionalCharge1Code", required = true)
	protected String additionalCharge1Code;
	@XmlElement(name = "AdditionalCharge1Amount", required = true)
	protected String additionalCharge1Amount;
	@XmlElement(name = "AdditionalCharge1Taxable", required = true)
	protected String additionalCharge1Taxable;
	@XmlElement(name = "AdditionalCharge2Code", required = true)
	protected String additionalCharge2Code;
	@XmlElement(name = "AdditionalCharge2Amount", required = true)
	protected String additionalCharge2Amount;
	@XmlElement(name = "AdditionalCharge2Taxable", required = true)
	protected String additionalCharge2Taxable;
	@XmlElement(name = "UseTax1Code", required = true)
	protected String useTax1Code;
	@XmlElement(name = "UseTax1Amount", required = true)
	protected String useTax1Amount;
	@XmlElement(name = "UseTax2Code", required = true)
	protected String useTax2Code;
	@XmlElement(name = "UseTax2Amount", required = true)
	protected String useTax2Amount;
	@XmlElement(name = "UseTax3Code", required = true)
	protected String useTax3Code;
	@XmlElement(name = "UseTax3Amount", required = true)
	protected String useTax3Amount;
	@XmlElement(name = "UseTax4Code", required = true)
	protected String useTax4Code;
	@XmlElement(name = "UseTax4Amount", required = true)
	protected String useTax4Amount;
	@XmlElement(name = "Taxable", required = true)
	protected String taxable;
	@XmlElement(name = "ApplyAdditionalCharge1", required = true)
	protected String applyAdditionalCharge1;
	@XmlElement(name = "ApplyAdditionalCharge2", required = true)
	protected String applyAdditionalCharge2;
	@XmlElement(name = "DistributeTax", required = true)
	protected String distributeTax;
	@XmlElement(name = "DistributeAddlChg1", required = true)
	protected String distributeAddlChg1;
	@XmlElement(name = "DistributeAddlChg2", required = true)
	protected String distributeAddlChg2;
	@XmlElement(name = "AP_GL_Division", required = true)
	protected String apglDivision;
	@XmlElement(name = "AP_GL_Account", required = true)
	protected String apglAccount;
	@XmlElement(name = "Dispute", required = true)
	protected String dispute;
	@XmlElement(name = "SeperateCheck_DirectDeposit", required = true)
	protected String seperateCheckDirectDeposit;
	@XmlElement(name = "TimeToPost", required = true)
	protected String timeToPost;
	@XmlElement(name = "InvoiceType", required = true)
	protected String invoiceType;
	@XmlElement(name = "ExtendedReference", required = true)
	protected String extendedReference;
	@XmlElement(name = "AuthorizationType", required = true)
	protected String authorizationType;
	@XmlElement(name = "CreditCard", required = true)
	protected String creditCard;
	@XmlElement(name = "PaidVendor", required = true)
	protected String paidVendor;
	@XmlElement(name = "ChargeDt", required = true)
	protected String chargeDt;
	@XmlElement(name = "BUProject", required = true)
	protected String buProject;
	@XmlElement(name = "GL_DistributionReference", required = true)
	protected String glDistributionReference;

	public int getGLDivision() {
		return this.glDivision;
	}

	public void setGLDivision(int value) {
		this.glDivision = value;
	}

	public int getGLDepartment() {
		return this.glDepartment;
	}

	public void setGLDepartment(int value) {
		this.glDepartment = value;
	}

	public String getGLAccount() {
		return this.glAccount;
	}

	public void setGLAccount(String value) {
		this.glAccount = value;
	}

	public int getGLActivity() {
		return this.glActivity;
	}

	public void setGLActivity(int value) {
		this.glActivity = value;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String value) {
		this.reference = value;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal value) {
		this.amount = value;
	}

	public int getVendor() {
		return this.vendor;
	}

	public void setVendor(int value) {
		this.vendor = value;
	}

	public String getOrganizationName() {
		return this.organizationName;
	}

	public void setOrganizationName(String value) {
		this.organizationName = value;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String value) {
		this.firstName = value;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String value) {
		this.lastName = value;
	}

	public String getJointName() {
		return this.jointName;
	}

	public void setJointName(String value) {
		this.jointName = value;
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String value) {
		this.addressLine1 = value;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String value) {
		this.addressLine2 = value;
	}

	public String getAddressLine3() {
		return this.addressLine3;
	}

	public void setAddressLine3(String value) {
		this.addressLine3 = value;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String value) {
		this.city = value;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String value) {
		this.state = value;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String value) {
		this.zip = value;
	}

	public String getBankAccount() {
		return this.bankAccount;
	}

	public void setBankAccount(String value) {
		this.bankAccount = value;
	}

	public String getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(String value) {
		this.dueDate = value;
	}

	public String getInvoice() {
		return this.invoice;
	}

	public void setInvoice(String value) {
		this.invoice = value;
	}

	public String getCustomer() {
		return this.customer;
	}

	public void setCustomer(String value) {
		this.customer = value;
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String value) {
		this.paymentType = value;
	}

	public String getUS1099() {
		return this.us1099;
	}

	public void setUS1099(String value) {
		this.us1099 = value;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String value) {
		this.type = value;
	}

	public String getInvoiceDate() {
		return this.invoiceDate;
	}

	public void setInvoiceDate(String value) {
		this.invoiceDate = value;
	}

	public String getGLPostDate() {
		return this.glPostDate;
	}

	public void setGLPostDate(String value) {
		this.glPostDate = value;
	}

	public String getDiscount() {
		return this.discount;
	}

	public void setDiscount(String value) {
		this.discount = value;
	}

	public String getSalesTax() {
		return this.salesTax;
	}

	public void setSalesTax(String value) {
		this.salesTax = value;
	}

	public String getAdditionalCharge1Code() {
		return this.additionalCharge1Code;
	}

	public void setAdditionalCharge1Code(String value) {
		this.additionalCharge1Code = value;
	}

	public String getAdditionalCharge1Amount() {
		return this.additionalCharge1Amount;
	}

	public void setAdditionalCharge1Amount(String value) {
		this.additionalCharge1Amount = value;
	}

	public String getAdditionalCharge1Taxable() {
		return this.additionalCharge1Taxable;
	}

	public void setAdditionalCharge1Taxable(String value) {
		this.additionalCharge1Taxable = value;
	}

	public String getAdditionalCharge2Code() {
		return this.additionalCharge2Code;
	}

	public void setAdditionalCharge2Code(String value) {
		this.additionalCharge2Code = value;
	}

	public String getAdditionalCharge2Amount() {
		return this.additionalCharge2Amount;
	}

	public void setAdditionalCharge2Amount(String value) {
		this.additionalCharge2Amount = value;
	}

	public String getAdditionalCharge2Taxable() {
		return this.additionalCharge2Taxable;
	}

	public void setAdditionalCharge2Taxable(String value) {
		this.additionalCharge2Taxable = value;
	}

	public String getUseTax1Code() {
		return this.useTax1Code;
	}

	public void setUseTax1Code(String value) {
		this.useTax1Code = value;
	}

	public String getUseTax1Amount() {
		return this.useTax1Amount;
	}

	public void setUseTax1Amount(String value) {
		this.useTax1Amount = value;
	}

	public String getUseTax2Code() {
		return this.useTax2Code;
	}

	public void setUseTax2Code(String value) {
		this.useTax2Code = value;
	}

	public String getUseTax2Amount() {
		return this.useTax2Amount;
	}

	public void setUseTax2Amount(String value) {
		this.useTax2Amount = value;
	}

	public String getUseTax3Code() {
		return this.useTax3Code;
	}

	public void setUseTax3Code(String value) {
		this.useTax3Code = value;
	}

	public String getUseTax3Amount() {
		return this.useTax3Amount;
	}

	public void setUseTax3Amount(String value) {
		this.useTax3Amount = value;
	}

	public String getUseTax4Code() {
		return this.useTax4Code;
	}

	public void setUseTax4Code(String value) {
		this.useTax4Code = value;
	}

	public String getUseTax4Amount() {
		return this.useTax4Amount;
	}

	public void setUseTax4Amount(String value) {
		this.useTax4Amount = value;
	}

	public String getTaxable() {
		return this.taxable;
	}

	public void setTaxable(String value) {
		this.taxable = value;
	}

	public String getApplyAdditionalCharge1() {
		return this.applyAdditionalCharge1;
	}

	public void setApplyAdditionalCharge1(String value) {
		this.applyAdditionalCharge1 = value;
	}

	public String getApplyAdditionalCharge2() {
		return this.applyAdditionalCharge2;
	}

	public void setApplyAdditionalCharge2(String value) {
		this.applyAdditionalCharge2 = value;
	}

	public String getDistributeTax() {
		return this.distributeTax;
	}

	public void setDistributeTax(String value) {
		this.distributeTax = value;
	}

	public String getDistributeAddlChg1() {
		return this.distributeAddlChg1;
	}

	public void setDistributeAddlChg1(String value) {
		this.distributeAddlChg1 = value;
	}

	public String getDistributeAddlChg2() {
		return this.distributeAddlChg2;
	}

	public void setDistributeAddlChg2(String value) {
		this.distributeAddlChg2 = value;
	}

	public String getAPGLDivision() {
		return this.apglDivision;
	}

	public void setAPGLDivision(String value) {
		this.apglDivision = value;
	}

	public String getAPGLAccount() {
		return this.apglAccount;
	}

	public void setAPGLAccount(String value) {
		this.apglAccount = value;
	}

	public String getDispute() {
		return this.dispute;
	}

	public void setDispute(String value) {
		this.dispute = value;
	}

	public String getSeperateCheckDirectDeposit() {
		return this.seperateCheckDirectDeposit;
	}

	public void setSeperateCheckDirectDeposit(String value) {
		this.seperateCheckDirectDeposit = value;
	}

	public String getTimeToPost() {
		return this.timeToPost;
	}

	public void setTimeToPost(String value) {
		this.timeToPost = value;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}

	public void setInvoiceType(String value) {
		this.invoiceType = value;
	}

	public String getExtendedReference() {
		return this.extendedReference;
	}

	public void setExtendedReference(String value) {
		this.extendedReference = value;
	}

	public String getAuthorizationType() {
		return this.authorizationType;
	}

	public void setAuthorizationType(String value) {
		this.authorizationType = value;
	}

	public String getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(String value) {
		this.creditCard = value;
	}

	public String getPaidVendor() {
		return this.paidVendor;
	}

	public void setPaidVendor(String value) {
		this.paidVendor = value;
	}

	public String getChargeDt() {
		return this.chargeDt;
	}

	public void setChargeDt(String value) {
		this.chargeDt = value;
	}

	public String getBUProject() {
		return this.buProject;
	}

	public void setBUProject(String value) {
		this.buProject = value;
	}

	public String getGLDistributionReference() {
		return this.glDistributionReference;
	}

	public void setGLDistributionReference(String value) {
		this.glDistributionReference = value;
	}
}
