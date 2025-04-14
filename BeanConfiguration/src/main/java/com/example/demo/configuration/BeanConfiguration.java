package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.controller.BeanController;
import com.example.demo.service.BeanService;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public BeanController beanController() {
		return new BeanController(beanService());
	}
	
	@Bean
	public BeanService beanService() {
		return new BeanService();
	}
}
