package com;

import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		int ch;
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Area of circle\n2.Area of rectangle\n3.Perimeter of circle\n4.Perimeter of rectangle");
		ip : while(true) {
			System.out.println("Enter your choice:");
			ch = sc.nextInt();
			switch(ch) {
			case 1:c.input();
			c.area();
			break;
			case 2:r.input();
			r.area();
			break;
			case 3:c.input();
			c.perimeter();
			break;
			case 4:r.input();
			r.perimeter();
			break;
			case 5:break ip;
			default:System.out.println("Enter the valid choice plese:");
			
			
			
			}
		}
		
	}
}


//pgm12
