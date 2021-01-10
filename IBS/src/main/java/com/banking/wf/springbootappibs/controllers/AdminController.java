package com.banking.wf.springbootappibs.controllers;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.banking.wf.springbootappibs.dto.AdminCredentialsDTO;
import com.banking.wf.springbootappibs.dto.CustomerDTO;
import com.banking.wf.springbootappibs.dto.ServiceProviderDTO;
import com.banking.wf.springbootappibs.dto.TransactionDTO;
import com.banking.wf.springbootappibs.entity.Transaction;
import com.banking.wf.springbootappibs.service.AccountManagementService;
import com.banking.wf.springbootappibs.service.IdentityManagementService;
import com.banking.wf.springbootappibs.service.ServiceProviderManagementService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AccountManagementService accountManagementService;
	
	@Autowired
	private IdentityManagementService identityManagementService;
	
	@Autowired
	private ServiceProviderManagementService serviceProviderManagementService;


	
	@RequestMapping(value="/adminHome", method=RequestMethod.POST)
	public String adminHome(@ModelAttribute("adminCreds") AdminCredentialsDTO adminCreds, ModelMap model) 		//@Valid @ModelAttribute 
	{
		System.out.println(adminCreds.getAdminID());
		System.out.println(adminCreds.getPassword());
		
		if(adminCreds.getAdminID().equals("admin") && adminCreds.getPassword().equals("admin"))
		{
				return "identityManagement/adminHome";
		}
		
		return "error-page";
	}
	
	@RequestMapping(value="/adminHome", method=RequestMethod.GET)
	public String adminHome() 		//@Valid @ModelAttribute 
	{
		return "identityManagement/adminHome";
	}
	
	
	@RequestMapping("/userRegProcess")
	public String userRegProcess(ModelMap model) 
	{
		List<CustomerDTO> list_customers = this.identityManagementService.fetchAllKYCPendingCustomers();
		model.put("list_customers", list_customers);
		return "identityManagement/adminApproveRegistration";
		
	}
	
	
	@RequestMapping(value="/approveKYC/{customerID}", method=RequestMethod.GET)
	public String approveKYC(ModelMap model,@PathVariable("customerID") String customerID) {
		CustomerDTO updatedCust = this.identityManagementService.updateKYCStatus(Long.parseLong(customerID), "approved");
		model.put("updatedCust", updatedCust);
		return "identityManagement/adminApproveKYC";
	}
	
	
	
	@RequestMapping(value="/declineKYC/{customerID}", method=RequestMethod.GET)
	public String declineKYC(ModelMap model,@PathVariable("customerID") String customerID) {
		CustomerDTO updatedCust = this.identityManagementService.updateKYCStatus(Long.parseLong(customerID), "decline");
		model.put("updatedCust", updatedCust);
		return "identityManagement/adminDeclineKYC";
	}
	

	@RequestMapping({"/logout", "/adminHome/logout"})
	public String logout(Model model) {
		return "redirect:/index";
	}
	
	//---------------------- Sruthi ----------------------------------//
	// Statement Generation Section

			@RequestMapping("/MonthlyStatement")

			//business logic 
			public String MonthlyStatement(ModelMap model) {
				TransactionDTO transactionInputDto = new TransactionDTO();
				model.addAttribute("transactionInputDto", transactionInputDto);
				model.put("transactionInputDto", transactionInputDto);
				//model.put("custID", customerID);
				return "accountManagement/adminMonthlyStatement";


			}


			@RequestMapping("/MonthlyStatementDisplay")


			public String MonthlyStatementDisplay(@Valid @ModelAttribute TransactionDTO transactionInputDto,
				BindingResult result, ModelMap model) {
				
				
				//Long id = Long.parseLong(getLoggedInUserName());
				//Long cusID = Long.parseLong(customerID);
				String month = transactionInputDto.getMonth();
				String year = transactionInputDto.getYear();
				String date = year+"-"+month+"-";
				Long custID = transactionInputDto.getCustomerId();
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
				return "accountManagement/adminMonthlyStatementDisplay";
			}


			// Statement generation section

			@RequestMapping("/PeriodicStatement")

			//business logic 
			public String PeriodicStatement(ModelMap model) {
				TransactionDTO transactionInputDto = new TransactionDTO();
				model.addAttribute("transactionInputDto", transactionInputDto);
				model.put("transactionInputDto", transactionInputDto);
				//model.put("custID", customerID);
				return "accountManagement/adminPeriodicStatement";


			}


			@RequestMapping("/PeriodicStatementDisplay")
			public String PeriodicStatementDisplay(@Valid @ModelAttribute TransactionDTO transactionInputDto,
				BindingResult result, ModelMap model) {
				
				
				//Long id = Long.parseLong(getLoggedInUserName());
				//Long cusID = Long.parseLong(customerID);
				String startDate = transactionInputDto.getStartDate();
				String endDate = transactionInputDto.getEndDate();
				Long custID = transactionInputDto.getCustomerId();
				List<Transaction> transaction = this.accountManagementService
						.fetchPerTrans(custID,startDate,endDate);
				model.addAttribute("transaction", transaction);
				model.put("transaction", transaction);
				return "accountManagement/adminPeriodicStatementDisplay";
			}


			@RequestMapping("/AnnualStatement")

			//business logic 
			public String AnnualStatement(ModelMap model) {
				TransactionDTO transactionInputDto = new TransactionDTO();
				model.addAttribute("transactionInputDto", transactionInputDto);
				model.put("transactionInputDto", transactionInputDto);
				//model.put("custID", customerID);
				return "accountManagement/adminAnnualStatement";


			}

			@RequestMapping("/AnnualStatementDisplay")


			public String AnnualStatementDisplay(@Valid @ModelAttribute TransactionDTO transactionInputDto,
				BindingResult result, ModelMap model) {
				
				
				//Long id = Long.parseLong(getLoggedInUserName());
				//Long cusID = Long.parseLong(customerID);
				String year = transactionInputDto.getYear();
				String[] a1 = year.split("-");
				String year1= a1[0];
				String year2= a1[1];
				Long custID = transactionInputDto.getCustomerId();
				List<Transaction> transaction = this.accountManagementService
						.fetchAnnTrans(custID,year1,year2);
				model.addAttribute("transaction", transaction);
				model.put("transaction", transaction);
				model.put("year", year);
				return "accountManagement/adminAnnualStatementDisplay";
			}


			//Withdrawal section
			@RequestMapping(value="/Withdrawal", method = RequestMethod.GET)

			public String WithdrawalAdmin(ModelMap model) {
				//business logic 
				TransactionDTO transactionInputDto = new TransactionDTO();
				model.addAttribute("transactionInputDto", transactionInputDto);
				model.put("transactionInputDto", transactionInputDto);
				return "accountManagement/adminWithdrawal";
				
			}

			@RequestMapping(value="/Withdrawal_Success", method = RequestMethod.POST)

			public String WithdrawalSuccess(@ModelAttribute ("transactionInputDto") TransactionDTO transactionInputDto,ModelMap model) {
				//business logic 
				Long customerID = transactionInputDto.getCustomerId();
				TransactionDTO transactionOutputDTO = this.accountManagementService
						.saveWithdrawTxnDetails(transactionInputDto,customerID);
				model.addAttribute("transactionOutputDTO", transactionOutputDTO);
				return "accountManagement/adminWithdrawalSuccess";
				
			}
			
			@RequestMapping(value="/RegisterServiceProvider", method = RequestMethod.GET)

			public String RegisterServiceProvider(ModelMap model) {
				//business logic 
				ServiceProviderDTO serviceInputDto = new ServiceProviderDTO();
				model.addAttribute("serviceInputDto", serviceInputDto);
				model.put("serviceInputDto", serviceInputDto);
				return "serviceProviderManagement/adminServiceProviderRegister";
				
			}
			
			@RequestMapping(value="/ViewServiceProviderDetails", method = RequestMethod.POST)

			public String RegisterServiceProviderView(@ModelAttribute ("serviceInputDto") ServiceProviderDTO serviceInputDto,ModelMap model) {
				//business logic 
				
				ServiceProviderDTO serviceDto = this.serviceProviderManagementService
						.SaveSPIdetails(serviceInputDto);
				model.addAttribute("serviceDto", serviceDto);
				model.put("serviceInputDto", serviceInputDto);
				return "serviceProviderManagement/adminServiceProviderViewDetails";
				
			}
			
			@RequestMapping(value="/ApproveDeclineSP", method = RequestMethod.GET)

			public String ApproveDeclineServiceProvider(ModelMap model) {
				//business logic 
				
				List<ServiceProviderDTO> serviceDto = this.serviceProviderManagementService
						.fetchSPIdetails();
				
				model.addAttribute("serviceDto", serviceDto);
				model.put("serviceDto", serviceDto);
				return "serviceProviderManagement/adminApproveServiceRegistration";
				
			}
			
			@RequestMapping(value="/approveSPKYC/{spi}", method=RequestMethod.GET)
			public String approveSPKYC(ModelMap model,@PathVariable("spi") String spi) {
				ServiceProviderDTO serviceDto = this.serviceProviderManagementService.updateKYCStatus(Long.parseLong(spi), "approved");
				model.put("serviceDto", serviceDto);
				return "serviceProviderManagement/adminApproveSPKYC";
			}
			
			
			
			@RequestMapping(value="/declineSPKYC/{spi}", method=RequestMethod.GET)
			public String declineSPKYC(ModelMap model,@PathVariable("spi") String spi) {
				ServiceProviderDTO serviceDto = this.serviceProviderManagementService.updateKYCStatus(Long.parseLong(spi), "decline");
				model.put("serviceDto", serviceDto);
				return "serviceProviderManagement/adminDeclineSPKYC";
			}
			
		
}
