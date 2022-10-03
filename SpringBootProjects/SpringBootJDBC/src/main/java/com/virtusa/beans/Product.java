package com.virtusa.beans;

public class Product {
	private int id;
	private String productname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public Product(int id, String productname) {
		super();
		this.id = id;
		this.productname = productname;
	}
	public Product() {
		
	}
}
