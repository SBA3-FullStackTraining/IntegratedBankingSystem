package com.banking.wf.springbootappibs.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.banking.wf.springbootappibs.dto.AdminCredentialsDTO;
import com.banking.wf.springbootappibs.dto.CustomerCredentialsDTO;
import com.banking.wf.springbootappibs.dto.CustomerDTO;

@Controller
@RequestMapping("/admin")
public class AdminController {


@RequestMapping("/adminHome")
public String home() {
	//business logic 
	
	return "Account";
	
}

@RequestMapping(value="/adminHome", method=RequestMethod.POST)
public String adminHome(@ModelAttribute("adminCreds") AdminCredentialsDTO adminCreds, ModelMap model) 		//@Valid @ModelAttribute 
{
	if(adminCreds.getAdminID().equals("admin") && adminCreds.getPassword().equals("admin"))
	{
			return "identityManagement/adminHome";
	}
	
	return "error-page";
}





//Fund Deposit section
@RequestMapping("/FundDeposit")
public String FundDepositAdmin() {
	//business logic 
	
	return "FundDeposit";
	
}
// Statement generation section
@RequestMapping("/StatementGeneration")
public String StatementGenerationAdmin() {
	//business logic 
	
	return "StatementGeneration";
	
}

//Withdrawal section
@RequestMapping("/Withdrawal")
public String WithdrawalAdmin() {
	//business logic 
	
	return "Withdrawal";
	
}

}
