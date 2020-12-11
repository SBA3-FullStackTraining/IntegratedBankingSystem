package com.banking.ibs.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class FixedDeposit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fixedDepositID;
	private int customerID;
	private double fixedDepositAmt;
	private double ROI;
	private String applicationDate;
	private String maturityDate;
	private double totalAmt;
	private String accHolderName;
	
	
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
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
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
	
	
}
