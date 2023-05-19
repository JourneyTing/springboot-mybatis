package com.example.arammy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.arammy.vo.UserVo;

@Mapper
public interface UserMapper {
	public UserVo checkUserId(String id) throws Exception;
	public UserVo checkUserPassword(UserVo user) throws Exception ;
	
	public UserVo selectUser(String id) throws Exception;
	
	public UserVo checkUserName(String name) throws Exception;
	
	public int saveInfo(UserVo userVo) throws Exception;
}
