package pwr.lcec.sync.entity.nisc;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;









@Embeddable
public class BiSoTypeFunctionRefPK
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Column(name = "BI_SO_TYPE_CD")
  private String biSoTypeCd;
  @Column(name = "BI_SO_FUNCTION_CD")
  private String biSoFunctionCd;
  @Column(name = "BI_TYPE_SRV_GRP")
  private String biTypeSrvGrp;
  
  public String getBiSoTypeCd() { return this.biSoTypeCd; }

  
  public void setBiSoTypeCd(String biSoTypeCd) { this.biSoTypeCd = biSoTypeCd; }

  
  public String getBiSoFunctionCd() { return this.biSoFunctionCd; }

  
  public void setBiSoFunctionCd(String biSoFunctionCd) { this.biSoFunctionCd = biSoFunctionCd; }

  
  public String getBiTypeSrvGrp() { return this.biTypeSrvGrp; }

  
  public void setBiTypeSrvGrp(String biTypeSrvGrp) { this.biTypeSrvGrp = biTypeSrvGrp; }

  
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (!(other instanceof BiSoTypeFunctionRefPK)) {
      return false;
    }
    BiSoTypeFunctionRefPK castOther = (BiSoTypeFunctionRefPK)other;
    return 
      (this.biSoTypeCd.equals(castOther.biSoTypeCd) && 
      this.biSoFunctionCd.equals(castOther.biSoFunctionCd) && 
      this.biTypeSrvGrp.equals(castOther.biTypeSrvGrp));
  }
  
  public int hashCode() {
    int prime = 31;
    int hash = 17;
    hash = hash * 31 + this.biSoTypeCd.hashCode();
    hash = hash * 31 + this.biSoFunctionCd.hashCode();
    return hash * 31 + this.biTypeSrvGrp.hashCode();
  }
}
