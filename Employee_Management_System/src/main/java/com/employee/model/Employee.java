package com.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Builder;


@Entity
@Builder
public class Employee {
	
	@Id    
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@NotNull
	private int id;
	@NotBlank
	private String name;
	@Min(20)
	private int age;
	@NotNull
	private String state;
	@NotNull
	private String type;
	@Positive
	private int salary;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public Employee(int id, String name, int age, String state, String type, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.state = state;
		this.type = type;
		this.salary = salary;
	}
	

}
