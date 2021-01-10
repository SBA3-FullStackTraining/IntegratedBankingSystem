package com.banking.wf.springbootappibs.exception;

public class CustomerCredentialsException extends RuntimeException{
	public CustomerCredentialsException(String message) {
		super(message);
	}
}
