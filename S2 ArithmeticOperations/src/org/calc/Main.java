package org.calc;
//import org.calc.Div;
//import org.calc.Mult;
//import org.calc.Add;
//import org.calc.Sub;
import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Add ad = new Add(a, b);
		System.out.print("Addition:"+ad.add());
		Sub sb = new Sub(a,b);
		System.out.print("\nSubstraction:"+sb.sub());
		Mult ml = new Mult(a, b);
		System.out.print("\nProduct:"+ml.mult());
		Div dv = new Div(a, b);
		System.out.print("\nQuitient:"+dv.div());
	}

}

//program no 15 in record