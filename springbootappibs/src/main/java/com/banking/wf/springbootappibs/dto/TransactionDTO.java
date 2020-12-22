package com.banking.wf.springbootappibs.dto;

import javax.persistence.Column;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;



public class TransactionDTO {
	

	private int savingsAccID;
	private Long customerId;
	private String lastTransationDate;
	private Long toAcc;
	private double amount;
	private String message;
	private String transID;
	private String txnType;
	private String month;
	private String year;
	private String date;
	public int getSavingsAccID() {
		return savingsAccID;
	}
	public void setSavingsAccID(int savingsAccID) {
		this.savingsAccID = savingsAccID;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getLastTransationDate() {
		return lastTransationDate;
	}
	public void setLastTransationDate(String lastTransationDate) {
		this.lastTransationDate = lastTransationDate;
	}
	public Long getToAcc() {
		return toAcc;
	}
	public void setToAcc(Long toAcc) {
		this.toAcc = toAcc;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTransID() {
		return transID;
	}
	public void setTransID(String transID) {
		this.transID = transID;
	}
	public String getTxnType() {
		return txnType;
	}
	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
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
