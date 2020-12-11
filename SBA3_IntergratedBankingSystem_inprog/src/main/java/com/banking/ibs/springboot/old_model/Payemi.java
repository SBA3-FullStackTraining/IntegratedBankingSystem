package com.banking.ibs.springboot.old_model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Payemi {
	
	@NotNull(message = "Loan Acc is required!")
	private String loanacct;
	@NotNull(message = "EMI is required!")
	private String emiamount;
	@NotBlank(message = "Month is required!")
	private String month;
	@NotNull(message = "Year is required!")
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
