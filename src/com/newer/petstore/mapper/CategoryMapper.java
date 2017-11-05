package com.newer.petstore.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.newer.petstore.domain.Category;

/**
 * 产品分类的数据操作
 * @author hzqhzqhzq
 *
 */
public interface CategoryMapper {
	@Select("select * from category") 
	List<Category> findAll();
}
