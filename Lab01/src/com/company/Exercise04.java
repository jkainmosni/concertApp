package com.company;
import java.util.Scanner;

public class Exercise04 {
    //Implement a program that checks if a given number is an odd or not.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double i = scan.nextInt();
        if (i%2 == 0) {
            System.out.println("Even");
        }
        else
            System.out.println("Odd");
    }
}
