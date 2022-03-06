package com.pathlock.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private int productId;
	private String productName;
	private int productPrice;
	private String productColor;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	

	public Product(int productId, String productName, int productPrice, String productColor) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productColor = productColor;
	}



	public Product(String pname, int price) {
		// TODO Auto-generated constructor stub
		this.productName=pname;
		this.productPrice=price;
	}

	public Product(String pname, int price, String pcolor) {
		// TODO Auto-generated constructor stub
		this.productName=pname;
		this.productPrice=price;
		this.productColor=pcolor;
	}



	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	
	public String getProductColor() {
		return productColor;
	}



	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}



	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	
	

}
