package com.newer.petstore.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.newer.petstore.domain.Product;

/**
 * 
 * @author hzqhzqhzq
 *
 */
public interface ProductMapper {
	
	@Select("select id,title,price,info,quantity,sales,concat('./images/dog',pic) pic from products order by id;")
	List<Product> findAll();
	
	
	@Select("select * from products where title like concat('%',#{kewWords},'%') or info like concat('%',#{keyWords},'%')")
	List<Product> search(String keyWords);
}
