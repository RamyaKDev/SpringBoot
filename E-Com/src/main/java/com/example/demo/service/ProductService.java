package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Products;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
private final ProductRepository productRepository;

public ProductService(ProductRepository productRepository) {
	
	this.productRepository = productRepository;
}
public List<Products> get_all_products(){
	return productRepository.findAll();
}
public Products add_products(Products products) {
	return productRepository.save(products);
}

}
