package com.banking.wf.springbootappibs.dto;


import javax.validation.constraints.NotNull;


public class FixedDepositDTO {
	
	private Long customerID;
	private Long fixedDepositID;
	private String accHolderName;
	private String applicationDate;
	@NotNull(message = "Fixed Deposit Amount is required!")
	private double fixedDepositAmt;
	private int term;
	private double ROI;
	private double totalAmt;
	private String maturityDate;
	private double interestAmt;
	

	public Long getFixedDepositID() {
		return fixedDepositID;
	}

	public void setFixedDepositID(Long fixedDepositID) {
		this.fixedDepositID = fixedDepositID;
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

	public void setROI(double ROI) {
		this.ROI = ROI;
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
	
	public int getterm() {
		return term;
	}

	public void setterm(int term) {
		this.term = term;
	}

	public double getInterestAmt() {
		return interestAmt;
	}

	public void setInterestAmt(double interestAmt) {
		this.interestAmt = interestAmt;
	}

	
	
	
	
	// Input DTO
	/*
	 public FixedDepositDTO(int customerID, String accHolderName, String applicationDate,
			@NotNull(message = "Fixed Deposit Amount is required!") double fixedDepositAmt, double ROI) {
		super();
		this.customerID = customerID;
		this.accHolderName = accHolderName;
		this.applicationDate = applicationDate;
		this.fixedDepositAmt = fixedDepositAmt;
		this.ROI = ROI;
	}

	 */
	
	

	// Output DTO
	/*
	 public FixedDepositDTO(int customerID, int fixedDepositID, String accHolderName, String applicationDate,
			@NotNull(message = "Fixed Deposit Amount is required!") double fixedDepositAmt, int term, double ROI,
			double totalAmt, String maturityDate) {
		super();
		this.customerID = customerID;
		this.fixedDepositID = fixedDepositID;
		this.accHolderName = accHolderName;
		this.applicationDate = applicationDate;
		this.fixedDepositAmt = fixedDepositAmt;
		this.term = term;
		this.ROI = ROI;
		this.totalAmt = totalAmt;
		this.maturityDate = maturityDate;
	}
	 */
	
	


		
	

}
