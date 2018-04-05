package com.mehta.applications.repository;

import org.springframework.data.repository.CrudRepository;

import com.mehta.applications.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
