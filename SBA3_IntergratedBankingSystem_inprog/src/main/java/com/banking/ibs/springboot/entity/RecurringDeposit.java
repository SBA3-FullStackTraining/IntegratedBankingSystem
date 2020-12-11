package com.banking.ibs.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RecurringDeposit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int recurringDepositID;
	private int customerID;
	private double monthlydeposit;
	private double ROI;
	private int term;
	private String applicationDate;
	private String maturityDate;
	private double totalAmt;
	private String accHolderName;
	
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public int getRecurringDepositID() {
		return recurringDepositID;
	}
	public void setRecurringDepositID(int recurringDepositID) {
		this.recurringDepositID = recurringDepositID;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public double getMonthlydeposit() {
		return monthlydeposit;
	}
	public void setMonthlydeposit(double monthlydeposit) {
		this.monthlydeposit = monthlydeposit;
	}
	public double getROI() {
		return ROI;
	}
	public void setROI(double rOI) {
		ROI = rOI;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
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
