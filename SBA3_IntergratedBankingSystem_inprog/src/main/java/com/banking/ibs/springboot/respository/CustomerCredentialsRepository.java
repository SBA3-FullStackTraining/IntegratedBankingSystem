package com.banking.ibs.springboot.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.ibs.springboot.entity.CustomerCredentials;


@Repository
public interface CustomerCredentialsRepository extends JpaRepository<CustomerCredentials, Long>
{

}
