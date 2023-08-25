package com.employee;

import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepo;

@DataJpaTest	//only scan @springdatarepository & @entity
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class EmployeeRepoTests {
	
	@Autowired
	EmployeeRepo employeeRepository;
	
	@Test
	@Order(1)
	@Rollback(value = false)
	public void createEmployeeTest() {
		
		Employee employee = new Employee();
		employee.setName("Shruti");
		employee.setAge(23);
		employee.setType("Gov");
		employee.setState("MP");
		employee.setSalary(44000);
		employeeRepository.save(employee);
		Assertions.assertThat(employee.getId()).isGreaterThan(0);
	}
	
	@Test
	@Order(2)
	@Rollback(value = false)
	public void getEmployeeTest() {
	
		Employee employee = employeeRepository.findById(2).get();
		Assertions.assertThat(employee.getId()).isEqualTo(2);

	}	
	
	@Test
	@Order(3)
	@Rollback(value = false)
	public void getAllEmployeeTest() {
		
		
		List<Employee> employee = employeeRepository.findAll();
		Assertions.assertThat(employee.size()).isGreaterThan(0);

	}
	
	@Test
	@Order(4)
	@Rollback(value = false)
	public void updateEmployeeTest() {
				
		Employee employee = employeeRepository.findById(2).get();
		employee.setName("Riya");
		Employee employeeUpdated = employeeRepository.save(employee);	
		Assertions.assertThat(employeeUpdated.getName()).isEqualTo("Riya");

	}
	
	@Test
	@Order(5)
	@Rollback(value = false)
	public void deleteEmployeeTest() {
				
		Employee employee = employeeRepository.findById(13).get();
		employeeRepository.delete(employee);
		Employee employee1 = null;	
		Optional<Employee> optionalEmployee = employeeRepository.findByName("Shrutika Bhatkar");
		
		if(optionalEmployee.isPresent()) {
			
			employee1 = optionalEmployee.get();
		}
		
		Assertions.assertThat(employee1).isNull();
	}
}
