package com.banking.wf.springbootappibs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.banking.wf.springbootappibs.entity.SavingsAccount;



@Repository

public interface SavingsAccountRepository extends JpaRepository<SavingsAccount, Long>{
	
	
	List<SavingsAccount> findByCustomerId(Long customerId);
	
	
}
