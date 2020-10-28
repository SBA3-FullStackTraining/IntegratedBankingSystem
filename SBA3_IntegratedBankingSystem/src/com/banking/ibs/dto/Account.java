package com.banking.ibs.dto;

import java.util.List;

public class Account {

	private Customer accountHolder;
	private int accountNumber;
	private AccountType accountType;
	private String IFSC_code;
	private String accountOpenDate;
	private String accountStatus;
	private List<Transaction> transactionList;
	
	public Account(Customer accountHolder, int accountNumber, AccountType accountType, String iFSC_code,
			String accountOpenDate, String accountStatus, List<Transaction> transactionList) {
		super();
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		IFSC_code = iFSC_code;
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
