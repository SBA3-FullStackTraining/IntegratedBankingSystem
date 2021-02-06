package com.banking.wf.springbootappibs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.banking.wf.springbootappibs.entity.Customer;
import com.banking.wf.springbootappibs.entity.Loan;

@Repository
public interface loanRepository extends JpaRepository<Loan, Long>{
	
	List<Loan> findByloanId(long loanId);
	List<Loan> findByCustomerIdAndStatus(@Param ("customerId") Long customerId, @Param("status") String status);
	
	@Query(value = "select l.* from loan l where l.status =:status", nativeQuery = true )
	List<Loan> findLoanByStatus(@Param("status") String status);
	
	/*
	 * @Modifying
	 * 
	 * @Query(value = "update loan l set l.status=:status where l.loanId =:loanId",
	 * nativeQuery = true) void updateloanstatus(@Param("status") String
	 * status, @Param("loanId") long loanId);
	 */
	

}
