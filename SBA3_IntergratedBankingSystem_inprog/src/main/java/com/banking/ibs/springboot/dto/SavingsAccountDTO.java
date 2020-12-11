package com.banking.ibs.springboot.dto;

import javax.validation.constraints.NotNull;



public class SavingsAccountDTO {
	

	private int savingsAccID;
	private int customerID;
	
	@NotNull(message = "Opening Balance Amount is required!")
	private double openingBalance;
	private double avlBalance;
	@NotNull(message = "Account Holder Name is required!")
	private String accHolderName;
	
	
	
	public int getSavingsAccID() {
		return savingsAccID;
	}
	public void setSavingsAccID(int savingsAccID) {
		this.savingsAccID = savingsAccID;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
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
	
	
	// Input DTO
	
	public SavingsAccountDTO(int customerID,
			@NotNull(message = "Opening Balance Amount is required!") double openingBalance,
			@NotNull(message = "Account Holder Name is required!") String accHolderName) {
		super();
		this.customerID = customerID;
		this.openingBalance = openingBalance;
		this.accHolderName = accHolderName;
	}
	
	
	
	// Output DTO
	
	
	public SavingsAccountDTO(int savingsAccID, int customerID,
			@NotNull(message = "Opening Balance Amount is required!") double openingBalance, double avlBalance,
			@NotNull(message = "Account Holder Name is required!") String accHolderName) {
		super();
		this.savingsAccID = savingsAccID;
		this.customerID = customerID;
		this.openingBalance = openingBalance;
		this.avlBalance = avlBalance;
		this.accHolderName = accHolderName;
	}
	
	
	
}
