package cn.hsiangsun.rule;

import java.util.List;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;


/**
 * 轮洵算法但是每5次轮换一次
 * @author hoho
 *
 */
public class FiveChance extends AbstractLoadBalancerRule{
	
	private int used = 0;//当前server被调用次数
	private int index = 0;//当前服务器索引
	
    public Server choose(ILoadBalancer lb, Object key) {
    	if (lb == null) {
    		return null;
    	}
    	
    	Server server = null;
    	while (server == null) {
    		if(Thread.interrupted()) {//线程被打断
    			return null;
    		}
    		
    		List<Server> liveList = lb.getReachableServers();
    		List<Server> allList = lb.getAllServers();
    		
    		int ServerCount = allList.size();
    		if(ServerCount == 0) return null;
    		
    		if (used < 5) {
    			server = liveList.get(index);
    			used ++;
    		}else {
    			used = 0;
    			index ++;
    		}
    		
    		if(!(index < liveList.size())) {
    			index = 0;
    		}
    		
    		if(server == null) {
    			Thread.yield();
    			continue;
    		}
    	}
    	
		return server;
		
	}

	@Override
	public Server choose(Object key) {
		return choose(getLoadBalancer(), key);
	}

	@Override
	public void initWithNiwsConfig(IClientConfig clientConfig) {
		// TODO Auto-generated method stub
	}

}
