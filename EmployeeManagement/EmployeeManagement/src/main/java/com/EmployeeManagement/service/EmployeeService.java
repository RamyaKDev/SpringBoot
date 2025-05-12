package com.EmployeeManagement.service;

import com.EmployeeManagement.entity.EmployeeEntity;
import com.EmployeeManagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public EmployeeEntity insertEmployee(EmployeeEntity employeeEntity){
        return employeeRepository.save(employeeEntity);
    }

    public EmployeeEntity getEmployee(Integer employeeId) {
        return employeeRepository.findById(employeeId).get();
    }

    public EmployeeEntity editEmployee(Integer employeeId, EmployeeEntity employeeEntity) {
        EmployeeEntity updateEntity= employeeRepository.findById(employeeId).get();
        updateEntity.setEmployeeId(employeeEntity.getEmployeeId());
        updateEntity.setEmployeeName(employeeEntity.getEmployeeName());
        updateEntity.setEmployeeAddress(employeeEntity.getEmployeeAddress());
     EmployeeEntity saveEntity= employeeRepository.save(updateEntity);
        return saveEntity;
    }

    public String deleteEmployee(Integer employeeId) {
        employeeRepository.deleteById(employeeId);
        return "The Employee ID "+employeeId+" is Deleted Successfully";
    }

    public List<EmployeeEntity> listAllEmployees() {
       return employeeRepository.findAll();
    }

    public List<EmployeeEntity> addAllEmployees(List<EmployeeEntity> employeeEntity) {
//        for(EmployeeEntity employee:employeeEntity) {
//          System.out.println(employee.getEmployeeName());
//            System.out.println(employee.getEmployeeAddress());
//
//        }
        return employeeRepository.saveAll(employeeEntity);
    }

    public String count() {
        long employeeCount=employeeRepository.count();
        return "Total number of Employees "+ employeeCount;
    }

    public String employeeExist(Integer employeeId) {
         boolean exist=employeeRepository.existsById( employeeId);
         if(exist)
                return "Employee is exist";
         else
             return "Employee does not exist";
    }

    public String deleteAllEmployees() {
         employeeRepository.deleteAll();
        return "All employees deleted";
    }
}
