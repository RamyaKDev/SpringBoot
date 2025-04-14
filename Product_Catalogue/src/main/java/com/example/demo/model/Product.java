package com.example.demo.model;



public class Product {
	
	public Product(String name, String url, String description, int price) {
		super();
		this.name = name;
		this.url = url;
		this.description = description;
		this.price = price;
	}

	private String name; 
	private String url; 
	private String description;
	private int price;
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", url=" + url + ", description=" + description + ", price=" + price + "]";
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
 
}
