package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private String empName;
	private List<String> phones;
	private Set<String> Addresses;
	private Map<String,String> courses;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empName, List<String> phones, Set<String> addresses, Map<String, String> courses) {
		super();
		this.empName = empName;
		this.phones = phones;
		Addresses = addresses;
		this.courses = courses;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return Addresses;
	}
	public void setAddresses(Set<String> addresses) {
		Addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", phones=" + phones + ", Addresses=" + Addresses + ", courses="
				+ courses + "]";
	}
	
	
	

}
