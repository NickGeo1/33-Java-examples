package com.test.maskot_12_slide_88;

public class Access_Between_Static_and_Nonstatic {
   // static int astaticvar = AnonStaticintMethod(); //We cant access a non static method via a static variable
    static int astaticvar2 = AstaticintMethod(); //Access to a static method via a static variable
    static String astaticvar3 = "A static string";

    int anonstaticvar = AnonStaticintMethod(); //Access to a non-static method via a non-static variable
    int anonstaticvar2 = AstaticintMethod();  //Access to a static method via a non-static variable
    String anonstaticvar3 = "A nonstatic string";

    static String astaticvar4 = astaticvar3; //Access to a static variable via a static variable
    //static int astaticvar5 = anonstaticvar2 ; //We cant access a non-static variable via a static variable
    String anonstaticvar4 = astaticvar3; //Access to a static variable via a non-static variable
    int anonstaticvar5 = anonstaticvar2; //Access to a non-static variable via a non-staticvariable

    public static void main(String[] args) {
        //System.out.println(anonstaticvar); //We cant access a non static variable via a static method
        //AnonStaticMethod(); //We cant access a non static method via a static method
        System.out.println(astaticvar2); //Access to a static variable via a static method
        AstaticMethod(); //Access to a static method via a static method

        Access_Between_Static_and_Nonstatic o = new Access_Between_Static_and_Nonstatic();
        o.AnonStaticMethod2();

        Access_Between_Static_and_Nonstatic o2; //null object
        //uo2.anonstaticvar = 30; //A null object can access a static method/variable
        //o2.AnonStaticMethod();
    }
    void AnonStaticMethod(){
        System.out.println("Access a non-static method");
    }
    int AnonStaticintMethod(){
        return 76;
    }

    static void AstaticMethod(){
        System.out.println("Access a static method");
    }
    static int AstaticintMethod(){
        return 68;
    }

    void AnonStaticMethod2(){
        AstaticMethod();//Access to a static method via a static method
        AnonStaticMethod();//Access to a non-static method via a static method
        astaticvar3 ="Changing the static string"; //Access to a static variable via a static method
        anonstaticvar3 = "Changing the non-static string"; //Access to a non-static variable via a static method
    }
}
