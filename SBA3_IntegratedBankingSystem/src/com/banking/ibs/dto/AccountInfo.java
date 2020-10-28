package com.banking.ibs.dto;

import java.math.BigInteger;
import java.util.Date;

public class AccountInfo
{
	private int customerID;
	private BigInteger cardNumber;
	private String cardType;
	private Date expiryDate;
	private int cvv;
	private int pin;

	public AccountInfo(int customerID, BigInteger cardNumber, String cardType, Date expiryDate, int cvv, int pin) {
		super();
		this.customerID = customerID;
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
		this.pin = pin;
	}

	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public BigInteger getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(BigInteger cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	

}
