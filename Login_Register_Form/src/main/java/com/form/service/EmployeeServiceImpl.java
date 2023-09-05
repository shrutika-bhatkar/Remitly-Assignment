package com.form.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.form.model.Employee;
import com.form.repository.EmployeeRepository;

//  4 wrds
public class EmployeeServiceImpl implements UserDetailsService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Employee employee = employeeRepository.findByEmail(username);
		if(employee == null) {
			throw new UsernameNotFoundException("Employee not found");
		}
		return new EmployeeService(employee);
	}

}
