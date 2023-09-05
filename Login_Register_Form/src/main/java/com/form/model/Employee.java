package com.form.model;

import jakarta.persistence.*;

@Entity
@Table(name ="employees", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name= "first_name", nullable = false)
	private String firstName;

	@Column(name= "last_name", nullable = false)
	private String lastName;

	@Column(name="email", nullable = false, unique = true, length = 45)
	private String email;
	
	@Column (name=" password", nullable = false, length = 64)
	private String password;

	
public Employee(String firstName, String lastName, String email, String password) {
	super();
	
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.password = password;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
	
	
	
}
