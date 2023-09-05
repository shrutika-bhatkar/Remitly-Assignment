package com.form;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

class PasswordGenerate {

	public static void main(String[] args) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String plainPassword = "sam@123";
		String encodedPassword = passwordEncoder.encode(plainPassword);
		
		System.out.println(encodedPassword);
	}

}
