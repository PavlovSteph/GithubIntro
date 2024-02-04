package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.model.LoginModel;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@GetMapping("/")
	public String display(Model model) {
		
		//Display the Login Form View
		model.addAttribute("title", "Login Form");
        model.addAttribute("loginModel", new LoginModel());

        // Return the view 
        return "login";
	}
	

}
