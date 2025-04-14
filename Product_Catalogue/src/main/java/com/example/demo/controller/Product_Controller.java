package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Product;

@Controller
public class Product_Controller {
	
	@GetMapping("/products")
	public String display_Products(Model model)
	{
		Product p1 = new Product("Dell", "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.juKuZePKbn6Ou1gCYbTzywHaFM%26pid%3DApi&f=1&ipt=38fa87998ad11fc26c2fc7c1f04270371fbc446b9a92a6b17779c91667dcf302&ipo=images", "Good Laptop", 22000);
		Product p2 = new Product("Lenovo", "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.juKuZePKbn6Ou1gCYbTzywHaFM%26pid%3DApi&f=1&ipt=38fa87998ad11fc26c2fc7c1f04270371fbc446b9a92a6b17779c91667dcf302&ipo=images", "Good Laptop", 22000);
		Product p3 = new Product("HP", "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.juKuZePKbn6Ou1gCYbTzywHaFM%26pid%3DApi&f=1&ipt=38fa87998ad11fc26c2fc7c1f04270371fbc446b9a92a6b17779c91667dcf302&ipo=images", "Good Laptop", 22000);
		Product p4 = new Product("Asus", "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.juKuZePKbn6Ou1gCYbTzywHaFM%26pid%3DApi&f=1&ipt=38fa87998ad11fc26c2fc7c1f04270371fbc446b9a92a6b17779c91667dcf302&ipo=images", "Good Laptop", 22000);

		List<Product> productList = new ArrayList<Product>(); 
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		model.addAttribute("products", productList);
		
		return "product_page"; 
		
	}

}
