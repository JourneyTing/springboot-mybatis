package com.example.arammy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.arammy.vo.UserVo;

@Mapper
@Repository
public interface UserMapper {
//	List<UserVo> login();
	
	public Integer login(UserVo id);
}
