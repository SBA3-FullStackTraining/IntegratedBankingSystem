package com.banking.ibs.springboot.old_model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class LoanPreclose {
	
	@NotNull(message = "Loan Account is required!")
	private String laccnum;
	@NotBlank(message = "Preclsoe is required!")
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
