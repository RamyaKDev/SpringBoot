package com.example.demo.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="H2Table")
public class H2entity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int EmpId;
private String EmpName;
public int getEmpId() {
	return EmpId;
}
public H2entity(int empId, String empName) {
	super();
	EmpId = empId;
	EmpName = empName;
}
public void setEmpId(int empId) {
	EmpId = empId;
}
public String getEmpName() {
	return EmpName;
}
public void setEmpName(String empName) {
	EmpName = empName;
}
}
