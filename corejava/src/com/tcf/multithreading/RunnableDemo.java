package com.tcf.multithreading;

public class RunnableDemo {

	public static void main(String[] args) {
		UsingRunnable a=new UsingRunnable(1,10,"Arun");
		Runnable r=()->{System.out.println("Run method runing");};
	}

}
