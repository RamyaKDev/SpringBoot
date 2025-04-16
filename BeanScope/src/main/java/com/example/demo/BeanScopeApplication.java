package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.controller.Prototype;
import com.example.demo.controller.Singleton;

@SpringBootApplication
public class BeanScopeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cc=SpringApplication.run(BeanScopeApplication.class, args);
		
		Singleton st=cc.getBean(Singleton.class);
		System.out.println("Singleton= "+st.hashCode());	
		
		Singleton st1=cc.getBean(Singleton.class);
		System.out.println("Singleton= "+st1.hashCode());	
		
		Singleton st2=cc.getBean(Singleton.class);
		System.out.println("Singleton= "+st2.hashCode());	
		Prototype pt=cc.getBean(Prototype.class);
		System.out.println("Prototype= "+pt.hashCode());	
		
		Prototype pt1=cc.getBean(Prototype.class);
		System.out.println("Prototype= "+pt1.hashCode());	
		
		Prototype pt2=cc.getBean(Prototype.class);
		System.out.println("Prototype= "+pt2.hashCode());	
		
		
		
		
	}

}
