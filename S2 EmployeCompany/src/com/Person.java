package com;

public class Person {
	String name, gender, address;
	protected int age;
	public Person(String n, String g, String addr, int a) {
		this.name = n;
		this.gender = g;
		this.address = addr;
		this.age = a;
	}
	public void display_person() {
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Address: "+address);
		System.out.println("Age: "+age);
	}

}
