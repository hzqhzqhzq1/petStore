package com.newer.petstore.web.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontContrllerServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	HashMap<String,Class> map = new HashMap<>();

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
//		设置URL与Controller的映射(使用注解？)
		map.put("/register.action",RegisterController.class);
		map.put("/login.action", LoginController.class);
		
		System.out.println(map);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		/petstore/user/login,action
		String url = req.getRequestURI();
		String urlName = url.substring(url.lastIndexOf("/"));
		
		Class controllerClass = map.get(urlName);
		if(controllerClass != null) {
			try {
//				使用反射创建该类型的实例：基于接口编程
				Controller controller = (Controller) controllerClass.newInstance();
//				调用执行
				String page = controller.execute(req, resp);
//				响应重定向
				resp.sendRedirect(page);
				
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
			
		}else {
			resp.sendRedirect("error/404.html");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}


	
	
	
}
