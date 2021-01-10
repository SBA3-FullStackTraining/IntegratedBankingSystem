package com.banking.wf.springbootappibs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.banking.wf.springbootappibs.dto.AdminCredentialsDTO;
import com.banking.wf.springbootappibs.dto.CustomerCredentialsDTO;
import com.banking.wf.springbootappibs.dto.CustomerDTO;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model model) {
		return "redirect:/index";
	}
	
	// to respond to root URL
	@RequestMapping("/access-denied")
	public String accessDenied() {
		
		return  "error-page";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model) {
		model.addAttribute("regCustomer", new CustomerDTO());
		return "identityManagement/customerRegister";
	}

	@RequestMapping("/login-form")
	public String customLogin() {
			return  "login-form";
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
		model.addAttribute("customerCreds", new CustomerCredentialsDTO());
		model.addAttribute("adminCreds", new AdminCredentialsDTO());
        return "index";
    }

}