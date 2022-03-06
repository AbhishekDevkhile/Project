package com.pathlock.Service;

import java.util.List;

import com.pathlock.Model.User;

public interface UserService {
	
    boolean insertUser(User u);
	
	List<User> getAllUsers();
	
	User getUserByNameAndPassword(String name,String password);

	User getUserById(int uid);

	
	List<User> getUserByName(String userName);
}

