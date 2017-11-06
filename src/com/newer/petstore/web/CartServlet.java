package com.newer.petstore.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newer.petstore.AppInfo;
import com.newer.petstore.domain.Cart;
import com.newer.petstore.domain.Product;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/cart")
public class CartServlet extends HttpServlet {

	// 每次【加入购物车】操作 HTTP GET 请求 携带一个查询参数 id
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		// HTTP的参数是文本格式（字符串）
		String idValue = request.getParameter("id");
		int id = Integer.parseInt(idValue);

		List<Product> list = (List<Product>) getServletContext().getAttribute(AppInfo.APP_PRPDUCT_LIST);
		Product product = null;
		for (Product p : list) {
			if (p.getId() == id) {	
				product = p;
			}
		}

		// 加入购物车
		Cart cart = (Cart) request.getSession().getAttribute(AppInfo.SESSION_CART);
		cart.addCart(product);

		// 响应重定向
		response.sendRedirect("cart.jsp");
		System.out.println("购物车");
	}

}
