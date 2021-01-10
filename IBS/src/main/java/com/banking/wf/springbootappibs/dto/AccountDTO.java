package com.banking.wf.springbootappibs.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;


public class AccountDTO 
{

	@Length(max = 16, min = 16, message="Customer ID should be of 16 digits")
	@NotNull(message = "CustomerID  is required!")
	private Long customerID;
	
	@Length(max = 5, min = 5, message="Account ID should be of 7 digits")
	@NotNull(message = "Account ID is required!")
	private Long accountID;
	
	@NotBlank(message = "Account Type is required!")
	private String accountType;
	
	@NotBlank(message = "IFSC is required!")
	private String IFSC_code;
	
	@NotBlank(message = "Account Open Date is required!")
	private String accountOpenDate;
	
	@NotBlank(message = "Account Status is required!")
	private String accountStatus;
	
	
	public AccountDTO(
			@Length(max = 16, min = 16, message = "Customer ID should be of 16 digits") @NotNull(message = "CustomerID  is required!") Long customerID,
			@Length(max = 7, min = 7, message = "Account ID should be of 7 digits") @NotNull(message = "Account ID is required!") Long accountID,
			@NotBlank(message = "Account Type is required!") String accountType,
			@NotBlank(message = "IFSC is required!") String iFSC_code,
			@NotBlank(message = "Account Open Date is required!") String accountOpenDate,
			@NotBlank(message = "Account Status is required!") String accountStatus) {
		super();
		this.customerID = customerID;
		this.accountID = accountID;
		this.accountType = accountType;
		this.IFSC_code = iFSC_code;
		this.accountOpenDate = accountOpenDate;
		this.accountStatus = accountStatus;
	}
	
	
	public Long getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}

	public Long getAccountID() {
		return accountID;
	}

	public void setAccountID(Long accountID) {
		this.accountID = accountID;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getIFSC_code() {
		return IFSC_code;
	}

	public void setIFSC_code(String iFSC_code) {
		this.IFSC_code = iFSC_code;
	}

	public String getAccountOpenDate() {
		return accountOpenDate;
	}

	public void setAccountOpenDate(String accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	
}
