package com.banking.ibs.springboot.old_model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class BankAdmin {
	
	@NotBlank(message = "First name is required!")
	private String firstName;
	@NotBlank(message = "last name is required!")
	private String lastName;
	@NotNull(message = "EmployeeID is required!")
	private int employeeID;
	@NotNull(message = "BranchID is required!")
	private int branchID;
	@NotNull(message = "Phone Number is required!")
	private String phoneNumber;
	
	public BankAdmin(String firstName, String lastName, int employeeID, int branchID, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeID = employeeID;
		this.branchID = branchID;
		this.phoneNumber = phoneNumber;
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
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public int getBranchID() {
		return branchID;
	}
	public void setBranchID(int branchID) {
		this.branchID = branchID;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
