package com.rogerjemployee.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rogerjemployee.springbootbackend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	
}
