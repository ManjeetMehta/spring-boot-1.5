package com.mehta.applications.security.service;

import com.mehta.applications.security.model.User;

public interface UserService {
	public User findUserByEmail(String email);

	public void saveUser(User user);
}
