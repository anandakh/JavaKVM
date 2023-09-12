package com;

public class Main {

	public static void main(String[] args) {
		Product p1 = new Product("BCO", "car123", 100000);
		System.out.println("***Display=p1");
		p1.display();
		Product p2 = new Product("Jagwar", "car426", 25000);
		System.out.println("***Display=p2");
		p2.display();
		Product p3 = new Product("Maruthi", "car800", 500000);
		System.out.println("***Display=p3");
		p3.display();
		Product p = new Product();
		if(p1.price < p2.price && p1.price < p3.price) {
			p=p1;
		}else if(p2.price<p3.price){
			p=p2;
		}else {
			p=p3;
		}
		System.out.println("***Display product with lowest price***");
		p.display();
	}

}

//pgm1   not committed
