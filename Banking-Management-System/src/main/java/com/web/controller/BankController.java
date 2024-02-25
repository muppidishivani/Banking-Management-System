package com.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.BankAccount;

import com.web.model.Deposit;
import com.web.model.TransferAmount;
import com.web.model.WithDraw;
import com.web.service.BankService;

@RestController
@CrossOrigin("*")
public class BankController {
	
@Autowired
private BankService service;
	
@PostMapping("/save")
public BankAccount addAccount(@RequestBody BankAccount bank) {
	BankAccount b=service.addAccount(bank);
	return b;
}
@GetMapping("/balance")
public BankAccount balance(@RequestBody BankAccount bank) {
	BankAccount bankooo=service.getBalance(bank.getAccountno(),bank.getPassword());
	
	return bankooo;
	
}
@PostMapping("/deposit")
public String deposit(@RequestBody Deposit deposit) {
	boolean success=service.deposit(deposit.getAccountno(),deposit.getPassword(),deposit.getDeposit());
	if(success) {
		return "Amount deposited successfully.....";
	}
	else {
		return "failed to deposit amount.Invalid Accountno or password";
	}
	
	
}
@PostMapping("/withdraw")
public String withdraw(@RequestBody WithDraw withdraw) {
	boolean success=service.withDraw(withdraw.getAccountno(), withdraw.getPassword(), withdraw.getWithdrawAmount());
	if(success) {
		return "Amount withdrawn  successfully....";
	}
	else {
		return "Failed to withdraw amount.Insufficient Balance ";
	}	
}
@PostMapping("/trasfer")
public String trasfer(@RequestBody TransferAmount transfer) {
	boolean success=service.transfer(transfer.getAccountno(), transfer.getTargetAccountno(),transfer.getPassword(),transfer.getAmount() );
	if(success) {
		return "Amount Trasfered  successfully....";
	}
	else {
		return "Failed to withdraw amount.Insufficient Balance and check account number & pin ";
	}	
}
}
