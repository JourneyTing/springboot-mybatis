package com.example.arammy.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardVo {
	private int rownum;
	private int boardId;
	private String title;
	private String contents;
	private String writer;
	private Date writeDate;
}
