package pwr.lcec.sync.session;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pwr.lcec.sync.entity.customconfig.ScheduledTask;
import pwr.lcec.sync.interfaces.ScheduleRemote;

@Stateless(name = "ScheduleBean", mappedName = "ejb/lcec/ScheduleProcessorBean", description = "ScheduleProcessorBean Business Facade")
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class ScheduleSession implements ScheduleRemote {
	private static Logger logger = LogManager.getLogger(ScheduleSession.class);

	@PersistenceContext(unitName = "CCPU")
	private EntityManager em;

	@SuppressWarnings("unchecked")
	public ScheduledTask findSchedule(String job) {
		List<ScheduledTask> found = null;

		Query query = this.em.createNamedQuery("ScheduledTask.findScheduleByJob");
		query.setParameter("application", "VendorPortalSyncAppl");
		query.setParameter("job", job);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		if (found.size() == 1)
			return (ScheduledTask) found.get(0);
		if (found.isEmpty()) {
			return null;
		}
		throw new NonUniqueResultException();
	}

	@SuppressWarnings("unchecked")
	public List<ScheduledTask> findAllSchedule() {
		List<ScheduledTask> found = null;

		Query query = this.em.createNamedQuery("ScheduledTask.findAll");
		query.setParameter("application", "VendorPortalSyncAppl");
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		return found;
	}
}
