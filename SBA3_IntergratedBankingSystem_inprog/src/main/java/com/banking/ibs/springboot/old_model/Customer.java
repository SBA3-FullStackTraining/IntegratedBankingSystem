package com.banking.ibs.springboot.old_model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Email;

public class Customer {
	@NotNull(message = "CustomerID  is required!")
	private String customerID;
	@NotNull(message = "Account ID is required!")
	private String accountID;
	@NotBlank(message = "First Name  is required!")
	private String firstName;
	@NotBlank(message = "Last Name  is required!")
	private String lastName;
	@NotNull(message = "PhoneNumber  is required!")
	private String phoneNumber;
	@Email(message = "e-Mail  is required!")
	private String email;
	@NotNull(message = "DOB  is required!")
	private String dateOfBirth;
	@NotBlank(message = "City  is required!")
	private String city;
	@NotBlank(message = "State  is required!")
	private String state;
	@NotBlank(message = "Country  is required!")
	private String country;
	@NotNull(message = "PINCODE  is required!")
	private String pincode;
	@NotBlank(message = "Address  is required!")
	private String fullAddress;
	@NotNull(message = "GivenID  is required!")
	private String givenID;
	@NotNull(message = "ID Number  is required!")
	private String IDNumber;
	
	public Customer(String customerID, String accountID, String firstName, String lastName, String phoneNumber, String email,
			String dateOfBirth, String city, String state, String country, String pincode, String fullAddress,
			String givenID, String iDNumber) {
		super();
		this.customerID = customerID;
		this.accountID = accountID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.fullAddress = fullAddress;
		this.givenID = givenID;
		IDNumber = iDNumber;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	public String getGivenID() {
		return givenID;
	}

	public void setGivenID(String givenID) {
		this.givenID = givenID;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}
	
}
