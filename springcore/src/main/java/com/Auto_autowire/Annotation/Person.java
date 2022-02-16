package com.Auto_autowire.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
//Autowire Annotation use in property
	@Autowired
	@Qualifier("add1")
	private Address add;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Autowire Annotation use constructor
	@Autowired
	public Person(Address add) {
		super();
		this.add = add;
		System.out.println("inside of constructor ");
	}

	public Address getAdd() {
		return add;
	}

	
	//Autowire Annotation use setter
	//	@Autowired
	public void setAdd(Address add) {
			
		System.out.println("Upside of setter method");	
		this.add = add;
	}

	@Override
	public String toString() {
		return "Person [add=" + add + "]";
	}
		
}
