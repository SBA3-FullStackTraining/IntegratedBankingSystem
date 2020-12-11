package com.banking.ibs.springboot.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.banking.ibs.springboot.entity.Bank;
import com.banking.ibs.springboot.entity.Branch;
import com.banking.ibs.springboot.entity.Customer;
import com.banking.ibs.springboot.entity.FixedDeposit;
import com.banking.ibs.springboot.entity.RecurringDeposit;
import com.banking.ibs.springboot.entity.SavingsAccount;

@Repository
public interface savingsAccountRepository extends JpaRepository<SavingsAccount, Long>{
	
	
	List<SavingsAccount> findBySavingsAccID(String savingsAccID);
	
	
}
