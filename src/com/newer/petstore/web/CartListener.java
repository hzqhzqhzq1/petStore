package com.newer.petstore.web;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.newer.petstore.AppInfo;
import com.newer.petstore.domain.Cart;

/**
 * Application Lifecycle Listener implementation class CartListener
 *
 */
@WebListener
public class CartListener implements HttpSessionListener {
	int counter;
	/**
	 * 创建新的会话（调用多次）
	 * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
	 */
	public void sessionCreated(HttpSessionEvent e) {
		counter++;
//		 创建会话的时候、创建一个购物车,给每一个会话都分配
		Cart cart = new Cart();
		e.getSession().setAttribute(AppInfo.SESSION_CART, cart);
		
		System.out.println("会话ID："+e.getSession().getId());
		
		e.getSession().getServletContext().setAttribute("ONLINE", counter);
	}

	/**
	 * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
	 */
	public void sessionDestroyed(HttpSessionEvent e) {
		counter--;
		
		
		System.out.println("会话销毁："+e.getSession().getId());
		ServletContext application  = e.getSession().getServletContext();
		application.setAttribute("ONLINE", counter);
	}
	

}
