package com.banking.ibs.role;

import java.sql.Timestamp;

public class DebitAccount extends Account{

	private AccountInfo accountDetails;
	private double currentBalance;
	private Timestamp lastTransaction;
	
	
	public AccountInfo getAccountDetails() {
		return accountDetails;
	}
	public void setAccountDetails(AccountInfo accountDetails) {
		this.accountDetails = accountDetails;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	public Timestamp getLastTransaction() {
		return lastTransaction;
	}
	public void setLastTransaction(Timestamp lastTransaction) {
		this.lastTransaction = lastTransaction;
	}
	
}
