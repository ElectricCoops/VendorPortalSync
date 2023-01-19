package pwr.lcec.sync.scheduler;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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

import pwr.lcec.sync.entity.nisc.WoRateGrpRef;
import pwr.lcec.sync.entity.nisc.custom.NiscRateRef;
import pwr.lcec.sync.entity.vp.CurrentContractDate;
import pwr.lcec.sync.entity.vp.RateGroup;
import pwr.lcec.sync.entity.vp.RateGroupPrice;
import pwr.lcec.sync.entity.vp.Vendor;
import pwr.lcec.sync.interfaces.NiscWorkOrderRemote;
import pwr.lcec.sync.interfaces.VpWorkFlowRemote;

@Singleton
public class SyncRates extends ScheduleBuilder {
	
  private static final String timerInfo = "SyncRates";
  private static final String syncStarted = "Hello!! Rate Sync ready to Work.";
  private static Logger logger = LogManager.getLogger(SyncRates.class);
  private CurrentContractDate contractDate = new CurrentContractDate();
  
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
    if (getScheduleFromTimerService(this.timerService, timerInfo) == null) {
      reinitializeTimer(this.timerService, timerInfo);
    } else if (!sex.equals(getScheduleFromTimerService(this.timerService, timerInfo))) {
      reinitializeTimer(this.timerService, timerInfo);
    } else {
      preparation("Nothing to change schedule has not changed.");
    } 
  }
  
  @Timeout
  public void syncPrices() {
    logger.info("RGP Sync Started @ " + new Date());
    
    contractDate = vpRemote.findCurrentContractDate();
    
    if(contractDate.getEffectiveStartDt() != null && contractDate.getEffectiveEndDt() != null) {
    	List<WoRateGrpRef> groupList = wfRemote.findRateGroups();
        
        groupList.stream().parallel().forEach(g -> { 
            
            mapRateGroupPrice(g);
            
        });
    }else {
    	logger.error("Error: Current Contract Date is not set, please add dates to the DB table.");
    }
 
    logger.info("RGP Sync Finished @ " + new Date());
  }

  
  public void mapRateGroupPrice(WoRateGrpRef grp) {
    logger.info("Rate Group " + grp.getWoRateGrpCd() + " Started @ " + new Date());

    RateGroup rg;
    
    if (grp.getWoRateGrpCd().equalsIgnoreCase("MAST")) {
      rg = vpRemote.findRateGroupByName("MASTEC");
      if (rg == null) {
        rg = vpRemote.findRateGroupByName(grp.getWoRateGrpCd());
      }
    } else {
      rg = vpRemote.findRateGroupByName(grp.getWoRateGrpCd());
    } 
    
    if (rg == null) {
      rg = new RateGroup();
      rg.setRateGroupName(grp.getWoRateGrpCd());
      rg.setEffectiveStartDt(new Timestamp(System.currentTimeMillis()));
      
      Vendor vendor = null;
      if (grp.getWoRateGrpCd().equalsIgnoreCase("MAST")) {
        vendor = vpRemote.findVendorByName("MASTEC");
      } else if (grp.getWoRateGrpCd().equalsIgnoreCase("GEN")) {
        vendor = vpRemote.findVendorByName("GENERIC");
      } else {
        vendor = vpRemote.findVendorByName(grp.getWoRateGrpCd());
      } 
      rg.setVendorId(vendor.getVendorId());
    } 

    
    rg.setDescription(grp.getWoDesc());
    rg.setFixedRateSW(grp.getWoFixedRateSw());
    rg.setStatusCode(grp.getWoStatCd());
    
    rg = vpRemote.mergeRateGroup(rg);
    
    List<NiscRateRef> cauList = wfRemote.findRatesByGrp(grp.getWoRateGrpCd());
    
    logger.info(String.valueOf(rg.getRateGroupName()) + " Assembly Unit List Size: " + cauList.size() + " Started @ " + new Date());
    
       
    Calendar c = Calendar.getInstance();

    //TODO: When the sync is ran inside the contract year the date can be now. For testing before the contract year you have to simulate this by setting a date inside the contract year.
    c.add(Calendar.DAY_OF_MONTH, 7); //Remove this line for normal running of the job
    
    Date syncDate = c.getTime();
    logger.info("Sync Date: " + syncDate);
    RateGroup group = rg;
    
    cauList.stream().parallel().forEach(cu -> {
          RateGroupPrice cau;

          
          if (grp.getWoRateGrpCd().equalsIgnoreCase("MAST")) {
            cau = vpRemote.findRatePriceByCauGrp(cu.getWoCauId(), 3, syncDate);
          } else if (grp.getWoRateGrpCd().equalsIgnoreCase("PIKE")) {
            cau = vpRemote.findRatePriceByCauGrp(cu.getWoCauId(), 4, syncDate);
          } else if (grp.getWoRateGrpCd().equalsIgnoreCase("LCEC")) {
            cau = vpRemote.findRatePriceByCauGrp(cu.getWoCauId(), 2, syncDate);
          } else {
            cau = vpRemote.findRatePriceByCauGrp(cu.getWoCauId(), 1, syncDate);
          }         	  
          
          if (cau == null) {
            cau = new RateGroupPrice();
            cau.setAssemblyGuid(cu.getWoCauId());
            cau.setRateGroup(group);
          } 

          
          cau.setAssemblySource("NISC");
          cau.setAssemblyDescription(cu.getWoDesc());
//          cau.setFixedCost(cu.getWoFixedAmt().toString());
          cau.setFixedCost("0");
          
          if (cu.getWoAmtConst() == null) {
            cau.setLaborConstCost("0");
          } else {
            cau.setLaborConstCost(cu.getWoAmtConst().toString());
          } 
          cau.setLaborConstHours(cu.getWoConsHrs());
          
          if (cu.getWoAmtRetire() == null) {
            cau.setLaborRetireCost("0");
          } else {
            cau.setLaborRetireCost(cu.getWoAmtRetire().toString());
          } 
          
          cau.setLaborRetireHours(cu.getWoRetireHrs());
          cau.setEffectiveStartDt(contractDate.getEffectiveStartDt());
          cau.setEffectiveEndDt(contractDate.getEffectiveEndDt());
          cau.setGLConstAccountId(1);
          cau.setGLRetireAccountId(3);
          
          if (cu.getWoCauId().endsWith(".T")) {
            cau.setGLPercent(new BigDecimal(0.5D));
          } else {
            cau.setGLPercent(new BigDecimal(1));
          } 
          
          cau.setGLActivity(220);
          cau.setGL_Department(0);
          cau.setGLRetireActivity(220);
          cau.setGLRetireDepartment(0);
          
          vpRemote.mergeRateGroupPrice(cau);
        });

    
    logger.info(String.valueOf(rg.getRateGroupName()) + " AU's Finished @ " + new Date());
  }

  /*public Timestamp convertStringtoTimeStamp(String input) throws ParseException {
    SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
    
    Date parsedTimestamp = dateformat.parse(input);
    
    return new Timestamp(parsedTimestamp.getTime());
  }*/
  
  public TimerService getTimerService() { return timerService; }


  
  public void setTimerService(TimerService timerService) { this.timerService = timerService; }


  
  public static String getTimerinfo() { return timerInfo; }


  
  public static String getSyncstarted() { return syncStarted; }
}
