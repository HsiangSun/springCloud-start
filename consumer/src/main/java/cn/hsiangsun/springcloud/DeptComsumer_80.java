package cn.hsiangsun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import cn.hsiangsun.rule.FiveChance;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="MICROSERVICE-CLOUD-DEPT",configuration = FiveChance.class) //使用自定义ribbon负载均衡算法
public class DeptComsumer_80 {
	public static void main(String[] args) {
		SpringApplication.run(DeptComsumer_80.class, args);
	}

}
