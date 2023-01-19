package pwr.lcec.sync.entity.vp.export;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkOrderRecordType", propOrder = { "content" })
public class WorkOrderRecordType {
	@XmlElementRefs({
			@XmlElementRef(name = "C57", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C13", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C15", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C17", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C48", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C10", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C24", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C55", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C41", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C46", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C53", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C40", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C28", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C33", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C5", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C34", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C52", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C25", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C8", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C27", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C42", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C11", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C43", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "Amount", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C29", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C54", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C32", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C45", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C37", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C9", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C16", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C36", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C19", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C26", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C51", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C6", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C38", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C60", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C44", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C22", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "InterfaceType", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "WorkOrder", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C18", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C21", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C23", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C58", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C30", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C14", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C50", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C56", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C12", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C49", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C59", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "ChargeCode", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C47", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C7", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C39", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C35", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C20", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "C31", namespace = "http://lcec.pwr", type = JAXBElement.class, required = false) })
	protected List<JAXBElement<? extends Serializable>> content;

	public List<JAXBElement<? extends Serializable>> getContent() {
		if (this.content == null) {
			this.content = new ArrayList();
		}
		return this.content;
	}
}
