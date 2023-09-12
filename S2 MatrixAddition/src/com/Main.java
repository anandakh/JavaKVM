package com;
import java.util.Scanner;
public class Main {
	
	    public static void main(String[] args){
	        int row, col, m, n;  
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of rows in the first matrix:");
	        row = sc.nextInt();    
	        System.out.println("Enter the number of columns in the first matrix:");
	        col = sc.nextInt();  
	        System.out.println("Enter the number of rows in the second matrix:");
	        m = sc.nextInt();  
	        System.out.println("Enter the number of columns in the second matrix:");
	        n = sc.nextInt();  
	        
	        
	        if (row == m && col == n){
	            int a[][] = new int[row][col];    
	            int b[][] = new int[m][n];    
	            int c[][] = new int[m][n];
	            System.out.println("Enter all the elements of first matrix:");
	            for (int i = 0; i < row; i++){
	                for (int j = 0; j < col; j++){
	                    a[i][j] = sc.nextInt();
	                }
	            }
	            System.out.println("");
	         
	            System.out.println("Enter all the elements of second matrix:");
	            for (int i = 0; i < m; i++){
	                for (int j = 0; j < n; j++){
	                    b[i][j] = sc.nextInt();
	                }
	            }
	            System.out.println("");
	           
	            System.out.println("First Matrix:");
	            for (int i = 0; i < row; i++){
	                for (int j = 0; j < col; j++){
	                    System.out.print(a[i][j]+" ");
	                }
	                System.out.println("");
	            }
	           
	            System.out.println("Second Matrix:");
	            for (int i = 0; i < m; i++){
	                for (int j = 0; j < n; j++){
	                    System.out.print(b[i][j]+" ");
	                }
	                System.out.println("");
	            }
	           
	            for (int i = 0; i < row; i++){
	                for (int j = 0; j < n; j++){
	                    for (int k = 0; k < col; k++){
	                        c[i][j] = a[i][j] + b[i][j];
	                    }
	                }
	            }
	         
	            System.out.println("Matrix after addition:");
	            for (int i = 0; i < row; i++){
	                for (int j = 0; j < n; j++){
	                    System.out.print(c[i][j]+"\t");
	                }
	                System.out.println("");
	            }
	        }
	        else{
	            System.out.println("Addition not possible");
	            System.out.println("Try Again");
	        }
	    }
	}

//pgm2 not committed