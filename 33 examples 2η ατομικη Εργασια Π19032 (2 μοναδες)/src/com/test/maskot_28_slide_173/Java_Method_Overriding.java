package com.test.maskot_28_slide_173;

public class Java_Method_Overriding {
    String s;
    int i;

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.MethodToBeOverrided(); //This way we are calling the overrided method
        sub.MethodToBeOverrided("String",1);
        System.out.println("Subclass has access to super class string: "+sub.s);
        System.out.println("Subclass has access to super class int: "+sub.i);
    }

    void MethodToBeOverrided(){
        System.out.println("This method is going to be overrided by a method of a subclass");
    }
}

class Sub extends Java_Method_Overriding{
   /* @Override
    int MethodToBeOverrided(){
        return 5;
    }*/ //We are unable to override this method because it is not the same as the super class method

    @Override
    void MethodToBeOverrided(){//If we want to override a method of the super class, we have to declare the method
        //of the sub class exactly the same way as the method of super

        super.MethodToBeOverrided(); //Calling the original method of super class
        System.out.println("Super class method has been successfully overrided");
    }

    void MethodToBeOverrided(String s,int i){ //We can declare an overloaded method of super though
        super.s = s;
        super.i = i;
    }

}