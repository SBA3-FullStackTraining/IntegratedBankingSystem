package com.banking.wf.springbootappibs.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class SessionDataDTO {

	private String loggedInUser;
	
	@Length(max = 1, min = 1, message="Sno should be of 1 digits")
	private Long sno;

	public Long getSno() {
		return sno;
	}

	public void setSno(Long sno) {
		this.sno = sno;
	}

	public String getLoggedInUser() {
		return loggedInUser;
	}

	public void setLoggedInUser(String loggedInUser) {
		this.loggedInUser = loggedInUser;
	}

	public SessionDataDTO(String loggedInUser,
			@Length(max = 1, min = 1, message = "Sno should be of 1 digits") Long sno) {
		super();
		this.loggedInUser = loggedInUser;
		this.sno = sno;
	}

	
	
}
