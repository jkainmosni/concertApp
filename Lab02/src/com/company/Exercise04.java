package com.company;

public class Exercise04 {
    public static void main(String[] args) {
        // Exercise 04
        int [] array = new int[10];
        for (int i=0 ; i<10 ; i++) {
            array[i] = (10+i) / 2;
           // System.out.println(array[i]);
        }
        for (int j=0 ; j<10; j++) {
            for (int i=0 ; i<10; i++) {
                if (array[j] == array[i]);

            System.out.println(array[j]);
            }
        }
    }
}
