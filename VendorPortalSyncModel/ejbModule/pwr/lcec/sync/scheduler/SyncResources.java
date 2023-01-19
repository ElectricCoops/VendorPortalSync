package pwr.lcec.sync.scheduler;

import java.sql.Timestamp;
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

import pwr.lcec.sync.entity.nisc.BiResourceRef;
import pwr.lcec.sync.entity.nisc.BiResourceWorkgrp;
import pwr.lcec.sync.entity.vp.VPResource;
import pwr.lcec.sync.entity.vp.WorkGroup;
import pwr.lcec.sync.interfaces.NiscWorkOrderRemote;
import pwr.lcec.sync.interfaces.VpWorkFlowRemote;

@Singleton
public class SyncResources extends ScheduleBuilder {
	
  private static final String timerInfo = "SyncResources";
  private static final String syncStarted = "Hello!! Resource Sync ready to Work.";
  private static Logger logger = LogManager.getLogger(SyncResources.class);
  
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
  public void syncResources() {
    logger.info("Resource Started @ " + new Date());
    
    List<BiResourceRef> biResources = this.wfRemote.findResourcesRef();
    
    logger.info("Resources From NISC: " + biResources.size());
    
    biResources.stream().parallel().forEach(r -> {
        
        mapResource(r);
        
    });
    /*for(BiResourceRef r : biResources) {
    	mapResource(r);
    }*/


    
    logger.info("Resource Finished @ " + new Date());
  }


  
  public void mapResource(BiResourceRef res) {
    VPResource vpResource = this.vpRemote.findResourceByName(res.getBiResourceNm());
    
    if (vpResource == null) {
      vpResource = new VPResource();
    }
    
    vpResource.setResourceId((int)res.getBiResourceId());
    vpResource.setResourceTypeCd(res.getBiResourceTypeCd());
    vpResource.setResourceName(res.getBiResourceNm());
    vpResource.setCrew(res.getBiCrew());
    vpResource.setUserID(res.getSyUserId());
    vpResource.setEmployeeNumber(res.getBiEmployeeNbr().intValue());
    vpResource.setActive(res.getBiActiveSw());
    vpResource.setEffectiveBeginDt(convertDtTm(res.getBiEffectBegDt()));
    vpResource.setEffectiveEndDt(convertDtTm(res.getBiEffectEndDt()));
    vpResource.setSourceSystem("NISC");
    
    vpResource = vpRemote.mergeResource(vpResource);
    
    List<BiResourceWorkgrp> workGroups = wfRemote.findResourceWorkGroupByResourceId(res.getBiResourceId());
    
    if (!workGroups.isEmpty() && workGroups != null) {
      
    	workGroups.stream().forEach(r -> {
            
            WorkGroup vpWG = vpRemote.findWorkGroup((int)res.getBiResourceId(), r.getId().getBiWorkgrp());
            
            if (vpWG == null)
            {
              vpWG = new WorkGroup();
            }

            
            vpWG.setResourceId((int)res.getBiResourceId());
            vpWG.setWorkGroupName(r.getId().getBiWorkgrp());
            vpWG.setListenSw(r.getBiListenSw());
            
            vpRemote.mergeWorkGroup(vpWG);
          });
    }
  }





  
  public Timestamp convertDtTm(Date date) { return (date == null) ? null : new Timestamp(date.getTime()); }




  
  public TimerService getTimerService() { return this.timerService; }


  
  public void setTimerService(TimerService timerService) { this.timerService = timerService; }


  
  public static String getTimerinfo() { return "SyncResources"; }


  
  public static String getSyncstarted() { return "Hello!! Resource Sync ready to Work."; }
}
