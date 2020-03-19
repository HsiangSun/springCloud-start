package cn.hsiangsun.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import cn.hsiangsun.springcloud.entity.Dept;
import feign.hystrix.FallbackFactory;

/**
 * 服务降级(当服务器宕机后会返回一些默认内容)
 * @author hoho
 *
 */
@Component
public class DeptServiceClientFallBackFactory implements FallbackFactory<DeptServiceClient> {

	@Override
	public DeptServiceClient create(Throwable cause) {
		return new DeptServiceClient() {
			@Override
			public Dept findById(Long id) {
				Dept result = new Dept();
				result.setId(0L);
				result.setDbName(null);
				result.setName("Not dound id"+id);
				return result;
			}
			@Override
			public List<Dept> findAll() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
}
	
	

