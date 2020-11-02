package com.banking.ibs.dto;

import java.math.BigInteger;
import java.util.Date;

public class FixedDeposit
{
	private int fixeddepoaccountNumber;
	private BigInteger fixeddepositaccholder;
	private float rateofinterest;
	
	private int term;
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


	private int depositamount;
	

	public FixedDeposit(int fixeddepoaccountNumber, BigInteger fixeddepositaccholder, int depositamount, int term, float rateofinterest) {
		super();
		this.fixeddepoaccountNumber = fixeddepoaccountNumber;
		this.fixeddepositaccholder = fixeddepositaccholder;
		this.depositamount = depositamount;
		
		this.rateofinterest = rateofinterest;
		this.term = term;
	}
}

	
	