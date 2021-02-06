package com.banking.wf.springbootappibs.dto;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class LoanOutputDTO {
	
	private long loanId; 
	private Long customerId;
	private String loanName;
	private Double loanAmount;
	private String loanApplicationDate;
	private String businessStructure;
	private String billingIndicator;
	private String taxIndicator;
	private String loanTenure;
	private String remark;
	private String status;
	private Double loanInterestRate;
	private Double emi;
	
	
	public long getLoanId() {
		return loanId;
	}
	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
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
	public String getLoanTenure() {
		return loanTenure;
	}
	public void setLoanTenure(String loanTenure) {
		this.loanTenure = loanTenure;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getStatus() {
		return status;
	}
	public Double getEmi() {
		return emi;
	}
	public void setEmi(Double emi) {
		this.emi = emi;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getLoanInterestRate() {
		return loanInterestRate;
	}
	public void setLoanInterestRate(Double loanInterestRate) {
		this.loanInterestRate = loanInterestRate;
	}


}