package com.banking.ibs.springboot.service;

import java.util.List;

import com.banking.ibs.springboot.dto.AccountDTO;
import com.banking.ibs.springboot.dto.CustomerCredentialsDTO;
import com.banking.ibs.springboot.dto.CustomerDTO;

public interface IdentityManagementService 
{
	//for Customer
	public List<CustomerDTO> fetchAllCustomers();
	public CustomerDTO fetchSingleCustomer(Long id);
	public CustomerDTO addCustomer(CustomerDTO customerDTO);
	public CustomerDTO updateCustomer(Long id, CustomerDTO customerDTO);
	public CustomerDTO deleteCustomer(Long id);
	
	
	//for CustomerCredentials
	public List<CustomerCredentialsDTO> fetchAllCustomerCreds();
	public boolean checkIfCredentialsExists(Long id);
	public CustomerCredentialsDTO fetchSingleCustomerCredInfo(Long id);
	public CustomerCredentialsDTO addCustomerCred(CustomerCredentialsDTO customerDTO);
	public CustomerCredentialsDTO updatePassword(Long id);
	public CustomerCredentialsDTO deleteCustomerCredInfo(Long id);

	
	//for Account 
	public List<AccountDTO> fetchAllAccounts();
	public List<AccountDTO> fetchAllAccountsByCustomerID(Long customerID);
	
}
