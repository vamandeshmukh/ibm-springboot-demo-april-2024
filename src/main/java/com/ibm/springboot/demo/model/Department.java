package com.ibm.springboot.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("departments")
public class Department {

	@Id
	private String departmentId;
	private String departmentName;
	private String location;
	private String managerId;

	// constructors, getters, setters, toString etc

}
