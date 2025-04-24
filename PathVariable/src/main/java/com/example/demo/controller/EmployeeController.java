package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmployeeBean;

@RestController
public class EmployeeController {
	//http://localhost:8080/input
	//@RequestBody
@PostMapping("/input")
public EmployeeBean getInput(@RequestBody EmployeeBean employeeBean) {
	System.out.println(employeeBean.getName());
	System.out.println(employeeBean.getAge());
return employeeBean;	
}

//http://localhost:8080/employeeinput/aaa/12
//@PathVariable
@GetMapping("/employeeinput/{name}/{age}")
public EmployeeBean getInput1(@PathVariable("name") String Empname, 
								@PathVariable("age") int Empage) {
	System.out.println(Empname);
	System.out.println(Empage);
return new EmployeeBean(Empname,Empage);	
}

//http://localhost:8080/paraminput?name=bbb&age=15
//@RequestParam
@GetMapping("/paraminput")
public EmployeeBean getInput2(@RequestParam("name") String Empname, 
							@RequestParam("age") int Empage) {
	System.out.println(Empname);
	System.out.println(Empage);
return new EmployeeBean(Empname,Empage);	
}

@GetMapping("/paraminputdefault")
public EmployeeBean getInput21(@RequestParam(defaultValue ="dddd") String name, 
							@RequestParam int age) {
	System.out.println(name);
	System.out.println(age);
return new EmployeeBean(name,age);	
}
@GetMapping("/paraminputd")
public EmployeeBean getInput211(@RequestParam(required=false) String name, 
							@RequestParam int age) {
	System.out.println(name);
	System.out.println(age);
return new EmployeeBean(name,age);	
}
}
