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

import pwr.lcec.sync.entity.nisc.GlAcctMstr;
import pwr.lcec.sync.entity.vp.GLAccount;
import pwr.lcec.sync.interfaces.NiscWorkOrderRemote;
import pwr.lcec.sync.interfaces.VpWorkFlowRemote;

@Singleton
public class SyncGLAccounts extends ScheduleBuilder {
	
	private static final String timerInfo = "SyncGLAccounts";
	private static final String syncStarted = "Hello!! GL Account Sync ready to Work.";
	private static Logger logger = LogManager.getLogger(SyncGLAccounts.class);

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
		reinitializeTimer(timerService, timerInfo);
	}

	@Timeout
	public void syncGlAccounts() {
		logger.info("GL Account Started @ " + new Date());

		List<GlAcctMstr> accountList = wfRemote.findGLAccounts();

		accountList.stream().parallel().forEach(gl -> {

			GLAccount account = vpRemote.findGLAccount(gl.getId().getGlAcctSubNbr());

			if (account == null) {
				account = new GLAccount();

				account.setGL_Account(gl.getId().getGlAcctSubNbr());
			}

			account.setGL_Description(gl.getGlDesc());

			vpRemote.mergeGLAccount(account);
		});

		logger.info("GLAccount Finished @ " + new Date());
	}

	public TimerService getTimerService() {
		return this.timerService;
	}

	public void setTimerService(TimerService timerService) {
		this.timerService = timerService;
	}

	public static String getTimerinfo() {
		return "SyncGLAccounts";
	}

	public static String getSyncstarted() {
		return "Hello!! GL Account Sync ready to Work.";
	}
}
