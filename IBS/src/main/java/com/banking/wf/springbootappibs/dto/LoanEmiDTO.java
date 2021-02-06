package com.banking.wf.springbootappibs.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class LoanEmiDTO {
	
	private long emiTransId;
	@NotNull(message = "Loan ID  is required!")
	private long loanId;
	@NotNull(message = "Customer ID  is required!")
	private long customerId;
	@NotBlank(message = "Select the Month")
	private String month;
	@NotBlank(message = "Select the Year")
	private String year; 
	@NotNull(message = "Enter the emi amount to be paid, This field should not be empty")
	private Double emi;
	@NotBlank(message = "Loan ApplicationDate is required!")
	private String loanEmiDate;
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
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
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
	public Double getEmi() {
		return emi;
	}
	public void setEmi(Double emi) {
		this.emi = emi;
	}
	public String getLoanEmiDate() {
		return loanEmiDate;
	}
	public void setLoanEmiDate(String loanEmiDate) {
		this.loanEmiDate = loanEmiDate;
	}
    
}
