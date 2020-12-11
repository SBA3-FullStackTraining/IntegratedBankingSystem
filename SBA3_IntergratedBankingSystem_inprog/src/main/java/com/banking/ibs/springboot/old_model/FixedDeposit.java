package com.banking.ibs.springboot.old_model;

import java.math.BigInteger;
import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class FixedDeposit
{
	@NotNull(message = "FD Acc Num is required!")
	private int fixeddepoaccountNumber;
	@NotBlank(message = "Account Holder is required!")
	private BigInteger fixeddepositaccholder;
	@NotNull(message = "ROI is required!")
	private float rateofInterest;
	private float fixedDepositAmount;
	private int term;
	private int depositAmount;
	
	
	public int getFixeddepoaccountNumber() {
		return fixeddepoaccountNumber;
	}


	public void setFixeddepoaccountNumber(int fixeddepoaccountNumber) {
		this.fixeddepoaccountNumber = fixeddepoaccountNumber;
	}


	public BigInteger getFixeddepositaccholder() {
		return fixeddepositaccholder;
	}


	public void setFixeddepositaccholder(BigInteger fixeddepositaccholder) {
		this.fixeddepositaccholder = fixeddepositaccholder;
	}


	public float getRateofinterest() {
		return rateofInterest;
	}


	public void setRateofinterest(float rateofinterest) {
		this.rateofInterest = rateofinterest;
	}


	public int getTerm() {
		return term;
	}


	public void setTerm(int term) {
		this.term = term;
	}


	public int getDepositamount() {
		return depositamount;
	}


	public void setDepositamount(int depositamount) {
		this.depositamount = depositamount;
	}


	private int depositamount;
	

	public FixedDeposit(int fixeddepoaccountNumber, BigInteger fixeddepositaccholder, int depositamount, int term, float rateofinterest) {
		super();
		this.fixeddepoaccountNumber = fixeddepoaccountNumber;
		this.fixeddepositaccholder = fixeddepositaccholder;
		this.depositamount = depositamount;
		
		this.rateofInterest = rateofinterest;
		this.term = term;
	}


	public int getDepositAmount() {
		return depositAmount;
	}


	public void setDepositAmount(int depositAmount) {
		this.depositAmount = depositAmount;
	}
}

	
	