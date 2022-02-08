package com.HQL;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee1 {
	@Id
	private int eId;
	private String eName;
	private String eCity;
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee1(int eId, String eName, String eCity) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eCity = eCity;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteCity() {
		return eCity;
	}
	public void seteCity(String eCity) {
		this.eCity = eCity;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eCity=" + eCity + "]";
	}

	
	

}
