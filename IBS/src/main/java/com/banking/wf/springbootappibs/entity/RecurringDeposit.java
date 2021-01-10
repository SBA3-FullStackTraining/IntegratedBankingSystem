package com.banking.wf.springbootappibs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class RecurringDeposit {

	@Id
	@Column(length=5, nullable=false)
	//@Column(columnDefinition="Int(5) default 80000")
	@ColumnDefault("70000")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long recurringDepositID;
	@Column(length=100, nullable=false)
	private Long customerID;
	@Column(length=100, nullable=false)
	private String accHolderName;
	@Column(length=100, nullable=false)
	private String applicationDate;
	@Column(length=100, nullable=false)
	private int term;
	@Column(length=100, nullable=false)
	private double ROI;
	@Column(length=100, nullable=false)
	private double monthlydeposit;
	@Column(length=100, nullable=false)
	private double totalDepositAmt;
	@Column(length=100, nullable=false)
	private String maturityDate;
	@Column(length=100, nullable=false)
	private double interestAmount;
	
	
	
	public double getTotalDepositAmt() {
		return totalDepositAmt;
	}
	public void setTotalDepositAmt(double totalDepositAmt) {
		this.totalDepositAmt = totalDepositAmt;
	}
	public double getInterestAmount() {
		return interestAmount;
	}
	public void setInterestAmount(double interestAmount) {
		this.interestAmount = interestAmount;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public Long getRecurringDepositID() {
		return recurringDepositID;
	}
	public void setRecurringDepositID(Long recurringDepositID) {
		this.recurringDepositID = recurringDepositID;
	}
	public Long getCustomerID() {
		return customerID;
	}
	public void setCustomerID(Long customerID) {
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
	
	
	
}
