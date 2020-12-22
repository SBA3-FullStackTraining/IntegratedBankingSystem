package com.banking.wf.springbootappibs.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class LoanEmiDTO {
	
	private long emiTransId;
	@Length(max = 5, min = 5, message="Loan ID should be of 5 digits")
	@NotNull(message = "Loan ID  is required!")
	private long loanId;
	@Length(max = 16, min = 16, message="Customer ID should be of 16 digits")
	@NotNull(message = "Customer ID  is required!")
	private long customerID;
	@NotNull(message = "Select the Month")
	private String month;
	@NotNull(message = "Select the Year")
	private String year; 
	@NotNull(message = "Enter the emi amount to be paid, This field should not be empty")
	private Double emiAmount;
	public long getEmiTransId() {
		return emiTransId;
	}
	public void setEmiTransId(long emiTransId) {
		this.emiTransId = emiTransId;
	}
	public long getLoanId() {
		return loanId;
	}
	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}
	public long getCustomerID() {
		return customerID;
	}
	public void setCustomerID(long customerID) {
		this.customerID = customerID;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Double getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(Double emiAmount) {
		this.emiAmount = emiAmount;
	}
     
}
