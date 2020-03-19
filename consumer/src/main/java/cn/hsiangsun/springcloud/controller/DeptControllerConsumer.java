package cn.hsiangsun.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cn.hsiangsun.springcloud.entity.Dept;
import java.util.*;

@RestController
public class DeptControllerConsumer {
	
	private static final String host = "http://MICROSERVICE-CLOUD-DEPT";
		
	@Autowired
	private RestTemplate http;
	
	@GetMapping("/consumer/dept/add")
	public boolean add(Dept dept) {
		return http.postForObject(host+"/api/dept/add", dept, Boolean.class);
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping("/consumer/dept/all")
	public List<Dept> all() {
		return http.getForObject(host+"/api/dept/all", List.class);
	}
	
	@GetMapping("/consumer/dept/{id}")
	public Dept getOne(@PathVariable("id") Long id) {
		return http.getForObject(host+"/api/dept/one/"+id, Dept.class);
	}
		

}
