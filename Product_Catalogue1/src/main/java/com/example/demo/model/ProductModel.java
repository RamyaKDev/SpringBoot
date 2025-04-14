package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data//@Getter, @setter
@ToString
public class ProductModel {
private String name;
private String url;
private String description;
private int price;
public ProductModel(String name, String url, String description, int price) {
	super();
	this.name = name;
	this.url = url;
	this.description = description;
	this.price = price;
}
@Override
public String toString() {
	return "ProductModel [name=" + name + ", url=" + url + ", description=" + description + ", price=" + price + "]";
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
