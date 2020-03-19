package cn.hsiangsun.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import cn.hsiangsun.springcloud.entity.Dept;
import cn.hsiangsun.springcloud.service.DeptService;

@RestController
@RequestMapping("/api/dept")
public class DeptController {
	
	@Autowired
	private DeptService service;
	
	@PostMapping("/add")
	public void add(Dept dept) {
		service.add(dept);
	}
	
	@GetMapping("/all")
	public List<Dept> findAll(){
		return service.list();
	}
	
	@GetMapping("/one/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return service.get(id);
	}

}
