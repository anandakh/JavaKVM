package com;
//import java.util.io.*;
import java.util.LinkedList;
public class Main {
	public static void main(String[]args) {
		LinkedList<String>list=new LinkedList<>();
		list.add("Good");
		list.add("morning");
		list.add("have");
		list.add("a");
		list.add("nice");
		list.add("day");
		System.out.println("Orginal linked list"+list);
		list.clear();
		System.out.println("List after removing elements"+list);
		list.add("Looks");
		list.add("Good");
		System.out.println("After adding elements to empty list:"+list);
		
	}

}
