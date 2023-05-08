package com.example.arammy.service;

import java.util.ArrayList;

import com.example.arammy.vo.BoardVo;
import com.example.arammy.vo.PagingVo;

public interface BoardService {
	public ArrayList<BoardVo> boardList ();
	
	public void register(BoardVo baordVo);
	
	public BoardVo get(int boardId);
	
	public boolean modify(BoardVo boardVo);
	
	public boolean remove (int boardId);
	
	public ArrayList<BoardVo> boardList(PagingVo pagingVo);
}
