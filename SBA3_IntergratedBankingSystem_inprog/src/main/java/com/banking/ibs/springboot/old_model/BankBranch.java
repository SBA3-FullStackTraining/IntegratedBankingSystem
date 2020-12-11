package com.banking.ibs.springboot.old_model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class BankBranch {

	@NotNull(message = "Bank Branch ID is required!")
	private int bankBranchID;
	@NotBlank(message = "bank Address is required!")
	private String bankAddress;
	@NotNull(message = "IFSC is required!")
	private String IFSC_code;
	
	public BankBranch(int bankBranchID, String bankAddress, String iFSC_code) {
		super();
		this.bankBranchID = bankBranchID;
		this.bankAddress = bankAddress;
		IFSC_code = iFSC_code;
	}
	
	public int getBankBranchID() {
		return bankBranchID;
	}
	public void setBankBranchID(int bankBranchID) {
		this.bankBranchID = bankBranchID;
	}
	public String getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	public String getIFSC_code() {
		return IFSC_code;
	}
	public void setIFSC_code(String iFSC_code) {
		IFSC_code = iFSC_code;
	}
	
}
