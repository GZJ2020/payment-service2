package cn.sz.gz.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sz.gz.dao.ICreditDAO;
import cn.sz.gz.pojo.Credit;
import cn.sz.gz.service.ICreditDAOService;

@Service
public class ICreditServiceimplo implements ICreditDAOService {
	
	@Autowired
	private ICreditDAO TcreditDAO;

	@Override
	public List<Credit> lookcredit(Integer suid) {
		
		return TcreditDAO.lookcredit(suid);
	}

	@Override
	public void addcredit(Credit credit) {
		TcreditDAO.addcredit(credit);
	}
	
	

}
