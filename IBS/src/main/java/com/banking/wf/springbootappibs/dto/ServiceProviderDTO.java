package com.banking.wf.springbootappibs.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ColumnDefault;


public class ServiceProviderDTO {

	
	private Long spi;
	
	@NotBlank(message = "spiUtility  is required!")
	private String spiUtility;
	@NotBlank(message = "providerDetails  is required!")
	private String providerDetails;
	@NotBlank(message = "BankName  is required!")
	private String spBankName;
	@NotBlank(message = "AccNo  is required!")
	private Long spAccNo;
	
	private String spKYCStatus;
	@NotBlank(message = "Prrof ID  is required!")
	private Long givenID;
	
	public Long getGivenID() {
		return givenID;
	}

	public void setGivenID(Long givenID) {
		this.givenID = givenID;
	}

	public Long getSpi() {
		return spi;
	}

	public void setSpi(Long spi) {
		this.spi = spi;
	}

	public String getSpiUtility() {
		return spiUtility;
	}

	public void setSpiUtility(String spiUtility) {
		this.spiUtility = spiUtility;
	}

	public String getProviderDetails() {
		return providerDetails;
	}

	public void setProviderDetails(String providerDetails) {
		this.providerDetails = providerDetails;
	}

	public String getSpBankName() {
		return spBankName;
	}

	public void setSpBankName(String spBankName) {
		this.spBankName = spBankName;
	}

	public Long getSpAccNo() {
		return spAccNo;
	}

	public void setSpAccNo(Long spAccNo) {
		this.spAccNo = spAccNo;
	}

	public String getSpKYCStatus() {
		return spKYCStatus;
	}

	public void setSpKYCStatus(String spKYCStatus) {
		this.spKYCStatus = spKYCStatus;
	}

	
}
