package com.newer.petstore.domain;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Set;

/**
 * 购物车
 * 
 * @author hzqhzqhzq
 *
 */
public class Cart {
	// 关系型数据库主键
	private int id;

	// 隶属账号
	private Account account;

	// 商品、 数量、
	HashMap<Product, Integer> map = new HashMap<Product, Integer>();

	private BigDecimal total;
	public Cart() {

	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public HashMap<Product, Integer> getMap() {
		return map;
	}

	public void setMap(HashMap<Product, Integer> map) {
		this.map = map;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 购物车总金额
	 * @return total
	 */
	public BigDecimal getTotal() {
		Set<Product> keys = map.keySet();
		for(Product p: keys) {
			int  n = map.get(p);
			total = total.add(
					p.getPrice().multiply(BigDecimal.valueOf(n)));
		}
		
		return total;
	}

}
