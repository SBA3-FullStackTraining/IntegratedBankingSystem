package com.banking.wf.springbootappibs.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;

public class CustomerDTO {
	
	@Length(max = 16, min = 16, message="Customer ID should be of 16 digits")
	@NotNull(message = "CustomerID  is required!")
	private Long customerID;
	
	@NotBlank(message = "First Name  is required!")
	private String firstName;
	
	@NotBlank(message = "Last Name  is required!")
	private String lastName;
	
	@Length(max = 10, min = 10, message="Phone Number should be of 10 digits")
	@NotNull(message = "PhoneNumber  is required!")
	private Long phoneNumber;
	
	@NotBlank(message = "e-Mail  is required!")
	@Email(message = "e-Mail  is required!")
	private String email;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@NotBlank(message = "DOB  is required and please enter the date format in yyyy-MM-dd format")
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
	
	@NotBlank(message = "GivenID  is required!")
	private String givenID;
	
	@NotBlank(message = "ID Number  is required!")
	private String IDNumber;
	
	@NotBlank(message = "KYC status  is required!")
	private String kycStatus;

	//providing data as output DTO
	public CustomerDTO(
			@Length(max = 16, min = 16, message = "Customer ID should be of 16 digits") @NotNull(message = "CustomerID  is required!") Long customerID,
			@NotBlank(message = "First Name  is required!") String firstName,
			@NotBlank(message = "Last Name  is required!") String lastName,
			@Length(max = 10, min = 10, message = "Phone Number should be of 10 digits") @NotNull(message = "PhoneNumber  is required!") Long phoneNumber,
			@NotBlank(message = "e-Mail  is required!") @Email(message = "e-Mail  is required!") String email,
			@NotBlank(message = "DOB  is required!") String dateOfBirth,
			@NotBlank(message = "City  is required!") String city,
			@NotBlank(message = "State  is required!") String state,
			@NotBlank(message = "Country  is required!") String country,
			@NotNull(message = "PINCODE  is required!") String pincode,
			@NotBlank(message = "Address  is required!") String fullAddress,
			@NotBlank(message = "GivenID  is required!") String givenID,
			@NotBlank(message = "ID Number  is required!") String iDNumber,
			@NotBlank(message = "KYC status  is required!") String kycStatus) {
		super();
		this.customerID = customerID;
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
		this.IDNumber = iDNumber;
		this.kycStatus = kycStatus;
	}

	//fetching the data while registration
	public CustomerDTO(@NotBlank(message = "First Name  is required!") String firstName,
			@NotBlank(message = "Last Name  is required!") String lastName,
			@Length(max = 10, min = 10, message = "Phone Number should be of 10 digits") @NotNull(message = "PhoneNumber  is required!") Long phoneNumber,
			@NotBlank(message = "e-Mail  is required!") @Email(message = "e-Mail  is required!") String email,
			@NotBlank(message = "DOB  is required!") String dateOfBirth,
			@NotBlank(message = "City  is required!") String city,
			@NotBlank(message = "State  is required!") String state,
			@NotBlank(message = "Country  is required!") String country,
			@NotNull(message = "PINCODE  is required!") String pincode,
			@NotBlank(message = "Address  is required!") String fullAddress,
			@NotBlank(message = "GivenID  is required!") String givenID,
			@NotBlank(message = "ID Number  is required!") String iDNumber) {
		super();
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
		this.IDNumber = iDNumber;
	}


	public CustomerDTO() {
		// TODO Auto-generated constructor stub
	}

	public Long getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
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

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
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
	

	public String getKycStatus() {
		return kycStatus;
	}

	public void setKycStatus(String kycStatus) {
		this.kycStatus = kycStatus;
	}

}
