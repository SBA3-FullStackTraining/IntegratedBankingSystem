package com.banking.wf.springbootappibs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.banking.wf.springbootappibs.entity.LoanEmi;

public interface loanEmiRepository extends JpaRepository<LoanEmi, Long>{
	
	List<LoanEmi> findByloanId(@Param ("loanId") Long loanId);

}
