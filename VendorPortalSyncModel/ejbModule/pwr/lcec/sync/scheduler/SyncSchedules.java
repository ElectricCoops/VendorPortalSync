package pwr.lcec.sync.scheduler;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Timeout;
import javax.ejb.TimerService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pwr.lcec.sync.entity.customconfig.ScheduledTask;
import pwr.lcec.sync.interfaces.ScheduleRemote;

@Singleton
@Startup
@DependsOn({"SyncGLAccounts", "SyncInvoiceExport", "SyncInvoiceStatus", "SyncRates", "SyncResources", "SyncWFTaskUpdate", "SyncWorkEvent", "SyncWorkFlow", "SyncManualWorkOrder"})
public class SyncSchedules extends ScheduleBuilder {

	private static final String timerInfo = "SyncSchedule";
	private static final String syncStarted = "Hello!! Schedule Sync ready to Work.";
	private static Logger logger = LogManager.getLogger(SyncSchedules.class);

	@Resource
	private TimerService timerService;

	//@EJB
	//SyncBudgetTracking syncBudgetTracking;
	
	@EJB
	SyncManualWorkOrder syncManualWorkOrder;

	@EJB
	SyncGLAccounts syncGlAccounts;

	@EJB
	SyncRates syncRates;

	@EJB
	SyncResources syncResources;

	@EJB
	SyncWorkEvent syncWorkEvent;

	@EJB
	SyncWorkFlow syncWorkFlow;

	@EJB
	SyncInvoiceExport syncInvoiceExport;

	@EJB
	SyncInvoiceStatus syncInvoiceStatus;

	@EJB
	SyncWFTaskUpdate syncWFTaskUpdate;

	@EJB
	private ScheduleRemote sRemote;

	@PostConstruct
	public void init() {
		createTimer(timerService, timerInfo);

		updateSchedules();

		preparation(syncStarted);
	}

	public void reinitializeTimer() { 

		reinitializeTimer(timerService, "SyncSchedule");

	}

	@Timeout
	public void updateSchedules() {
		logger.info("Running Sync Schedule Job!!!");

		List<ScheduledTask> stList = this.sRemote.findAllSchedule();

		stList.stream().forEach(st -> {

			if (st.getJob().equals(timerInfo)) {
				if (!compareSE(getScheduleFromTimerService(timerService, timerInfo), convertTaskToExpression(st))) {
					reinitializeTimer();
				}
			}
			//else if (st.getJob().equals(SyncBudgetTracking.getTimerinfo())) {

				//syncBudgetTracking.reinitializeTimer(convertTaskToExpression(st));
			//}
			else if (st.getJob().equals(SyncManualWorkOrder.getTimerinfo())) {

				syncManualWorkOrder.reinitializeTimer(convertTaskToExpression(st));
			}
			else if (st.getJob().equals(SyncGLAccounts.getTimerinfo())) {

				syncGlAccounts.reinitializeTimer(convertTaskToExpression(st));
			}
			else if (st.getJob().equals(SyncRates.getTimerinfo())) {

				syncRates.reinitializeTimer(convertTaskToExpression(st));
			}
			else if (st.getJob().equals(SyncResources.getTimerinfo())) {

				syncResources.reinitializeTimer(convertTaskToExpression(st));
			}
			else if (st.getJob().equals(SyncWorkEvent.getTimerinfo())) {

				syncWorkEvent.reinitializeTimer(convertTaskToExpression(st));
			}
			else if (st.getJob().equals(SyncWorkFlow.getTimerinfo())) {

				syncWorkFlow.reinitializeTimer(convertTaskToExpression(st));
			}
			else if (st.getJob().equals(SyncInvoiceExport.getTimerinfo())) {

				syncInvoiceExport.reinitializeTimer(convertTaskToExpression(st));
			}
			else if (st.getJob().equals(SyncInvoiceStatus.getTimerinfo())) {

				syncInvoiceStatus.reinitializeTimer(convertTaskToExpression(st));
			}
			else if (st.getJob().equals(SyncWFTaskUpdate.getTimerinfo())) {

				syncWFTaskUpdate.reinitializeTimer(convertTaskToExpression(st));
			}
			else {

				logger.warn("ScheduledTask " + st.getApplication() + "\\" + st.getJob() + " does not have a job in this application.");
			} 
		});
	}
}
