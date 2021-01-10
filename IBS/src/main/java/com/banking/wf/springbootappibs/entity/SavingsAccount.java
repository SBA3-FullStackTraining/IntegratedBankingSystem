package com.banking.wf.springbootappibs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;

@Entity

public class SavingsAccount {

	@Id
	@Column(length=5, nullable=false)
	//@Column(columnDefinition="Int(5) default 50000")
	@ColumnDefault("90000")
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name="savingsAccID",columnDefinition = "int default 10")
   // private int value;
	private Long savingsAccID;
	@Column(length=16, nullable=false)
	private Long customerId;
	@Column(length=100, nullable=false)
	private String accHolderName;
	@Column(length=100, nullable=false)
	private String applicationDate;
	@Column(length=100, nullable=false)
	private double openingBalance;
	@Column(length=100, nullable=false)
	private double avlBalance;
	
	
	public Long getSavingsAccID() {
		return savingsAccID;
	}
	public void setSavingsAccID(Long savingsAccID) {
		this.savingsAccID = savingsAccID;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public String getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}
	public double getOpeningBalance() {
		return openingBalance;
	}
	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}
	public double getAvlBalance() {
		return avlBalance;
	}
	public void setAvlBalance(double avlBalance) {
		this.avlBalance = avlBalance;
	}
	
	
	
}
