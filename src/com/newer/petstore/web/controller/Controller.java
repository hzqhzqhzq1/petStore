package com.newer.petstore.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 定义控制器接口
 * @author hzqhzqhzq
 *
 */
public interface Controller {
	/**
	 * 控制器的执行
	 * 
	 * @param requeset
	 * @param response
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	String execute(
				HttpServletRequest request,
				HttpServletResponse response
			)	throws ServletException,IOException;
}
