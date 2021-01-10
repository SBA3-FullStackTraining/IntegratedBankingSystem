package com.banking.wf.springbootappibs.exception;

public class TransactionException extends RuntimeException{
	public TransactionException(String message) {
		super(message);
	}
}
