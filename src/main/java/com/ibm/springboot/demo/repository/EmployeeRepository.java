package com.ibm.springboot.demo.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ibm.springboot.demo.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, ObjectId> {

	// no need to define methods for basic CRUD operations

}
