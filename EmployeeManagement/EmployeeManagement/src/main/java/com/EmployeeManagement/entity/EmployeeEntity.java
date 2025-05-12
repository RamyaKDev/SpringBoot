package com.EmployeeManagement.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Employee")
public class EmployeeEntity {

        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private int employeeId;
        @Column(name="Name")
        private String employeeName;
        @Column(name="Address")
        private String employeeAddress;

        public EmployeeEntity(int employeeId, String employeeName, String employeeAddress) {
            super();
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.employeeAddress = employeeAddress;
        }
        public int getEmployeeId() {
            return employeeId;
        }
        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }

    public EmployeeEntity() {

    }

    public String getEmployeeName() {
            return employeeName;
        }
        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }
        public String getEmployeeAddress() {
            return employeeAddress;
        }
        public void setEmployeeAddress(String employeeAddress) {
            this.employeeAddress = employeeAddress;
        }

    }


