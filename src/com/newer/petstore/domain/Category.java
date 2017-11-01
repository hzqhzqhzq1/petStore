package com.newer.petstore.domain;

import java.util.LinkedList;
import java.util.List;

/**
 * 分类（名称、很多商品）
 * 
 * @author hzqhzqhzq
 *
 */
public class Category extends BaseEntity {
	// 分类的名称
	private String title;

	// 该分类下的所有商品
	private List<Product> productList = new LinkedList<Product>();

	public Category() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	/**
	 * 在分类中添加商品
	 */
	public void addProduct(Product pro) {
		productList.add(pro);
	}
}
