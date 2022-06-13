package com.test.maskot_31_slide_190;

public class Anonymous_Class_Extending_An_Existing_Class {
    final String fs = "String of super class";
    byte superbyte;
    int superint;

    public static void main(String[] args) {
        new Anonymous_Class_Extending_An_Existing_Class((byte)12,1000){ //Anonymous class that extends an existing class
            //This is an anonymous class that is using the constructor of its super

            //Anonymous class content
            int anonymousint = 10;

            void AnonymousMethod(){ //A method inside anonymous class
                System.out.println("Anonymous int is "+anonymousint);
                System.out.println("Anonymous class has access to its super class variables: ");
                System.out.println("fs: "+fs);
                System.out.println("superbyte: "+super.superbyte);
                System.out.println("superint: "+superint);
            }
            @Override //Overriding method of super class in anonymous class
            void SuperMethod(){
                super.SuperMethod();
                System.out.println("Anonymous class overrided a method of its super class");
            }
        }.AnonymousMethod();//or .SuperMethod(); or Test(); //Calling a method of the anonymous class via an anonymous object
        //We can also call any other method of the super class here
    }

    Anonymous_Class_Extending_An_Existing_Class(byte superbyte,int superint){//Super class constructor
     this.superint=superint;
     this.superbyte = superbyte;
    }
    void SuperMethod(){//Super class method
        System.out.println("This is a method of super class");
    }
    void Test(){

    }
}
