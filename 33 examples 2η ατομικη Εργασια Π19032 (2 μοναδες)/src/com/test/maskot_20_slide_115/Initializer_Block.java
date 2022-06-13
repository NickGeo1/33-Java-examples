package com.test.maskot_20_slide_115;

public class Initializer_Block {
    int number;
    String str;
    Character ch;

    public static void main(String[] args) {
        Initializer_Block I = new Initializer_Block(); //Before constructor code initializer block code is being executed
        System.out.println(I.number);
        System.out.println(I.str);
        System.out.println(I.ch);
    }

    {//Start of initializer block
        System.out.println("Before Constructor execution we are setting specific values for our object variables");

        this.number = 1;
        this.str = "A string that is being initialized inside an initializer block";
        this.ch = 'A';
    }//End of initializer block

    Initializer_Block(){//Constructor
        System.out.println("Object variable values have been already initialized");
    }
}
