package com;

public class Fthread implements Runnable {
    @Override
    public void run() {
        int a = 0, b = 1;
        System.out.println("Fibonacci " + a);
        System.out.println("Fibonacci " + b);
        for (int h = 1; h <= 7; h++) {
            int c = a + b;
            System.out.println("Fibonacci " + c);
            a = b;
            b = c;
        }
    }
}