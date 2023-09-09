package com;

import java.util.Scanner;
public class Circle implements AP {
	int r=0;
	double area=0, perimeter=0, pi = 3.141;
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle;");
		r=sc.nextInt();
	}
	public void area() {
		area = pi*r*r;
		System.out.println("Area of the circle is:"+area);
	}
	public void perimeter() {
		perimeter= 2*pi*r;
		System.out.println("perimeter of the circle is:"+perimeter);
	}
	

}
