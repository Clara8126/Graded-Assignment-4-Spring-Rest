package com.greatlearning.employeeService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.employeeService.entity.Role;


public interface RoleRepository extends JpaRepository<Role, Integer> {

}
