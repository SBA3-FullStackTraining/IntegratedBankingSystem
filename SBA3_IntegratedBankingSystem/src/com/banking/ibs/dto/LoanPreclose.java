package com.banking.ibs.dto;

public class LoanPreclose {
	
	private String laccnum;
	private String preclose;
	
	public LoanPreclose(String preclose, String laccnum) {
		super();
		this.laccnum = laccnum;
		this.preclose = preclose;
	}

	
	public String getLaccnum() {
		return laccnum;
	}


	public void setLaccnum(String laccnum) {
		this.laccnum = laccnum;
	}


	public String getPreclose() {
		return preclose;
	}
	public void setPreclose(String preclose) {
		this.preclose = preclose;
	} 
	
	
	
	
}
