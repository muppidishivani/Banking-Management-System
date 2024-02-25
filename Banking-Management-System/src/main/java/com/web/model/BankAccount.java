package com.web.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class BankAccount {
@Id
	private Long accountno;
	private String name;
	private String password;
	private double amount;
	private String address;
	private long mobileno;
	private int status;
	public BankAccount() {
		super();
	}
	public BankAccount(Long accountno, String name, String password, double amount, String address, long mobileno,
			int status) {
		super();
		this.accountno = accountno;
		this.name = name;
		this.password = password;
		this.amount = amount;
		this.address = address;
		this.mobileno = mobileno;
		this.status = status;
		
	}
	public Long getAccountno() {
		return accountno;
	}
	public void setAccountno(Long accountno) {
		this.accountno = accountno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "BankAccount [accountno=" + accountno + ", name=" + name + ", password=" + password + ", amount="
				+ amount + ", address=" + address + ", mobileno=" + mobileno + ", status=" + status + "]";
	}
	
	
	

	}
	
	

