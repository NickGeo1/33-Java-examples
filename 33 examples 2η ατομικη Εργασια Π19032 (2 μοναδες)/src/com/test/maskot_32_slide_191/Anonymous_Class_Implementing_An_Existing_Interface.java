package com.test.maskot_32_slide_191;

public class Anonymous_Class_Implementing_An_Existing_Interface {
    int test;

    public static void main(String[] args) {
        new ExistingInterface(){//Anonymous class implementing an existing interface
            //Anonymous class content
            int anonymousint;
            char ach;

            void AnonymousMethod(int anonymousint, char ach){//An anonymous class method
                this.anonymousint = anonymousint;
                this.ach = ach;
                System.out.println("This method can be used to initialize instance variables of anonymous method");
                System.out.println("anonymousint: "+this.anonymousint);
                System.out.println("ach: "+this.ach);
            }
            void PrintInterfacevars(){ //Accessing interface variables
                System.out.println("Interface variables are: ");
                System.out.println(intrfcstr);
                System.out.println(intrfcint);
            }
            @Override//Overriding interface methods
            public void InterfaceMethod(){
                System.out.println("This is the first interface method");
            }
            @Override
            public Character InterfaceMethod2(){
                System.out.println("This is the second interface method and returns a char");
                return 'A';
            }

        }.PrintInterfacevars(); //We can access any anonymous class member with the anonymous object
    }
}

interface ExistingInterface{
    String intrfcstr = "interface string";
    int intrfcint = 143;

    void InterfaceMethod();
    Character InterfaceMethod2();
}