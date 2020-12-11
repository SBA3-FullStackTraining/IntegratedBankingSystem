package com.banking.ibs.springboot.old_model;

import java.sql.Timestamp;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class DebitAccount extends Account{

	@NotBlank(message = "Account is required!")
	private AccountInfo accountDetails;
	@NotNull(message = "Current Balance  is required!")
	private double currentBalance;
	@NotNull(message = "Last Txn is required!")
	private Timestamp lastTransaction;
	
	public DebitAccount(Customer accountHolder, int accountNumber, AccountType accountType, String iFSC_code,
			String accountOpenDate, String accountStatus, List<Transaction> transactionList, AccountInfo accountDetails,
			double currentBalance, Timestamp lastTransaction) {
		super(accountHolder, accountNumber, accountType, iFSC_code, accountOpenDate, accountStatus, transactionList);
		this.accountDetails = accountDetails;
		this.currentBalance = currentBalance;
		this.lastTransaction = lastTransaction;
	}

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
