package com.banking.ibs.dto;

public class ApplyLoan {
     private String loantype;
	 private String loanamt;
     private String loantenure;
     private String appnumber;
	
 
	public ApplyLoan(String loantype, String loanamt, String loantenure, String appnumber) {
		super();
		this.loantype = loantype;
		this.loanamt = loanamt;
		this.loantenure = loantenure;
		this.appnumber = appnumber;
	}
	public String getLoantype() {
		return loantype;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public String getLoanamt() {
		return loanamt;
	}
	public void setLoanamt(String loanamt) {
		this.loanamt = loanamt;
	}
	public String getloantenure() {
		return loantenure;
	}
	public void setloanmonths(String loantenure) {
		this.loantenure = loantenure;
	}
    public String getAppnumber() {
		return appnumber;
	}
	public void setAppnumber(String appnumber) {
		this.appnumber = appnumber;
	}
     
     
}
