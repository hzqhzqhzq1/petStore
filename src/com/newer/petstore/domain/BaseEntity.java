package com.newer.petstore.domain;

import java.io.Serializable;

/**
 * 所有实体类的基类
 * @author hzqhzqhzq
 *
 */
public abstract class BaseEntity implements Serializable{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
