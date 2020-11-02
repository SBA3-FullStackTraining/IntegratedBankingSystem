package com.banking.ibs.dto;

import java.math.BigInteger;
import java.util.Date;

public class ServiceProvider
{
	private int spaccountNumber;
	private BigInteger spaccountname;
	private float billamount;
	private String fixeddepositaccholder;
	private int term;
	private int depositamount;
	
	public ServiceProvider(int spaccountNumber, BigInteger spaccountname, float billamount, String fixeddepositaccholder, int depositamount,int term) {
		super();
		this.spaccountNumber = spaccountNumber;
		this.spaccountname = spaccountname;
		this.billamount = billamount;
		this.depositamount =depositamount;
		this.fixeddepositaccholder = fixeddepositaccholder;
		this.term = term;
	}

	public int getSpaccountNumber() {
		return spaccountNumber;
	}

	public void setSpaccountNumber(int spaccountNumber) {
		this.spaccountNumber = spaccountNumber;
	}

	public BigInteger getSpaccountname() {
		return spaccountname;
	}

	public void setSpaccountname(BigInteger spaccountname) {
		this.spaccountname = spaccountname;
	}

	public float getBillamount() {
		return billamount;
	}

	public void setBillamount(float billamount) {
		this.billamount = billamount;
	}

	public String getFixeddepositaccholder() {
		return fixeddepositaccholder;
	}

	public void setFixeddepositaccholder(String fixeddepositaccholder) {
		this.fixeddepositaccholder = fixeddepositaccholder;
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

	