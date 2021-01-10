package com.banking.wf.springbootappibs.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.wf.springbootappibs.dto.CustomerCredentialsDTO;
import com.banking.wf.springbootappibs.dto.CustomerDTO;
import com.banking.wf.springbootappibs.dto.SessionDataDTO;
import com.banking.wf.springbootappibs.entity.Account;
import com.banking.wf.springbootappibs.entity.Customer;
import com.banking.wf.springbootappibs.entity.CustomerCredentials;
import com.banking.wf.springbootappibs.entity.SessionData;
import com.banking.wf.springbootappibs.repository.AccountRepository;
import com.banking.wf.springbootappibs.repository.CustomerCredentialsRepository;
import com.banking.wf.springbootappibs.repository.CustomerRepository;
import com.banking.wf.springbootappibs.repository.SessionDataRepository;
import com.banking.wf.springbootappibs.dto.AccountDTO;


@Service
public class IdentityManagementServiceImpl implements IdentityManagementService
{
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CustomerCredentialsRepository customerCredentialsRepository;
	
	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private SessionDataRepository sessionDataRepository;

	
	//*********************** utility methods *****************//
	private CustomerDTO convertCustomerEntityToOutputDto(Customer customer) 
	{
		CustomerDTO customerOutputDTO = new CustomerDTO(customer.getCustomerID(), customer.getFirstName(), customer.getLastName(), customer.getPhoneNumber(), customer.getEmail(), customer.getDateOfBirth(), customer.getCity(), customer.getState(), customer.getCountry(), customer.getPincode(), customer.getFullAddress(), customer.getGivenID(), customer.getIDNumber(), customer.getKycStatus());
		return customerOutputDTO;
	}
	
	private Customer convertCustomerInputDtoToEntity(CustomerDTO customerInputDTO) 
	{
		Customer customer = new Customer();
		customer.setFirstName(customerInputDTO.getFirstName());
		customer.setLastName(customerInputDTO.getLastName());
		customer.setPhoneNumber(customerInputDTO.getPhoneNumber());
		customer.setEmail(customerInputDTO.getEmail());
		customer.setDateOfBirth(customerInputDTO.getDateOfBirth());
		customer.setCity(customerInputDTO.getCity());
		customer.setState(customerInputDTO.getState());
		customer.setCountry(customerInputDTO.getCountry());
		customer.setPincode(customerInputDTO.getPincode());
		customer.setFullAddress(customerInputDTO.getFullAddress());
		customer.setGivenID(customerInputDTO.getGivenID());
		customer.setKycStatus(customerInputDTO.getKycStatus());
		customer.setIDNumber(customerInputDTO.getIDNumber());
		return customer;
	}
	
	private CustomerCredentialsDTO convertCustomerCredentialsEntityToOutputDto(CustomerCredentials customerCredentials) 
	{
		CustomerCredentialsDTO customerCredentialsOutputDTO = new CustomerCredentialsDTO(customerCredentials.getCustomerID(), customerCredentials.getPassword(), customerCredentials.getTranspswd());
		return customerCredentialsOutputDTO;
	}
	
	private CustomerCredentials convertCustomerCredentialsInputDtoToEntity(CustomerCredentialsDTO customerCredentialsInputDTO) 
	{
		CustomerCredentials customerCredentials = new CustomerCredentials();
		customerCredentials.setCustomerID(customerCredentialsInputDTO.getCustomerID());
		customerCredentials.setPassword(customerCredentialsInputDTO.getPassword());
		customerCredentials.setTranspswd(customerCredentialsInputDTO.getTranspswd());
		return customerCredentials;
	}
	
	private AccountDTO convertAccountEntityToOutputDto(Account account) 
	{
		AccountDTO accountOutputDTO = new AccountDTO(account.getCustomerID(), account.getAccountID(), account.getAccountType(), account.getIFSC_code(), account.getAccountOpenDate(), account.getAccountStatus());
		return accountOutputDTO;
	}
	
	private Account convertAccountInputDtoToEntity(AccountDTO accountInputDTO) 
	{
		Account account = new Account();
		account.setCustomerID(accountInputDTO.getCustomerID());
		account.setAccountID(accountInputDTO.getAccountID());
		account.setAccountType(accountInputDTO.getAccountType());
		account.setAccountOpenDate(accountInputDTO.getAccountOpenDate());
		account.setAccountStatus(accountInputDTO.getAccountStatus());
		
		return account;
	}
	
	private SessionDataDTO convertSessionEntityToOutputDto(SessionData sessionData) 
	{
		SessionDataDTO sessionOutputDTO = new SessionDataDTO(sessionData.getLoggedInUser(), sessionData.getSno());
		return sessionOutputDTO;
	}
	
