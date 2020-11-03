package com.banking.ibs.dto;

public class LoanStatement {
	
	private String lacctnumber;
	private String startdate;
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
