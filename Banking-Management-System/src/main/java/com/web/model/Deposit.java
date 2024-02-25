package com.web.model;

public class Deposit {
private Long accountno;
private String password;
private double deposit;

public Deposit() {
	super();
}

public Deposit(Long accountno, String password, double deposit) {
	super();
	this.accountno = accountno;
	this.password = password;
	this.deposit = deposit;
}

public Long getAccountno() {
	return accountno;
}

public void setAccountno(Long accountno) {
	this.accountno = accountno;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public double getDeposit() {
	return deposit;
}

public void setDeposit(double deposit) {
	this.deposit = deposit;
}

@Override
public String toString() {
	return "Deposit [accountno=" + accountno + ", password=" + password + ", deposit=" + deposit + "]";
}



}
