package com.pathlock.dto;

import java.io.Serializable;

public class Item implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	private int itemid;
	private String itemname;
	private int itemprice;
	private String itemcolor;
	private int quantity;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int itemid, String itemname, int itemprice, String itemcolor, int quantity) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
		this.itemprice = itemprice;
		this.itemcolor = itemcolor;
		this.quantity = quantity;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getItemprice() {
		return itemprice;
	}
	public void setItemprice(int itemprice) {
		this.itemprice = itemprice;
	}
	public String getItemcolor() {
		return itemcolor;
	}
	public void setItemcolor(String itemcolor) {
		this.itemcolor = itemcolor;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", itemname=" + itemname + ", itemprice=" + itemprice + ", itemcolor="
				+ itemcolor + ", quantity=" + quantity + "]";
	}
	
	

}
