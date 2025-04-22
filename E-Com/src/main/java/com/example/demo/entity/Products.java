package com.example.demo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@jakarta.persistence.Entity
@Table(name="Product")

public class Products {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private long no;
private String url, description, name;
private int stock, price;
public long getNo() {
	return no;
}
public void setNo(long no) {
	this.no = no;
}
@Override
public String toString() {
	return "Products [no=" + no + ", url=" + url + ", description=" + description + ", name=" + name + ", stock="
			+ stock + ", price=" + price + "]";
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
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
}
