package com.banking.ibs.springboot.exception;


public class CustomerCredentialsException extends RuntimeException{
	public CustomerCredentialsException(String message) {
		super(message);
	}
}
