package com.ibm.springboot.demo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("employees")
public class Employee {

	@Id
	private ObjectId employeeId;
	private String firstName;
	private Double salary;

//	constructors, getters, setters etc 

	public Employee() {
		super();
	}

	public Employee(ObjectId employeeId, String firstName, Double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.salary = salary;
	}

	public ObjectId getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(ObjectId employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

}

//package com.ibm.springboot.demo.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
//public class Employee {
//
//	private Integer employeeId;
//	private String firstName;
//	private Double salary;
//
//}
