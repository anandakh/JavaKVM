package com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter number of teahers:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter details of teacher:");
		Teacher[] Teacher = new Teacher[n];
		int id;
		String deptname,name,address,Subject;
		float salary;
		for(int i=0; i<n; i++) {
			System.out.println("Enter "+i+"teacher details");
			System.out.println("Enter teacher id:");
			id = sc.nextInt();
			System.out.println("Enter teacher name:");
			Scanner s = new Scanner(System.in);
			name = s.nextLine();
			System.out.println("Enter teacher salary:");
			salary = sc.nextInt();
			System.out.println("Enter teacher address:");
			address = s.nextLine();
			System.out.println("Enter teacher department:");
			deptname = s.nextLine();
			System.out.println("Enter teacher subjects:");
			Scanner c = new Scanner(System.in);
			Subject = c.nextLine();
			Teacher[i] = new Teacher(id, name, salary, address, deptname, Subject);	
		}
		
		System.out.println("Teacher details are:");
		for (Teacher x:Teacher) {
			x.display();
		}
		System.out.println();

	}

}
//pgm9.  
