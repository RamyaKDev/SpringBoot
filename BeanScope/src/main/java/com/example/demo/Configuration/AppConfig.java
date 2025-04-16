package com.example.demo.Configuration;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.demo.controller.Prototype;
import com.example.demo.controller.Singleton;

@Configuration
public class AppConfig {
	@Bean
public Singleton getSingleton() {
	return new Singleton();
}
	@Bean
	//@Scope("prototype")
		@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Prototype getPrototype() {
		return new Prototype();
	}
}
