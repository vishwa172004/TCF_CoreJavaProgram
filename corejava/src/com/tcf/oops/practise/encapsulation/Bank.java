package com.tcf.oops.practise.encapsulation;
class Bank{
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Bank(int accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	public Bank() {
		
	}
	public void withdraw(double amount)
	{
		this.balance-=amount;
	}
	public void deposit(double amount)
	{
		this.balance+=amount;
	}
	public void displayAccountInfo()
	{
		this.toString();
	}
	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance="
				+ balance + "]";
	}
	
	
	
	
}