package com.banking.ibs.springboot.controllers;


import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.banking.ibs.springboot.dto.CustomerCredentialsDTO;
import com.banking.ibs.springboot.entity.SavingsAccount;
import com.banking.ibs.springboot.service.AccountManagementService;
import com.banking.ibs.springboot.service.IdentityManagementService;


@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IdentityManagementService identityManagementService;
	
	@Autowired
	private AccountManagementService accountManagementService;

	
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public String home(@Valid HttpServletRequest request, Model model) 		//@Valid @ModelAttribute 
	{
		String customerID = request.getParameter("customerID").toString();
		String password = request.getParameter("password").toString();
		
		if(this.identityManagementService.checkIfCredentialsExists(Long.parseLong(customerID)))
		{
			CustomerCredentialsDTO credDTO = this.identityManagementService.fetchSingleCustomerCredInfo(Long.parseLong(customerID));
			
			if(credDTO.getPassword().equals(password))
			{
				model.addAttribute("customerID", customerID);
				model.addAttribute("password", password);
				
				return "identityManagement/customerHome";
			}
		}
		
		return "error-page";
	}
	
	
	//Savings Bank section
	@RequestMapping(value="/Savings", method=RequestMethod.GET)
	public String Savingsbanking(ModelMap model) {
		model.put("Id", getLoggedInUserName());
		Long ID= Long.parseLong(getLoggedInUserName());
		/*List <SavingsAccount> savings=this.service.fetchAllSavingAcc(ID);
		System.out.println(savings);
		model.put("savings", savings);*/
			return "SavingsBank";
	}

	@RequestMapping("/BillPayment")
	public ModelAndView BillPayment() {
		//business logic 
		
		return new ModelAndView("BillPayement", "command", new SavingsAccount());
		
	}


	@RequestMapping(value = "/FundTransfer", method = RequestMethod.GET)
	public ModelAndView FundTransfer() {
		//business logic 
		return new ModelAndView("FundTransfer", "command", new SavingsAccount());
		
		
	}

	@RequestMapping("/StatementGeneration")
	public ModelAndView StatementGeneration() {
		//business logic 
		return new ModelAndView("StatementGeneration", "command", new SavingsAccount());
		
		
	}

	//Fixed Deposit Section

	@RequestMapping("/FixedDeposit")
	public ModelAndView FixedDeposit() {
		//business logic 
		
		return new ModelAndView("FixedDeposit", "command", new SavingsAccount());
		
		
	}

	@RequestMapping("/FixedDeposit_Application")
	public ModelAndView FixedDepositApp() {
		//business logic 
		return new ModelAndView("FixedDeposit_Application", "command", new SavingsAccount());
		
		
	}

	@RequestMapping("/FixedDeposit_Verification")
	public ModelAndView FixedDepositVer() {
		//business logic 
		return new ModelAndView("FixedDeposit_Verification", "command", new SavingsAccount());
		
		
	}

	// Recurring Deposit Section

	@RequestMapping("/RecurringDeposit")
	public ModelAndView RecurringDeposit() {
		//business logic 
		return new ModelAndView("RecurringDeposit", "command", new SavingsAccount());
		
		
	}

	@RequestMapping("/RecurringDeposit_Application")
	public ModelAndView RecurringDepositApp(HttpServletRequest request) {
		//business logic 
		return new ModelAndView("RecurringDeposit_Application", "command", new SavingsAccount());

		
	}

	@RequestMapping("/RecurringDeposit_Verification")
	public ModelAndView RecurringDepositVer(HttpServletRequest request) {
		//business logic 
		
		return new ModelAndView("RecurringDeposit_Verification", "command", new SavingsAccount());
	}

	private String getLoggedInUserName() {
		Object principal= SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		if(principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}
		return principal.toString();
	}



	}
