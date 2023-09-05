package com.form.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.form.model.Employee;
import com.form.repository.EmployeeRepository;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/")
	public String viewhome() {
		return "index";
	}
	
	@GetMapping("/register")
	public String showRegistraionForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "registration";
	}
	
	@PostMapping("/process_register")
	public String processRegister(Employee employee) {
	BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	String encodedPassword = passwordEncoder.encode(employee.getPassword());
	employee.setPassword(encodedPassword);
	
	employeeRepository.save(employee);
	return "register_sucess";
	}
	
	@GetMapping("/employees")
	public String listEmployees(Model model) {
		List<Employee> listEmployees = employeeRepository.findAll();
		model.addAttribute("listEmployees", listEmployees);
		
		return "employees";
		
	}
	
	
	
	
	
	
	
}
