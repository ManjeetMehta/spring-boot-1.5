package com.mehta.applications.repository;

import org.springframework.data.repository.CrudRepository;

import com.mehta.applications.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
