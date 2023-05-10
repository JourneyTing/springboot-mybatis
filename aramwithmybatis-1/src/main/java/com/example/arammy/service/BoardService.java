package com.example.arammy.service;

import java.util.ArrayList;

import com.example.arammy.vo.ArticlePage;
import com.example.arammy.vo.BoardVo;
import com.example.arammy.vo.Criteria;

public interface BoardService {
	public ArrayList<BoardVo> boardList (int pageNum);
	
	public int boardListCnt();
	
	public ArrayList<BoardVo> boardList(ArticlePage articlePage);
}
