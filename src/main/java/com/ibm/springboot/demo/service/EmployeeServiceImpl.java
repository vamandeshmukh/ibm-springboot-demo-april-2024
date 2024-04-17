package com.ibm.springboot.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.springboot.demo.model.Employee;
import com.ibm.springboot.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EmployeeRepository employeeRepository;

	private List<Employee> empList = new ArrayList<>();

	@Override
	public Employee getEmployeeById(ObjectId objectId) {
		LOG.info(objectId.toString());
//		LOG.warn(employeeId.toString());
//		LOG.error(employeeId.toString());
		return empList.stream().filter(emp -> emp.getEmployeeId().equals(objectId)).findFirst().orElse(null);
	}

	@Override
	public List<Employee> getAllEmployees() {
		LOG.info("getAllEmployees");
		return employeeRepository.findAll();
	}

	// @Override
//	public List<Employee> getAllEmployees() {
//		LOG.info("getAllEmployees");
//		return empList;
//	}

	@Override
	public Employee addEmployee(Employee employee) {
		LOG.info(employee.toString());
		empList.add(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		LOG.info(employee.toString());
		return empList.set(empList.indexOf(getEmployeeById(employee.getEmployeeId())), employee);
	}

	@Override
	public Employee deleteEmployee(Integer employeeId) {
//		LOG.info(employeeId.toString());
//		Employee empToDelete = getEmployeeById(employeeId);
//		empList.remove(empToDelete);
		return null;
	}

}
