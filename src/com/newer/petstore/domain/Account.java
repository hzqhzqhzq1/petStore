package com.newer.petstore.domain;

import java.util.LinkedList;
import java.util.List;

/**
 * 账号
 * 
 * @author hzqhzqhzq
 *
 */
public class Account {
	
	
	/**
	 * 内部类 账号的地址(内聚)
	 * 
	 * @author hzqhzqhzq
	 *
	 */
	public static class Adress {
		String province;
		String city;
		String street;
		String name;
		String phone;
	}

	// ID
	private int id;
	// 用户名
	private String name;
	// 用户密码
	private String password;
	// 购物车
	private Cart cart;
	// 订单列表
	private List<Order> orderList = new LinkedList<Order>();
	// 地址
	private Adress adress;

	public Account() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}
}
