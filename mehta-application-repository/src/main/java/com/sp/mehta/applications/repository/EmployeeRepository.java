package com.sp.mehta.applications.repository;

import org.springframework.data.repository.CrudRepository;

import com.sp.mehta.applications.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
