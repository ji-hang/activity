package com.example.demo;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.mapper.DemoMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivityApplicationTests {
	
	@Autowired
	private DemoMapper demoMapper;

	@Test
	public void contextLoads() {
		List<Map<String, Object>> list = demoMapper.query();
		System.out.println(list);
	}

}
