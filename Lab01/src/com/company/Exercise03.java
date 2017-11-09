package com.company;

public class Exercise03 {
    //Implement a java program that calculates the sum of 1 + 1/2 + 1/3 + ... + 1/100.
    public static void main(String[] args) {
        double sum = 1;
        for (int i=2 ; i<=100 ; i++) {
            double d = 1d/i;
            sum = sum + d;
        }
    System.out.println(sum);
    }
}
