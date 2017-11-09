package com.company;

public class Exercise01 {
    //Implement a java program that calculates the sum of 1+2+3+...+100.
    public static void main(String[] args) {
        int sum=0;
        for (int i=1 ; i < 101 ; i++) {
        sum = sum + i;
        }
        System.out.println(sum);
    }
}
