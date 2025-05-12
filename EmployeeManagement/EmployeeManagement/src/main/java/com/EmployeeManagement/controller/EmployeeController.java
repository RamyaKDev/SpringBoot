package com.EmployeeManagement.controller;

import com.EmployeeManagement.entity.EmployeeEntity;
import com.EmployeeManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    //Inserting single employee
    @PostMapping("/insert")
    public ResponseEntity<EmployeeEntity> insertEmployee(@RequestBody EmployeeEntity employeeEntity){
        return new ResponseEntity<>(employeeService.insertEmployee(employeeEntity), HttpStatus.CREATED) ;
    }

    //Displaying single employee based on the employeeid
    @GetMapping("/get/{employeeId}")
    public ResponseEntity<EmployeeEntity> getEmployee(@PathVariable("employeeId") Integer employeeId){
    return new ResponseEntity<>(employeeService.getEmployee(employeeId),HttpStatus.OK);
    }

    //updating employee details based on id
    @PutMapping("/edit/{employeeId}")
        public ResponseEntity<EmployeeEntity> editEmployee(@PathVariable("employeeId") Integer employeeId, @RequestBody EmployeeEntity employeeEntity){
        employeeEntity.setEmployeeId(employeeId);
        return  new ResponseEntity<>(employeeService.editEmployee(employeeId,employeeEntity),HttpStatus.FOUND);
    }

    //deleting single employee by id
    @DeleteMapping("/delete/{employeeId}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("employeeId") Integer employeeId){
        return  new ResponseEntity<>(employeeService.deleteEmployee(employeeId),HttpStatus.GONE);
    }

    //Displaying the List of Employees
    @GetMapping("/listallemployees")
    public List<EmployeeEntity> listAllEmployees(){
        return employeeService.listAllEmployees();
    }

    //inserting more than one employess
    @PostMapping("/insertmoreemployees")
    public List<EmployeeEntity> addAllEmployees(@RequestBody List<EmployeeEntity> employeeEntity){
        return employeeService.addAllEmployees(employeeEntity);
    }

    //Counting all employees
    @GetMapping("/count")
    public String count(){
        return employeeService.count();
    }

    //Checking employee exists or not
    @GetMapping("/exist/{employeeId}")
    public String employeeExist(@PathVariable("employeeId") Integer employeeId){
        return employeeService.employeeExist(employeeId);
    }

    //delete all employees
    @DeleteMapping("/deleteallemployees")
    public String deleteAll(){
        return employeeService.deleteAllEmployees();
    }
}
