package com.ibm.springboot.demo.service;

import java.util.List;

import org.bson.types.ObjectId;

import com.ibm.springboot.demo.model.Employee;

public interface EmployeeService {

	public abstract Employee getEmployeeById(ObjectId employeeId);

	public abstract List<Employee> getAllEmployees();

	public abstract Employee addEmployee(Employee employee);

	public abstract Employee updateEmployee(Employee employee);

	public abstract Employee deleteEmployee(Integer employeeId);
}
