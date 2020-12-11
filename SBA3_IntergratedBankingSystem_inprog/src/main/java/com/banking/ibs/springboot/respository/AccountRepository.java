package com.banking.ibs.springboot.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.banking.ibs.springboot.entity.Account;


@Repository
public interface AccountRepository extends JpaRepository<Account, Long>
{
	@Query("select acc from Account acc where acc.customerid=:customerID")
	List<Account> findByCustomerID(@Param("customerID")Long customerID);
}

