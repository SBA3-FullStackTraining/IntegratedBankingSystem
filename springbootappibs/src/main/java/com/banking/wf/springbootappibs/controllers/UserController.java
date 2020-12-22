
package com.banking.wf.springbootappibs.controllers;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.banking.wf.springbootappibs.dto.SavingsAccountDTO;
import com.banking.wf.springbootappibs.dto.TransactionDTO;
import com.banking.wf.springbootappibs.dto.CustomerCredentialsDTO;
import com.banking.wf.springbootappibs.dto.CustomerDTO;
import com.banking.wf.springbootappibs.dto.FixedDepositDTO;
import com.banking.wf.springbootappibs.dto.RecurringDepositDTO;
import com.banking.wf.springbootappibs.entity.SavingsAccount;
import com.banking.wf.springbootappibs.entity.Transaction;
import com.banking.wf.springbootappibs.service.IdentityManagementService;
import com.banking.wf.springbootappibs.service.accountManagementService;




@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private accountManagementService accountManagementService;
	
	@Autowired
	private IdentityManagementService identityManagementService;
	
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index() {
		return "redirect:/index";
	}
	
	
	private String getLoggedInUserName() {
		/*
		 Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	
		if (principal instanceof UserDetails) { 
		
		
			return ((UserDetails) principal).getUsername();
		}
		return principal.toString();
		 */
		return "7777777777777771" ;
	}

	
	@RequestMapping(value="/userHome", method=RequestMethod.GET)
	public String getHomePage( ModelMap model) {
		model.put("customerInfo", this.identityManagementService.fetchSingleCustomer(Long.parseLong(getLoggedInUserName())));
		return "identityManagement/customerHome";
	}
	
	
	@RequestMapping(value="/userHome", method=RequestMethod.POST)
	public String userHome(@ModelAttribute("customerCreds") CustomerCredentialsDTO customerCreds, ModelMap model) 		//@Valid @ModelAttribute 
	{
		if(this.identityManagementService.checkIfCredentialsExists(customerCreds.getCustomerID()))
		{
			CustomerCredentialsDTO fectchedCredentialsDTO = this.identityManagementService.fetchSingleCustomerCredInfo(customerCreds.getCustomerID());
			String password = fectchedCredentialsDTO.getPassword();
			
			if(password.contains("OTPGEN"))
			{
				model.addAttribute("updateCusCred", new CustomerCredentialsDTO());
				model.put("reset", "request");
				model.put("creds", fectchedCredentialsDTO);
				return "identityManagement/customerResetPassword";
			}
			
			
			if(customerCreds.getPassword().equals(password))
			{
				CustomerDTO customerInfo = this.identityManagementService.fetchSingleCustomer(customerCreds.getCustomerID());
				model.put("customerInfo", customerInfo);
				return "identityManagement/customerHome";
			}
		}
		
		return "error-page";
	}
	
	@RequestMapping({"/logout", "/userHome/logout"})
	public String logout(Model model) {
		return "redirect:/index";
	}
	
	@RequestMapping(value="/passwordUpdate", method=RequestMethod.POST)
	public String passwordUpdate(@RequestParam("password") String password, @RequestParam("customerID") String customerID, @ModelAttribute("updateCusCred") CustomerCredentialsDTO updateCusCred, ModelMap model) {
		
		System.out.println(password);
		System.out.println(customerID);
		
		CustomerCredentialsDTO updatedCredDTO = this.identityManagementService.updatePassword(Long.parseLong(customerID), password);
		model.put("reset", "done");
		
		if(updatedCredDTO.getPassword().equals(password))
		{
			model.put("status", "done");
		}
		else
		{
			model.put("status", "notdone");
		}
		
		return "identityManagement/customerResetPassword";
	}
	
	@RequestMapping(value="/customerViewDetails", method=RequestMethod.GET)
	public String customerViewDetails(ModelMap model) 
	{
		CustomerDTO fetchedCustomer = this.identityManagementService.fetchSingleCustomer(Long.parseLong(getLoggedInUserName()));
		model.put("fetchedCustomer", fetchedCustomer);
		return "identityManagement/customerViewDetails";
	}
	
	public static String generateOTP() { 
	    Random rnd = new Random();
	    char [] digits = new char[11];
	    digits[0] = (char) (rnd.nextInt(9) + '1');
	    for(int i=1; i<digits.length; i++) {
	        digits[i] = (char) (rnd.nextInt(10) + '0');
	    }
	    return "OTPGEN" + new String(digits);
	}
	
	@RequestMapping(value="/custRegister", method=RequestMethod.POST)
	public String registerUser(@ModelAttribute("regCustomer") CustomerDTO regCustomer, ModelMap model) 
	{
		//customerDTO.setAccountID(Long.parseLong("00001"));
		regCustomer.setKycStatus("pending");
		CustomerDTO registeredCus = this.identityManagementService.addCustomer(regCustomer);
		System.out.println("added cus");
		CustomerCredentialsDTO creds = new CustomerCredentialsDTO(registeredCus.getCustomerID(), generateOTP());
		CustomerCredentialsDTO registeredCusCreds = this.identityManagementService.addCustomerCred(creds);
		System.out.println("added cus creds");
		model.put("customerID", registeredCus.getCustomerID());
		model.put("OTP", registeredCusCreds.getPassword());
		
		boolean updateFlag;
		if(registeredCus.getCustomerID()!=null && registeredCusCreds.getPassword()!=null)
		{
			updateFlag = true;
		} else {
			updateFlag = false;
		}
		
		model.put("updateFlag", updateFlag);
		
		return "identityManagement/customerRegistrationStatus";
	}
	
	//=======================================================================================
	
	

	
	@RequestMapping("/MiniStatement")
		public String MiniStatement(ModelMap model) {
			Long cusID = Long.parseLong(getLoggedInUserName());
			model.put("Id", getLoggedInUserName());
			List<Transaction> statement = this.accountManagementService.fetchAlltransactions(cusID);
			
			model.put("statement", statement);
			return "MiniStatement";
	}



