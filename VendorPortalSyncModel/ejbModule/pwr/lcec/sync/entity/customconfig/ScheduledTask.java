package pwr.lcec.sync.entity.customconfig;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = "ScheduledTask.findAll", query = "SELECT s FROM ScheduledTask s WHERE s.application = :application"),
	@NamedQuery(name = "ScheduledTask.findScheduleByJob", query = "SELECT s FROM ScheduledTask s WHERE s.application = :application AND s.job = :job") })
public class ScheduledTask implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ScheduledTaskId")
	private int scheduledTaskId;
	
	@Column(name = "Application")
	private String application;
	
	@Column(name = "DayOfMonth")
	private String dayOfMonth;
	
	@Column(name = "DayOfWeek")
	private String dayOfWeek;
	
	@Column(name = "EndDt")
	private Timestamp endDt;
	
	@Column(name = "Hour")
	private String hour;
	
	@Column(name = "Job")
	private String job;
	
	@Column(name = "Minute")
	private String minute;
	
	@Column(name = "Month")
	private String month;
	
	@Column(name = "Second")
	private String second;
	
	@Column(name = "StartDt")
	private Timestamp startDt;
	
	@Column(name = "Year")
	private String year;

	public int getScheduledTaskId() {
		return this.scheduledTaskId;
	}

	public void setScheduledTaskId(int scheduledTaskId) {
		this.scheduledTaskId = scheduledTaskId;
	}

	public String getApplication() {
		return this.application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getDayOfMonth() {
		return this.dayOfMonth;
	}

	public void setDayOfMonth(String dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}

	public String getDayOfWeek() {
		return this.dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public Timestamp getEndDt() {
		return this.endDt;
	}

	public void setEndDt(Timestamp endDt) {
		this.endDt = endDt;
	}

	public String getHour() {
		return this.hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMinute() {
		return this.minute;
	}

	public void setMinute(String minute) {
		this.minute = minute;
	}

	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getSecond() {
		return this.second;
	}

	public void setSecond(String second) {
		this.second = second;
	}

	public Timestamp getStartDt() {
		return this.startDt;
	}

	public void setStartDt(Timestamp startDt) {
		this.startDt = startDt;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}
}
