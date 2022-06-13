package com.test.maskot_23_slide_127;

import java.util.ArrayList;

public class Java_ArrayList {
    int intelement;
    char charelement;
    float floatelement;

    public static void main(String[] args) {
        Java_ArrayList a1 = new Java_ArrayList();
        Java_ArrayList a2 = new Java_ArrayList();
        Java_ArrayList a3 = new Java_ArrayList();
        Java_ArrayList a4 = new Java_ArrayList();//Creating objects

        a1.charelement = 'A';//Setting values to all objects
        a1.intelement = 1;
        a1.floatelement = 1.1f;

        a2.charelement = 'B';
        a2.intelement = 2;
        a2.floatelement = 2.2f;

        a3.charelement = 'C';
        a3.intelement = 3;
        a3.floatelement = 3.3f;

        a4.charelement = 'D';
        a4.intelement = 4;
        a4.floatelement = 4.4f;

        ArrayList<Java_ArrayList> list = new ArrayList<>();//Creating the ArrayList

        list.add(a1);//Adding elements to list
        list.add(a2);
        list.add(a4);
        list.add(2,a3);
        Java_ArrayList.printlist(list); //Printing all values for each object-element in list

        list.remove(a3); //Deleting elements from list.Another way is by index: list.remove(3);
        Java_ArrayList.printlist(list);

        list.get(2).floatelement = 3.3f; //Modifying list elements
        list.get(2).charelement = 'C';
        list.get(2).intelement = 3;
        Java_ArrayList.printlist(list);


        for(Java_ArrayList o: list){ //Accessing all the elements of the list using a for each loop
            if(o.charelement=='C')
                System.out.println("\nFound letter C");
        }
    }



    static void printlist(ArrayList<Java_ArrayList> list){//Accessing all the elements of the list using a for loop
        System.out.println("\n");
        for(int i=0; i<list.size(); i++){
            System.out.println("Object element "+(i+1)+" has values: "+list.get(i).charelement+", "+list.get(i).floatelement+", "+
                    list.get(i).intelement);
        }
    }

}
