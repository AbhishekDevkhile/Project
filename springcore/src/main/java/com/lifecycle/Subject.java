package com.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Subject {
	
	private String sName;

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(String sName) {
		super();
		this.sName = sName;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	@Override
	public String toString() {
		return "Subject [sName=" + sName + "]";
	}
	
	
	@PostConstruct
	public void start()
	{
	System.out.println("in Annotation init() method:postConstruct");	
	}
	@PreDestroy
	public void end()
	{
		System.out.println("in Annotation Destroy() method: preConstruct");
	}

}
