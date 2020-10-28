package com.banking.ibs.dto;

public class LoginDetails {

	private String loginID;
	private String password;
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
