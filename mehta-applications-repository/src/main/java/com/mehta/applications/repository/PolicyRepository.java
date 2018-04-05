package com.mehta.applications.repository;

import org.springframework.data.repository.CrudRepository;

import com.mehta.applications.model.Policy;

public interface PolicyRepository extends CrudRepository<Policy, Integer> {

}
