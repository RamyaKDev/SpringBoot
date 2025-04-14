package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import com.example.demo.controller.StereotypeController;
import com.example.demo.repository.StereotypeRepository;
import com.example.demo.service.StereotypeService;

@SpringBootApplication
public class StereotypeAnnotationsApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ac=SpringApplication.run(StereotypeAnnotationsApplication.class, args);
		
		System.out.println("Accessing Stereotype annotations Based on Class");
		StereotypeController sc=ac.getBean(StereotypeController.class);
		System.out.println(sc.getController());
		
		StereotypeService sc1=ac.getBean(StereotypeService.class);
		System.out.println(sc1.getService());
		
		StereotypeRepository sc2=ac.getBean(StereotypeRepository.class);
		System.out.println(sc2.getRepository());
		
		
//	System.out.println("Accessing Stereotype annotations Based on Spring IOC container Object");
//	
//		StereotypeController oc=(StereotypeController)ac.getBean("stereotypeController");
//		System.out.println(oc.getController());
//		
//		StereotypeService oc1=(StereotypeService)ac.getBean("stereotypeService");
//		System.out.println(oc1.getService());
//		
//		StereotypeRepository oc2=(StereotypeRepository)ac.getBean("stereotypeRepository");
//		System.out.println(oc2.getRepository());
		
		System.out.println("Accessing Stereotype annotations Based on Customized Object");
		
		StereotypeController cc=(StereotypeController)ac.getBean("springController");
		System.out.println(cc.getController());
		
		StereotypeService cc1=(StereotypeService)ac.getBean("springService");
		System.out.println(cc1.getService());
		
		StereotypeRepository cc2=(StereotypeRepository)ac.getBean("springRepository");
		System.out.println(cc2.getRepository());
	}

}
