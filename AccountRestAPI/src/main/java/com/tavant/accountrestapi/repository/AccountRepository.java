package com.tavant.accountrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tavant.accountrestapi.model.Account;
@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

}