	private SessionData convertSessionInputDtoToEntity(SessionDataDTO sessionDataDTO) 
	{
		SessionData session = new SessionData();
		session.setLoggedInUser(sessionDataDTO.getLoggedInUser());
		session.setSno(sessionDataDTO.getSno());
		
		return session;
	}
	
	//*******************************************************//
	

	public List<CustomerDTO> fetchAllCustomers() {
		List<Customer> customerList = this.customerRepository.findAll();
		return	customerList.stream().map(this :: convertCustomerEntityToOutputDto).collect(Collectors.toList());
	}
	
	
	public List<CustomerDTO> fetchAllKYCPendingCustomers(){
		
		List<Customer> customerList = this.customerRepository.findByKYCStatus("pending");
		return	customerList.stream().map(this :: convertCustomerEntityToOutputDto).collect(Collectors.toList());
	}
	

	public CustomerDTO fetchSingleCustomer(Long id) {
		if(this.customerRepository.existsById(id)) {
			Customer customer = this.customerRepository.findById(id).orElse(null);
			//System.out.println(id);
			//Customer customer = this.customerRepository.getOne(id);
			CustomerDTO customerOutputDTO = this.convertCustomerEntityToOutputDto(customer);
			return customerOutputDTO;
		}
		return null;
	}

	public CustomerDTO addCustomer(CustomerDTO customerInputDto) {
		Customer customer = this.convertCustomerInputDtoToEntity(customerInputDto);
		Customer newCustomer = this.customerRepository.save(customer);
		CustomerDTO customerDTOOutputDto =  this.convertCustomerEntityToOutputDto(newCustomer);
		return customerDTOOutputDto;
	}

	@Override
	public CustomerDTO updateCustomer(Long id, CustomerDTO customerDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO deleteCustomer(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CustomerCredentialsDTO> fetchAllCustomerCreds() {
		List<CustomerCredentials> credList = this.customerCredentialsRepository.findAll();
		return	credList.stream().map(this :: convertCustomerCredentialsEntityToOutputDto).collect(Collectors.toList());
	}

	@Override
	public CustomerCredentialsDTO fetchSingleCustomerCredInfo(Long id) {
		if(this.customerCredentialsRepository.existsById(id)) {
			CustomerCredentials customerCredentials = this.customerCredentialsRepository.findById(id).orElse(null);
			CustomerCredentialsDTO customerCredentialsOutputDTO = this.convertCustomerCredentialsEntityToOutputDto(customerCredentials);
			return customerCredentialsOutputDTO;
		}
		return null;
	}

	@Override
	public CustomerCredentialsDTO addCustomerCred(CustomerCredentialsDTO customerCredentialsInputDTO) {
		CustomerCredentials customerCredentials = this.convertCustomerCredentialsInputDtoToEntity(customerCredentialsInputDTO);
		CustomerCredentials newCustomerCredentials = this.customerCredentialsRepository.save(customerCredentials);
		CustomerCredentialsDTO customerCredentialsDTOOutputDto =  this.convertCustomerCredentialsEntityToOutputDto(newCustomerCredentials);
		return customerCredentialsDTOOutputDto;
	}

	@Override
	public CustomerCredentialsDTO updatePassword(Long id, String password) {
		this.customerCredentialsRepository.updatePassword(id, password);
		return this.convertCustomerCredentialsEntityToOutputDto(this.customerCredentialsRepository.getOne(id));
	}

	@Override
	public CustomerCredentialsDTO deleteCustomerCredInfo(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<AccountDTO> fetchAllAccounts() {
		List<Account> accountList = this.accountRepository.findAll();
		return	accountList.stream().map(this :: convertAccountEntityToOutputDto).collect(Collectors.toList());
	}

	public List<AccountDTO> fetchAllAccountsByCustomerID(Long customerID) {
		List<Account> accountList = this.accountRepository.findByCustomerID(customerID);
		return	accountList.stream().map(this :: convertAccountEntityToOutputDto).collect(Collectors.toList());
	}

	public boolean checkIfCredentialsExists(Long id) {
		return this.customerCredentialsRepository.existsById(id);
	}

	@Override
	public boolean checkUserExists(String email) {
		return this.customerCredentialsRepository.checkExistByEmail(email).size()>0;
	}

	@Override
	public SessionDataDTO updateUser(String id) {
		
		SessionData session = new SessionData();
		session.setLoggedInUser(id);
		session.setSno(Long.parseLong("1"));
		
		return convertSessionEntityToOutputDto(this.sessionDataRepository.save(session));
	}
	
	public SessionDataDTO fetchUserLoggedIn()
	{
		return convertSessionEntityToOutputDto(this.sessionDataRepository.getOne(Long.parseLong("1")));
	}
	
	
	public CustomerDTO updateKYCStatus(Long id, String status)
	{
		this.customerRepository.updateKYCStatus(id, status);
		return convertCustomerEntityToOutputDto(this.customerRepository.getOne(id));
	}

}
