package com.banking.wf.springbootappibs.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class Loan {
	/*
	 * @TableGenerator(name="loan_id", initialValue = 10000)
	 * 
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.TABLE)
	 */
	@Id
	@Column(length=5, nullable=false)
	@ColumnDefault("50000")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long loanId;
	private Long customerId;
	@Column(length=100, nullable=false)
	private String loanName;
	@Column(length=100, nullable=false)
	private Double loanAmount;
	@Column(length=100, nullable=false)
	private String loanTenure;
	@Column(length=100, nullable=false)
	private String loanApplicationDate;
	@Column(length=100, nullable=false)
	private String businessStructure;
	@Column(length=100, nullable=false)
	private String billingIndicator;
	@Column(length=100, nullable=false)
	private String taxIndicator;
	@Column(length=100, nullable=false)
	private String status;
	@Column(length=100, nullable=false)
	private String remark;
	@Column(length=100, nullable=false)
	private Double loanInterestRate;
	@Column(length=100, nullable=false)
	private Double emi;

	

	public Double getEmi() {
		return emi;
	}
	public void setEmi(Double emi) {
		this.emi = emi;
	}
	public Long getloanId() {
		return loanId;
	}
	public void setloanId(Long loanId) {
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
	public String getRemark() {
		return remark;
	}
	public String getStatus() {
		return status;
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
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Long getLoanId() {
		return loanId;
	}
	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}
	public String getLoanTenure() {
		return loanTenure;
	}
	public void setLoanTenure(String loanTenure) {
		this.loanTenure = loanTenure;
	}

	
}
