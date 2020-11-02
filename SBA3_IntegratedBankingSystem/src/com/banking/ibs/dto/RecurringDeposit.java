package com.banking.ibs.dto;

import java.math.BigInteger;
import java.util.Date;

public class RecurringDeposit
{
	private int recdepoaccountNumber;
	private BigInteger recdepositaccholder;
	private float rateofinterest;
	
	private int term;
	private int depositamount;
	
	public RecurringDeposit(int recdepoaccountNumber, BigInteger recdepositaccholder, int depositamount, int term, float rateofinterest) {
		super();
		this.recdepoaccountNumber = recdepoaccountNumber;
		this.recdepositaccholder = recdepositaccholder;
		this.depositamount = depositamount;
		
		this.rateofinterest = rateofinterest;
		this.term = term;
	}

	public int getRecdepoaccountNumber() {
		return recdepoaccountNumber;
	}

	public void setRecdepoaccountNumber(int recdepoaccountNumber) {
		this.recdepoaccountNumber = recdepoaccountNumber;
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
	}}