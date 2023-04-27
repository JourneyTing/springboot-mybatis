package com.example.arammy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.arammy.mapper.TestMapper;
import com.example.arammy.vo.TestVo;

@Service
public class TestService {

	@Autowired
	public TestMapper mapper;
	
	public String selectTest(){
		return mapper.selectTest();
	}
}
