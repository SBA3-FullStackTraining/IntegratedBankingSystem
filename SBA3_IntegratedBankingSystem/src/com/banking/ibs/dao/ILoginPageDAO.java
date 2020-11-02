package com.banking.ibs.dao;

import java.util.HashMap;

import com.banking.ibs.dto.Customer;

public interface ILoginPageDAO 
{
	public HashMap<String, String> getUserCredData(String userType);
	
	public Customer getUserInfo(String userType, String UserID);
	
	public boolean changePassword(String userType, String UserID, String newPassword);

	public boolean addNewRegisteredCustomer(Customer customer);
	
}
