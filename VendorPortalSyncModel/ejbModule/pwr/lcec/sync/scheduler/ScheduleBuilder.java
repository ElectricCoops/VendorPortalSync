package pwr.lcec.sync.scheduler;

import java.util.Collection;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.ScheduleExpression;
import javax.ejb.Timer;
import javax.ejb.TimerConfig;
import javax.ejb.TimerService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pwr.lcec.sync.entity.customconfig.ScheduledTask;
import pwr.lcec.sync.interfaces.ScheduleRemote;

public class ScheduleBuilder {
	private static Logger logger = LogManager.getLogger(ScheduleBuilder.class);

	@EJB
	private ScheduleRemote sRemote;

	public TimerService cancelTimer(TimerService timerService, String timerInfo) {
		if (timerService.getTimers() != null) {
			timerService.getTimers().forEach(timer -> {

				if (timer.getInfo().equals(timerInfo)) {
					timer.cancel();
				}
			});
		}

		return timerService;
	}

	public TimerService reinitializeTimer(TimerService timerService, String timerInfo) {
		cancelTimer(timerService, timerInfo);
		createTimer(timerService, timerInfo);

		return timerService;
	}

	protected TimerService createTimer(TimerService timerService, String timerInfo) {
		ScheduleExpression scheduleExpression = new ScheduleExpression();

		scheduleExpression = getSchedule(timerInfo);

		TimerConfig timerConfig = new TimerConfig();
		timerConfig.setPersistent(false);
		timerConfig.setInfo(timerInfo);
		timerService.createCalendarTimer(scheduleExpression, timerConfig);

		return timerService;
	}

	public void preparation(String syncStarted) {
		logger.info(syncStarted);
	}

	public ScheduleExpression getScheduleFromTimerService(TimerService ts, String timerInfo) {
		ScheduleExpression expression = null;

		Collection<Timer> timers = ts.getTimers();

		for (Timer t : timers) {

			if (t.getInfo().equals(timerInfo)) {
				expression = t.getSchedule();
			}
		}

		return expression;
	}

	protected ScheduleExpression convertTaskToExpression(ScheduledTask st) {
		ScheduleExpression se = new ScheduleExpression();

		se.year(st.getYear());
		se.dayOfMonth(st.getDayOfMonth());
		se.month(st.getMonth());
		se.dayOfWeek(st.getDayOfWeek());
		se.hour(st.getHour());
		se.minute(st.getMinute());
		se.second(st.getSecond());
		se.start(st.getStartDt());
		se.end(st.getEndDt());

		return se;
	}

	public ScheduleExpression getSchedule(String job) {
		ScheduledTask st = null;
		ScheduleExpression se = new ScheduleExpression();

		try {
			st = this.sRemote.findSchedule(job);
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (st == null) {
			logger.error("Schedule could not be found for job " + job);
		} else {

			se.year(st.getYear());
			se.dayOfMonth(st.getDayOfMonth());
			se.month(st.getMonth());
			se.dayOfWeek(st.getDayOfWeek());
			se.hour(st.getHour());
			se.minute(st.getMinute());
			se.second(st.getSecond());
			se.start(st.getStartDt());
			se.end(st.getEndDt());
		}

		return se;
	}

	public boolean compareSE(ScheduleExpression current, ScheduleExpression latest) {
		if (compareString(current.getYear(), latest.getYear())
				&& compareString(current.getDayOfMonth(), latest.getDayOfMonth())
				&& compareString(current.getMonth(), latest.getMonth())
				&& compareString(current.getDayOfWeek(), latest.getDayOfWeek())
				&& compareString(current.getHour(), latest.getHour())
				&& compareString(current.getMinute(), latest.getMinute())
				&& compareString(current.getSecond(), latest.getSecond())
				&& compareDate(current.getStart(), latest.getStart())
				&& compareDate(current.getEnd(), latest.getEnd())) {
			return true;
		}
		return false;
	}

	public boolean compareString(String a, String b) {
		if (a != null && b != null) {
			if (a.compareTo(b) == 0) {
				return true;
			}
		} else if (a == null && b == null) {
			return true;
		}
		return false;
	}

	public boolean compareDate(Date a, Date b) {
		if (a != null && b != null) {
			if (a.compareTo(b) == 0) {
				return true;
			}
		} else if (a == null && b == null) {
			return true;
		}
		return false;
	}
}
