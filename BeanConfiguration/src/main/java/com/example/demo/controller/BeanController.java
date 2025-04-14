package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.service.BeanService;

@Controller
public class BeanController {
	@Autowired
	private BeanService beanService;
	
	public BeanController(BeanService beanService) {
		super();
		this.beanService = beanService;
	}

	public String getController() {
		return beanService.getService();
	}
}
