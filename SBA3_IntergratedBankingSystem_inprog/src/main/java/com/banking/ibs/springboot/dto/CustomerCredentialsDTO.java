package com.banking.ibs.springboot.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class CustomerCredentialsDTO 
{
	
	@Length(max = 16, min = 16, message="Customer ID should be of 16 digits")
	@NotNull(message = "CustomerID is required!")
	private Long customerID;

	@NotBlank(message = "Password is required!")
	private String password;

	
	public CustomerCredentialsDTO(
			@Length(max = 16, min = 16, message = "Customer ID should be of 16 digits") @NotNull(message = "CustomerID is required!") Long customerID,
			@NotBlank(message = "Password is required!") String password) {
		super();
		this.customerID = customerID;
		this.password = password;
	}

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
