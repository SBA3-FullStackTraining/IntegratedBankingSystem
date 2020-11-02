package com.banking.ibs.dto;

import java.math.BigInteger;
import java.util.Date;

public class BeneficiaryAccount
{
	private int benfaccountNumber;
	private String benfIFSC;
	private String benfname;
	
	public BeneficiaryAccount(int benfaccountNumber, String benfname, String benfIFSC) {
		super();
		this.benfaccountNumber = benfaccountNumber;
		this.benfname = benfname;
		this.benfIFSC = benfIFSC;
		
	}

	public int getBenfaccountNumber() {
		return benfaccountNumber;
	}

	public void setBenfaccountNumber(int benfaccountNumber) {
		this.benfaccountNumber = benfaccountNumber;
	}

	public String getBenfIFSC() {
		return benfIFSC;
	}

	public void setBenfIFSC(String benfIFSC) {
		this.benfIFSC = benfIFSC;
	}

	public String getBenfname() {
		return benfname;
	}

	public void setBenfname(String benfname) {
		this.benfname = benfname;
	}

	

}
