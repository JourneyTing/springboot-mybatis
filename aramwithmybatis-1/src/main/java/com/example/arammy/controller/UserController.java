package com.example.arammy.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.arammy.service.UserService;
import com.example.arammy.vo.UserVo;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
@RequestMapping(value = "/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping ("/")
	public String login(HttpSession session) throws Exception {
		return "user/login";
	}
	
	@ResponseBody
	@PostMapping("/user/login") 
	public int login(@RequestBody UserVo user, HttpSession session) throws Exception{
		System.out.println("UserApiController : login 호출됨");
		int result = userService.login(user);
		String id = user.getId();
		
		session.setAttribute("id", id);
		
		log.info("id : " + id);
		
		return result;
	}
	
	// 회원가입 페이지로 이동
	@GetMapping("/join")
	public String joinForm() throws Exception {
		return "user/join";
	}
	
	// 아이디 중복 체크
	@ResponseBody
	@RequestMapping ("/user/join/idChk")
	public int idChk(@RequestBody UserVo user) throws Exception {
		int result = userService.checkUserId(user);
		
		return result;
	}
	
	// 닉네임 중복 체크
	@ResponseBody
	@RequestMapping("/user/join/nameChk")
	public int nameChk(@RequestBody UserVo user) throws Exception {
		int result = userService.checkUserName(user);
		
		return result;
	}
	
	// 회원가입
	@ResponseBody
	@PostMapping("/user/join")
	public int join (@RequestBody UserVo user) throws Exception {
		log.info("회원가입폼에서 입력받은 데이터: {}", user);
		int result = userService.saveInfo(user);
		
		return result;
	}
	
	@RequestMapping("/myInfo")
	public String myInfo(Model model, HttpSession session, UserVo user) throws Exception {
		String id = (String) session.getAttribute("id");
		
		UserVo userVo = new UserVo();
		userVo = userService.myInfo(id); 
		
		model.addAttribute("info", userVo);
		
		return "user/myInfo";
	}
	
}
