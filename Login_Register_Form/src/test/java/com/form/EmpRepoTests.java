package com.form;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.form.model.Employee;
import com.form.repository.EmployeeRepository;


@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class EmpRepoTests {

	@Autowired
	private TestEntityManager testEntityManager;
	
	@Autowired
	private EmployeeRepository repoemp;
	
	
	@Test
	@Order(1)
	public void testCreateUser() {
		Employee employee = new Employee();
		employee.setFirstName("Sham");
		employee.setLastName("Jadhav");
		employee.setEmail("shamjadhav12@gmail.com");
		employee.setPassword("Sj@12");
		
		Employee savedEmployee = repoemp.save(employee);
		Employee existEmployee = testEntityManager.find(Employee.class, savedEmployee.getId());  
		assertThat(employee.getEmail()).isEqualTo(existEmployee.getEmail());
	}
	
	@Test
	@Order(2)
	public void testFindByEmail() {
		String email = "shrutikabh@gmail.com";
		Employee employee = repoemp.findByEmail(email);
		assertThat(employee.getEmail()).isEqualTo(email);
	}
	
	

}