//Fixed Deposit Section


/*
 @RequestMapping("/FixedDeposit_Application/{customerID}")
public String FixedDepositApp(ModelMap model,@PathVariable("customerID") String customerID) {
	//business logic 
	FixedDepositDTO fixedDepositInputDto = new FixedDepositDTO();
	model.addAttribute("transactionInputDto", fixedDepositInputDto);
	model.put("transactionInputDto", fixedDepositInputDto);
	model.put("custID", customerID);
	return "FixedDeposit_Application";
	
	
}
 
 */


@RequestMapping("/FixedDeposit_Success")
public String FixedDepositSuccess(@Valid @ModelAttribute FixedDepositDTO fixedDepositInputDto,
		BindingResult result, ModelMap model) {
	//business logic 
	FixedDepositDTO fixedDepositOutputDto = this.accountManagementService
			.saveFDDetails(fixedDepositInputDto,Long.parseLong(getLoggedInUserName()));
	
	model.addAttribute("fixedDepositOutputDto", fixedDepositOutputDto);
	model.put("fixedDepositOutputDto", fixedDepositOutputDto);
	return "FixedDeposit_Success";
	
	
}


@RequestMapping("/FixedDeposit_Application")
public String FixedDepositApp(ModelMap model) {
	//business logic 
	Long cusID = Long.parseLong(getLoggedInUserName());
	CustomerDTO customerCred = this.accountManagementService.findDetails(cusID);
	String accHolderFName = customerCred.getFirstName();
	String accHolderLName = customerCred.getLastName();
	String accHolderName = accHolderFName+" "+accHolderLName;
	customerCred.getLastName();
	FixedDepositDTO fixedDepositInputDto = new FixedDepositDTO();
	model.addAttribute("fixedDepositInputDto", fixedDepositInputDto);
	model.put("fixedDepositInputDto", fixedDepositInputDto);
	model.put("custID", getLoggedInUserName());
	model.put("accHolderName", accHolderName);
	
	return "FixedDeposit_Application";
	
	
}

@RequestMapping("/FixedDeposit_Verification")
public String FixedDepositVerify(ModelMap model) {
	//business logic 
	Long cusID = Long.parseLong(getLoggedInUserName());
	List<FixedDepositDTO> fixedDepositDto = this.accountManagementService.findFixedDeposit(cusID);
	model.addAttribute("fixedDepositDto", fixedDepositDto);
	model.put("fixedDepositDto", fixedDepositDto);
	return "FixedDeposit_Verification";
	
	
}




// Recurring Deposit Section

@RequestMapping("/RecurringDeposit_Success/{customerID}")
public String RecurringDepositSuccess(@Valid @ModelAttribute RecurringDepositDTO recurringDepositInputDto,
		BindingResult result, ModelMap model,@PathVariable("customerID") Long customerID) {
	//business logic 
	RecurringDepositDTO recurringDepositOutputDto = this.accountManagementService
			.saveRDDetails(recurringDepositInputDto,customerID);
	
	model.addAttribute("recurringDepositOutputDto", recurringDepositOutputDto);
	model.put("recurringDepositOutputDto", recurringDepositOutputDto);
	return "RecurringDeposit_Success";
	
	
}


