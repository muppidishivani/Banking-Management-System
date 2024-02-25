package com.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.web.model.BankAccount;
import java.util.List;

@Repository
public interface BankRepo extends JpaRepository<BankAccount, Long> {
	BankAccount findByAccountnoAndPassword(Long accountno, String password);
	BankAccount findByAccountno(Long accountno);
}

