package cn.hsiangsun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //启动eureka服务器
public class EurekaServer_10010 {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer_10010.class, args);
	}

}
