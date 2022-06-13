package com.test.maskot_15_slide_99;

public class Variable_Arguments {
    int code;

    public static void main(String[] args) {
        Variable_Arguments c1 = new Variable_Arguments();
        Variable_Arguments c2 = new Variable_Arguments();
        Variable_Arguments c3 = new Variable_Arguments();
        Variable_Arguments c4 = new Variable_Arguments();
        Variable_Arguments c5 = new Variable_Arguments();
        Variable_Arguments c = new Variable_Arguments();//Make 5 objects of class Variable_Arguments

        c1.code = 453;
        c2.code = 910;
        c3.code = 865;
        c4.code = 742;
        c5.code = 753;//Setting code for 5 objects
        System.out.println("The codes of the 5 objects are: ");
        c.varargpreview(4,c1,c2,c3,c4,c5); //Calling varargpreview method with object c


    }
    /*void varargpreview(Variable_Arguments... codes,int num){
        for(Variable_Arguments vararg: codes){
            System.out.print(vararg.code+" ");//Printing the codes of all object parameters
        }
    }*/         //Variable Arguments must be the last parameters

    /*void varargpreview(Variable_Arguments... codes,Variable_Arguments codes2){
        for(Variable_Arguments vararg: codes){
            System.out.print(vararg.code+" ");//Printing the codes of all object parameters
        }
    } */        //A method must have only one Variable Argument

     void varargpreview(int num,Variable_Arguments... codes){
        for(Variable_Arguments vararg: codes){
            System.out.print(vararg.code+" ");//Printing the codes of all object parameters
        }
         System.out.println("The first method parameter has value: "+num);
    }

}
