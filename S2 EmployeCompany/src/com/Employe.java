package com;

public class Employe extends Person {
	int empid, salary;
	String companyname, qualif;
	public Employe(String n, String g, String addr, int a, int eid, String cname, String qual, int sal) {
	super(n, g, addr, a);
	empid = eid;
	companyname = cname;
	qualif = qual;
	salary = sal;
	}
	public void dispaly_Employe() {
		super.display_person();
		System.out.println("Empid: "+empid);
		System.out.println("Company: "+companyname);
		System.out.println("Qualification "+qualif);
		System.out.println("Salary: "+salary);
	}
}
