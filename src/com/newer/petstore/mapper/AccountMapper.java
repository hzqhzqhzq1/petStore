package com.newer.petstore.mapper;

import org.apache.ibatis.annotations.Select;

public interface AccountMapper {
	/**
	 * 登陆
	 * @param name
	 * @return	password or null
	 */
	@Select("select password from accounts where name=#{name}")
	String login(String name); 
}
