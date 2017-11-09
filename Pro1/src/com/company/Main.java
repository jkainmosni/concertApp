package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
	// write your code here

        Vehicles vehicle1 = new Vehicles();
        Vehicles vehicle2 = new Vehicles();
        Vehicles vehicle3 = new Vehicles();
        Vehicles vehicle4 = new Vehicles();
        Vehicles vehicle5 = new Vehicles();
        Vehicles vehicle6 = new Vehicles();

        vehicle1.setPlate("HXC-1234");
        vehicle2.setPlate("ABC-1234");
        vehicle3.setPlate("ZBC-1234");
        vehicle4.setPlate("FXC-1234");
        vehicle5.setPlate("ABD-1234");
        vehicle6.setPlate("ASC-1234");

        List<Vehicles> myList = new ArrayList<Vehicles>();
        /*Scanner sc = new Scanner(System.in);
        for (int i=0 ; i<3; i++) {
            String a = sc.next();
            myList.add(a);
        }*/

        myList.add(vehicle1);
        myList.add(vehicle2);
        myList.add(vehicle3);
        myList.add(vehicle4);
        myList.add(vehicle5);
        myList.add(vehicle6);

        Vehicles temp;
        for (int i=0; i < myList.size(); i++) {

            for (int j=1; j < myList.size() -i; j++) {

                if (myList.get(j-1).compareTo(myList.get(j)) >0) {
                    temp = myList.get(j-1);
                    myList.set(j-1,myList.get(j));
                    myList.set(j, temp);
                }
            }
        }
        for (int i=0; i<myList.size(); i++) {
            System.out.println(myList.get(i).getPlate());
        }




    }
}
