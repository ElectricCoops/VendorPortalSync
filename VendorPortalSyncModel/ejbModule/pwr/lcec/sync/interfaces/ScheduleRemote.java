package pwr.lcec.sync.interfaces;

import java.util.List;
import javax.ejb.Remote;
import pwr.lcec.sync.entity.customconfig.ScheduledTask;

@Remote
public interface ScheduleRemote {

	public ScheduledTask findSchedule(String paramString);

	public List<ScheduledTask> findAllSchedule();
}
