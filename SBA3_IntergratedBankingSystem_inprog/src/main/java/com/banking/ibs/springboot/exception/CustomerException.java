package com.banking.ibs.springboot.exception;

public class CustomerException extends RuntimeException{
	public CustomerException(String message) {
		super(message);
	}
}