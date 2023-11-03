package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/employe")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;


	@GetMapping("/employee")
	public String homePage() {
		return "Welcome to Employee Management System";	
		}
  
    
    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping("/addEmployee")
    public void addEmployee(@Valid int id, String name, double salary) {
        Employee newEmployee = new Employee(id, name, salary);
        employeeService.addEmployee(newEmployee);
    }

    @GetMapping("/getEmployeeById/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/edit/{id}")
    public void updateEmployee(@PathVariable int id, String name, double salary) {
        Employee updatedEmployee = new Employee(id, name, salary);
        employeeService.updateEmployee(updatedEmployee);
    }

    @GetMapping("/deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }
}
	
	

