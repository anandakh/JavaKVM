package com;
import java.util.Scanner;
public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String Username, Password;
		System.out.println("Enter the username:");
		Username = sc.nextLine();
		System.out.println("Enter the password:");
		Password = sc.nextLine();
		int length = Username.length();
		try {
			if (length<6) 
				throw new UsernameExeption("Username must be greater than 6 characters");
			else if(!Password.equals("Hello"))
				throw new PasswordException("Incorrect password \n type correct password");
			else
				System.out.println("Login successfull");
		}
		catch(UsernameExeption u ) {
			u.printStackTrace();
		}
		catch(PasswordException p) {
			p.printStackTrace();
		}
		finally {
			System.out.println("Finally statement is executed");
		}
	}
}

//program no 16 in record
