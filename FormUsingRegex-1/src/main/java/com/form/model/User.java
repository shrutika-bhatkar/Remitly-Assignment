package com.form.model;

import lombok.Data;

import javax.validation.constraints.Pattern;


@Data
public class User {

	@Pattern(regexp = "/^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$/", 
			message = "Invalid email format")
    private String email;

	
    @Pattern(regexp = "^(\\+\\d{1,3}[- ]?)?\\d{10}$", 
    		message = "Invalid mobile number format")
    private String mobileNumber;
    
    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	
}
