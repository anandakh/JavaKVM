package com;

import java.util.Scanner;

public class Main {
void calcarea(float s1){
	System.out.println("Area of Square : "+ s1*s1);
	}
void calcarea(float x,float y){
	System.out.println("Area of Rectangle : " + x*y);
	}
void calcarea(double r){
	double area = 3.14*r*r;
	System.out.println("Area of circle : " + area);
	}
public static void main(String[] args){
	Main obj = new Main();
	System.out.println("Enter side of square : ");
	Scanner sc = new Scanner(System.in);
	float s1 = sc.nextFloat();
	obj.calcarea(s1);
	System.out.println("Enter length of Rectangle : ");
	float x = sc.nextFloat();
	System.out.println("Enter breadth of Rectangle : ");
	float y = sc.nextFloat();
	obj.calcarea(x,y);
    System.out.println("Enter Radius of Circle : ");
    double r = sc.nextDouble();
    obj.calcarea(r);
    }
}

//pgm 8 