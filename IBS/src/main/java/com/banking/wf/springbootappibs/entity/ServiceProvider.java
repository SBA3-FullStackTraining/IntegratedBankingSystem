package com.banking.wf.springbootappibs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;

@Entity

public class ServiceProvider {

	@Id
	@Column(length=5, nullable=false)
	@ColumnDefault("60000")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long spi;
	@Column(length=20, nullable=false)
	private String spiUtility;
	@Column(length=50, nullable=false)
	private String providerDetails;
	@Column(length=50, nullable=false)
	private String spBankName;
	@Column(length=5, nullable=false)
	private Long spAccNo;
	@Column(length=20, nullable=false)
	private String spKYCStatus;
	@Column(length=20, nullable=false)
	private Long givenID;
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
	public Long getGivenID() {
		return givenID;
	}
	public void setGivenID(Long givenID) {
		this.givenID = givenID;
	}
	
	
	
	
	
	
	
}
