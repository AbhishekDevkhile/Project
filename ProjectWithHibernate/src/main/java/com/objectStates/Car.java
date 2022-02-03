package com.objectStates;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	private int carNo;
	private String carName;
	private String carColor;
	
	
	public Car() {
		super();
	}
	public Car(int carNo, String carName, String carColor) {
		super();
		this.carNo = carNo;
		this.carName = carName;
		this.carColor = carColor;
	}
	public int getCarNo() {
		return carNo;
	}
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", carName=" + carName + ", carColor=" + carColor + "]";
	}
	
	
	
	
	
	

}
