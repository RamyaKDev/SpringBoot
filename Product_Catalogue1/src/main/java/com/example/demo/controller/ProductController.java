package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.ProductModel;

@Controller
public class ProductController {
@GetMapping("/products")
public String displayProducts(Model model) {
	ProductModel p1=new ProductModel("HP","https://www.google.com/imgres?q=hp%20laptop&imgurl=https%3A%2F%2Fm.media-amazon.com%2Fimages%2FI%2F61cNY70JaZL.jpg&imgrefurl=https%3A%2F%2Fwww.amazon.com%2FHP-Intel-i3-1005G1-3-4GHz-Laptop%2Fdp%2FB089T6C53P&docid=_GdABv-WwUeDsM&tbnid=j4S-X9_THWLyaM&vet=12ahUKEwjs7PGdvdGMAxW7D9AFHQjlCoQQM3oECBkQAA..i&w=1500&h=949&hcb=2&ved=2ahUKEwjs7PGdvdGMAxW7D9AFHQjlCoQQM3oECBkQAA","Good",25000);
	ProductModel p2=new ProductModel("ACER","https://www.google.com/imgres?q=hp%20laptop&imgurl=https%3A%2F%2Fm.media-amazon.com%2Fimages%2FI%2F61cNY70JaZL.jpg&imgrefurl=https%3A%2F%2Fwww.amazon.com%2FHP-Intel-i3-1005G1-3-4GHz-Laptop%2Fdp%2FB089T6C53P&docid=_GdABv-WwUeDsM&tbnid=j4S-X9_THWLyaM&vet=12ahUKEwjs7PGdvdGMAxW7D9AFHQjlCoQQM3oECBkQAA..i&w=1500&h=949&hcb=2&ved=2ahUKEwjs7PGdvdGMAxW7D9AFHQjlCoQQM3oECBkQAA","V.Good",35000);
	ProductModel p3=new ProductModel("DELL","https://www.google.com/imgres?q=hp%20laptop&imgurl=https%3A%2F%2Fm.media-amazon.com%2Fimages%2FI%2F61cNY70JaZL.jpg&imgrefurl=https%3A%2F%2Fwww.amazon.com%2FHP-Intel-i3-1005G1-3-4GHz-Laptop%2Fdp%2FB089T6C53P&docid=_GdABv-WwUeDsM&tbnid=j4S-X9_THWLyaM&vet=12ahUKEwjs7PGdvdGMAxW7D9AFHQjlCoQQM3oECBkQAA..i&w=1500&h=949&hcb=2&ved=2ahUKEwjs7PGdvdGMAxW7D9AFHQjlCoQQM3oECBkQAA","Good to have",20000);
	ProductModel p4=new ProductModel("LENEVO","https://www.google.com/imgres?q=hp%20laptop&imgurl=https%3A%2F%2Fm.media-amazon.com%2Fimages%2FI%2F61cNY70JaZL.jpg&imgrefurl=https%3A%2F%2Fwww.amazon.com%2FHP-Intel-i3-1005G1-3-4GHz-Laptop%2Fdp%2FB089T6C53P&docid=_GdABv-WwUeDsM&tbnid=j4S-X9_THWLyaM&vet=12ahUKEwjs7PGdvdGMAxW7D9AFHQjlCoQQM3oECBkQAA..i&w=1500&h=949&hcb=2&ved=2ahUKEwjs7PGdvdGMAxW7D9AFHQjlCoQQM3oECBkQAA","Worth",25000);
	List<ProductModel> list=new ArrayList<ProductModel>();
	list.add(p1);
	list.add(p2);
	list.add(p3);
	list.add(p4);
	model.addAttribute("productslist",list);
	return "products_page";
}
}
