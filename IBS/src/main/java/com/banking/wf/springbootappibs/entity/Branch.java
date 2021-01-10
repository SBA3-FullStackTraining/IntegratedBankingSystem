package com.banking.wf.springbootappibs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Branch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length=100, nullable=false)
	private int bankBranchID;
	@Column(length=100, nullable=false)
	private String bankAddress;
	@Column(length=100, nullable=false)
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
	
}
