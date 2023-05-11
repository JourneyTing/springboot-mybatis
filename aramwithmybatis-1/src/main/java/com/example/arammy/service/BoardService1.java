package com.example.arammy.service;

import java.util.ArrayList;

import com.example.arammy.vo.ArticlePage;
import com.example.arammy.vo.BoardVo1;
import com.example.arammy.vo.Criteria1;

public interface BoardService1 {
	public ArrayList<BoardVo1> boardList (int pageNum);
	
	public int boardListCnt();
	
	public ArrayList<BoardVo1> boardList(ArticlePage articlePage);
}
