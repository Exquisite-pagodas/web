package com.mrli.dao.user;

import com.mrli.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface userMapper {
	int getUser(@Param("userName") String userName,@Param("userPassword") String userPassword);

	//查询单个用户的所有信息
	List<User> getUserList(@Param("id") Integer id);
}
