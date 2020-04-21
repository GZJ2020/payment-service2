package cn.sz.gz.service;

import java.util.List;

import cn.sz.gz.pojo.Credit;


public interface ICreditDAOService {
	
	public List<Credit> lookcredit(Integer suid);
	
	public void addcredit(Credit credit);
	
}
