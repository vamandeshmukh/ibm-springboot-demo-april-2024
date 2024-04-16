package com.ibm.springboot.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.springboot.demo.model.Employee;
import com.ibm.springboot.demo.service.EmployeeService;
import com.ibm.springboot.demo.service.EmployeeServiceImpl;

@RestController
@RequestMapping("emp")
public class EmployeeController {


	@Autowired
	EmployeeService employeeService;

	@GetMapping("get-emp-by-id") // 101
	public Employee getEmpById() {
		System.out.println("getEmpById");
		return employeeService.getEmployeeById(101);
	}

	@GetMapping("get-all-emps")
	public List<Employee> getAllEmps() {
		List<Employee> empList = new ArrayList<>(Arrays.asList(new Employee(101, "Sonu", 10.5),
				new Employee(102, "Monu", 10.5), new Employee(101, "Sonu", 10.5)));
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
