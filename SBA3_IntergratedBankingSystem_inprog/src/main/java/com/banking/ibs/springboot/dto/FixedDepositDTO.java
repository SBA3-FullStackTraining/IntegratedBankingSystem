package com.banking.ibs.springboot.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class FixedDepositDTO {
	
	
	private int fixedDepositID;
	
	
	private int customerID;
	
	
	@NotNull(message = "Fixed Deposit Amount is required!")
	private double fixedDepositAmt;
	
	private double ROI;
	
	private String applicationDate;
	
	
	private String maturityDate;
	
	private double totalAmt;
	
	private String accHolderName;
	
	// Input DTO

	public FixedDepositDTO(
			 int customerID,
			@NotNull(message = "Fixed Deposit  is required!") double fixedDepositAmt, double rOI,
			String applicationDate,  String accHolderName) {
		super();
		this.customerID = customerID;
		this.fixedDepositAmt = fixedDepositAmt;
		ROI = rOI;
		this.applicationDate = applicationDate;
		this.accHolderName = accHolderName;
	}

	// Output DTO
	
		public FixedDepositDTO(
				@Length(max = 10, min = 10, message = "Fixed Deposit ID should be of 10 digits") @NotNull(message = "Fixed Deposit ID  is required!") int fixedDepositID,
				@Length(max = 16, min = 16, message = "Customer ID should be of 16 digits") @NotNull(message = "CustomerID  is required!") int customerID,
				@NotNull(message = "Fixed Deposit  is required!") double fixedDepositAmt, double rOI,
				String applicationDate, @NotBlank(message = "maturityDate  is required!") String maturityDate,
				double totalAmt, String accHolderName) {
			super();
			this.fixedDepositID = fixedDepositID;
			this.customerID = customerID;
			this.fixedDepositAmt = fixedDepositAmt;
			ROI = rOI;
			this.applicationDate = applicationDate;
			this.maturityDate = maturityDate;
			this.totalAmt = totalAmt;
			this.accHolderName = accHolderName;
		}
		
		

	public int getFixedDepositID() {
		return fixedDepositID;
	}

	public void setFixedDepositID(int fixedDepositID) {
		this.fixedDepositID = fixedDepositID;
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

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}


}
