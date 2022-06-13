package com.test.maskot_6_slide_46;

import com.test.maskot_1_slide_5.Class_vs_Object.House;

public class Import_Usage {

    public static void main(String[] args) {
        //Using fully qualified name to access the class of the first package
        com.test.maskot_1_slide_5.Class_vs_Object.House outer = new com.test.maskot_1_slide_5.Class_vs_Object.House();
        String oldowner = outer.owner = "John"; //Making object of class House of the first package
        AccessFirstpckg inner = new AccessFirstpckg(); //Setting a value for that object
        inner.ChangeOwner(oldowner, "Anna");

        //Using direct name of class House of the first package
        House outer2 = new House();//Making object of class House of the first package
        double olddimensions = outer2.sqdimensions = 280.56; //Setting a value for that object
        AccessFirstpckg inner2 = new AccessFirstpckg();
        inner2.ChangeDimensions(olddimensions,290.47);


    }

}

class AccessFirstpckg{
    String newowner;
    double newdimensions;

    void ChangeOwner(String oldowner, String newowner ){
        System.out.println("Old owner of the house was: "+oldowner);
        System.out.println("New owner is: "+newowner);
    }

    void ChangeDimensions(double olddimensions, double newdimensions ){
        System.out.println("Old dimensions of the house was: "+olddimensions);
        System.out.println("New dimensions are: "+newdimensions);
    }


}