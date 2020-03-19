package cn.hsiangsun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboard {
	
	/**
	 * 
	 * 微服务只有在添加了【spring-boot-starter-actuator】的情况下才能被监控
	 */
	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboard.class, args);
	}

}
