package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.controller.QualififerController;

@SpringBootApplication
public class QualifierAnnatationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac=SpringApplication.run(QualifierAnnatationApplication.class, args);
		QualififerController qc=ac.getBean(QualififerController.class);
		qc.getController();
	}

}
