package com.banking.wf.springbootappibs.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class AdminCredentialsDTO 
{
	
	@NotBlank(message = "adminID is required!")
	private String adminID;

	@NotBlank(message = "Password is required!")
	private String password;

	
	public AdminCredentialsDTO(
			@NotNull(message = "adminID is required!") String adminID,
			@NotBlank(message = "Password is required!") String password) {
		this.adminID = adminID;
		this.password = password;
	}
	
	public AdminCredentialsDTO() {
	}

	public String getAdminID() {
		return adminID;
	}

	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
