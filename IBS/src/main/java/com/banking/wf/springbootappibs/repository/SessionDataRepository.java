package com.banking.wf.springbootappibs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.banking.wf.springbootappibs.entity.Bank;
import com.banking.wf.springbootappibs.entity.SessionData;


@Repository
public interface SessionDataRepository extends JpaRepository<SessionData, Long>{

}
