package com.pathlock.Dao;

import java.util.List;

import com.pathlock.Model.User;


public interface UserDao {

	
	
	boolean insertUser(User u);
	
	List<User> getAllUsers();
	
	User getUserById(int id);
	
	User getUserByNameAndPassword(String name,String password);
	
	List<User> getUserByName(String userName);
}
