package com.web.model;

public class WithDraw {
private Long accountno;
private String password;
private double withdrawAmount;
public WithDraw() {
	super();
}
public WithDraw(Long accountno, String password, double withdrawAmount) {
	super();
	this.accountno = accountno;
	this.password = password;
	this.withdrawAmount = withdrawAmount;
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
public double getWithdrawAmount() {
	return withdrawAmount;
}
public void setWithdrawAmount(double withdrawAmount) {
	this.withdrawAmount = withdrawAmount;
}
@Override
public String toString() {
	return "WithDraw [accountno=" + accountno + ", password=" + password + ", withdrawAmount=" + withdrawAmount + "]";
}




}
