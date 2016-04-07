package com.frameworkonly.webapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.frameworkonly.webapp.domain.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

	
}
