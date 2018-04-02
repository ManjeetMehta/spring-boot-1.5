package com.sp.mehta.applications.web.controller;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sp.mehta.applications.common.constants.ApplicationConstants;
import com.sp.mehta.applications.common.vo.ProductVo;
import com.sp.mehta.applications.service.ProductService;


@RestController
@RequestMapping(value = ApplicationConstants.OPERATION_PRODUCT)
public class ProductController {

	@Autowired
	ProductService productService;
	
	
	@RequestMapping(value = ApplicationConstants.OPERATION_READ, method = RequestMethod.GET)
	Map<String,Object> readProduct(@PathVariable Integer id) {
		Map<String,Object> resultMap=new HashMap<String,Object>();
		ProductVo productVo = null;
		if (id!= null) {
			productVo = productService.readProduct(id);
			if(productVo!=null) {
				resultMap.put("productVo",productVo);
				resultMap.put("success",true);
			}else {
				resultMap.put("error","Invalid Id, Data Not Found..");
			}
				
		}else {
			resultMap.put("error","id can't be null...");
		}
		
		return resultMap;

	}
	
	
	@RequestMapping(value = ApplicationConstants.OPERATION_CREATE, method = RequestMethod.POST)
	Map<String,Object> createProduct (@RequestBody ProductVo productVo) {
		Map<String,Object> resultMap=new HashMap<String,Object>();
		if (productVo != null) {
			Integer id = productService.createProduct(productVo);
			resultMap.put("id",id);
			}
		
		return resultMap;
		
	}
	
	@RequestMapping(value = ApplicationConstants.OPERATION_UPDATE, method = RequestMethod.POST)
	Map<String,Object> updateProdut(@RequestBody ProductVo productVo) {
		Map<String,Object> resultMap=new HashMap<String,Object>();

		if (productVo == null) {
			resultMap.put("error","object can't be null");

		}else if(productVo.getId()==null) {
			resultMap.put("error","Id can't be null");
		}else {
			Boolean check =	 productService.updateProduct(productVo);
			if(!check)
				resultMap.put("error","not updated ! internal server error");
			else
				resultMap.put("success","true");
		}
		
		return resultMap;
	}
	
	
	@RequestMapping(value = ApplicationConstants.OPERATION_LIST, method = RequestMethod.GET)
	List<ProductVo> listProduct(){
		List<ProductVo> productVoList = null;
		productVoList = productService.listProduct();
		
		return productVoList;
	}
	
}