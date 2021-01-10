package com.banking.wf.springbootappibs.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;



public class BeneficiaryDTO {
	
	@Length(max = 16, min = 16, message="Customer ID should be of 16 digits")
	@NotNull(message = "CustomerID  is required!")
	private Long customerID;
	
	@Length(max = 5, min = 5, message="beneficiary ID should be of 5 digits")
	@NotNull(message = "beneficiary ID  is required!")
	private Long beneficiaryID;
	
	@NotBlank(message = "beneficiary Account HolderName is required!")
	private String benfAccHolderName;
	
	@NotBlank(message = "beneficiary Relation is required!")
	private String benfRelation;
	
	@NotBlank(message = "beneficiary Bank Account Type is required!")
	private String benfBankAccountType;
	
	@NotBlank(message = "beneficiary Bank account ID is required!")
	private String benfBankAccID;
	
	@NotBlank(message = "beneficiary Bank IFSC code is required!")
	private String benfBankIFSC;
	
	@NotBlank(message = "beneficiary Bank Name is required!")
	private String benfBankName;

	
	public String getBenfBankName() {
		return benfBankName;
	}

	public void setBenfBankName(String benfBankName) {
		this.benfBankName = benfBankName;
	}

	public Long getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}

	public Long getBeneficiaryID() {
		return beneficiaryID;
	}

	public void setBeneficiaryID(Long beneficiaryID) {
		this.beneficiaryID = beneficiaryID;
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

	public BeneficiaryDTO(
			@Length(max = 16, min = 16, message = "Customer ID should be of 16 digits") @NotNull(message = "CustomerID  is required!") Long customerID,
			@Length(max = 5, min = 5, message = "beneficiary ID should be of 5 digits") @NotNull(message = "beneficiary ID  is required!") Long beneficiaryID,
			@NotBlank(message = "beneficiary Account HolderName is required!") String benfAccHolderName,
			@NotBlank(message = "beneficiary Relation is required!") String benfRelation,
			@NotBlank(message = "beneficiary Bank Account Type is required!") String benfBankAccountType,
			@NotBlank(message = "beneficiary Bank account ID is required!") String benfBankAccID,
			@NotBlank(message = "beneficiary Bank IFSC code is required!") String benfBankIFSC,
			@NotBlank(message = "beneficiary Bank Name is required!") String benfBankName) {
		super();
		this.customerID = customerID;
		this.beneficiaryID = beneficiaryID;
		this.benfAccHolderName = benfAccHolderName;
		this.benfRelation = benfRelation;
		this.benfBankAccountType = benfBankAccountType;
		this.benfBankAccID = benfBankAccID;
		this.benfBankIFSC = benfBankIFSC;
		this.benfBankName = benfBankName;
	}

	public BeneficiaryDTO() {
	}
	
	
	
	
}
