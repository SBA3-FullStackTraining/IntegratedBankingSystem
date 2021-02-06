
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
import com.banking.wf.springbootappibs.dto.ServiceProviderDTO;
import com.banking.wf.springbootappibs.dto.SessionDataDTO;
import com.banking.wf.springbootappibs.dto.TransactionDTO;
import com.banking.wf.springbootappibs.dto.BeneficiaryDTO;
import com.banking.wf.springbootappibs.dto.CustomerCredentialsDTO;
import com.banking.wf.springbootappibs.dto.CustomerDTO;
import com.banking.wf.springbootappibs.dto.FixedDepositDTO;
import com.banking.wf.springbootappibs.dto.LoanDTO;
import com.banking.wf.springbootappibs.dto.LoanEmiDTO;
import com.banking.wf.springbootappibs.dto.LoanOutputDTO;
import com.banking.wf.springbootappibs.dto.RecurringDepositDTO;
import com.banking.wf.springbootappibs.entity.FixedDeposit;
import com.banking.wf.springbootappibs.entity.SavingsAccount;
import com.banking.wf.springbootappibs.entity.ServiceProvider;
import com.banking.wf.springbootappibs.entity.Transaction;
import com.banking.wf.springbootappibs.service.AccountManagementService;
import com.banking.wf.springbootappibs.service.BeneficiaryManagementService;
import com.banking.wf.springbootappibs.service.IdentityManagementService;
import com.banking.wf.springbootappibs.service.LoanManagementService;
import com.banking.wf.springbootappibs.service.ServiceProviderManagementService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private AccountManagementService accountManagementService;
	
	@Autowired
	private IdentityManagementService identityManagementService;
	
	@Autowired
	private BeneficiaryManagementService beneficiaryManagementService;

	@Autowired
	private ServiceProviderManagementService serviceProviderManagementService;

	@Autowired
	private LoanManagementService loanmanagementservice;

	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index() {
		return "redirect:/index";
	} 
	
	
	private String getLoggedInUserName() {
		return this.identityManagementService.fetchUserLoggedIn().getLoggedInUser();
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
				this.identityManagementService.updateUser(Long.toString(customerCreds.getCustomerID()));
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
		
		CustomerCredentialsDTO updatedCredDTO = this.identityManagementService.addCustomerCred(updateCusCred);
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
	
	@RequestMapping(value="/passwordUpdate", method=RequestMethod.GET)
	public String passwordUpdate(ModelMap model) {
		CustomerCredentialsDTO fectchedCredentialsDTO = this.identityManagementService.fetchSingleCustomerCredInfo(Long.parseLong(getLoggedInUserName()));
		model.addAttribute("updateCusCred", new CustomerCredentialsDTO());
		model.put("reset", "request");
		model.put("creds", fectchedCredentialsDTO);
		return "identityManagement/customerResetPassword";
	}
	
	
	@RequestMapping(value="/viewAllBeneficiary", method=RequestMethod.GET)
	public String viewAllBeneficiary(ModelMap model) {
		List<BeneficiaryDTO> beneficiaryList = this.beneficiaryManagementService.fetchAllBeneficiariesByCustID(Long.parseLong(getLoggedInUserName()));
		model.put("beneficiaryList", beneficiaryList);
		return "beneficiaryManagement/viewAllBeneficiary";
	}
	
	@RequestMapping(value="/processModifyBenf/{beneficiaryID}", method=RequestMethod.GET)
	public String processModifyBenf(ModelMap model,@PathVariable("beneficiaryID") String beneficiaryID) {
		BeneficiaryDTO fetchedBenf = this.beneficiaryManagementService.fetchSingleBeneficiary(Long.parseLong(beneficiaryID));
		
		model.put("fetchedBenf", fetchedBenf);
		model.put("newModifiedBenf", new BeneficiaryDTO());
		return "beneficiaryManagement/processModifyBenf";
	}
	
	
	@RequestMapping(value="/saveModifiedBeneficiary", method=RequestMethod.POST)
	public String saveModifiedBeneficiary(@ModelAttribute("newModifiedBenf") BeneficiaryDTO newModifiedBenf, ModelMap model) 
	{
		newModifiedBenf.setCustomerID(Long.parseLong(getLoggedInUserName()));
		System.out.println(newModifiedBenf.getCustomerID());
		System.out.println(newModifiedBenf.getBeneficiaryID());
		System.out.println(newModifiedBenf.getBenfAccHolderName());
		System.out.println(newModifiedBenf.getBenfBankAccID());
		System.out.println(newModifiedBenf.getBenfBankIFSC());
		System.out.println(newModifiedBenf.getBenfBankAccountType());
		System.out.println(newModifiedBenf.getBenfRelation());
		
		BeneficiaryDTO updatedBenf = this.beneficiaryManagementService.updateBeneficiaryData(newModifiedBenf);
		model.put("updatedBenf", updatedBenf);
		return "beneficiaryManagement/newBeneficiary";
	}
	
	@RequestMapping(value="/addBeneficiary", method=RequestMethod.GET)
	public String addBeneficiary(ModelMap model) 
	{
		model.put("newBenf", new BeneficiaryDTO());
		return "beneficiaryManagement/addBeneficiary";
	}
	
	@RequestMapping(value="/modifyBeneficiary", method=RequestMethod.GET)
	public String modifyBeneficiary(ModelMap model) 
	{
		List<BeneficiaryDTO> beneficiaryList = this.beneficiaryManagementService.fetchAllBeneficiariesByCustID(Long.parseLong(getLoggedInUserName()));
		model.put("beneficiaryList", beneficiaryList);
		return "beneficiaryManagement/modifyBeneficiary";
	}
	
	@RequestMapping(value="/newBeneficiary", method=RequestMethod.POST)
	public String newBeneficiary(@ModelAttribute("newBenf") BeneficiaryDTO newBenf, ModelMap model) 
	{
		System.out.println(newBenf.getCustomerID());
		newBenf.setCustomerID(Long.parseLong(getLoggedInUserName()));
		System.out.println(newBenf.getCustomerID());
		BeneficiaryDTO updatedBenf = this.beneficiaryManagementService.updateBeneficiaryData(newBenf);
		model.put("updatedBenf", updatedBenf);
		return "beneficiaryManagement/newBeneficiary";
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
	
	
	
	
	
	//#######################################Sr################################################//
	
	
	// Savings Account session
	
				@RequestMapping(value = "/Savings", method = RequestMethod.GET)
				public String savings(ModelMap model) {
					model.put("Id", getLoggedInUserName());
					Long id = Long.parseLong(getLoggedInUserName());
					System.out.println(id);
					
					//Long cusID = Long.parseLong(customerID);
					List<SavingsAccount> savings = this.accountManagementService.fetchAllSavingAcc(id);
					System.out.println(savings.get(0));
					model.put("savings", savings.get(0));
					//System.out.println(savings);
					//SavingsAccountDTO savings = new SavingsAccountDTO();
					//business logic 
					//model.addAttribute("savings",savings);
					
					return "accountManagement/custSavingsBank";
				}
				
				@RequestMapping(value="/Savings_Application", method=RequestMethod.GET)
				
				public String SavingsApp(ModelMap model) {
					//business logic 
					model.put("Id", getLoggedInUserName());
					Long id = Long.parseLong(getLoggedInUserName());
					CustomerDTO customerCred = this.accountManagementService.findDetails(id);
					String accHolderFName = customerCred.getFirstName();
					String accHolderLName = customerCred.getLastName();
					String accHolderName = accHolderFName+" "+accHolderLName;
					customerCred.getLastName();
					SavingsAccountDTO savingsInputDto = new SavingsAccountDTO();
					model.addAttribute("savingsInputDto", savingsInputDto);
					model.put("savingsInputDto", savingsInputDto);
					model.put("custID", id);
					model.put("accHolderName", accHolderName);
					
					return "accountManagement/custSavingsApplication";
					
					
				}


				@RequestMapping(value="/Savings_Success", method=RequestMethod.POST)
				
				public String SavingsSuccess(@ModelAttribute SavingsAccountDTO savingsInputDto, ModelMap model) {
					//business logic
					model.put("Id", getLoggedInUserName());
					Long id = Long.parseLong(getLoggedInUserName());
					SavingsAccountDTO savingsOutputDto = this.accountManagementService
							.saveSavingsDetails(savingsInputDto,id);
					
					//model.addAttribute("savingsOutputDto", savingsOutputDto);
					model.put("savingsOutputDto", savingsOutputDto);
					return "accountManagement/custSavingsSuccess";
					
					
				}

				
			//Bill Payment section

			@RequestMapping(value="/BillPayment", method=RequestMethod.GET)	

			public String BillPaymentsApp(ModelMap model) {
				//business logic 
				model.put("Id", getLoggedInUserName());
				Long id = Long.parseLong(getLoggedInUserName());
				List<SavingsAccount> savings = this.accountManagementService.fetchAllSavingAcc(id);
				model.put("savings", savings.get(0));
				TransactionDTO transactionDTO = new TransactionDTO();
				model.addAttribute("transactionDTO", transactionDTO);
				ServiceProviderDTO serviceProviderInputDto = new ServiceProviderDTO();
				model.addAttribute("serviceProviderInputDto", serviceProviderInputDto);
				List<ServiceProviderDTO> serviceProvider = this.accountManagementService.fetchApprovedSPIdetails();
				model.put("serviceProvider", serviceProvider);
				return "accountManagement/custBillPayment";

			}


			//@RequestMapping("/BillPayment_Success/{customerID}")
			@RequestMapping(value = "/BillPayment_Success", method = RequestMethod.POST)
			public String BillPaymentsSuccess(@ModelAttribute("transactionDTO")  TransactionDTO transactionDTO,ModelMap model) {
				//business logic 
				//TransactionDTO transactionOutputDto = new TransactionDTO();
				model.put("Id", getLoggedInUserName());
				Long id = Long.parseLong(getLoggedInUserName());
				TransactionDTO transactionOutputDto = this.accountManagementService
						.saveSPTxnDetails(transactionDTO,id);
				model.addAttribute("transactionOutputDto", transactionOutputDto);
				//model.put("transactionOutputDto", transactionOutputDto);
				//return "BillPayment_Success";
				return "accountManagement/custBillPaymentSuccess";
				

			}

			// Fund Transfer Section
			@RequestMapping(value="/FundTransfer", method=RequestMethod.GET)	


			//business logic 
			public String Fundtransfer(ModelMap model) {
				
				model.put("Id", getLoggedInUserName());
				Long id = Long.parseLong(getLoggedInUserName());
				List<SavingsAccount> savings = this.accountManagementService.fetchAllSavingAcc(id);
				model.put("savings", savings.get(0));
				model.put("cusID", id);
				List<BeneficiaryDTO> beneficiary =this.accountManagementService .fetchAllBeneficiary(id);
				model.put("beneficiary", beneficiary);
				CustomerCredentialsDTO fectchedCredentialsDTO = this.identityManagementService.fetchSingleCustomerCredInfo(id);
				model.put("fectchedCredentialsDTO", fectchedCredentialsDTO);
				TransactionDTO transactionDTO = new TransactionDTO();
				model.addAttribute("transactionDTO", transactionDTO);
				return "accountManagement/custFundTransfer";
				


			}




			@RequestMapping(value="/FundTransfer_Success", method = RequestMethod.POST)

			//business logic 
			public String FundtransferSuccess( @ModelAttribute ("transactionDTO") TransactionDTO transactionDTO,ModelMap model) {
				//Long cusID = Long.parseLong(customerID);
				//TransactionDTO transactionOutputDto = new TransactionDTO();
				model.put("Id", getLoggedInUserName());
				Long id = Long.parseLong(getLoggedInUserName());
				TransactionDTO transactionOutputDTO = this.accountManagementService
						.saveTxnDetails(transactionDTO,id);
				model.addAttribute("transactionOutputDTO", transactionOutputDTO);
				//model.put("transactionOutputDTO", transactionOutputDTO);
				return "accountManagement/custFundTransferSuccess";
				


			}


			// Statement Generation Section

			@RequestMapping("/MiniStatement")

				//business logic 
				public String MiniStatement(ModelMap model) {
					//model.put("Id", getLoggedInUserName());
					//Long ID = Long.parseLong(getLoggedInUserName());
					model.put("Id", getLoggedInUserName());
					Long id = Long.parseLong(getLoggedInUserName());
					//Long cusID = Long.parseLong(id);
					List<Transaction> statement = this.accountManagementService.fetchAlltransactions(id);
					
					model.put("statement", statement);
					return "accountManagement/custMiniStatement";
				
				
			}


			@RequestMapping("/MonthlyStatement")

			//business logic 
			public String MonthlyStatement(ModelMap model) {
				model.put("Id", getLoggedInUserName());
				Long id = Long.parseLong(getLoggedInUserName());
				TransactionDTO transactionInputDto = new TransactionDTO();
				model.addAttribute("transactionInputDto", transactionInputDto);
				model.put("transactionInputDto", transactionInputDto);
				model.put("custID", id);
				return "accountManagement/custMonthlyStatement";


			}

			@RequestMapping("/AnnualStatement")

			//business logic 
			public String AnnualStatement(ModelMap model) {
				model.put("Id", getLoggedInUserName());
				Long id = Long.parseLong(getLoggedInUserName());
				TransactionDTO transactionInputDto = new TransactionDTO();
				model.addAttribute("transactionInputDto", transactionInputDto);
				model.put("transactionInputDto", transactionInputDto);
				model.put("custID", id);
				return "accountManagement/custAnnualStatement";


			}

			@RequestMapping("/PeriodicStatement")

			//business logic 
			public String PeriodicStatement(ModelMap model) {
				model.put("Id", getLoggedInUserName());
				Long id = Long.parseLong(getLoggedInUserName());
				TransactionDTO transactionInputDto = new TransactionDTO();
				model.addAttribute("transactionInputDto", transactionInputDto);
				model.put("transactionInputDto", transactionInputDto);
				model.put("custID", id);
				return "accountManagement/custPeriodicStatement";


			}

			@RequestMapping("/MonthlyStatementDisplay")


			public String MonthlyStatementDisplay(@Valid @ModelAttribute TransactionDTO transactionInputDto,
				BindingResult result, ModelMap model) {
				
				model.put("Id", getLoggedInUserName());
				Long id = Long.parseLong(getLoggedInUserName());
				//Long id = Long.parseLong(getLoggedInUserName());
				//Long cusID = Long.parseLong(customerID);
				String month = transactionInputDto.getMonth();
				String year = transactionInputDto.getYear();
				
				String date = year+"-"+month+"-";
				List<Transaction> transaction = this.accountManagementService
						.fetchMonTrans(id,date);
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
				return "accountManagement/custMonthlyStatementDisplay";
			}





			@RequestMapping("/PeriodicStatementDisplay")


			public String PeriodicStatementDisplay(@Valid @ModelAttribute TransactionDTO transactionInputDto,
				BindingResult result, ModelMap model) {
				
				model.put("Id", getLoggedInUserName());
				Long id = Long.parseLong(getLoggedInUserName());
				//Long id = Long.parseLong(getLoggedInUserName());
				//Long cusID = Long.parseLong(customerID);
				String startDate = transactionInputDto.getStartDate();
				String endDate = transactionInputDto.getEndDate();
				List<Transaction> transaction = this.accountManagementService
						.fetchPerTrans(id,startDate,endDate);
				model.addAttribute("transaction", transaction);
				model.put("transaction", transaction);
				return "accountManagement/custPeriodicStatementDisplay";
			}




			@RequestMapping("/AnnualStatementDisplay")


			public String AnnualStatementDisplay(@Valid @ModelAttribute TransactionDTO transactionInputDto,
				BindingResult result, ModelMap model) {
				
				model.put("Id", getLoggedInUserName());
				Long id = Long.parseLong(getLoggedInUserName());
				
				//Long id = Long.parseLong(getLoggedInUserName());
				//Long cusID = Long.parseLong(customerID);
				String year = transactionInputDto.getYear();
				String[] a1 = year.split("-");
				String year1= a1[0];
				String year2= a1[1];
				List<Transaction> transaction = this.accountManagementService
						.fetchAnnTrans(id,year1,year2);
				model.addAttribute("transaction", transaction);
				model.put("transaction", transaction);
				model.put("year", year);
				return "accountManagement/custAnnualStatementDisplay";
			}

			// Fixed Deposit Section

			@RequestMapping(value="/FixedDeposit_Application", method = RequestMethod.GET)

			public String FixedDepositApp(ModelMap model) {
				//business logic 
				model.put("Id", getLoggedInUserName());
				Long id = Long.parseLong(getLoggedInUserName());
				//Long cusID = Long.parseLong(customerID);
				CustomerDTO customerCred = this.accountManagementService.findDetails(id);
				String accHolderFName = customerCred.getFirstName();
				String accHolderLName = customerCred.getLastName();
				String accHolderName = accHolderFName+" "+accHolderLName;
				customerCred.getLastName();
				FixedDepositDTO fixedDepositInputDto = new FixedDepositDTO();
				model.addAttribute("fixedDepositInputDto", fixedDepositInputDto);
				model.put("fixedDepositInputDto", fixedDepositInputDto);
				model.put("custID", id);
				model.put("accHolderName", accHolderName);
				
				return "accountManagement/custFixedDepositApplication";
				
				
			}

			@RequestMapping(value="/FixedDeposit_Success", method = RequestMethod.POST)

			public String FixedDepositSuccess(@Valid @ModelAttribute FixedDepositDTO fixedDepositInputDto,
					BindingResult result, ModelMap model) {
				//business logic 
				model.put("Id", getLoggedInUserName());
				Long id = Long.parseLong(getLoggedInUserName());
				FixedDepositDTO fixedDepositOutputDto = this.accountManagementService
						.saveFDDetails(fixedDepositInputDto,id);
				
				model.addAttribute("fixedDepositOutputDto", fixedDepositOutputDto);
				model.put("fixedDepositOutputDto", fixedDepositOutputDto);
				return "accountManagement/custFixedDepositSuccess";
				
				
			}



			@RequestMapping(value="/FixedDeposit_Verification", method = RequestMethod.GET)

			public String FixedDepositVerify(ModelMap model) {
				//business logic 
				
				model.put("Id", getLoggedInUserName());
				Long id = Long.parseLong(getLoggedInUserName());
				List<FixedDepositDTO> fixedDepositDto = this.accountManagementService.findFixedDeposit(id);
				model.addAttribute("fixedDepositDto", fixedDepositDto);
				model.put("fixedDepositDto", fixedDepositDto);
				return "accountManagement/custFixedDepositVerification";
				
				
			}




			// Recurring Deposit Section


			@RequestMapping(value="/RecurringDeposit_Application", method = RequestMethod.GET)

			public String RecurringDepositApp(ModelMap model) {
				//business logic 
				model.put("Id", getLoggedInUserName());
				Long id = Long.parseLong(getLoggedInUserName());
				CustomerDTO customerCred = this.accountManagementService.findDetails(id);
				String accHolderFName = customerCred.getFirstName();
				String accHolderLName = customerCred.getLastName();
				String accHolderName = accHolderFName+" "+accHolderLName;
				customerCred.getLastName();
				RecurringDepositDTO recurringDepositInputDto = new RecurringDepositDTO();
				model.addAttribute("recurringDepositInputDto", recurringDepositInputDto);
				model.put("recurringDepositInputDto", recurringDepositInputDto);
				model.put("custID", id);
				model.put("accHolderName", accHolderName);
				
				return "accountManagement/custRecurringDepositApplication";
				
				
			}

			@RequestMapping(value="/RecurringDeposit_Success", method = RequestMethod.POST)

			public String RecurringDepositSuccess(@Valid @ModelAttribute RecurringDepositDTO recurringDepositInputDto,
					BindingResult result, ModelMap model) {
				//business logic 
				model.put("Id", getLoggedInUserName());
				Long id = Long.parseLong(getLoggedInUserName());
				RecurringDepositDTO recurringDepositOutputDto = this.accountManagementService
						.saveRDDetails(recurringDepositInputDto,id);
				
				model.addAttribute("recurringDepositOutputDto", recurringDepositOutputDto);
				model.put("recurringDepositOutputDto", recurringDepositOutputDto);
				return "accountManagement/custRecurringDepositSuccess";
				
				
			}

			@RequestMapping(value="/RecurringDeposit_Verification", method = RequestMethod.GET)

			public String RecurringDepositVerify(ModelMap model) {
				//business logic 
				model.put("Id", getLoggedInUserName());
				Long id = Long.parseLong(getLoggedInUserName());
				List<RecurringDepositDTO> recurringDepositDto = this.accountManagementService.findRecurringDeposit(id);
				model.addAttribute("recurringDepositDto", recurringDepositDto);
				model.put("recurringDepositDto", recurringDepositDto);
				return "accountManagement/custRecurringDepositVerification";
				
				
			}
			
			@RequestMapping(value="/ServiceManagement", method = RequestMethod.GET)

			public String ServiceProvider(ModelMap model) {
				//business logic 
				model.put("Id", getLoggedInUserName());
				Long id = Long.parseLong(getLoggedInUserName());
				List<ServiceProviderDTO> serviceProviderDto = this.serviceProviderManagementService.fetchApprovedSPIdetails();
				model.addAttribute("serviceProviderDto", serviceProviderDto);
				model.put("serviceProviderDto", serviceProviderDto);
				return "serviceProviderManagement/custServiceProvider";
				
			}

			@RequestMapping(value="/ApplyLoan", method = RequestMethod.GET)

			public String applyLoan(ModelMap model) {
				//business logic 
				model.put("Id", getLoggedInUserName());
				Long id = Long.parseLong(getLoggedInUserName());
				System.out.println(id);
				LoanDTO loandto = new LoanDTO();
			    model.addAttribute("LoanDTO", loandto);
			    model.put("LoanDTO", loandto);
			    //model.put("CusID", id);
			    return "loanManagement/CustApplyForLoan";
			}
			
			@RequestMapping(value="/LoanApplied")
			public String loansubmitted(@Valid @ModelAttribute ("LoanDTO") LoanDTO loandto, ModelMap model) {
				
				model.put("Id", getLoggedInUserName());
				Long id = Long.parseLong(getLoggedInUserName());
				LoanOutputDTO loanoutputdto = this.loanmanagementservice.applyLoan(id, loandto);
				model.addAttribute("LoanOutputDTO", loanoutputdto);
				model.put("LoanOutputDTO", loanoutputdto);
				return "loanManagement/loan-confirm";
			}
			
			@RequestMapping(value="/PayLoanEmi")
			public String fetchloanemi(ModelMap model) {
				model.put("Id", getLoggedInUserName());
				Long id = Long.parseLong(getLoggedInUserName());
				System.out.println(id);
				String status = "Approved";
				List<LoanOutputDTO> loanoutputdto = this.loanmanagementservice.fetchAllLoans(id, status);
				model.put("LoanOutputDTO", loanoutputdto);
				return "loanManagement/payloanemi";
			}
            
			@RequestMapping(value="/LoanEmiDetails/{loanId}/{emi}/{customerId}",  method=RequestMethod.GET)
			   public String fetchloandetails(LoanEmiDTO loanemidto,@PathVariable("customerId") Long customerId, @PathVariable("loanId") Long loanId,@PathVariable("emi") Double emi, ModelMap model) {
				   model.put("Id", getLoggedInUserName());
				   Long id = Long.parseLong(getLoggedInUserName());
				   System.out.println("Loan id "+ loanId);
				   //loanoutputdto = this.loanmanagementservice.fetchLoan(loanId);
				   model.addAttribute("LoanEmiDTO", loanemidto);
				   model.put("emi", loanemidto);
				   model.put("LoanEmiDTO", loanemidto);
				   return "loanManagement/emidetails";
			   }
			 
			@RequestMapping(value="/emiconfirm")
			public String emipaid(@Valid @ModelAttribute ("LoanEmiDTO") LoanEmiDTO loanEmidto, ModelMap model) {
				
				model.put("Id", getLoggedInUserName());
				Long id = Long.parseLong(getLoggedInUserName());
				LoanEmiDTO loanemidto = this.loanmanagementservice.payemi(loanEmidto);
				//model.addAttribute("LoanEmiDTO", loanemidto);
				model.put("LoanEmiDTO", loanemidto);
				return "loanManagement/EMIConfirm";
			   
			}
            
			@RequestMapping(value="/LoanStatement")
			public String fetchloanst(ModelMap model) {
				model.put("Id", getLoggedInUserName());
				Long id = Long.parseLong(getLoggedInUserName());
				System.out.println(id);
				String status = "Approved";
				List<LoanOutputDTO> loanoutputdto = this.loanmanagementservice.fetchAllLoans(id, status);
				model.put("LoanOutputDTO", loanoutputdto);
				return "loanManagement/generateloanst";
			}
           
			@RequestMapping(value="/loanstatementdisplay/{loanId}", method=RequestMethod.GET)
			public String loanstatement(@PathVariable("loanId") Long loanId,ModelMap model) {
				model.put("Id", getLoggedInUserName());
				Long id = Long.parseLong(getLoggedInUserName());
				System.out.println(id);
			    List<LoanEmiDTO> loanemidto = this.loanmanagementservice.fetchAllEmistatement(loanId);
				model.put("LoanEmiDTO", loanemidto);
				return "loanManagement/statement_generation";
			}
			
			@RequestMapping(value="/LoanPreClose")
			public String fetchloanpreclose(ModelMap model) {
				model.put("Id", getLoggedInUserName());
				Long id = Long.parseLong(getLoggedInUserName());
				System.out.println(id);
				String status = "Approved";
				List<LoanOutputDTO> loanoutputdto = this.loanmanagementservice.fetchAllLoans(id, status);
				model.put("LoanOutputDTO", loanoutputdto);
				return "loanManagement/loanpreclosefetchloan";
			}
			
			@RequestMapping(value="/LoanPreCloseSubmit/{loanId}", method=RequestMethod.GET)
			   public String fetchloandetails(@Valid @ModelAttribute ("LoanOutputDTO") LoanOutputDTO loanoutputdto, @PathVariable("loanId") Long loanId, ModelMap model) {
				   System.out.println("prclose "+loanId);
				   loanoutputdto = this.loanmanagementservice.fetchLoan(loanId);
				   model.addAttribute("LoanOutputDTO", loanoutputdto);
				   model.put("LoanOutputDTO", loanoutputdto);
				   return "loanManagement/LoanPreCloseSubmit";
			}
			
			@RequestMapping(value="/LoanPreClosesummary")
			public String emipaid(@Valid @ModelAttribute ("LoanOutputDTO") LoanDTO loandto, ModelMap model) {
				
				model.put("Id", getLoggedInUserName());
				Long id = Long.parseLong(getLoggedInUserName());
				LoanOutputDTO loanoutputdto = this.loanmanagementservice.loanpreclose(loandto);
				//model.addAttribute("LoanEmiDTO", loanemidto);
				model.put("LoanOutputDTO", loanoutputdto);
				return "loanManagement/PreClosereqsubmitted";
			}


}

