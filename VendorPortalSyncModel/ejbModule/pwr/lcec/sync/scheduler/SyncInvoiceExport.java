package pwr.lcec.sync.scheduler;

import com.opencsv.CSVWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.ScheduleExpression;
import javax.ejb.Singleton;
import javax.ejb.Timeout;
import javax.ejb.TimerService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pwr.lcec.sync.email.EmailHelper;
import pwr.lcec.sync.entity.vp.Invoice;
import pwr.lcec.sync.entity.vp.InvoiceDetail;
import pwr.lcec.sync.entity.vp.ServiceOrder;
import pwr.lcec.sync.interfaces.VpWorkFlowRemote;

@Singleton
public class SyncInvoiceExport extends ScheduleBuilder {
	private static final String to = "accountspayable@lcec.net";
	private static final List<String> recipients = Arrays.asList(new String[] { to, "patrick.bowles@lcec.net" });

	private static final String subject = "VendorPortal Invoice Notification";

	private static final String timerInfo = "SyncInvoiceExport";

	private static final String syncStarted = "Hello!! Invoice Export Sync ready to Work.";

	private static Logger logger = LogManager.getLogger(SyncInvoiceExport.class);

	private static final String filePath = "/mnt/share/AP-invoice-export/";

	private static final String fileSharePath = "\\\\vm-sftp\\AP-invoice-export$";

	private static final String fileName = "VendorPort_InvoiceExport_";

	private EmailHelper helper = new EmailHelper();

	@Resource
	private TimerService timerService;

	@EJB
	private VpWorkFlowRemote vpRemote;

	@PostConstruct
	public void init() {
		preparation(syncStarted);
	}

	public void reinitializeTimer(ScheduleExpression sex) {
		reinitializeTimer(timerService, timerInfo);
	}

	@Timeout
	public void invoiceExport() {
	    List<String[]> exportData = new ArrayList<String[]>();
	    
	    List<Invoice> invoices = vpRemote.findApprovedInvoices();
	    
	    if (invoices == null || invoices.isEmpty()) {
	      
	      logger.info("No Invoice to export.");
	      
	      helper.sendEmail(recipients, subject, helper.getEmailMessage(fileName, fileSharePath, false));
	      
	    }else {
	    	
	    	invoices.stream().forEach(i -> {
	    		Invoice inv = i;
	    		inv.setApInvId("VP" + i.getInvoiceId());
	    		
	    		List<InvoiceDetail> dtls = vpRemote.findInvoiceDetail(i.getInvoiceId());
	    		
	    		dtls.stream().forEach(d -> {
	    			
	    			exportData.add(mapHeaderRow(inv, d));
	    			exportData.add(mapDetailRow(inv, d));
	    			
	    		});
	    		
	    		i = vpRemote.updateInvoiceStatus(inv);
	    	});
	    	
	    	exportCSV(exportData);
		      
		    helper.sendEmail(recipients, subject, helper.getEmailMessage(fileName + getFileDate() + ".csv", fileSharePath, true));
		    
		    invoices.stream().forEach(i -> {
	            
	            i.setInvoiceStatusId(6);
	            i = vpRemote.updateInvoiceStatus(i);
	            updateServiceOrderInvoice(i.getServiceOrderId(), i);
	        });
		      
	      
	     /* invoices.stream().forEach(i -> {
	            
	    	  List<InvoiceDetail> dtls = vpRemote.findInvoiceDetail(i.getInvoiceId());
	            
	          Invoice inv = i;
	            
	          dtls.stream().forEach(());

	            
	            i.setApInvId("VP" + i.getInvoiceId());
	            i = vpRemote.updateInvoiceStatus(i);
	      });
	
	
	      
	      exportCSV(exportData);
	      
	      helper.sendEmail(recipients, "VendorPortal Invoice Notification", this.helper.getEmailMessage("VendorPort_InvoiceExport_" + getFileDate() + ".csv", "\\\\vm-sftp\\AP-invoice-export$", true));
	      
	      invoices.stream().forEach(i -> {
	            
	            i.setInvoiceStatusId(6);
	            i = vpRemote.updateInvoiceStatus(i);
	          });*/
	    } 
	  }
	
	public void updateServiceOrderInvoice(String soId, Invoice invoice) {
		
		ServiceOrder so = vpRemote.findServiceOrderById(soId);
		
		
		so.setInvoiceId(invoice.getInvoiceId());
		so.setInvoiceStatusId(invoice.getInvoiceStatusId());
		
		vpRemote.mergeServiceOrder(so);
		
	}

	private void exportCSV(List<String[]> exportData) {
		CSVWriter write = getWriterConfig();

		try {
			write.writeAll(exportData);
			write.close();
		} catch (IOException e) {
			logger.error(e.getMessage());
		}
	}

