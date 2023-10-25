package com.form.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.form.model.User;

import jakarta.validation.Valid;

@Controller
public class formController {

	@GetMapping("/login")
    public String getForm(User user) {
        return "form";
    }
 
    @PostMapping("/login")
    public String form(@Valid User user, Errors errors, Model model) {
        if (errors.hasErrors()) {
            return "form";
        } else {
            model.addAttribute("message", "loggedin successful ...");
            return "form";
        }
    }
}
