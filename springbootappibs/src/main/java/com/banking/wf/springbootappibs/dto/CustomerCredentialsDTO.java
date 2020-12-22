package com.banking.wf.springbootappibs.dto;

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
		this.customerID = customerID;
		this.password = password;
	}
	
	public CustomerCredentialsDTO() {
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