	private CSVWriter getWriterConfig() {
		CSVWriter csvWriter = null;
		try {
			Writer writer = Files.newBufferedWriter(
					Paths.get(filePath + fileName + getFileDate() + ".csv",
							new String[0]),
					new java.nio.file.OpenOption[0]);
			logger.info(fileName + getFileDate() + ".csv");

			//csvWriter = new CSVWriter(writer, ',', false, '"', "\n");
			//csvWriter = new CSVWriter(writer, ',', '"', "\n");
			csvWriter = new CSVWriter(writer);//, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.DEFAULT_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
		} catch (IOException e) {
			logger.error(e.getMessage());
		}

		return csvWriter;
	}

	private String[] mapHeaderRow(Invoice inv, InvoiceDetail detail) {
		String[] hdRow = new String[58];

		hdRow[0] = "0";
		hdRow[1] = detail.getGLDepartment().toString();
		hdRow[2] = detail.getGL_Code();
		hdRow[3] = detail.getGLActivity().toString();
		hdRow[4] = detail.getDescription();
		hdRow[5] = detail.getAmount().toString();
		hdRow[6] = vpRemote.findVendorById(inv.getVendorId()).getApVendId();
		hdRow[7] = "";
		hdRow[8] = "";
		hdRow[9] = "";
		hdRow[10] = "";
		hdRow[11] = "";
		hdRow[12] = "";
		hdRow[13] = "";
		hdRow[14] = "";
		hdRow[15] = "";
		hdRow[16] = "";
		hdRow[17] = "";
		hdRow[18] = "";
		hdRow[19] = inv.getVendorReference();

		hdRow[20] = "";
		hdRow[21] = "";
		hdRow[22] = "";
		hdRow[23] = "";
		hdRow[24] = getDate();
		hdRow[25] = "";
		hdRow[26] = "";
		hdRow[27] = "";
		hdRow[28] = "";
		hdRow[29] = "";
		hdRow[30] = "";
		hdRow[31] = "";
		hdRow[32] = "";
		hdRow[33] = "";
		hdRow[34] = "";
		hdRow[35] = "";
		hdRow[36] = "";
		hdRow[37] = "";
		hdRow[38] = "";
		hdRow[39] = "";
		hdRow[40] = "";
		hdRow[41] = "";
		hdRow[42] = "N";
		hdRow[43] = "";
		hdRow[44] = "";
		hdRow[45] = "";
		hdRow[46] = "";
		hdRow[47] = "";
		hdRow[48] = "";
		hdRow[49] = "";
		hdRow[50] = "";
		hdRow[51] = "";
		hdRow[52] = "";
		hdRow[53] = "";
		hdRow[54] = "VP-" + inv.getInvoiceId() + "-" + detail.getGL_Code();

		hdRow[55] = "none";
		hdRow[56] = "";
		hdRow[57] = "";

		return hdRow;
	}

	private String[] mapDetailRow(Invoice inv, InvoiceDetail detail) {
		String[] dtlRow = new String[58];

		dtlRow[0] = "WO";
		dtlRow[1] = inv.getWorkOrderId();
		dtlRow[2] = "6";
		dtlRow[3] = detail.getAmount().toString();
		dtlRow[4] = "";
		dtlRow[5] = "";
		dtlRow[6] = "";
		dtlRow[7] = "";
		dtlRow[8] = "";
		dtlRow[9] = "";
		dtlRow[10] = "";
		dtlRow[11] = "";
		dtlRow[12] = "";
		dtlRow[13] = "";
		dtlRow[14] = "";
		dtlRow[15] = "";
		dtlRow[16] = "";
		dtlRow[17] = "";
		dtlRow[18] = "";
		dtlRow[19] = "";
		dtlRow[20] = "";
		dtlRow[21] = "";
		dtlRow[22] = "";
		dtlRow[23] = "";
		dtlRow[24] = "";
		dtlRow[25] = "";
		dtlRow[26] = "";
		dtlRow[27] = "";
		dtlRow[28] = "";
		dtlRow[29] = "";
		dtlRow[30] = "";
		dtlRow[31] = "";
		dtlRow[32] = "";
		dtlRow[33] = "";
		dtlRow[34] = "";
		dtlRow[35] = "";
		dtlRow[36] = "";
		dtlRow[37] = "";
		dtlRow[38] = "";
		dtlRow[39] = "";
		dtlRow[40] = "";
		dtlRow[41] = "";
		dtlRow[42] = "";
		dtlRow[43] = "";
		dtlRow[44] = "";
		dtlRow[45] = "";
		dtlRow[46] = "";
		dtlRow[47] = "";
		dtlRow[48] = "";
		dtlRow[49] = "";
		dtlRow[50] = "";
		dtlRow[51] = "";
		dtlRow[52] = "";
		dtlRow[53] = "";
		dtlRow[54] = "";
		dtlRow[55] = "";
		dtlRow[56] = "";
		dtlRow[57] = "";

		return dtlRow;
	}

	public TimerService getTimerService() {
		return this.timerService;
	}

	public void setTimerService(TimerService timerService) {
		this.timerService = timerService;
	}

	public String getDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");

		return sdf.format(new Date());
	}

	public String getFileDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("MMddyyyy_hhmmss");

		return sdf.format(new Date());
	}

	public static String getTimerinfo() {
		return timerInfo;
	}
}
