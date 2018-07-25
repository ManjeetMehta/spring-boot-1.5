package com.mehta.applications.repository;

import org.springframework.data.repository.CrudRepository;

import com.mehta.applications.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
