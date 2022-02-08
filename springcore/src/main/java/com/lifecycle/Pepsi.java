 package com.lifecycle;
 /*life cycle method using interface :
1.InitializingBean
2.DisposableBean
 */
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean
{
	private double price;

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pepsi(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}
	
	//same as init()
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside init method");
		
	}

	public void destroy() throws Exception {
		System.out.println("inside destroy method");
		
	}

	
	
	
		
	

}
