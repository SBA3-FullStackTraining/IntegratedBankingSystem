package com.banking.wf.springbootappibs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;


@Entity
public class Account 
{
	
	@Column(length=16, nullable=false)
	private Long customerID;
	
	@Id
	@ColumnDefault("90001")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length=5, nullable=false)
	private Long accountID;
	
	@Column(length=100, nullable=false)
	private String accountType;
	
	@Column(length=100, nullable=false)
	private String IFSC_code;
	
	@Column(length=100, nullable=false)
	private String accountOpenDate;
	
	@Column(length=100, nullable=false)
	private String accountStatus;
	
	public Long getCustomerID() {
		return customerID;
	}
	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}
	public Long getAccountID() {
		return accountID;
	}
	public void setAccountID(Long accountID) {
		this.accountID = accountID;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
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
