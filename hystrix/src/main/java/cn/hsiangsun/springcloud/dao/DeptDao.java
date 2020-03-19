package cn.hsiangsun.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.hsiangsun.springcloud.entity.Dept;

@Mapper
public interface DeptDao {
	
	public void addDept(Dept dept);
	
	public Dept findById(Long id);
	
	public List<Dept> findAll();

}
