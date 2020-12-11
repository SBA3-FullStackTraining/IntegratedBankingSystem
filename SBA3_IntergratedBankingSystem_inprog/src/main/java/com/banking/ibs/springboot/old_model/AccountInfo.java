package com.banking.ibs.springboot.old_model;

import java.math.BigInteger;
import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AccountInfo
{
	@NotNull(message = "CustomerID is required!")
	private int customerID;
	@NotNull(message = "Card Number is required!")
	private BigInteger cardNumber;
	@NotBlank(message = "Card Type is required!")
	private String cardType;
	@NotNull(message = "Expiry Date is required!")
	private Date expiryDate;
	@NotNull(message = "CVV is required!")
	private int cvv;
	@NotNull(message = "PIN is required!")
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
