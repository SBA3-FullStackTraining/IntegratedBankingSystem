package com.banking.wf.springbootappibs.exception;

public class LoanNotFoundException extends RuntimeException{

	public LoanNotFoundException(String message) {
		super(message);
	}
}
