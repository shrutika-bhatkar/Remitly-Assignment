package com.form;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.form", exclude = {ErrorMvcAutoConfiguration.class})
@EntityScan(basePackages = "com.form.model")
public class FormUsingRegex1Application {

	public static void main(String[] args) {
		SpringApplication.run(FormUsingRegex1Application.class, args);
	}

}
