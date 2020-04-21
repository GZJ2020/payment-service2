package cn.sz.gz.MyController;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import cn.sz.gz.pojo.Credit;
import cn.sz.gz.pojo.Student;
import cn.sz.gz.service.ICreditDAOService;
import cn.sz.gz.util.Studentclient;


@Controller
@RequestMapping("/cd")
public class MyController {
	
	@Autowired
	private ICreditDAOService creditService;
	
	@Autowired
	private Studentclient studentclient;
	
	
	@RequestMapping(value="look/{suid}",method=RequestMethod.GET)
	public String Lookcredit(@PathVariable Integer suid,HttpServletRequest request) {
		System.out.println("这里是lookcredit");
		List<Credit> lookcredit = creditService.lookcredit(suid);
		request.setAttribute("look", lookcredit);
		return "lookcredit";
	}
	
	
	@RequestMapping(value="addcredit/{suid}",method=RequestMethod.GET)
	public String AddPageredit(@PathVariable Integer suid,HttpServletRequest request) {
		request.setAttribute("stuid", suid);
		return "addcredit";
	}
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String AddStudent(Credit credit) {
		System.out.println("这里是addcredit..");
		
		Integer score = studentclient.findbyidscore(credit.getSuid());
		if(score>=credit.getPscore()) {
			creditService.addcredit(credit);
			
			Student stu = new Student();
			stu.setStugrade(credit.getPscore());
			stu.setStuid(credit.getSuid());
			studentclient.UpdateStudent(stu);
			
			return "redirect:http://192.168.155.1:9002/st/findall";
		}
		return "notenoughscore";
		
	}
	
}
