package com.banking.ibs.springboot.dto;


import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class RecurringDepositDTO {

	@Length(max = 10, min = 10, message="Recurring Deposit ID should be of 10 digits")
	@NotNull(message = "Recurring Deposit ID  is required!")
	private int recurringDepositID;
	
	@Length(max = 16, min = 16, message="Customer ID should be of 16 digits")
	@NotNull(message = "CustomerID  is required!")
	private int customerID;
	
	@NotNull(message = "Monthly Deposit  is required!")
	private double monthlydeposit;
	
	private double ROI;
	
	@NotNull(message = "Term  is required!")
	private int term;
	
	private String applicationDate;
	
	
	private String maturityDate;
	private double totalAmt;
	private String accHolderName;
	
	
	
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
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	
	
	
	// Input DTO
	
	public RecurringDepositDTO(
			@Length(max = 16, min = 16, message = "Customer ID should be of 16 digits") @NotNull(message = "CustomerID  is required!") int customerID,
			@NotNull(message = "Monthly Deposit  is required!") double monthlydeposit, double rOI,
			@NotNull(message = "Term  is required!") int term, String applicationDate, double totalAmt,
			String accHolderName) {
		super();
		this.customerID = customerID;
		this.monthlydeposit = monthlydeposit;
		ROI = rOI;
		this.term = term;
		this.applicationDate = applicationDate;
		this.totalAmt = totalAmt;
		this.accHolderName = accHolderName;
	}
	
	// Output DTO
	
	public RecurringDepositDTO(
			@Length(max = 10, min = 10, message = "Recurring Deposit ID should be of 10 digits") @NotNull(message = "Recurring Deposit ID  is required!") int recurringDepositID,
			@Length(max = 16, min = 16, message = "Customer ID should be of 16 digits") @NotNull(message = "CustomerID  is required!") int customerID,
			@NotNull(message = "Monthly Deposit  is required!") double monthlydeposit, double rOI,
			@NotNull(message = "Term  is required!") int term, String applicationDate, String maturityDate,
			double totalAmt, String accHolderName) {
		super();
		this.recurringDepositID = recurringDepositID;
		this.customerID = customerID;
		this.monthlydeposit = monthlydeposit;
		ROI = rOI;
		this.term = term;
		this.applicationDate = applicationDate;
		this.maturityDate = maturityDate;
		this.totalAmt = totalAmt;
		this.accHolderName = accHolderName;
	}
	
	
	
	
}
