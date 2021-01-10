package com.banking.wf.springbootappibs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.wf.springbootappibs.entity.Loan;

public interface loanRepository extends JpaRepository<Loan, Long>{
	
	List<Loan> findByloanId(long loanId);

}
