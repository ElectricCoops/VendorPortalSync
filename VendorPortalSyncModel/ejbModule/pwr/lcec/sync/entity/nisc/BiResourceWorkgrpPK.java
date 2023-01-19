package pwr.lcec.sync.entity.nisc;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;








@Embeddable
public class BiResourceWorkgrpPK
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Column(name = "BI_RESOURCE_ID")
  private long biResourceId;
  @Column(name = "BI_WORKGRP")
  private String biWorkgrp;
  
  public long getBiResourceId() { return this.biResourceId; }

  
  public void setBiResourceId(long biResourceId) { this.biResourceId = biResourceId; }

  
  public String getBiWorkgrp() { return this.biWorkgrp; }

  
  public void setBiWorkgrp(String biWorkgrp) { this.biWorkgrp = biWorkgrp; }

  
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof BiResourceWorkgrpPK)) {
      return false;
    }
    BiResourceWorkgrpPK castOther = (BiResourceWorkgrpPK)other;
    return 
      (this.biResourceId == castOther.biResourceId && 
      this.biWorkgrp.equals(castOther.biWorkgrp));
  }
  
  public int hashCode() {
    int prime = 31;
    int hash = 17;
    hash = hash * 31 + (int)(this.biResourceId ^ this.biResourceId >>> 32);
    return hash * 31 + this.biWorkgrp.hashCode();
  }
}
