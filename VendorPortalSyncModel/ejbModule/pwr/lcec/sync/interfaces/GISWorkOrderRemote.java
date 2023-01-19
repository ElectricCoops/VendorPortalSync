package pwr.lcec.sync.interfaces;

import java.util.List;
import javax.ejb.Remote;
import pwr.lcec.sync.entity.gis.StAttachedAssembly;
import pwr.lcec.sync.entity.gis.StStation;
import pwr.lcec.sync.entity.gis.custom.GisAssemblies;

@Remote
public interface GISWorkOrderRemote {
	
	public List<StStation> findStationByWorkOrder(String paramString);

	public List<StAttachedAssembly> findAssembliesByStation(String paramString1, String paramString2);

	public List<GisAssemblies> findAssemblies(String paramString);
}
