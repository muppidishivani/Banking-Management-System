package com.web.service;



import com.web.model.BankAccount;


public interface BankService {
public BankAccount addAccount(BankAccount bank );
public BankAccount getBalance(Long accountno,String password);
public boolean deposit(Long accountno,String password,double deposit);
public boolean withDraw(Long accountno,String password,double withdrawAmount);
public boolean transfer(Long accountno,Long targetAccountno,String password,double amount);
}
