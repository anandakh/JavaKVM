package com;
import java.util.Scanner;
public class Main {
	public static void main(String []ar) {
		System.out.println("Enter number of teachers:");
		Scanner sc =new Scanner(System.in);
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		Teacher[] teacher = new Teacher[n];
		for(int i=0; i<n; i++) {
			System.out.println("Enter name of teachers:");
			String name=sc.nextLine();
			System.out.println("Enter gender of teachers:");
			String gen=sc.nextLine();
			System.out.println("Enter address of teachers:");
			String addr=sc.nextLine();
			System.out.println("Enter age of teachers:");
			int age = s.nextInt();
			System.out.println("Enter empid of teacher:");
			int eid = s.nextInt();
			System.out.println("Enter company name:");		
			String cn=sc.nextLine();
			System.out.println("Enter qualification of teacher:");
			String qual=sc.nextLine();
			System.out.println("Enter salary of teacher:");
			int sal = s.nextInt();
			System.out.println("Enter teacher id:");
			int tid = s.nextInt();
			System.out.println("Enter subject of teacher1:");
			String sub=sc.nextLine();
			System.out.println("Enter department of teacher:");
			String dept=sc.nextLine();
			Teacher t = new Teacher(name, gen, addr, age, eid, cn, qual, sal,sub, dept, tid);
			teacher[i] = t;
		}
		for(Teacher t: teacher) {
			t.displayT();
		}
	}

}

//pgm 10 . 
