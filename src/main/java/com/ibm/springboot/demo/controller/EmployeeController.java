package com.ibm.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.springboot.demo.model.Employee;
import com.ibm.springboot.demo.service.EmployeeService;

@RestController
@RequestMapping("emp")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
//	http://localhost:8080/emp/get-emp-by-id/101

	@GetMapping("get-emp-by-id/{eid}")
	public Employee getEmpById( @PathVariable(name = "eid") Integer employeeId) {
		System.out.println(employeeId);
		Employee employee = employeeService.getEmployeeById(employeeId);
		System.out.println(employee.toString());
		return employee;
	}

	@GetMapping("get-all-emps")
	public List<Employee> getAllEmps() {
		List<Employee> empList = employeeService.getAllEmployees();
		empList.forEach(System.out::println);
		return empList;
	}

}

//package com.ibm.springboot.demo.controller;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("emp")
//public class EmployeeController {
//
////	http://localhost:8080/emp/get-data
//	
//	@GetMapping("get-data")
//	public String hi() {
//		System.out.println("Hello!");
//		return "Employee world!";
//	}
//
//
//}
