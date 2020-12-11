package com.banking.ibs.springboot.entity;

import javax.persistence.Entity;

@Entity
public class CustomerCredentials 
{

	private Long customerID;
	private String password;
	

	public Long getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
