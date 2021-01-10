package com.banking.wf.springbootappibs.service;

import java.util.List;

import com.banking.wf.springbootappibs.dto.AccountDTO;
import com.banking.wf.springbootappibs.dto.CustomerCredentialsDTO;
import com.banking.wf.springbootappibs.dto.CustomerDTO;
import com.banking.wf.springbootappibs.dto.SessionDataDTO;


public interface IdentityManagementService 
{
	//for Customer
	public List<CustomerDTO> fetchAllCustomers();
	public CustomerDTO fetchSingleCustomer(Long id);
	public CustomerDTO addCustomer(CustomerDTO customerDTO);
	public CustomerDTO updateCustomer(Long id, CustomerDTO customerDTO);
	public CustomerDTO deleteCustomer(Long id);
	public boolean checkUserExists(String email);
	public List<CustomerDTO> fetchAllKYCPendingCustomers();
	public CustomerDTO updateKYCStatus(Long id, String status);
	
	
	//for CustomerCredentials
	public List<CustomerCredentialsDTO> fetchAllCustomerCreds();
	public boolean checkIfCredentialsExists(Long id);
	public CustomerCredentialsDTO fetchSingleCustomerCredInfo(Long id);
	public CustomerCredentialsDTO addCustomerCred(CustomerCredentialsDTO customerDTO);
	public CustomerCredentialsDTO updatePassword(Long id, String password);
	public CustomerCredentialsDTO deleteCustomerCredInfo(Long id);

	
	//for sessionData
	public SessionDataDTO updateUser(String id);
	public SessionDataDTO fetchUserLoggedIn();
	
	//for Account 
	public List<AccountDTO> fetchAllAccounts();
	public List<AccountDTO> fetchAllAccountsByCustomerID(Long customerID);
	
	
}
