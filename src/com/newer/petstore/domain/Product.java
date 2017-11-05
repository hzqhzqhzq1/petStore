package com.newer.petstore.domain;

import java.math.BigDecimal;

/**
 * 商品
 * 
 * @author hzqhzqhzq
 *
 */
public class Product {
	private int id;
	// 商品名称
	private String title;

	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", price=" + price + ", info=" + info + ", quantity="
				+ quantity + ", sales=" + sales + ", pic=" + pic + "]";
	}

	// 价格
	private BigDecimal price;

	// 描述信息
	private String info;

	// 库存
	private int quantity;

	// 销量
	private int sales;

	// 图片路径
	private String pic;

	// 类别
	private Category category;

	public Product() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}