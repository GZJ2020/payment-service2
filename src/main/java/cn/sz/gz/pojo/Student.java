package cn.sz.gz.pojo;

import java.io.Serializable;

public class Student implements Serializable {
	private Integer stuid;//主键
	private Integer stunumber;//学号
	private String stuname;//学生姓名
	private String stusex;//性别
	private Integer stuage; //年龄
	private String stuclass;//班级
	private Integer stugrade;//剩余分数
	public Integer getStuid() {
		return stuid;
	}
	public void setStuid(Integer stuid) {
		this.stuid = stuid;
	}
	public Integer getStunumber() {
		return stunumber;
	}
	public void setStunumber(Integer stunumber) {
		this.stunumber = stunumber;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getStusex() {
		return stusex;
	}
	public void setStusex(String stusex) {
		this.stusex = stusex;
	}
	public Integer getStuage() {
		return stuage;
	}
	public void setStuage(Integer stuage) {
		this.stuage = stuage;
	}
	public String getStuclass() {
		return stuclass;
	}
	public void setStuclass(String stuclass) {
		this.stuclass = stuclass;
	}
	public Integer getStugrade() {
		return stugrade;
	}
	public void setStugrade(Integer stugrade) {
		this.stugrade = stugrade;
	}
	
	
	
}

