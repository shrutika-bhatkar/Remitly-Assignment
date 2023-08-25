package com.employee.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.model.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	Optional<Employee> findByName(String name);

}
