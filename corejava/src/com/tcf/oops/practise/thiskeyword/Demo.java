package com.tcf.oops.practise.thiskeyword;

public class Demo {

	public static void main(String[] args) {
		Book obj1=new Book();
		Book obj2=new Book(101,"Java Programming","James Gosling",499.99);
		obj2.displayInfo();
		Book obj3=new Book(102,"Effective Java","Joshua Bloch",699.5);
		obj3.displayInfo();

	}

}
