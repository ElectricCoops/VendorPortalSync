package pwr.lcec.sync.scheduler;

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

import pwr.lcec.sync.entity.nisc.ApBatchTran;
import pwr.lcec.sync.entity.nisc.ApInvAct;
import pwr.lcec.sync.entity.vp.Invoice;
import pwr.lcec.sync.entity.vp.ServiceOrder;
import pwr.lcec.sync.interfaces.NiscWorkOrderRemote;
import pwr.lcec.sync.interfaces.VpWorkFlowRemote;

@Singleton
public class SyncInvoiceStatus extends ScheduleBuilder {
	private static final String timerInfo = "SyncInvoiceStatus";
	private static final String syncStarted = "Hello!! Invoice Status Sync ready to Work.";
	private static Logger logger = LogManager.getLogger(SyncInvoiceStatus.class);

	@Resource
	private TimerService timerService;

	@EJB
	private VpWorkFlowRemote vpRemote;

	@EJB
	private NiscWorkOrderRemote niscRemote;

	@PostConstruct
	public void init() {
		preparation(syncStarted);
	}

	public void reinitializeTimer(ScheduleExpression sex) {
		reinitializeTimer(timerService, timerInfo);
	}

	@Timeout
	public void invoiceStatus() {
		List<Invoice> invoices = vpRemote.findInvoicesForSync();

		logger.info("Invoice Status Sync Started w/ " + invoices.size() + " records @ " + new Date());

		try {
			invoices.parallelStream().forEach(i -> {

				ApBatchTran abt = niscRemote.findApBatchTranByInvId(i.getVendorReference());

				if(abt != null) {
					//If record found in this table update Invoice table to 7 = Approved-Imported 
					i.setInvoiceStatusId(7);

					vpRemote.updateInvoiceStatus(i);
					updateServiceOrderInvoice(i.getServiceOrderId(), i);
				}else {
					//Check AP_INV_ACT table for Invoice status
					List<ApInvAct> aia = niscRemote.findInvActByInvId(i.getVendorReference());

					if(aia != null) {
						if(aia.size() >= 1) {
							logger.debug("Invoice Reference size: " + aia.size());
							aia.stream().forEach(a -> {
								logger.debug("NISC record for " + a.getApInvId() + " " + a.getApAmt() + " " + a.getApStatCd());
								if(a.getApAmt().equals(i.getInvoiceAmount())) {
									logger.debug("Amounts are equal...");
									if("U".equals(a.getApStatCd())) {//unpaid
										i.setInvoiceStatusId(8);
										logger.debug("U should be updated.");
									}else if("Y".equals(a.getApStatCd())) {//payment pending
										i.setInvoiceStatusId(9);
									}else if("R".equals(a.getApStatCd())) {//partially paid
										i.setInvoiceStatusId(10);
									}else if("F".equals(a.getApStatCd())) {//fully paid
										i.setInvoiceStatusId(12);
									}else if("P".equals(a.getApStatCd())) {//paid
										i.setInvoiceStatusId(12);
									}else if("V".equals(a.getApStatCd())) {//void
										i.setInvoiceStatusId(13);
									}

									vpRemote.updateInvoiceStatus(i);
									updateServiceOrderInvoice(i.getServiceOrderId(), i);
								}

							});

						}
					}
				}
			});
		} catch (Exception e) {
			logger.error("Invoice Status Sync Error: " + e.getMessage());
		}

		logger.info("Invoice Status Sync Finished @ " + new Date());
	}
	
	public void updateServiceOrderInvoice(String soId, Invoice invoice) {
		
		ServiceOrder so = vpRemote.findServiceOrderById(soId);
		
		
		so.setInvoiceId(invoice.getInvoiceId());
		so.setInvoiceStatusId(invoice.getInvoiceStatusId());
		
		vpRemote.mergeServiceOrder(so);
		
	}

	/*public void updateInvoiceStatus(int invoiceId, int invStatus) {
		Invoice invoice = vpRemote.findInvoiceById(invoiceId);

		if (invoice != null) {
			invoice.setInvoiceStatusId(invStatus);
			vpRemote.updateInvoiceStatus(invoice);
		} else {
			logger.error("No invoice found for InvoiceID: " + invoiceId);
		}
	}*/

	public TimerService getTimerService() {
		return this.timerService;
	}

	public void setTimerService(TimerService timerService) {
		this.timerService = timerService;
	}

	public static String getTimerinfo() {
		return "SyncInvoiceStatus";
	}
}
