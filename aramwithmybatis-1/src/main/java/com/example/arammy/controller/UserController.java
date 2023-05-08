package com.example.arammy.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.arammy.service.UserService;
import com.example.arammy.vo.UserVo;

@Controller
@RequestMapping(value = "/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
//	@GetMapping ("/")
//	public String login() throws Exception {
//		return "user/login";
//	}
	
	@ResponseBody
	@PostMapping("/user/login") 
	public int login(@RequestBody UserVo user) throws Exception{
		System.out.println("UserApiController : login 호출됨");
		int result = userService.login(user);
		
		return result;
	}

	
}
