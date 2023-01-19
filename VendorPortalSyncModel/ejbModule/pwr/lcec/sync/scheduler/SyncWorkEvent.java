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

import pwr.lcec.sync.entity.nisc.BiWorkEventCdRef;
import pwr.lcec.sync.entity.vp.WorkEventStatus;
import pwr.lcec.sync.interfaces.NiscWorkOrderRemote;
import pwr.lcec.sync.interfaces.VpWorkFlowRemote;

@Singleton
public class SyncWorkEvent extends ScheduleBuilder {

	private static final String timerInfo = "SyncWorkEvent";
	private static final String syncStarted = "Hello!! Work Event Status Sync ready to Work";
	private static Logger logger = LogManager.getLogger(SyncWorkEvent.class);

	@EJB
	private NiscWorkOrderRemote wfRemote;

	@EJB
	private VpWorkFlowRemote vpRemote;

	@Resource
	private TimerService timerService;

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
			preparation("Nothing to change schedule has not chnaged.");
		} 
	}

	@Timeout
	public void syncEvents() {
		logger.info("Work Event Status Started @ " + new Date());

		List<BiWorkEventCdRef> eventList = wfRemote.findWorkEventCd();

		eventList.stream().parallel().forEach(we -> {

			WorkEventStatus wes = vpRemote.findWorkEvent(we.getBiWorkEventCd());

			if (wes == null) {
				wes = new WorkEventStatus();
				wes.setWorkEventStatusId(we.getBiWorkEventCd());
				wes.setActive(true);
			} 

			wes.setDescription(we.getBiEventDesc());
			wes.setApplicationCode(we.getBiApplCd());

			vpRemote.mergeWorkEvent(wes);
		});


		logger.info("Work Event Status Finished @ " + new Date());
	}



	public TimerService getTimerService() { return this.timerService; }



	public void setTimerService(TimerService timerService) { this.timerService = timerService; }



	public static String getTimerinfo() { return "SyncWorkEvent"; }



	public static String getSyncstarted() { return "Hello!! Work Event Status Sync ready to Work"; }
}
