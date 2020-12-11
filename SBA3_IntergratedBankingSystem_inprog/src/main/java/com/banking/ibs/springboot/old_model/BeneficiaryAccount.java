package com.banking.ibs.springboot.old_model;

import java.math.BigInteger;
import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class BeneficiaryAccount
{
	@NotNull(message = "Beneficiary Account  is required!")
	private int benfAccountNumber;
	@NotNull(message = "Beneficiary Bank IFSC is required!")
	private String benfIFSC;
	@NotBlank(message = "Beneficiary name is required!")
	private String benfName;
	@NotBlank(message = "Beneficiary Bank name is required!")
	private String benfBankName;
	private String senderName;
	private String description;
	
	public BeneficiaryAccount(int benfaccountNumber, String benfname, String benfIFSC,String benfBankName,String senderName,String description) {
		super();
		this.benfAccountNumber = benfaccountNumber;
		this.benfName = benfname;
		this.benfIFSC = benfIFSC;
		this.benfBankName = benfBankName;
		this.senderName = senderName;
		this.description = description;
		
	}

	public int getBenfaccountNumber() {
		return benfAccountNumber;
	}

	public void setBenfaccountNumber(int benfaccountNumber) {
		this.benfAccountNumber = benfaccountNumber;
	}

	public String getBenfIFSC() {
		return benfIFSC;
	}

	public void setBenfIFSC(String benfIFSC) {
		this.benfIFSC = benfIFSC;
	}

	public String getBenfname() {
		return benfName;
	}

	public void setBenfname(String benfname) {
		this.benfName = benfname;
	}
	
	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}

	

}
