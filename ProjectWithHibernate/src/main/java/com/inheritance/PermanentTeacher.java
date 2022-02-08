package com.inheritance;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Inheritance(strategy=InheritanceType.JOINED)
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Entity
public class PermanentTeacher  extends Teacher{
	private int salary;

	public PermanentTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PermanentTeacher(int salary) {
		super();
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "PermanentTeacher [salary=" + salary + "]";
	}

	
	
}
