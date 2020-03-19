package cn.hsiangsun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker //开启hystrix支持
public class DeptProviderHystrix_8002 {
	
	public static void main(String[] args) {
		SpringApplication.run(DeptProviderHystrix_8002.class, args); 
	}

}
