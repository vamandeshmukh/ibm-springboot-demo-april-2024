package com.ibm.springboot.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.springboot.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private List<Employee> empList = new ArrayList<>();

	@Override
	public Employee getEmployeeById(Integer employeeId) {
		System.out.println(employeeId);
		return new Employee(101, "Sonu", 10.5);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return empList;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return null;
	}

	@Override
	public Employee deleteEmployee(Integer employeeId) {
		return null;
	}

}
