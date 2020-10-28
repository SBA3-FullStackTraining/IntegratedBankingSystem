package com.banking.ibs.dto;

public class Bank {

	private String bankName;
	private String bankLocation;
	private BankBranch bankBranch;
	
	public Bank(String bankName, String bankLocation, BankBranch bankBranch) {
		super();
		this.bankName = bankName;
		this.bankLocation = bankLocation;
		this.bankBranch = bankBranch;
	}
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankLocation() {
		return bankLocation;
	}
	public void setBankLocation(String bankLocation) {
		this.bankLocation = bankLocation;
	}
	public BankBranch getBankBranch() {
		return bankBranch;
	}
	public void setBankBranch(BankBranch bankBranch) {
		this.bankBranch = bankBranch;
	}
	
}
