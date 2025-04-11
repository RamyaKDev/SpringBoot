package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ComponentBeanApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac= SpringApplication.run(ComponentBeanApplication.class, args);
		Car maruthi=cac.getBean(Car.class);
		maruthi.drive();                                 
	}

}
