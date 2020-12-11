package com.banking.ibs.springboot.old_model;

import java.math.BigInteger;
import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ServiceProvider
{
	@NotNull(message = "SP Acc is required!")
	private int spaccountNumber;
	@NotNull(message = "From Acc is required!")
	private int fromAccountNumber;
	@NotBlank(message = "SP Acc Name is required!")
	private BigInteger spaccountName;
	@NotNull(message = "Bill Amount is required!")
	private float billAmount;
	@NotBlank(message = "FD Account Holder is required!")
	private String fixedDepositAccholder;
	@NotNull(message = "Term is required!")
	private int term;
	@NotNull(message = "DepositAmount is required!")
	private int depositAmount;
	@NotNull(message = "Txn password is required!")
	private int transpswd;
	
	public ServiceProvider(int spaccountNumber, BigInteger spaccountname, float billamount, String fixeddepositaccholder, int depositamount,int term,int fromAccountNumber,int transpswd) {
		super();
		this.spaccountNumber = spaccountNumber;
		this.fromAccountNumber = fromAccountNumber;
		this.spaccountName = spaccountname;
		this.billAmount = billamount;
		this.transpswd = transpswd;
	}

	public int getfromAccountNumber() {
		return spaccountNumber;
	}

	public void setfromAccountNumber(int fromAccountNumber) {
		this.spaccountNumber = fromAccountNumber;
	}
	
	public int gettranspswd() {
		return transpswd;
	}

	public void settranspswd(int transpswd) {
		this.transpswd = transpswd;
	}
	
	public int getSpaccountNumber() {
		return spaccountNumber;
	}

	public void setSpaccountNumber(int spaccountNumber) {
		this.spaccountNumber = spaccountNumber;
	}

	public BigInteger getSpaccountname() {
		return spaccountName;
	}

	public void setSpaccountname(BigInteger spaccountname) {
		this.spaccountName = spaccountname;
	}

	public float getBillamount() {
		return billAmount;
	}

	public void setBillamount(float billamount) {
		this.billAmount = billamount;
	}

	public String getFixeddepositaccholder() {
		return fixedDepositAccholder;
	}

	public void setFixeddepositaccholder(String fixeddepositaccholder) {
		this.fixedDepositAccholder = fixeddepositaccholder;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public int getDepositamount() {
		return depositAmount;
	}

	public void setDepositamount(int depositamount) {
		this.depositAmount = depositamount;
	}
}

	