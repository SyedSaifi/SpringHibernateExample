package com.example.app.service;

import java.util.List;

import com.example.app.entity.EmployeeEntity;

 
public interface EmployeeManager {
    public void addEmployee(EmployeeEntity employee);
    public List<EmployeeEntity> getAllEmployees();
    public void deleteEmployee(Integer employeeId);
}