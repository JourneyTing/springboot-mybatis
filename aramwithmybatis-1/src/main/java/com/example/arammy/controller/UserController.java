package com.example.arammy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.arammy.service.UserService;
import com.example.arammy.vo.UserVo;

@Controller
@RequestMapping(value = "/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping ("/")
	public String login() throws Exception {
		return "user/login";
	}
	
	
	@GetMapping("/main")
	public String main(UserVo user) throws Exception {
		Integer loginUser = userService.login(user);
		
		System.out.println("loginUser : " + loginUser);
		return "index";
	}
}
