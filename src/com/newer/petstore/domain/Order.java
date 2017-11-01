package com.newer.petstore.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.newer.petstore.domain.Account.Adress;

/**
 * 订单
 * 
 * @author hzqhzqhzq
 *
 */
public class Order {
	
//	编号
	private int id;
	
//	时间
	private Date time;
	
//	账号
	private Account account;
	
//	送货地址(如果为空，则使用账号的默认地址)
	private Adress address;
	
//	订单项
	private  List<Item> items = new ArrayList<Item>();
	
//	总价
	private BigDecimal total;
	
	public Order() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Adress getAddress() {
		return address;
	}

	public void setAddress(Adress address) {
		this.address = address;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	
	
}
