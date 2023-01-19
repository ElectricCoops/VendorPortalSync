package pwr.lcec.sync.entity.vp.export;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceMessagesType", propOrder = { "invoiceMessage" })
public class InvoiceMessagesType {
	@XmlElement(name = "InvoiceMessage", required = true)
	protected List<InvoiceMessageType> invoiceMessage;

	public List<InvoiceMessageType> getInvoiceMessage() {
		if (this.invoiceMessage == null) {
			this.invoiceMessage = new ArrayList<InvoiceMessageType>();
		}
		return this.invoiceMessage;
	}
}
