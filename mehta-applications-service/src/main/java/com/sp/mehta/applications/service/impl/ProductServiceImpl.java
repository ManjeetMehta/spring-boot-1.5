package com.sp.mehta.applications.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mehta.applications.common.vo.AddressVo;
import com.mehta.applications.common.vo.OrgVo;
import com.mehta.applications.common.vo.ProductVo;
import com.sp.mehta.applications.model.Org;
import com.sp.mehta.applications.model.Product;
import com.sp.mehta.applications.repository.OrgRepository;
import com.sp.mehta.applications.repository.ProductRepository;
import com.sp.mehta.applications.service.ProductService;

@Component
public class ProductServiceImpl implements ProductService {

	@Autowired
	OrgRepository orgRepository;

	@Autowired
	ProductRepository productRepository;

	@Override
	public Integer createProduct(ProductVo productVo) {
		if (productVo != null) {
			Product product = new Product();
			product.setId(productVo.getId());
			product.setName(productVo.getName());
			product.setDescription(productVo.getDescription());
			product.setPrice(productVo.getPrice());
			product.setType(productVo.getType());
			product.setActive(productVo.isActive());

			Org org = null;
			if (productVo.getOrgVo() != null) {
				Integer id = productVo.getOrgVo().getId();
				if (id != null) {
					org = orgRepository.findOne(id);
					if (org != null) {
						product.setOrg(org);
					}
				}
				product = productRepository.save(product);
				if (product != null) {
					return product.getId();
				}
			}
		}
		return null;
	}

	@Override
	public Boolean updateProduct(ProductVo productVo)	{
		 if (productVo != null && productVo.getId() != null) {
			 Product product = productRepository.findOne(productVo.getId());
			 if (product!=null) {
				 product.setId(productVo.getId());
				 product.setName(productVo.getName());
				 product.setDescription(productVo.getDescription());
				 product.setPrice(productVo.getPrice());
				 product.setType(productVo.getType());

				 if (productVo.getOrgVo()!= null && productVo.getOrgVo().getId() != null) {
					 Org org = orgRepository.findOne(productVo.getOrgVo().getId());
					 if (org != null) {
						 product.setOrg(org);
					 }
				 }
			 }
			 
		}
		return null;
	}

	@Override
	public ProductVo readProduct(Integer id) {
		ProductVo productVo = null;
		if (id != null) {

			if (id != null) {
				Product product = productRepository.findOne(id);
				if (product != null) {
					productVo = new ProductVo();
					productVo.setId(product.getId());
					productVo.setName(product.getName());
					productVo.setDescription(product.getDescription());
					productVo.setPrice(product.getPrice());
					productVo.setType(product.getType());
					productVo.setActive(product.isActive());

					
					if(product.getOrg()!=null) {
						OrgVo orgVo = new OrgVo();
						orgVo.setId(product.getOrg().getId());
						productVo.setOrgVo(orgVo);
						orgVo.setName(product.getOrg().getName());
						orgVo.setCountry(product.getOrg().getCountry());
						orgVo.setActive(product.getOrg().isActive());
						
						if (product.getOrg().getAddress() != null) {
							AddressVo addressVo = new AddressVo();
						//	addressVo.setId(product.getOrg().getId());
							
						}
					}
					

				}

			}
		}
		return productVo;
	}

	@Override
	public boolean deleteProduct(Integer id) {
		if (id != null) {
			
		}
			
		return false;
	}

	@Override
	public List<ProductVo> listProduct() {
		List<ProductVo> productVoList = null;
		List<Product> productList = (List<Product>) productRepository.findAll();

		if (productList != null) {
			productVoList = new ArrayList<ProductVo>();
			ProductVo productVo = null;
			for (Product product : productList) {
				if (product != null) {
					productVo = new ProductVo();
					productVo.setId(product.getId());
					productVo.setName(product.getName());
					productVo.setPrice(product.getPrice());
					productVo.setType(product.getType());
					productVo.setDescription(product.getDescription());
					productVo.setActive(product.isActive());
					
					OrgVo orgVo = new OrgVo();
					orgVo.setId(product.getOrg().getId());
					
					productVo.setOrgVo(orgVo);
					productVoList.add(productVo);
				}
			}
				
		}

		return productVoList;
	}

}
