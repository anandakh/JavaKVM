package com;

public class Product {
	String pname, pcode;
	int price;
	public String getpname() {
		return pname;	
	}
	
	public Product(String pname, String pcode, int price) {
		this.pname = pname;
		this.pcode = pcode;
		this.price = price;
	}
	
	public Product() {	
	}
	
	public void setpname(String pname) {
		this.pname = pname;
	}
	
	public String getpcode() {
		return pcode;
	}
	
	public void setpcode(String pcode) {
		this.pcode = pcode;
	}
	
	public int getprice() {
		return price;	
	}
	
	public void display() {
		System.out.println("Pcode="+this.pcode);
		System.out.println("Pname="+this.pname);
		System.out.println("Price="+this.price);
	}
}
