package com.sp.mehta.applications.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sp.mehta.applications.model.Org;

public interface OrgRepository extends CrudRepository<Org, Integer> {

	public List<Org> findAllByCountry(String country);
}
