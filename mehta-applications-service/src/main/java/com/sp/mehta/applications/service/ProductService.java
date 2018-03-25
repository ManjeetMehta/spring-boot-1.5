package com.sp.mehta.applications.service;

import java.util.List;

import com.sp.mehta.applications.common.vo.ProductVo;
import com.sp.mehta.applications.model.Product;

public interface ProductService {
	
	public Integer createProduct(ProductVo productVo);
	
	public Boolean updateProduct(ProductVo productVo);
	
	public ProductVo readProduct(Integer id);
	
	public boolean deleteProduct(Integer id);
	
	List<ProductVo> listProduct();

}
