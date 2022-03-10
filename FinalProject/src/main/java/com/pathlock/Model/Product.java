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
	private int stockinHand;
	
	
	
	public Product(String productName, int productPrice, String productColor, int stockinHand) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productColor = productColor;
		this.stockinHand = stockinHand;
	}
	
	
	public Product(int productId, String productName, int productPrice, String productColor) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productColor = productColor;
	}


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, int productPrice, String productColor, int stockinHand) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productColor = productColor;
		this.stockinHand = stockinHand;
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
	public int getStockinHand() {
		return stockinHand;
	}
	public void setStockinHand(int stockinHand) {
		this.stockinHand = stockinHand;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productColor=" + productColor + ", stockinHand=" + stockinHand + "]";
	}
	
	
	
	

}
