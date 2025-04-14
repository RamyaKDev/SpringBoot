package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service("springService")
public class StereotypeService {
	public String getService() {
		return "Stereotype Service";
	}
}
