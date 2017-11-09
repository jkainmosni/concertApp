package com.company;

public class Exercise01 {
    public static void main(String[] args) {
        // Exercise 01
        int [] array = new int[5];
        for (int i=0 ; i<5 ; i++) {
            array[i] = i;
        }
        int sum=0;
        for (int j=0 ; j<5 ; j++) {
            sum = sum + array[j];
        }
        System.out.println("Sum is: " + sum);
        int mo=0;
        mo = sum / 5;
        System.out.println("M.O. is: " + mo);
        int perc=0;
        for (int i=0 ; i<5 ; i++) {
            if (array[i] > mo) {
                perc = perc + 20;
            }
        }
        System.out.println(perc + "%");
    }
}
