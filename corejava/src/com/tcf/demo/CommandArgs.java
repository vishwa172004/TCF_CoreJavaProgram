package com.tcf.demo;

public class CommandArgs {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=a+b;
		System.out.println("Addition of a and b is: " + c);
	}

}
