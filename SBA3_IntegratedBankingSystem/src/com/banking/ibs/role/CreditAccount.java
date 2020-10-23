package com.banking.ibs.role;

import java.sql.Date;


public class CreditAccount extends Account{

	private AccountInfo accountDetails;
	private double creditLimit;
	private double availableCreditLimit;
	private double creditUsed;
	private Date billDate;
		
	
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