@RequestMapping("/RecurringDeposit_Application/{customerID}")
public String RecurringDepositApp(ModelMap model,@PathVariable("customerID") String customerID) {
	//business logic 
	Long cusID = Long.parseLong(customerID);
	CustomerDTO customerCred = this.accountManagementService.findDetails(cusID);
	String accHolderFName = customerCred.getFirstName();
	String accHolderLName = customerCred.getLastName();
	String accHolderName = accHolderFName+" "+accHolderLName;
	customerCred.getLastName();
	RecurringDepositDTO recurringDepositInputDto = new RecurringDepositDTO();
	model.addAttribute("recurringDepositInputDto", recurringDepositInputDto);
	model.put("recurringDepositInputDto", recurringDepositInputDto);
	model.put("custID", customerID);
	model.put("accHolderName", accHolderName);
	
	return "RecurringDeposit_Application";
	
	
}

@RequestMapping("/RecurringDeposit_Verification/{customerID}")
public String RecurringDepositVerify(ModelMap model,@PathVariable("customerID") String customerID) {
	//business logic 
	Long cusID = Long.parseLong(customerID);
	List<RecurringDepositDTO> recurringDepositDto = this.accountManagementService.findRecurringDeposit(cusID);
	model.addAttribute("recurringDepositDto", recurringDepositDto);
	model.put("recurringDepositDto", recurringDepositDto);
	return "RecurringDeposit_Verification";
	
	
}

	@RequestMapping(value = "/Savings/{customerID}", method = RequestMethod.GET)
	public String savings(ModelMap model,@PathVariable("customerID") String customerID) {
		
		//model.put("Id", getLoggedInUserName());
		System.out.println(customerID);
		
		Long cusID = Long.parseLong(customerID);
		System.out.println(cusID);
		List<SavingsAccount> savings = this.accountManagementService.fetchAllSavingAcc(cusID);
		System.out.println(savings.get(0));
		model.put("savings", savings.get(0));
		//System.out.println(savings);
		//SavingsAccountDTO savings = new SavingsAccountDTO();
		//business logic 
		//model.addAttribute("savings",savings);
		
		return "SavingsBank";
	}
	
	
	
//Savings Bank section


@RequestMapping(value = "/FundTransfer", method = RequestMethod.GET)
public String FundTransfer() {
	//business logic 
	return "Fundtransfer";
	
	
}

@RequestMapping("/BillPayment")
public ModelAndView BillPayment() {
	//business logic 
	
	return new ModelAndView("BillPayement", "command", new SavingsAccount());
	
}

/*
 @RequestMapping(value = "/FundTransfer", method = RequestMethod.GET)
public ModelAndView FundTransfer() {
	//business logic 
	return new ModelAndView("FundTransfer", "command", new SavingsAccount());
	
	
}
 
 */

@RequestMapping("/StatementGeneration")

//business logic 
public String StatementGeneration(ModelMap model) {
	
	return "StatementGeneration1";


}



@RequestMapping("/MonthlyStatement")
public String MonthlyStatement1(ModelMap model) {
	TransactionDTO transactionInputDto = new TransactionDTO();
	model.addAttribute("transactionInputDto", transactionInputDto);
	
	return "MonthlyStatement";


}



@RequestMapping("/MonthlyStatement/{customerID}")
public String MonthlyStatement(ModelMap model,@PathVariable("customerID") String customerID) {
	TransactionDTO transactionInputDto = new TransactionDTO();
	model.addAttribute("transactionInputDto", transactionInputDto);
	model.put("transactionInputDto", transactionInputDto);
	model.put("custID", customerID);
	return "MonthlyStatement";
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


@RequestMapping("/MonthlyStatementDisplay/{custID}")
public String MonthlyStatementDisplay(@Valid @ModelAttribute TransactionDTO transactionInputDto,
	BindingResult result, ModelMap model,@PathVariable("custID") Long custID) {
	
	
	//Long id = Long.parseLong(getLoggedInUserName());
	//Long cusID = Long.parseLong(customerID);
	String month = transactionInputDto.getMonth();
	String year = transactionInputDto.getYear();
	
	String date = year+"-"+month+"-";
	List<Transaction> transaction = this.accountManagementService
			.fetchMonTrans(custID,date);
	model.addAttribute("transaction", transaction);
	model.put("transaction", transaction);
	switch(month) {
	case "01":
		month = "JANUARY";
	break;
	case "02":
		month = "FEBRAURY";
	break;
	case "03":
		month = "MARCH";
	break;
	case "04":
		month = "APRIL";
	break;
	case "05":
		month = "MAY";
	break;
	case "06":
		month = "JUNE";
	break;
	case "07":
		month = "JULY";
	break;
	case "08":
		month = "AUGUST";
	break;
	case "09":
		month = "SEPTEMBER";
	break;
	case "10":
		month = "OCTOBER";
	break;
	case "11":
		month = "NOVEMBER";
	break;
	case "12":
		month = "DECEMBER";
	break;
	
	}
	model.put("month", month);
	return "MonthlyStatementDisplay";
}







}

