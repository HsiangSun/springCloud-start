package cn.hsiangsun.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean { 
	
	@Bean
	@LoadBalanced //开启ribbon负载均衡
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	
	/**
	 * 显示的指明负载论衡算法
	 * @return
	 */
	/*
	 * @Bean public IRule ribbonRule() { return new RandomRule(); }
	 */

}
