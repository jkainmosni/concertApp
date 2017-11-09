package com.company;
import java.util.Scanner;

public class Exercise05 {
    //Implement a java program that prints the digits of a given integer.
    public static void main(String[] args) {
        int m, n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        m = s.nextInt();
        while(m > 0)
        {
            n = m % 10;
            m = m / 10;
            System.out.println(n);
        }
    }
}
