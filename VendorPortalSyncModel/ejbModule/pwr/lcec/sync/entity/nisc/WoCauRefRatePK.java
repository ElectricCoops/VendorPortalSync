package pwr.lcec.sync.entity.nisc;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;








@Embeddable
public class WoCauRefRatePK
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Column(name = "WO_CAU_ID")
  private String woCauId;
  @Column(name = "WO_RATE_GRP_CD")
  private String woRateGrpCd;
  
  public String getWoCauId() { return this.woCauId; }

  
  public void setWoCauId(String woCauId) { this.woCauId = woCauId; }

  
  public String getWoRateGrpCd() { return this.woRateGrpCd; }

  
  public void setWoRateGrpCd(String woRateGrpCd) { this.woRateGrpCd = woRateGrpCd; }

  
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof WoCauRefRatePK)) {
      return false;
    }
    WoCauRefRatePK castOther = (WoCauRefRatePK)other;
    return 
      (this.woCauId.equals(castOther.woCauId) && 
      this.woRateGrpCd.equals(castOther.woRateGrpCd));
  }
  
  public int hashCode() {
    int prime = 31;
    int hash = 17;
    hash = hash * 31 + this.woCauId.hashCode();
    return hash * 31 + this.woRateGrpCd.hashCode();
  }
}
