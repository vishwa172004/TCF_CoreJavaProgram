package com.tcf.demo;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if((a&1)==1)
		{
			System.out.println("The give number is odd");
		}
		else {
			System.out.println("The give number is even");
		}
		sc.close();
	}

}
