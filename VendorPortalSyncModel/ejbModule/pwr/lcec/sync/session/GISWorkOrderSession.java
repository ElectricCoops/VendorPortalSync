package pwr.lcec.sync.session;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pwr.lcec.sync.entity.gis.StAttachedAssembly;
import pwr.lcec.sync.entity.gis.StStation;
import pwr.lcec.sync.entity.gis.custom.GisAssemblies;
import pwr.lcec.sync.interfaces.GISWorkOrderRemote;

@Stateless(name = "GISWorkOrderBean", mappedName = "ejb/lcec/GISWorkOrderProcessorBean", description = "GISWorkOrderProcessorBean Business Facade")
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class GISWorkOrderSession implements GISWorkOrderRemote {
	private static Logger logger = LogManager.getLogger(GISWorkOrderSession.class);

	@PersistenceContext(unitName = "GISPU")
	private EntityManager em;

	@SuppressWarnings("unchecked")
	public List<StStation> findStationByWorkOrder(String woNumber) {
		List<StStation> found = null;

		Query query = this.em.createNamedQuery("StStation.findStationsByWorkOrder");
		query.setParameter("woNumber", woNumber);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		return found;
	}

	@SuppressWarnings("unchecked")
	public List<StAttachedAssembly> findAssembliesByStation(String woNumber, String stStation) {
		List<StAttachedAssembly> found = null;

		Query query = this.em.createNamedQuery("StAttachedAssembly.findAssembliesByStation");
		query.setParameter("woNumber", woNumber);
		query.setParameter("stationName", stStation);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		try {
			found = query.getResultList();
		} catch (Exception e) {
			logger.error("Exception occured: " + e.getMessage());
		}

		return found;
	}

	@SuppressWarnings("unchecked")
	public List<GisAssemblies> findAssemblies(String woId) {
		Query query = this.em.createQuery(
				"SELECT new pwr.lcec.sync.entity.gis.custom.GisAssemblies("
					+ "wor.gsGuid,"
					+ "wor.stWoNumber,"
					+ "wor.stStatusRefGuid,"
					+ "sr.stStatusDescription,"
					+ "wor.stWoDescription,"
					+ "wor.stWoTypeCode,"
					+ "wor.stServiceAddr1,"
					+ "wor.stServiceAddrCity,"
					+ "wor.stServiceAddrPhone,"
					+ "wor.stServiceAddrZip,"
					+ "wor.stServiceName,"
					+ "wor.stJobProjectNum,"
					+ "wor.stIvueSeqNum,"
					+ "wor.stAccountingCode,"
					+ "wor.stBiCustId,"
					+ "st.objectid,"
					+ "st.gsStationName,"
					+ "st.gsDateCreated,"
					+ "st.gsDateModified,"
					+ "aa.gsGuid,"
					+ "aa.gsAssemblyGuid,"
					+ "ar.gsAssemblyDescription,"
					+ "aa.stAssemblyActionCode,"
					+ "aa.stAssemblyEstimateCode,"
					+ "aa.gsAssemblyQuantity,"
					+ "aa.gsAssemblyDateCreated,"
					+ "aa.gsAssemblyDateInstalled,"
					+ "aa.gsAssemblyDateModified,"
					+ "aa.gsAssemblyComments,"
					+ "aa.gsAsmbLastModifiedUser,"
					+ "aa.gsIsNeutral)"
		+ "    FROM StWorkorderRef wor"
		+ " LEFT JOIN StStation st ON st.stWorkorderRefGuid = wor.gsGuid"
		+ " LEFT JOIN StAttachedAssembly aa ON aa.gsNetworkFeatureGuid = st.gsGuid"
		+ " LEFT JOIN StStatusRef sr ON wor.stStatusRefGuid = sr.gsGuid"
		+ " LEFT JOIN GsAssemblyRef ar ON ar.gsAssemblyName = aa.gsAssemblyGuid"
		+ " WHERE wor.stWoNumber = :woId AND aa.stAssemblyActionCode != 'E' AND aa.gsAssemblyGuid not like '{UNKNOWN%' ORDER BY wor.gsGuid, st.gsStationName");

		query.setParameter("woId", woId);
		return query.getResultList();
	}
}
