package cn.hsiangsun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients 
public class DeptComsumerFign_8080 {
	public static void main(String[] args) {
		SpringApplication.run(DeptComsumerFign_8080.class, args);
	}

}
