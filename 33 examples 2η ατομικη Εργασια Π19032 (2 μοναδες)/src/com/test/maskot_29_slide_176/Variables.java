package com.test.maskot_29_slide_176;

public class Variables extends SuperOfVariables implements InterfaceForVariables {
    Byte objb;
    String objstr;
    Integer objint;

    public static void main(String[] args) {
        //Access object variables through their class

        Variables v = new Variables();
        //subclass variables
        v.objb = 1;
        v.objstr = "This is a string";
        v.objint = 13;
        System.out.println(v.ObjMethod());
        System.out.println(v.ObjMethod2());
        //superclass variables
        v.superobjb = 2;
        v.superobjstr = "This a string of super class";
        System.out.println(v.SuperObjMethod());



        //Access object variables through their super class

        SuperOfVariables sov = new Variables();
        //subclass variables

        /*sov.objb = 1;
        sov.objstr = "This is a string";
        sov.objint = 13;
        System.out.println(sov.ObjMethod());
        System.out.println(sov.ObjMethod2());*/ //Super class cannot access subclass variables(unless we cast)

        //superclass variables
        sov.superobjb = 2;
        sov.superobjstr = "This a string of super class";
        System.out.println(sov.SuperObjMethod());



        //Access object variables through class implemented interface

        InterfaceForVariables ifv = new Variables();
        //subclass variables

        /*ifv.objb = 1;
        ifv.objstr = "This is a string";
        ifv.objint = 13;
        System.out.println(ifv.ObjMethod());*/
        System.out.println("\n");
        System.out.println(ifv.ObjMethod2()); //Implemented interface can access only the method that its class overrides

        //superclass variables

        /*ifv.superobjb = 2;
        ifv.superobjstr = "This a string of super class";
        System.out.println(ifv.SuperObjMethod());*/



        //Access object variables through super class Object

        Object ob = new Variables();
       /* //subclass variables
        ob.objb = 1;
        ob.objstr = "This is a string";
        ob.objint = 13;
        System.out.println(ob.ObjMethod());
        System.out.println(ob.ObjMethod2());
        //superclass variables
        ob.superobjb = 2;
        ob.superobjstr = "This a string of super class";
        System.out.println(ob.SuperObjMethod());*/  //Super class Object cannot access subclass variables(unless we cast)
    }

    int ObjMethod(){
        System.out.println("This function returns the integer of an object + 2: ");
        return this.objint+2;
    }
    @Override
    public String ObjMethod2(){
        System.out.println("This function returns the string of an object with some extra string: ");
        return this.objstr+" some extra string";
    }
}


class SuperOfVariables{
    byte superobjb;
    String superobjstr;

    int SuperObjMethod(){
        System.out.println("This function returns the byte of an object of superclass + 2: ");
        return this.superobjb+2;
    }
}


interface InterfaceForVariables{
    String ObjMethod2();
}