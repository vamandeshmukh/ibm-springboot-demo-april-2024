package com.ibm.springboot.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.springboot.demo.model.Employee;

@RestController
@RequestMapping("emp")
public class EmployeeController {

	@GetMapping("get-emp-by-id")
	public Employee getEmpById() {
		return new Employee(101, "Sonu", 10.5);
	}

	@GetMapping("get-all-emps")
	public List<Employee> getAllEmps() {
		
		List<Employee> empList = new ArrayList<>();
		
//		empList.add();
		

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
