package com.newer.petstore.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.newer.petstore.domain.Category;
import com.newer.petstore.domain.Product;

/**
 * 产品分类的数据操作
 * @author hzqhzqhzq
 *
 */
public interface CategoryMapper {
	@Select("select * from category") 
	List<Category> findAll();
	
	/**
	 * 获得特定分类的商品列表
	 * @param 分类的名称
	 * @return 分类下的所有产品
	 */
	@Select("select * from products where category_id="
			+ "(select id from category where title='#{title}'")
	List<Product> getProductByCategory(String t);
}
