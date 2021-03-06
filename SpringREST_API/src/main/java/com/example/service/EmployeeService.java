package com.example.service;

import java.util.Collection;

import com.example.bean.Employee;

public interface EmployeeService {

	Collection<Employee> getAllEmployees();
	Employee saveEmployee(Employee employee);
	Employee findEmployee(int id);
	Employee removeEmployee(int id);
	Employee updateEmployee(int id,int salary);
	
}
