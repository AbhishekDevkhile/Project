package com.pathlock.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.pathlock.Dao.RoleDaoImpl;
import com.pathlock.Dao.UserDao;
import com.pathlock.Model.Role;
import com.pathlock.Model.User;


@Service
public class UserServiceImpl implements UserService{
	

	@Autowired
	private UserDao udao;
	
	//
	@Autowired
	private BCryptPasswordEncoder passEncoder;
	
	@Autowired
	private RoleDaoImpl rdao;
	
/*
	@Override
	public boolean insertUser(User u) {
	    udao.insertUser(u);
	    return true;
	}
*/
	//
	@Override
	public boolean insertUser(User u) {
		
		String pass=u.getUserpassword();
		String encodepass=passEncoder.encode(pass);
		u.setUserpassword(encodepass);
		
		
		Role r=rdao.getRole(2);
		u.setRole(r);
		
	    udao.insertUser(u);
	    return true;
	}
	
	
	
	@Override
	public List<User> getAllUsers() {
		return udao.getAllUsers();
	}
	
	@Override
	public User getUserByNameAndPassword(String name, String password) {
		User u=udao.getUserByNameAndPassword(name, password);
		return u;
	}

	@Override
	public User getUserById(int uid) {
		// TODO Auto-generated method stub
		return udao.getUserById(uid);
	}



	@Override
	public List<User> getUserByName(String userName) {
		// TODO Auto-generated method stub
		return udao.getUserByName(userName);
	}
	

}
