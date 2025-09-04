package com.tcf.oops.practise.encapsulation;

public class Demo {

	public static void main(String[] args) {
		Bank p1=new Bank();
		p1.setAccountHolderName("Raj");
		p1.setAccountNumber(98876);
		p1.setBalance(50000);
		p1.deposit(4000);
		p1.withdraw(2000);
		System.out.println(p1);
		Bank p2=new Bank(1234,"Mani",75000);
		p2.withdraw(9000);
		System.out.println(p2);

	}

}
