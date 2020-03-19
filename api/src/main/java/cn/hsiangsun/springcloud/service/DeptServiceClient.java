package cn.hsiangsun.springcloud.service;



import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cn.hsiangsun.springcloud.entity.Dept;

//@FeignClient(value ="MICROSERVICE-CLOUD-DEPT",fallbackFactory = DeptServiceClientFallBackFactory.class)
@FeignClient(name="MICROSERVICE-CLOUD-DEPT",fallbackFactory = DeptServiceClientFallBackFactory.class)
public interface DeptServiceClient {
	
	@GetMapping("/api/dept/all")
	public List<Dept> findAll();
	
	@GetMapping("/api/dept/one/{id}")
	public Dept findById(@PathVariable("id") Long id);

}
