package com.banking.ibs.springboot.old_model;

import java.sql.Date;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class CreditAccount extends Account{

	@NotBlank(message = "Account  is required!")
	private AccountInfo accountDetails;
	@NotNull(message = "Credit Limit is required!")
	private double creditLimit;
	@NotNull(message = "Available Credit Limit  is required!")
	private double availableCreditLimit;
	@NotNull(message = "Credit Used  is required!")
	private double creditUsed;
	@NotNull(message = "Bill Date  is required!")
	private Date billDate;
		
	public CreditAccount(Customer accountHolder, int accountNumber, AccountType accountType, String iFSC_code,
			String accountOpenDate, String accountStatus, List<Transaction> transactionList, AccountInfo accountDetails,
			double creditLimit, double availableCreditLimit, double creditUsed, Date billDate) {
		super(accountHolder, accountNumber, accountType, iFSC_code, accountOpenDate, accountStatus, transactionList);
		this.accountDetails = accountDetails;
		this.creditLimit = creditLimit;
		this.availableCreditLimit = availableCreditLimit;
		this.creditUsed = creditUsed;
		this.billDate = billDate;
	}
	
	public AccountInfo getAccountDetails() {
		return accountDetails;
	}
	public void setAccountDetails(AccountInfo accountDetails) {
		this.accountDetails = accountDetails;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public double getAvailableCreditLimit() {
		return availableCreditLimit;
	}
	public void setAvailableCreditLimit(double availableCreditLimit) {
		this.availableCreditLimit = availableCreditLimit;
	}
	public double getCreditUsed() {
		return creditUsed;
	}
	public void setCreditUsed(double creditUsed) {
		this.creditUsed = creditUsed;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	
}
