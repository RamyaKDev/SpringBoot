package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Hardcoding
@Component
public class Engine {
	String fuel1,fuel2;
	//public Engine(@Value("Petrol")String fuel1,@Value("Gas")String fuel2){
		public Engine(@Value("${engine.fuel1}")String fuel1,@Value("${engine.fuel2}")String fuel2){
		this.fuel1=fuel1;
		this.fuel2=fuel2;
		System.out.println(this.fuel1+" "+this.fuel2);
	}
	
	public void start() {
		System.out.println("Engine started");
	}

}
