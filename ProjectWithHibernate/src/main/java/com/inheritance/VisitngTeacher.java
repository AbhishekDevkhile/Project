package com.inheritance;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Inheritance(strategy=InheritanceType.JOINED)
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Entity
public class VisitngTeacher {
	private int hrs;
	private int rate;
	public VisitngTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VisitngTeacher(int hrs, int rate) {
		super();
		this.hrs = hrs;
		this.rate = rate;
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "VisitngTeacher [hrs=" + hrs + ", rate=" + rate + "]";
	}
	
	

}
