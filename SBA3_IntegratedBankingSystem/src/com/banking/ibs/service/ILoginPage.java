package com.banking.ibs.service;


public interface ILoginPage 
{
	public void doLogin(String username, String password);
	public void doSignUp(String username, String email, int phone_num, String password, String re_enter_password);
	public void forgotPassword(String username, int phone_num);
	public void forgotPassword(String email);
	
}