package com;

public class Teacher extends Employe {
	String subject, department;
	int teacherid;
	public Teacher(String n, String g, String addr, int a, int eid, String cname, String qual, int sal, String sub, String dept, int tid) {
		super(n,g,addr,a,eid,cname,qual,sal);
		subject=sub;
		department=dept;
		teacherid=tid;
	}
	public void displayT() {
		super.dispaly_Employe();
		System.out.println("TeacherId: "+teacherid);
		System.out.println("Subject: "+subject);
		System.out.println("Department: "+department);
	}

}
