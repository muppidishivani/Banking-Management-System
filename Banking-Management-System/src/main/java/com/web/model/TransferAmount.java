package com.web.model;

public class TransferAmount {
private Long accountno;
private Long targetAccountno;
private String password;
private double amount;
public TransferAmount() {
	super();
}
public TransferAmount(Long accountno, Long targetAccountno, String password, double amount) {
	super();
	this.accountno = accountno;
	this.targetAccountno = targetAccountno;
	this.password = password;
	this.amount = amount;
}
public Long getAccountno() {
	return accountno;
}
public void setAccountno(Long accountno) {
	this.accountno = accountno;
}
public Long getTargetAccountno() {
	return targetAccountno;
}
public void setTargetAccountno(Long targetAccountno) {
	this.targetAccountno = targetAccountno;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "TransferAmount [accountno=" + accountno + ", targetAccountno=" + targetAccountno + ", password=" + password
			+ ", amount=" + amount + "]";
}


}
