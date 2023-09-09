package org.shape;

import java.util.*;
public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the squre:");
		int s = sc.nextInt();
		Squre sq = new Squre(s);
		System.out.println("Area of the squre is:"+sq.area());
		System.out.println("Enter the radius of the circle:");
		int r = sc.nextInt();
		Circle c1 = new Circle(r);
		System.out.println("Area of the circle is:"+c1.area()) ;
		System.out.println("Enter the side1 of the triangle:");
		int s1 = sc.nextInt();
		System.out.println("Enter the side2 of the triangle:");
		int s2 = sc.nextInt();
		System.out.println("Enter the side3 of the triangle:");
		int s3 = sc.nextInt();
		Triangle t = new Triangle(s1, s2, s3);
		System.out.println("Area of triangle:"+t.area());
		
	}

}
//program 14 in record