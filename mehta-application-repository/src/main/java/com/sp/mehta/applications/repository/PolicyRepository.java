package com.sp.mehta.applications.repository;

import org.springframework.data.repository.CrudRepository;

import com.sp.mehta.applications.model.Policy;

public interface PolicyRepository extends CrudRepository<Policy, Integer> {

}
