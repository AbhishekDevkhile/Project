package com.springcore;

public class Student {
	private int studId;
	private String studename;
	private  String StudAddress;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studId, String studename, String studAddress) {
		super();
		this.studId = studId;
		this.studename = studename;
		StudAddress = studAddress;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		System.out.println("Setting student Id");
		this.studId = studId;
	}
	public String getStudename() {
		return studename;
	}
	public void setStudename(String studename) {
		System.out.println("Setting student Name");
		this.studename = studename;
	}
	public String getStudAddress() {
		return StudAddress;
	}
	public void setStudAddress(String studAddress) {
		System.out.println("Setting student Address");
		StudAddress = studAddress;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studename=" + studename + ", StudAddress=" + StudAddress + "]";
	} 
	

}
