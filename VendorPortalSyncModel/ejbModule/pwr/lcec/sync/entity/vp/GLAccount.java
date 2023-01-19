package pwr.lcec.sync.entity.vp;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "GLAccount.findAll", query = "SELECT g FROM GLAccount g"),
		@NamedQuery(name = "GLAccount.findGLAccount", query = "SELECT g FROM GLAccount g WHERE g.GL_Account = :account") })
public class GLAccount implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int GLAccountId;
	private BigDecimal GL_Account;
	private BigDecimal GL_Activity;
	private BigDecimal GL_Department;
	private String GL_Description;

	public int getGLAccountId() {
		return this.GLAccountId;
	}

	public void setGLAccountId(int GLAccountId) {
		this.GLAccountId = GLAccountId;
	}

	public BigDecimal getGL_Account() {
		return this.GL_Account;
	}

	public void setGL_Account(BigDecimal GL_Account) {
		this.GL_Account = GL_Account;
	}

	public BigDecimal getGL_Activity() {
		return this.GL_Activity;
	}

	public void setGL_Activity(BigDecimal GL_Activity) {
		this.GL_Activity = GL_Activity;
	}

	public BigDecimal getGL_Department() {
		return this.GL_Department;
	}

	public void setGL_Department(BigDecimal GL_Department) {
		this.GL_Department = GL_Department;
	}

	public String getGL_Description() {
		return this.GL_Description;
	}

	public void setGL_Description(String GL_Description) {
		this.GL_Description = GL_Description;
	}
}
