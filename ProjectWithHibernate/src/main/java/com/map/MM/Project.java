package com.map.MM;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Project {
	@Id
	private int pId;
	@Column(name="ProjectName")
	private String pNmae;
	
	@ManyToMany(mappedBy="projects")
	private List<Emp>employees;


	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Project(int pId, String pNmae, List<Emp> employees) {
		super();
		this.pId = pId;
		this.pNmae = pNmae;
		this.employees = employees;
	}


	public int getpId() {
		return pId;
	}


	public void setpId(int pId) {
		this.pId = pId;
	}


	public String getpNmae() {
		return pNmae;
	}


	public void setpNmae(String pNmae) {
		this.pNmae = pNmae;
	}


	public List<Emp> getEmployees() {
		return employees;
	}


	public void setEmployees(List<Emp> employees) {
		this.employees = employees;
	}


	@Override
	public String toString() {
		return "Project [pId=" + pId + ", pNmae=" + pNmae + ", employees=" + employees + "]";
	}
	
	

}
