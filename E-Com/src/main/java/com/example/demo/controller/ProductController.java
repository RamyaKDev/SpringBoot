package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Products;
import com.example.demo.service.ProductService;


//localhost:8080/

@RestController
@RequestMapping("/api/products")
public class ProductController {
private final ProductService productService;

public ProductController(ProductService productService) {

	this.productService = productService;
}
@GetMapping
public List<Products> show_all_products(){
	
	return productService.get_all_products();	
	
}
@PostMapping
public Products add_products(@RequestBody Products products) {
 return productService.add_products(products); 
}


@PostMapping("/success")
public String display() {
	return "success";
}


//@GetMapping
//public String show_all_products(Model model){
//	
//	List<Products> productList=productService.get_all_products();
//	model.addAttribute("ProductLists",productList);
//	return "productpage";
//	
//}

//@PostMapping("/add")
//public String add_products(@ModelAttribute("products") Products products) {
//	System.out.println(products.toString());
//	System.out.println(products.getName());
//	System.out.println(products.getDescription());
//	System.out.println(products.getPrice());	
//productService.add_products(products); 
// return "addproduct";
//}



}