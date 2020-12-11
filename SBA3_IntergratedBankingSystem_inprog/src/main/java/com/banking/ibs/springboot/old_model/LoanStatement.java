package com.banking.ibs.springboot.old_model;

import javax.validation.constraints.NotNull;

public class LoanStatement {
	
	@NotNull(message = "Loan Acc is required!")
	private String lacctnumber;
	@NotNull(message = "Start Date is required!")
	private String startdate;
	@NotNull(message = "nd Date is required!")
	private String enddate;
	
	
	public LoanStatement(String lacctnumber, String startdate, String enddate) {
		super();
		this.lacctnumber = lacctnumber;
		this.startdate = startdate;
		this.enddate = enddate;
	}
	public String getLacctnumber() {
		return lacctnumber;
	}
	public void setLacctnumber(String lacctnumber) {
		this.lacctnumber = lacctnumber;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	
	
	
	
	
}
