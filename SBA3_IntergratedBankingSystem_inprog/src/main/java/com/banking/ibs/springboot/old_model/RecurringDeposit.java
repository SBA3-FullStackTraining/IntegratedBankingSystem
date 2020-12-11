package com.banking.ibs.springboot.old_model;

import java.math.BigInteger;
import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class RecurringDeposit
{
	@NotNull(message = "RD Acc is required!")
	private int recdepoaccountNumber;
	@NotBlank(message = "RD Account Holder is required!")
	private BigInteger recdepositaccholder;
	@NotNull(message = "ROI is required!")
	private float rateofinterest;
	
	private int term;
	private int depositamount;
	private int maturityDate;
	
	public RecurringDeposit(int recdepoaccountNumber, BigInteger recdepositaccholder, int depositamount, int term, float rateofinterest,int maturityDate) {
		super();
		this.recdepoaccountNumber = recdepoaccountNumber;
		this.recdepositaccholder = recdepositaccholder;
		this.depositamount = depositamount;
		
		this.rateofinterest = rateofinterest;
		this.term = term;
		this.maturityDate = maturityDate;
	}

	public int getRecdepoaccountNumber() {
		return recdepoaccountNumber;
	}

	public void setRecdepoaccountNumber(int recdepoaccountNumber) {
		this.recdepoaccountNumber = recdepoaccountNumber;
	}
	
	public int getmaturityDate() {
		return maturityDate;
	}

	public void setmaturityDate(int maturityDate) {
		this.maturityDate = maturityDate;
	}

	public BigInteger getRecdepositaccholder() {
		return recdepositaccholder;
	}

	public void setRecdepositaccholder(BigInteger recdepositaccholder) {
		this.recdepositaccholder = recdepositaccholder;
	}

	public float getRateofinterest() {
		return rateofinterest;
	}

	public void setRateofinterest(float rateofinterest) {
		this.rateofinterest = rateofinterest;
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
	
}