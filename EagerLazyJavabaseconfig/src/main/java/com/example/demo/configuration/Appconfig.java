package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.example.demo.controller.Eagerloader;
import com.example.demo.controller.Lazyloader;

@Configuration
public class Appconfig {

	@Bean
	public Eagerloader eager() {
		return new Eagerloader();
	}
	
	@Bean
	@Lazy
	public Lazyloader lazy() {
		return new Lazyloader();
	}
}
