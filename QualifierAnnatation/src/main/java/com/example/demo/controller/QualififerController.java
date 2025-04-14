package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.service.Vehicle;

@Component
public class QualififerController {
	//FieldInjection
	@Autowired	
	
	
	private Vehicle vehicle;
	
	
	//Constructor Injection

//public QualififerController(Vehicle vehicle) {
//		super();
//		this.vehicle = vehicle;
//	}
	
//SetterInjection

//public void setVehicle(@Qualifier("fourWheeler")Vehicle vehicle) {
//	this.vehicle = vehicle;
//}

public void getController() {
	 vehicle.getservice();
}
}
