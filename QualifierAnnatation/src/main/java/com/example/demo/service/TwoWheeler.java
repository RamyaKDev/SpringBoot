package com.example.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class TwoWheeler implements Vehicle{

	@Override
	public void getservice() {
		// TODO Auto-generated method stub
		System.out.println("TwoWheeler");
	}

}
