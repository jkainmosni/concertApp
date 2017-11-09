package com.company;
import java.util.Scanner;
import static java.lang.Math.pow;

public class Exercise02 {
    public static void main(String[] args) {
    //Implement a java program that calculates a^n given that a and n are integers.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a base: ");
        double i = scan.nextInt();
        System.out.println("Enter an exponenet: ");
        double n = scan.nextInt();
        double x = Math.pow(i, n);
        System.out.printf("pow(" +i+","+n+") is "+x+" .");
    }
}
