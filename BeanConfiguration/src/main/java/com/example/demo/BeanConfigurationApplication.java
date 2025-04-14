package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.controller.BeanController;

@SpringBootApplication
public class BeanConfigurationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac=SpringApplication.run(BeanConfigurationApplication.class, args);
		BeanController bc=ac.getBean(BeanController.class);
		System.out.println(bc.getController());
	}

}
