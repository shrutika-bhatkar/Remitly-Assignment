package com.form.controller;

import com.form.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class FormController {

    @GetMapping("/form")
    public String getForm(User user, Model model) {
        return "form";
    }

    @PostMapping("/form")
    public String processForm(@Valid User user, Errors errors, Model model) {
        if (errors.hasErrors()) {
            return "form";
        }
        System.out.println(user.getEmail());
        // Process the valid form data, e.g., save to a database
        return "success";
    }
}
