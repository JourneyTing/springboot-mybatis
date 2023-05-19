package com.example.arammy.service;

import com.example.arammy.vo.UserVo;

public interface UserService {
	public int login(UserVo user) throws Exception;
	
	public int checkUserId(UserVo user) throws Exception;
	
	public int checkUserName(UserVo user) throws Exception;
	
	public int saveInfo(UserVo user) throws Exception;
	
	public UserVo myInfo(String id) throws Exception;
}
