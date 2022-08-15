package com.greatlearning.employeeService.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.employeeService.entity.Employee;


public interface EmployeeRepository extends JpaRespsitory< Employee, Integer> {
	
	List<Employee> findByFirstNameContainsAllIgnoreCase(String firstName);
	
	List<Employee> findAllByOrderByFirstNameAsc();
	
	List<Employee> findAllByOrderByFirstNameDesc();

	
	
}
