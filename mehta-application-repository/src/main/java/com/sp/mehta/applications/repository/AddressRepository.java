package com.sp.mehta.applications.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sp.mehta.applications.model.Address;

public interface AddressRepository extends CrudRepository<Address,Integer>{

	public List<Address> findAllByCountry (String country); 
}
