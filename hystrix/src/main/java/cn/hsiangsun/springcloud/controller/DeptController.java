package cn.hsiangsun.springcloud.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;

import cn.hsiangsun.springcloud.entity.Dept;
import cn.hsiangsun.springcloud.service.DeptService;

@RestController
@RequestMapping("/api/dept")
public class DeptController {
	
	@Resource
	private DeptService service;
	
	@PostMapping("/add")
	public void add(Dept dept) {
		service.add(dept);
	}
	
	@GetMapping("/all")
	@HystrixCommand
	public List<Dept> findAll(){
		return service.list();
	}
	
	@GetMapping("/one/{id}")
	@HystrixCommand
	//@HystrixCommand(fallbackMethod="HystrixProtectGet")//服务熔断
	public Dept get(@PathVariable("id") Long id) {
		
		Dept result = this.service.get(id);
		if(result == null) {
			throw new RuntimeException("id错误");
		}
		return result;	
		
	}
	
	/*
	 * @SuppressWarnings("unused") private Dept
	 * HystrixProtectGet(@PathVariable("id") Long id) { return new
	 * Dept().setDbName("当前ID"+id+"没有获取到").setDbName("No db").setId(0L); }
	 */

}
