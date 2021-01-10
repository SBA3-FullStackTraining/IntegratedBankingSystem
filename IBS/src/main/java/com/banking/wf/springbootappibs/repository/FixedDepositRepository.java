package com.banking.wf.springbootappibs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.banking.wf.springbootappibs.entity.FixedDeposit;


@Repository
public interface FixedDepositRepository extends JpaRepository<FixedDeposit, Long>{
	
	
	//FixedDeposit findByCustomerID(Long customerID);
	List<FixedDeposit> findByCustomerID(Long customerID);
	
	
	
}
