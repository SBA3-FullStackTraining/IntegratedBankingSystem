package com.banking.ibs.dto;

public class Payemi {
	
	private String loanacct;
	private String emiamount;
	private String month;
	private String year;
	
	public Payemi(String loanacct, String emiamount, String month, String year) {
		super();
		this.loanacct = loanacct;
		this.emiamount = emiamount;
		this.month = month;
		this.year = year;
	}
	public String getLoanacct() {
		return loanacct;
	}
	public void setLoanacct(String loanacct) {
		this.loanacct = loanacct;
	}
	public String getEmiamount() {
		return emiamount;
	}
	public void setEmiamount(String emiamount) {
		this.emiamount = emiamount;
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
	
	
	
	
	}
