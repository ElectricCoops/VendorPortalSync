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
import pwr.lcec.sync.entity.nisc.BiWrkflwTask;
import pwr.lcec.sync.entity.vp.WorkFlowTask;
import pwr.lcec.sync.interfaces.NiscWorkOrderRemote;
import pwr.lcec.sync.interfaces.VpWorkFlowRemote;

@Singleton
public class SyncWFTaskUpdate extends ScheduleBuilder {
	
	private static final String timerInfo = "SyncWFTaskUpdate";
	private static final String syncStarted = "Hello!! NISC WFT-Update Sync ready to Work.";
	private static Logger logger = LogManager.getLogger(SyncWFTaskUpdate.class);


	@Resource
	private TimerService timerService;

	@EJB
	private NiscWorkOrderRemote niscRemote;

	@EJB
	private VpWorkFlowRemote vpRemote;

	@PostConstruct
	public void init() { 
		
		preparation(syncStarted); 
		
	}

	public void reinitializeTimer(ScheduleExpression sex) {
		if (getScheduleFromTimerService(timerService, timerInfo) == null) {
			reinitializeTimer(timerService, timerInfo);
		} else if (!sex.equals(getScheduleFromTimerService(timerService, timerInfo))) {
			reinitializeTimer(timerService, timerInfo);
		} else {
			preparation(syncStarted);
		} 
	}

	@Timeout
	public void updateIvueWFTask() {
		logger.info("Work Flow Task Update Started @ " + new Date());

		List<WorkFlowTask> completedTasks = vpRemote.findCompletedWFTask();

		completedTasks.stream().forEach(t -> {

			BiWrkflwTask wfTask = niscRemote.findTaskByTaskKey(t.getWorkFlowTaskId());

			if (wfTask != null) {

				wfTask.setBiWorkEventCd("COMP");
				wfTask.setBiEventDtTm(new Date());
				niscRemote.mergeWorkFlowTask(wfTask);
			} else {

				logger.error("WorkFlowTask not found in NISC database: " + t.getWorkFlowTaskId());
			} 
		});


		logger.info("Work Flow Task Update Finished @ " + new Date());
	}



	public TimerService getTimerService() { return this.timerService; }



	public void setTimerService(TimerService timerService) { this.timerService = timerService; }



	public static String getTimerinfo() { return "SyncWFTaskUpdate"; }
}
