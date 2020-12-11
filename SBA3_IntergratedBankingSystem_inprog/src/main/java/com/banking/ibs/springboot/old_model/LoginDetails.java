package com.banking.ibs.springboot.old_model;

import javax.validation.constraints.NotNull;

public class LoginDetails {

	@NotNull(message = "Login ID is required!")
	private String loginID;
	@NotNull(message = "Password is required!")
	private String password;
	@NotNull(message = "AccountID is required!")
	private String accountID;
	
	public LoginDetails(String loginID, String password) {
		super();
		this.loginID = loginID;
		this.password = password;
	}
	
	public LoginDetails(String loginID, String password, String accountID) {
		super();
		this.loginID = loginID;
		this.password = password;
		this.accountID = accountID;
	}

	public String getLoginID() {
		return loginID;
	}
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccountID() {
		return accountID;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

}
