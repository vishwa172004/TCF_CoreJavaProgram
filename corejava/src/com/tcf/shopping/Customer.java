package com.tcf.shopping;

public class Customer {
	private int cid;
	private String name;
	private String city;
	//interface method
	private ShoppingMall sh;
	public Customer(int cid, String name, String city, ShoppingMall sh) {
		this.cid = cid;
		this.name = name;
		this.city = city;
		this.sh = sh;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", city=" + city + "]";
	}
	public void order()
	{
		sh.purchase();
	}
}
