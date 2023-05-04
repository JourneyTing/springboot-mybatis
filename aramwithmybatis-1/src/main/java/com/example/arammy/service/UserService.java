package com.example.arammy.service;


import org.springframework.stereotype.Service;

import com.example.arammy.vo.UserVo;

public interface UserService {
	public int login(UserVo user) throws Exception;
	
}
