package com.mehta.applications.social.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehta.applications.social.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByEmail(String email);

}