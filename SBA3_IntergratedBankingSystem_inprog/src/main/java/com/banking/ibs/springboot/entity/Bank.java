package com.banking.ibs.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Bank {

	@Id
	private String bankName;
	private String bankLocation;
	private String bankBranch;
	
	
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
	public String getBankBranch() {
		return bankBranch;
	}
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}
	
	
	
	
}
