package com.foodrunner.app.service;

import java.util.List;

import com.foodrunner.app.entities.User;

public interface UserService {
	
	public User saveUser(User user);

    public List<User> getAllUsers();

    public User getUserById(Long id);

    public User updateUser(User user);

    public void deleteUser(Long id);

}
