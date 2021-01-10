package com.banking.wf.springbootappibs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class Beneficiary {
	
	@Id
	@Column(length=5, nullable=false)
	@ColumnDefault("80000")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long beneficiaryID;
	
	@Column(length=16, nullable=false)
	private Long customerID;
	
	@Column(length=50, nullable=false)
	private String benfAccHolderName;
	
	@Column(length=50, nullable=false)
	private String benfRelation;
	
	@Column(length=50, nullable=false)
	private String benfBankAccountType;
	
	@Column(length=50, nullable=false)
	private String benfBankAccID;
	
	@Column(length=50, nullable=false)
	private String benfBankIFSC;

	@Column(length=50, nullable=false)
	private String benfBankName;
	
	public Long getBeneficiaryID() {
		return beneficiaryID;
	}

	public void setBeneficiaryID(Long beneficiaryID) {
		this.beneficiaryID = beneficiaryID;
	}

	public Long getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}

	public String getBenfAccHolderName() {
		return benfAccHolderName;
	}

	public void setBenfAccHolderName(String benfAccHolderName) {
		this.benfAccHolderName = benfAccHolderName;
	}

	public String getBenfRelation() {
		return benfRelation;
	}

	public void setBenfRelation(String benfRelation) {
		this.benfRelation = benfRelation;
	}

	public String getBenfBankAccountType() {
		return benfBankAccountType;
	}

	public void setBenfBankAccountType(String benfBankAccountType) {
		this.benfBankAccountType = benfBankAccountType;
	}

	public String getBenfBankAccID() {
		return benfBankAccID;
	}

	public void setBenfBankAccID(String benfBankAccID) {
		this.benfBankAccID = benfBankAccID;
	}

	public String getBenfBankIFSC() {
		return benfBankIFSC;
	}

	public void setBenfBankIFSC(String benfBankIFSC) {
		this.benfBankIFSC = benfBankIFSC;
	}

	public String getBenfBankName() {
		return benfBankName;
	}

	public void setBenfBankName(String benfBankName) {
		this.benfBankName = benfBankName;
	}

	public Beneficiary(Long beneficiaryID, Long customerID, String benfAccHolderName, String benfRelation,
			String benfBankAccountType, String benfBankAccID, String benfBankIFSC, String benfBankName) {
		super();
		this.beneficiaryID = beneficiaryID;
		this.customerID = customerID;
		this.benfAccHolderName = benfAccHolderName;
		this.benfRelation = benfRelation;
		this.benfBankAccountType = benfBankAccountType;
		this.benfBankAccID = benfBankAccID;
		this.benfBankIFSC = benfBankIFSC;
		this.benfBankName = benfBankName;
	}
	
	
	public Beneficiary()
	{}
	
	
}
