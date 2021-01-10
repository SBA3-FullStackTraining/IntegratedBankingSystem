package com.banking.wf.springbootappibs.dto;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;



public class SavingsAccountDTO {
	

	private Long savingsAccID;
	private Long customerID;
	private String accHolderName;
	private String applicationDate;
	@Digits(integer=15, fraction=0, message="The value must be numeric and less than five digits")
	@NotNull(message = "Opening Balance Amount is required!")
	private double openingBalance;
	private double avlBalance;
	
	public Long getSavingsAccID() {
		return savingsAccID;
	}
	public void setSavingsAccID(Long savingsAccID) {
		this.savingsAccID = savingsAccID;
	}
	public Long getCustomerID() {
		return customerID;
	}
	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}
	public double getOpeningBalance() {
		return openingBalance;
	}
	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}
	public double getAvlBalance() {
		return avlBalance;
	}
	public void setAvlBalance(double avlBalance) {
		this.avlBalance = avlBalance;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	
	public String getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}
	
	// Input DTO
	/*
	 public SavingsAccountDTO(int customerID, String accHolderName, String applicationDate,
			@Digits(integer = 15, fraction = 0, message = "The value must be numeric and less than five digits") @NotNull(message = "Opening Balance Amount is required!") double openingBalance) {
		super();
		this.customerID = customerID;
		this.accHolderName = accHolderName;
		this.applicationDate = applicationDate;
		this.openingBalance = openingBalance;
	}
	 
	 */
	
	
	// Output DTO
	/*
	public SavingsAccountDTO(int savingsAccID, int customerID, String accHolderName, String applicationDate,
			@Digits(integer = 15, fraction = 0, message = "The value must be numeric and less than five digits") @NotNull(message = "Opening Balance Amount is required!") double openingBalance,
			double avlBalance) {
		super();
		this.savingsAccID = savingsAccID;
		this.customerID = customerID;
		this.accHolderName = accHolderName;
		this.applicationDate = applicationDate;
		this.openingBalance = openingBalance;
		this.avlBalance = avlBalance;
	}
	 */
	
	
	
	
}
