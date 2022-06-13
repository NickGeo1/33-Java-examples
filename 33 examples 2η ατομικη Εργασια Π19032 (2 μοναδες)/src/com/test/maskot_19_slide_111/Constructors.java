package com.test.maskot_19_slide_111;

public class Constructors {
    int numberofconstructors;

    //All constructors have the same name as their class. They do not return a value

     public Constructors(){ //Public constructor
         System.out.println("This is a user defined constructor");
    }
    private Constructors(int num){ //Private constructor (Overloaded)
         this.numberofconstructors = num;
    }
    protected Constructors(String s){ //Protected constructor (Overloaded)
        this();
        System.out.println("With a string parameter: "+s);
    }
    Constructors(char ch){ //Default constructor (Overloaded)
        this();
        System.out.println("With a character parameter: "+ch);
    }

    public static void main(String[] args) {
        Constructors c1 = new Constructors();
        Constructors c2 = new Constructors(4);
        System.out.println("Object c2 has "+c2.numberofconstructors+" constructors");
        Constructors c3 = new Constructors("string");
        Constructors c4 = new Constructors( 'C');
    }
}

