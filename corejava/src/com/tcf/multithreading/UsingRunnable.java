package com.tcf.multithreading;

public class UsingRunnable implements Runnable{
	private int start,end;
	private String msg;
	Thread t;
	public UsingRunnable(int start,int end,String msg)
	{
		this.start=start;
		this.end=end;
		this.msg=msg;
		this.t=new Thread(this,"child thread");
		t.start();
	}
	public void run()
	{
		for(int i=start;i<=end;i++)
		{
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("Hello "+ msg);
		}
	}
	
	
}
