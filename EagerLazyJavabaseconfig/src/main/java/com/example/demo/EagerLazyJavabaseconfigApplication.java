package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.Lazyloader;

@SpringBootApplication
public class EagerLazyJavabaseconfigApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(EagerLazyJavabaseconfigApplication.class, args);
		 ac.getBean(Lazyloader.class);
	}

}
