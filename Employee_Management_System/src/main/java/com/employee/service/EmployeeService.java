package com.employee.service;


import java.util.List;
import java.util.Optional;
import com.employee.model.Employee;

import jakarta.validation.constraints.Positive;

public interface EmployeeService {


		public Employee addEmployee(Employee employee);
		
		public String removeEmployee(@Positive int id);
		
		public Optional<Employee> findEmpById(@Positive int id);
		
		public List<Employee> getAllEmployee();
		
		public String updateEmployee(@Positive int id);
	}


