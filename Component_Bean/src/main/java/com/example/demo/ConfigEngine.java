package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ConfigEngine {

	
	    @Bean
	    public Engine give_Engine() {

	    return new Engine("Petrol","Diesel");
	    }
	
}
