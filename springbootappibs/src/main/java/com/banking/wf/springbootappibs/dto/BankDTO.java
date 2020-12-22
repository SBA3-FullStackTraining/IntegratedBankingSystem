package com.banking.wf.springbootappibs.dto;



public class BankDTO {

	//@NotBlank(message = "Bank Name  is required!")
	private String bankName;
	//@NotBlank(message = "Bank Location  is required!")
	private String bankLocation;
	//@NotBlank(message = "Bank Branch  is required!")
	private String bankBranch;
	
	
	// Input DTO
	public BankDTO(String bankName,
			String bankBranch) {
		super();
		this.bankName = bankName;
		this.bankBranch = bankBranch;
	}

	public BankDTO(String bankName,
			String bankLocation,
			String bankBranch) {
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

	public String getBankBranch() {
		return bankBranch;
	}

	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	
	
}
