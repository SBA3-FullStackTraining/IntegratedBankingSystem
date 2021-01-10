package com.banking.wf.springbootappibs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.banking.wf.springbootappibs.entity.Account;



@Repository
public interface AccountRepository extends JpaRepository<Account, Long>
{
	@Query(value = "SELECT * FROM Account acc WHERE acc.customer_id = :customerID", nativeQuery = true)
	List<Account> findByCustomerID(@Param("customerID") Long customerID);
}

