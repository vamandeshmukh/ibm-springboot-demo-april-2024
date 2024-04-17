package com.ibm.springboot.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ibm.springboot.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	private List<Employee> empList = new ArrayList<>(
			Arrays.asList(new Employee(101, "Sonu", (double) 90000), new Employee(102, "Monu", (double) 99000),
					new Employee(103, "Tonu", (double) 2000), new Employee(104, "Gonu", (double) 89000)));

	@Override
	public Employee getEmployeeById(Integer employeeId) {
		LOG.info(employeeId.toString());
		LOG.warn(employeeId.toString());
		LOG.error(employeeId.toString());
		return empList.stream().filter(emp -> emp.getEmployeeId().equals(employeeId)).findFirst().orElse(null);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return empList;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		empList.add(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return empList.set(empList.indexOf(getEmployeeById(employee.getEmployeeId())), employee);
	}

	@Override
	public Employee deleteEmployee(Integer employeeId) {
		Employee empToDelete = getEmployeeById(employeeId);
		empList.remove(empToDelete);
		return empToDelete;
	}

}
