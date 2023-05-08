package com.example.arammy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.arammy.service.BoardService;
import com.example.arammy.vo.PagingVo;

@Controller
@RequestMapping(value = "/")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping({"/","main"})
	public String boardList(PagingVo pagingVo, Model model) throws Exception {
		
		model.addAttribute("boardList", boardService.boardList(pagingVo));
		
		return "/index";
	}
	
	
	
}
