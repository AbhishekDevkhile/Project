package com.lifecycle;
/*life cycle method using  XML method :
1.init()
2.destroy()
*/
public class Cake {
	
	private double cPrice;

	public Cake() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cake(double cPrice) {
		super();
		this.cPrice = cPrice;
	}

	

	public double getcPrice() {
		return cPrice;
	}

	public void setcPrice(double cPrice) {
		System.out.println("inside Set method");
		this.cPrice = cPrice;
	}
	@Override
	public String toString() {
		return "Cake [cPrice=" + cPrice + "]";
	}
	
	
	public void init() {
		System.out.println("in init method");

	}
	
	public void destroy()
	{
		System.out.println("in detroy method ");
	}

}
