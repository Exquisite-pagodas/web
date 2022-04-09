package com.mrli.servlet;

import com.mrli.dao.user.userMapper;
import com.mrli.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/HolleWorldServlet")
public class HelloWorldServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String code = request.getParameter("action");


		if (code.equals("login")){
			String userName =  request.getParameter("userName");
			String userPassword = request.getParameter("userPassword");
			int a = 0;
			SqlSession sqlSession = null;
			try {
				sqlSession = MybatisUtil.createSqlSession();
				a = sqlSession.getMapper(userMapper.class).getUser(userName,userPassword);
				MybatisUtil.closeSession(sqlSession);
				System.out.printf("用户"+userName+"登录");
				System.out.println(a == 0? "失败" : "成功");
			} catch (Exception e) {
				e.printStackTrace();
			}


			if (a>0){

				request.getRequestDispatcher("./main.jsp").forward(request,response);

			}else{

				request.getRequestDispatcher("./index.jsp").forward(request,response);

			}

		}

	}
}
