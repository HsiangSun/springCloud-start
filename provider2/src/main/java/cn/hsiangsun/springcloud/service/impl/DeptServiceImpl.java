package cn.hsiangsun.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.hsiangsun.springcloud.dao.DeptDao;
import cn.hsiangsun.springcloud.entity.Dept;
import cn.hsiangsun.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {
		
	@Autowired
	private DeptDao dao;
	
	@Override
	public boolean add(Dept dept) {
		try {
			dao.addDept(dept);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Dept get(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Dept> list() {
		return dao.findAll();
	}

}
