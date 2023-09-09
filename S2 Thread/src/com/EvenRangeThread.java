package com;

public class EvenRangeThread implements Runnable {
    @Override
    public void run() {
        int a = 2, b = 10;
        for (int k = a; k <= b; k = k + 2) {
            System.out.println("EvenRangeThread " + k);
        }
    }
}

