package pwr.lcec.sync.entity.vp.export;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceMessageType", propOrder = { "invoiceHeader", "workOrderRecord" })
public class InvoiceMessageType {
	@XmlElement(name = "InvoiceHeader", required = true)
	protected InvoiceHeaderType invoiceHeader;
	@XmlElement(name = "WorkOrderRecord")
	protected List<WorkOrderRecordType> workOrderRecord;

	public InvoiceHeaderType getInvoiceHeader() {
		return this.invoiceHeader;
	}

	public void setInvoiceHeader(InvoiceHeaderType value) {
		this.invoiceHeader = value;
	}

	public List<WorkOrderRecordType> getWorkOrderRecord() {
		if (this.workOrderRecord == null) {
			this.workOrderRecord = new ArrayList<WorkOrderRecordType>();
		}
		return this.workOrderRecord;
	}
}
