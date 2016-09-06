package com.model;

public class Product {

	
	String itemName;
	int itemID;
	String discription;
	int qty;
	double price;
	String image;
	public Product(String itemName, int itemID, String discription, int qty, double price, String image) {
		
		this.itemName = itemName;
		this.itemID = itemID;
		this.discription = discription;
		this.qty = qty;
		this.price = price;
		this.image = image;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	}
