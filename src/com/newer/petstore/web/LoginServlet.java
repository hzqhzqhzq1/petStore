package com.newer.petstore.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSessionFactory;

import com.newer.petstore.AppInfo;
import com.newer.petstore.mapper.AccountMapper;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String aName = request.getParameter("name");
		String aPassword = request.getParameter("pw");
		
		SqlSessionFactory factory = (SqlSessionFactory) getServletContext().getAttribute(AppInfo.APP_SESSION_FACTORY);
		AccountMapper accountMapper = factory.openSession().getMapper(AccountMapper.class);
		String pw = accountMapper.login(aName);
		if(!pw.equals(null)&&pw.equals(aPassword)) {
			System.out.println("登陆成功");
		}else {
			System.out.println("登陆失败");
		}
		response.getWriter().write("hello");
		
	}

}
