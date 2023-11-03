package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;



@SpringBootApplication(scanBasePackages="com.employee.*")
@EntityScan(basePackages="com.employee.model")

public class EmployeManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeManagementSystemApplication.class, args);
	}

}
