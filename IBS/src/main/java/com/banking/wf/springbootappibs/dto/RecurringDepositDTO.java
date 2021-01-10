package com.banking.wf.springbootappibs.dto;





import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;


public class RecurringDepositDTO {

	//@Length(max = 10, min = 10, message="Recurring Deposit ID should be of 10 digits")
	//@NotNull(message = "Recurring Deposit ID  is required!")
	private Long recurringDepositID;
	//@Length(max = 16, min = 16, message="Customer ID should be of 16 digits")
	//@NotNull(message = "CustomerID  is required!")
	private Long customerID;
	private String accHolderName;
	private String applicationDate;
	@NotNull(message = "Term  is required!")
	@Digits(integer=5, fraction=0, message="The value must be numeric and less than five digits")
	private int term;
	private double ROI;
	//@NotNull(message = "Monthly Deposit  is required!")
	private double monthlydeposit;
	private double totalAmt;
	private String maturityDate;
	private double interestAmt;
	
	
	
	
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
	public double gettotalAmt() {
		return totalAmt;
	}
	public void settotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public double getInterestAmt() {
		return interestAmt;
	}
	public void setInterestAmt(double interestAmt) {
		this.interestAmt = interestAmt;
	}

	// Input DTO
	/*
	public RecurringDepositDTO(int customerID, String accHolderName, String applicationDate,
			@NotNull(message = "Term  is required!") @Digits(integer = 5, fraction = 0, message = "The value must be numeric and less than five digits") int term,
			double ROI) {
		super();
		this.customerID = customerID;
		this.accHolderName = accHolderName;
		this.applicationDate = applicationDate;
		this.term = term;
		this.ROI = ROI;
	} 
	 */
	
	
	// Output DTO
	
	
	/*
	public RecurringDepositDTO(int recurringDepositID, int customerID, String accHolderName, String applicationDate,
			@NotNull(message = "Term  is required!") @Digits(integer = 5, fraction = 0, message = "The value must be numeric and less than five digits") int term,
			double ROI, double monthlydeposit, double totalDepositAmt, String maturityDate) {
		super();
		this.recurringDepositID = recurringDepositID;
		this.customerID = customerID;
		this.accHolderName = accHolderName;
		this.applicationDate = applicationDate;
		this.term = term;
		this.ROI = ROI;
		this.monthlydeposit = monthlydeposit;
		this.totalDepositAmt = totalDepositAmt;
		this.maturityDate = maturityDate;
	}
	 
	 */
	
	
	
	
	
}
