package com.form.model;

import jakarta.validation.constraints.Pattern;



public class User {

    @Pattern(regexp = "^[a-zA-Z0-9]([._-]?[a-zA-Z0-9]){2,17}[a-zA-Z0-9]$", 
    		message = "Username must be 6 to 20 characters, containing letters, digits, and optional ._- characters.")
    private String username;

    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z\\d]).{8,32}$", 
    		message = "Password must contain at least 1 uppercase, 1 lowercase, 1 special character, and 1 digit, with a length of 8 to 32 characters.")
    private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(
			@Pattern(regexp = "^[a-zA-Z0-9]([._-]?[a-zA-Z0-9]){2,17}[a-zA-Z0-9]$", 
				message = "Username must be 6 to 20 characters, containing letters, digits, and optional ._- characters.") String username,
			@Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z\\d]).{8,32}$",
				message = "Password must contain at least 1 uppercase, 1 lowercase, 1 special character, and 1 digit, with a length of 8 to 32 characters.") String password) {
		super();
		this.username = username;
		this.password = password;
	}



	
    
    
}
