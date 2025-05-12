package com.EmployeeManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

}
//Table creation
//Hibernate:
//create table employee (
//		employee_id integer not null auto_increment,
//		name varchar(255),
//address varchar(255),
//primary key (employee_id)
//    ) engine=InnoDB