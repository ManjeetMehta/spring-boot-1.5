package com.mehta.applications.service;

import java.util.List;

import com.mehta.applications.common.vo.ProductVo;
import com.mehta.applications.model.Product;

public interface ProductService {
	
	public Integer createProduct(ProductVo productVo);
	
	public Boolean updateProduct(ProductVo productVo);
	
	public ProductVo readProduct(Integer id);
	
	public boolean deleteProduct(Integer id);
	
	List<ProductVo> listProduct();

}
