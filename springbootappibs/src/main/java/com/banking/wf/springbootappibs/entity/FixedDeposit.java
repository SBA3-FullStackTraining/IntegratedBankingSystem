package com.banking.wf.springbootappibs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import org.hibernate.annotations.ColumnDefault;

@Entity

public class FixedDeposit {

	@Id
	@Column(length=5, nullable=false)
	@ColumnDefault("50000")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fixedDepositID;
	@Column(length=100, nullable=false)
	private Long customerID;
	@Column(length=100, nullable=false)
	private String accHolderName;
	@Column(length=100, nullable=false)
	private String applicationDate;
	@Column(length=100, nullable=false)
	private double fixedDepositAmt;
	@Column(length=100, nullable=false)
	private int term;
	@Column(length=100, nullable=false)
	private double ROI;
	@Column(length=100, nullable=false)
	private double interestAmt;
	
	@Column(length=100, nullable=false)
	private double totalAmt;
	@Column(length=100, nullable=false)
	private String maturityDate;
	
	public double getInterestAmt() {
		return interestAmt;
	}
	public void setInterestAmt(double interestAmt) {
		this.interestAmt = interestAmt;
	}
	public int getfixedDepositID() {
		return fixedDepositID;
	}
	public void setfixedDepositID(int fixedDepositID) {
		this.fixedDepositID = fixedDepositID;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public Long getCustomerID() {
		return customerID;
	}
	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}
	public double getFixedDepositAmt() {
		return fixedDepositAmt;
	}
	public void setFixedDepositAmt(double fixedDepositAmt) {
		this.fixedDepositAmt = fixedDepositAmt;
	}
	public double getROI() {
		return ROI;
	}
	public void setROI(double rOI) {
		ROI = rOI;
	}
	public String getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}
	public String getMaturityDate() {
		return maturityDate;
	}
	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}
	public double getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	
	
}
