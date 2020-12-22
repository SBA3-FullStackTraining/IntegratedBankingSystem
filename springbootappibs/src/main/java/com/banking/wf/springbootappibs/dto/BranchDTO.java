package com.banking.wf.springbootappibs.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;


public class BranchDTO {
	
	
	@NotNull(message = "BankBranch ID  is required!")
	private int bankBranchID;
	
	@NotBlank(message = "Bank Address  is required!")
	private String bankAddress;
	
	@Length(max = 7, min = 7, message="IFSC Code should be of 7 digits")
	@NotNull(message = "IFSC Code  is required!")
	private String IFSC_code;

	
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

	// Input DTO
	public BranchDTO(@NotNull(message = "BankBranch ID  is required!") int bankBranchID,
			@NotBlank(message = "Bank Address  is required!") String bankAddress,
			@Length(max = 7, min = 7, message = "IFSC Code should be of 7 digits") @NotNull(message = "IFSC Code  is required!") String iFSC_code) {
		super();
		this.bankBranchID = bankBranchID;
		this.bankAddress = bankAddress;
		IFSC_code = iFSC_code;
	}
	
	// Output DTO
	public BranchDTO(@NotBlank(message = "Bank Address  is required!") String bankAddress,
			@Length(max = 7, min = 7, message = "IFSC Code should be of 7 digits") @NotNull(message = "IFSC Code  is required!") String iFSC_code) {
		super();
		
		this.bankAddress = bankAddress;
		IFSC_code = iFSC_code;
	}
	
	
}
