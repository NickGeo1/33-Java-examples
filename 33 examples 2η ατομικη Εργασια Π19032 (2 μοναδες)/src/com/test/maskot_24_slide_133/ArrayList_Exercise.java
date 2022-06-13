package com.test.maskot_24_slide_133;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList_Exercise {
    public static void main(String[] args) {

        ArrayList<Integer> listofevenintegers = new ArrayList<Integer>(); //Creating a list of integers

        for (int i = 0; i <= 100; i+=2) {//Adding all the even numbers from 0 to 100
            listofevenintegers.add(i);
        }
        System.out.println("The original List is: "+listofevenintegers);


        //Using for loop

        for (int i = 0; i <=listofevenintegers.size(); i++) {
            if(i==1 || i==15 || i== 29){
                listofevenintegers.add(101+i); //We can add elements
                listofevenintegers.remove(40); //We can remove elements
                listofevenintegers.set(0,100); //We can modify elements
            }
        }
        System.out.println("The list after the first loop is: "+listofevenintegers);


        //Using for-each loop

        for (Integer i: listofevenintegers) {
            if(i==12){
                //listofevenintegers.add(110);
                //listofevenintegers.remove(10);  //We cant add or remove elements
                listofevenintegers.set(0,1000); //We can modify elements
            }
        }
        System.out.println("The list after the second loop is: "+listofevenintegers);


        //Using list iterator

        ListIterator<Integer> iterator = listofevenintegers.listIterator();
        int count = 0;

        while (iterator.hasNext()) {
            if (count==5) {
                // listofevenintegers.add(15);
                //listofevenintegers.remove(48); //We cant add or remove elements
                listofevenintegers.set(0,10000); //We can modify elements
            }
            count+=1;
            iterator.next();
        }
        System.out.println("The list after the third loop is: "+listofevenintegers);
    }
}


