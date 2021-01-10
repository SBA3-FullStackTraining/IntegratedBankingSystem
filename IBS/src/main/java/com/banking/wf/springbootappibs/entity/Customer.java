package com.banking.wf.springbootappibs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.validator.constraints.Length;


@Entity
public class Customer {
	
	@Id  // primary key
    @Column(length=16, nullable=false)
	@ColumnDefault("7777777777777771")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerID;
	
	@Column(length=100, nullable=false)
	private String firstName;
	
	@Column(length=100, nullable=false)
	private String lastName;
	
	@Column(length=10, nullable=false)
	private Long phoneNumber;
	
	@Column(length=100, nullable=false)
	private String email;
	
	@Column(length=10, nullable=false)
	private String dateOfBirth;
	
	@Column(length=100, nullable=false)
	private String city;
	
	@Column(length=100, nullable=false)
	private String state;
	
	@Column(length=100, nullable=false)
	private String country;
	
	@Column(length=100, nullable=false)
	private String pincode;
	
	@Column(length=100, nullable=false)
	private String fullAddress;
	
	@Column(length=100, nullable=false)
	private String givenID;
	
	@Column(length=100, nullable=false)
	private String IDNumber;
	
	@Column(length=100, nullable=false)
	private String kycStatus;


	public String getKycStatus() {
		return kycStatus;
	}

	public void setKycStatus(String kycStatus) {
		this.kycStatus = kycStatus;
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

}
