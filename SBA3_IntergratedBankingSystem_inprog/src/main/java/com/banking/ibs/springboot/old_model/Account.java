package com.banking.ibs.springboot.old_model;



import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class Account {
	@NotBlank(message = "Account Holder Name is required!")
	private Customer accountHolder;
	@NotNull(message = "Account Number is required!")
	private int accountNumber;
	@NotBlank(message = "Account Type is required!")
	private AccountType accountType;
	@NotBlank(message = "IFSC is required!")
	private String IFSC_code;
	@NotBlank(message = "Acc Open Date is required!")
	private String accountOpenDate;
	@NotBlank(message = "Acc Status is required!")
	private String accountStatus;
	private List<Transaction> transactionList;
	
	public Account(Customer accountHolder, int accountNumber, AccountType accountType, String iFSC_code,
			String accountOpenDate, String accountStatus, List<Transaction> transactionList) {
		super();
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.IFSC_code = iFSC_code;
		this.accountOpenDate = accountOpenDate;
		this.accountStatus = accountStatus;
		this.transactionList = transactionList;
	}
	
	public enum AccountType{
		DEBIT, CREDIT;
	}
	
	public List<Transaction> getTransactionList() {
		return transactionList;
	}
	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}
	public Customer getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(Customer accountHolder) {
		this.accountHolder = accountHolder;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public String getIFSC_code() {
		return IFSC_code;
	}
	public void setIFSC_code(String iFSC_code) {
		IFSC_code = iFSC_code;
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
