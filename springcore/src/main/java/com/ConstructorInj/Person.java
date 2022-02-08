package com.ConstructorInj;

public class Person {

	private int pId;
	private String pName;
	private certificate cert;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	
	
	public Person(int pId, String pName, certificate cert) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.cert = cert;
	}
	
	public certificate getCert() {
		return cert;
	}
	public void setCert(certificate cert) {
		this.cert = cert;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", cert=" + cert + "]";
	}
	
	
	
	
	
}

