package cn.sz.gz.dao;

import java.util.List;

import cn.sz.gz.pojo.Credit;

public interface ICreditDAO {
	
	public List<Credit> lookcredit(Integer suid);
	
	
	public void addcredit(Credit credit);
	
}
