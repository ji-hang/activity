package com.example.demo.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.mapper.DemoMapper;
import com.example.demo.service.DemoService;

@Service
@Transactional
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoMapper demoMapper;
	
	public void query() {
		List<Map<String, Object>> list = demoMapper.query();
		System.out.println(list);
	}
}
