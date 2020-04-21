package cn.sz.gz.pojo;

import java.io.Serializable;

import java.sql.Date;

public class Credit implements Serializable {

	private Integer pid;//主键
	private Integer pscore;//扣分值
	private String preason;//扣分原因
	private Date  ptime;//扣分时间
	private Integer  suid;//学生主键
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getPscore() {
		return pscore;
	}
	public void setPscore(Integer pscore) {
		this.pscore = pscore;
	}
	public String getPreason() {
		return preason;
	}
	public void setPreason(String preason) {
		this.preason = preason;
	}
	public Date getPtime() {
		return ptime;
	}
	public void setPtime(Date ptime) {
		this.ptime = ptime;
	}
	public Integer getSuid() {
		return suid;
	}
	public void setSuid(Integer suid) {
		this.suid = suid;
	}
	
	
}
