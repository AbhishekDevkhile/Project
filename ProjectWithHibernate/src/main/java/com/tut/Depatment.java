package com.tut;

import javax.persistence.Embeddable;

@Embeddable
public class Depatment {
	public Depatment(int deptId, String deptName) {
		super();
		DeptId = deptId;
		DeptName = deptName;
	}
	private int DeptId;
	private String DeptName;
	public Depatment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDeptId() {
		return DeptId;
	}
	public void setDeptId(int deptId) {
		DeptId = deptId;
	}
	public String getDeptName() {
		return DeptName;
	}
	public void setDeptName(String deptName) {
		DeptName = deptName;
	}
	@Override
	public String toString() {
		return "Depatment [DeptId=" + DeptId + ", DeptName=" + DeptName + "]";
	}
	
	
	

}
