package com.pathlock.Model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class User {
	
	@Id
	@GeneratedValue
	private int userId;
	private String userName;
	private String userpassword;
	private String gender;
	private int age;
	private String email;
	private long number;
	@ManyToOne
	private Role role;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	

	public User(int userId, String userName, String userpassword, String gender, int age, String email, long number,
			Role role) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userpassword = userpassword;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.number = number;
		this.role = role;
	}



	public User(String gender2, String uname, String upass, int age2, String email2, long num) {
		
		
		this.userName = uname;
		this.userpassword = upass;
		this.gender = gender2;
		this.age = age2;
		this.email = email2;
		this.number = num;
		// TODO Auto-generated constructor stub
	}


	

	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	



	public String getUserpassword() {
		return userpassword;
	}



	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public long getNumber() {
		return number;
	}



	public void setNumber(long number) {
		this.number = number;
	}



	public Role getRole() {
		return role;
	}



	public void setRole(Role role) {
		this.role = role;
	}



	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userpassword=" + userpassword + ", gender="
				+ gender + ", age=" + age + ", email=" + email + ", number=" + number + ", role=" + role + "]";
	}
}