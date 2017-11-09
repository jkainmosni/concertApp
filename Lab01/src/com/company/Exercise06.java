package com.company;
import java.util.Scanner;

public class Exercise06 {
    //Implement a java program that prints the divisors of a given integer.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double a = scan.nextInt();
        if (a%2 == 0) { //Even
            for (int i = 1; i <= a/2; i++)
                if (a % i == 0) {
                    System.out.println(i);
                }
        }
        else if (a%2 != 0) { //Odd
            for (int i=1 ; i<=a/3 ; i++)
                if (a%i==0) {
                    System.out.println(i);
                }
        }
    }
}
