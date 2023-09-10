package com;

public class Teacher extends EmployeeT  {
	String departmet, subject;

	Teacher(int empid, String name, float salary, String address, String departmet, String subject) {
		super(empid, name, salary, address);
		this.departmet = departmet;
		this.subject = subject;
	}
	
	public void display() {
		System.out.println("Teacher id:"+empid);
		System.out.println("Teacher name:"+name);
		System.out.println("Teacher salary:"+salary);
		System.out.println("Teacher address:"+address);
		System.out.println("Teacher departmet:"+departmet);
		System.out.println("Teacher subject:"+subject);
	}
	
}
