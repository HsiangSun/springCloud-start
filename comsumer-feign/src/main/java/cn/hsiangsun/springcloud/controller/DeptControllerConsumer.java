package cn.hsiangsun.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cn.hsiangsun.springcloud.entity.Dept;
import cn.hsiangsun.springcloud.service.DeptServiceClient;

@RestController
public class DeptControllerConsumer {
	
	@Autowired
	private DeptServiceClient service;
	
	@GetMapping("/consumer/dept/all")
	public List<Dept> all() {
		return service.findAll();
	}
	
	@GetMapping("/consumer/dept/{id}")
	public Dept getOne(@PathVariable("id") Long id) {
		return service.findById(id);
	}
		

}
