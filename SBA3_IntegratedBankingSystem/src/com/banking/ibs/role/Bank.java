package com.banking.ibs.role;

public class Bank {

	private String bankName;
	private String bankLocation;
	private BankBranch bankBranch;
	
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
