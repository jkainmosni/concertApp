package com.company;

public class Exercise02 {
    public static void main(String[] args) {
        // Exercise 02
        int [] array01 = new int[5];
        for (int i=0 ; i<5 ; i++) {
            array01[i] = i;
        //    System.out.println(i);
        }
        int [] array02 = new int[5];
        for (int j=0 ; j<5 ; j++) {
            array02[j] = j + 1;
         //   System.out.println(array02[i]);
        }
        for (int i=0 ; i<5 ; i++) {
            for (int j=0 ; j<5 ; j++) {
                if (array01[i] == array02[j]) {
                    System.out.println(i);
                }
            }
        }
    }
}
