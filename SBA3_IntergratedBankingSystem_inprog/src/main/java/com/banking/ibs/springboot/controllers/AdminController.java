package com.banking.ibs.springboot.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {


@RequestMapping("/home")
public String home() {
	//business logic 
	
	return "Account";
	
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
