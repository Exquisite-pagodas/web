package com.mrli.test;

import com.mrli.entity.User;
import com.mrli.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.mrli.dao.user.userMapper;

import java.util.List;

public class allTest {

	@Test
	public void userLogin(){
		SqlSession sqlSession = null;
		try {
			sqlSession = MybatisUtil.createSqlSession();
			int a = sqlSession.getMapper(userMapper.class).getUser("kevin","root123");
			System.out.println(a == 0? "失败" : "成功");
			System.out.println(a);
		} finally {
			MybatisUtil.closeSession(sqlSession);
		}

	}


	@Test
	public void getOneUser(){
		SqlSession sqlSession = null;
		try {
			sqlSession = MybatisUtil.createSqlSession();
			List<User> users = sqlSession.getMapper(userMapper.class).getUserList(1);
			for (User user : users) {
				System.out.println(user.toString());
			}
		} finally {
			MybatisUtil.closeSession(sqlSession);
		}

	}
}
