package com.banking.wf.springbootappibs.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class LoanDTO {
	private long loanId; 
	private Long customerID;
	@NotBlank(message = "Loan Name is required!")
	private String loanName;
	@Min(value=1,message="Loan Amount cannot be negitive or zero")
	@NotNull(message = "Loan Amount is required!")
	private Double loanAmount;
	@NotBlank(message = "Loan ApplicationDate is required!")
	private String loanApplicationDate;
	@NotBlank(message = "Business Structure is required!")
	private String businessStructure;
	@NotBlank(message = "Billing Indicator is required!")
	private String billingIndicator;
	@NotBlank(message = "Tax Indicator is required!")
	private String taxIndicator;
	@NotBlank(message = "Select a Loan Tenure")
	private String loanTenure;
	public String getLoanTenure() {
		return loanTenure;
	}
	public void setLoanTenure(String loanTenure) {
		this.loanTenure = loanTenure;
	}
	public String getLoanName() {
		return loanName;
	}
	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}
	public Double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getLoanApplicationDate() {
		return loanApplicationDate;
	}
	public void setLoanApplicationDate(String loanApplicationDate) {
		this.loanApplicationDate = loanApplicationDate;
	}
	public String getBusinessStructure() {
		return businessStructure;
	}
	public void setBusinessStructure(String businessStructure) {
		this.businessStructure = businessStructure;
	}
	public String getBillingIndicator() {
		return billingIndicator;
	}
	public void setBillingIndicator(String billingIndicator) {
		this.billingIndicator = billingIndicator;
	}
	public String getTaxIndicator() {
		return taxIndicator;
	}
	public void setTaxIndicator(String taxIndicator) {
		this.taxIndicator = taxIndicator;
	}
	public long getLoanId() {
		return loanId;
	}
	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}
	public Long getCustomerID() {
		return customerID;
	}
	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}


}
