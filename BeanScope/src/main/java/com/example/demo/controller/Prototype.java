package com.example.demo.controller;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


	//@Component
	//@Scope("prototype")
	//@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public class Prototype {
	public Prototype() {
		System.out.println("Prototype!!!");
	}
	}

