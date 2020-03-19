package cn.hsiangsun.springcloud.service;

import java.util.List;

import cn.hsiangsun.springcloud.entity.Dept;

public interface DeptService {
	
	public boolean add(Dept dept);
	
	public Dept get(Long id);
	
	public List<Dept> list();

}
