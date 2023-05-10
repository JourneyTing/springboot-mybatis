package com.example.arammy.vo;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardVo {
	private int rownum;
	private int boardId;
	private String title;
	private String contents;
	private String id;
	private Date writeDate;
}
