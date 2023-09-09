package com;

public class Main {
	public static void main(String[] args) {
		Fthread ft = new Fthread();
		EvenRangeThread ev = new EvenRangeThread();
		Thread t1 = new Thread(ft);
		Thread t2 = new Thread(ev);
		t1.start();
		t2.start();
	}
}

//program no 17 in record