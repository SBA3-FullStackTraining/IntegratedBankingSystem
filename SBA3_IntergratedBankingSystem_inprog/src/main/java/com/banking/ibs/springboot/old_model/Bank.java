package com.banking.ibs.springboot.old_model;

import javax.validation.constraints.NotBlank;

public class Bank {

	@NotBlank(message = "Bank Name is required!")
	private String bankName;
	@NotBlank(message = "Bank Location is required!")
	private String bankLocation;
	@NotBlank(message = "Bank Branch is required!")
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
