package cn.sz.gz.util;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cn.sz.gz.pojo.Student;



@FeignClient(value="StudentServer")
public interface Studentclient {
	
	
	@PostMapping(value="/st/student/stuupdate")
	public void UpdateStudent(@RequestBody Student stu);
	
	@GetMapping(value="/st/student/byidscore/{stuid}")
	public Integer findbyidscore(@PathVariable("stuid") Integer stuid);
	
}
