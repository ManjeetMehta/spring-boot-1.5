package com.sp.mehta.applications.repository;

import org.springframework.data.repository.CrudRepository;

import com.sp.mehta.applications.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
