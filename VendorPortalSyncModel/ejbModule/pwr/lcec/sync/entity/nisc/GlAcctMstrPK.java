package pwr.lcec.sync.entity.nisc;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;









@Embeddable
public class GlAcctMstrPK
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Column(name = "GL_ACCT_SUB_NBR")
  private BigDecimal glAcctSubNbr;
  @Column(name = "GL_DIV_NBR")
  private long glDivNbr;
  
  public BigDecimal getGlAcctSubNbr() { return this.glAcctSubNbr; }

  
  public void setGlAcctSubNbr(BigDecimal glAcctSubNbr) { this.glAcctSubNbr = glAcctSubNbr; }

  
  public long getGlDivNbr() { return this.glDivNbr; }

  
  public void setGlDivNbr(long glDivNbr) { this.glDivNbr = glDivNbr; }

  
  public int hashCode() {
    int prime = 31;
    int result = 1;
    result = 31 * result + ((this.glAcctSubNbr == null) ? 0 : this.glAcctSubNbr.hashCode());
    return 31 * result + (int)(this.glDivNbr ^ this.glDivNbr >>> 32);
  }

  
  public boolean equals(Object obj) {
    if (this == obj)
      return true; 
    if (obj == null)
      return false; 
    if (getClass() != obj.getClass())
      return false; 
    GlAcctMstrPK other = (GlAcctMstrPK)obj;
    if (this.glAcctSubNbr == null) {
      if (other.glAcctSubNbr != null)
        return false; 
    } else if (!this.glAcctSubNbr.equals(other.glAcctSubNbr)) {
      return false;
    }  if (this.glDivNbr != other.glDivNbr)
      return false; 
    return true;
  }
}
