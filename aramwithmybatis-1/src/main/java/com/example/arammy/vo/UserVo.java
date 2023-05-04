package com.example.arammy.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class UserVo {
	private int index;
	private int num;
	private String id;
	private String password;
	private String name;
	private String email;
	private Date updateDate;
	private Date cretaeDate;
	private int loginFlag;
	
	private int result;
}
