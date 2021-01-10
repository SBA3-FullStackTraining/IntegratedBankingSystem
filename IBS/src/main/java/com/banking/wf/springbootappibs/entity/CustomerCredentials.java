package com.banking.wf.springbootappibs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.core.userdetails.User;


@Entity
public class CustomerCredentials 
{
	@Id
	@Column(length=16, nullable=false)
	private Long customerID;
	
	@Column(length=100, nullable=false)
	private String password;
	
	@Column(length=10)
	private String transpswd;
	
	public String getTranspswd() {
		return transpswd;
	}

	public void setTranspswd(String transpswd) {
		this.transpswd = transpswd;
	}

	public Long getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
