package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Products;
import com.example.demo.service.ProductService;

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

}