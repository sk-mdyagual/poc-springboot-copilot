package com.banking.accounting.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.banking.accounting.entities.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
