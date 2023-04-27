package com.example.arammy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.arammy.service.TestService;
import com.example.arammy.vo.TestVo;

@RestController
@RequestMapping(value = "/")
public class TestController {

	@Autowired
	TestService testService;
		
	@RequestMapping(value = "/")
	public ModelAndView test() throws Exception{
		ModelAndView mav = new ModelAndView("login");
		
		String testList = testService.selectTest();
		mav.addObject("list", testList);
	
		System.out.println("mav :" + mav);
		
		return mav;
	}
}
