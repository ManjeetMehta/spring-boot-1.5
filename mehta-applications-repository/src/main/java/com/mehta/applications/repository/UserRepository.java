package com.mehta.applications.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.mehta.applications.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	public User findByUserName(String userName);
	
	public List<User> findAll();
	
//	@Query("Select U.* from User U where U.userName = ?1 And U.password = ?2")
	public User findByUserNameAndPassword (String userName, String password);

}
