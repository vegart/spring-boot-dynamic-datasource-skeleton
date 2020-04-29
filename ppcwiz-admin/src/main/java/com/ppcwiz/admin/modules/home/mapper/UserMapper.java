package com.ppcwiz.admin.modules.home.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ppcwiz.admin.modules.home.domain.UserVO;

@Mapper
@Repository
public interface UserMapper {
	ArrayList<UserVO> list();
}
