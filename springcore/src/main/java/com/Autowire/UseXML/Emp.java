package com.Autowire.UseXML;

public class Emp {
	private Address adr;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Address adr) {
		super();
		this.adr = adr;
		System.out.println("inside constructor");
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	@Override
	public String toString() {
		return "Emp [adr=" + adr + "]";
	}
	
	

}
