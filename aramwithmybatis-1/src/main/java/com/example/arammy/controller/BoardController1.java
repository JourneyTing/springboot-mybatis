package com.example.arammy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.arammy.service.BoardService1;
import com.example.arammy.vo.ArticlePage;
import com.example.arammy.vo.BoardVo1;
import com.example.arammy.vo.Criteria1;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
public class BoardController1 {
	
	@Autowired
	private BoardService1 boardService;
	
	public String list(Model model, @RequestParam(defaultValue="1") int pageNum) {
		List<BoardVo1> list = boardService.boardList(pageNum);
		log.info("list : " + list);
		log.info("list.size() : " + list.size());

		int total = boardService.boardListCnt();
		log.info("total : " + total);
		
		ArticlePage firstList = new ArticlePage(total, 1, 10, 10, list);
		
		/* board 게시물 내용  */
		model.addAttribute("boardList", boardService.boardList(firstList));
		
		/* paging tag 값 계산 */ 
		model.addAttribute("list", firstList);
		
		return "/index";
	}
	
	/* 페이징에 따라 다시 검색 및 페이지 리스트 구현 해주는 controller 구현부  */
	public String boardListPaging(Model model, @RequestParam(defaultValue="1") int pageNum) {
		List<BoardVo1> list = boardService.boardList(pageNum);
		log.info("list.size() : " + list.size());
	
		int total = boardService.boardListCnt();
		log.info("total : " + total);
		ArticlePage firstList = new ArticlePage(total, 1, 10, 10, list);
		model.addAttribute("boardList", boardService.boardList(firstList));
		model.addAttribute("list", new ArticlePage(total, pageNum, 10, 10, list));
		
		return "/common";
		
	}
	
}
