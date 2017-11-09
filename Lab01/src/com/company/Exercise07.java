package com.company;

public class Exercise07 {
    public static void main(String[] args) {
        //Implement a java program that prints the first 30 numbers of the Fibonacci series.
        int a=1;
        int b=1;
        int sum;
        System.out.println(a);
        System.out.println(b);
        for (int i=0 ; i <=30 ; i++) {
            sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;
        }
    }
}
