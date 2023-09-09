package com;

import java.util.Scanner;
public class Rectangle implements AP{
	
	int l=0, b=0;
	double area, perimeter;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectangle:");
		l=sc.nextInt();
		System.out.println("Enter the breadth of rectangle:");
		b=sc.nextInt();
	}
	public void area() {
		area = l*b;
		System.out.println("Area of the rectangle is:"+area);
	}
	public void perimeter() {
		perimeter = 2*l+b;
		System.out.println("perimeter of the rectangle is:"+perimeter);
	}
	

}
