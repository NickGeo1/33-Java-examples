package com.test.maskot_9_slide_83;

public class Abstract {
    public static void main(String[] args) {
        //AbstractClass abs = new AbstractClass(); //Abstract classes cannot be instantiated
        //AbstractClass2 abs2 = new AbstractClass2();

        NonAbstractClass non = new NonAbstractClass();
        non.number2 = 5;
        int value = non.SubstractOne2();
        System.out.println("Return value of SubstractOne2 is: "+value );

        NonAbstractClass2 non2 = new NonAbstractClass2();
        non2.AbstractMethod();
    }

}


abstract class AbstractClass  { //There is no need to contain any abstract member in this class
    int number;

    int SubstractOne(){
        return number - 1;
    }
    abstract void AbstractMethod(); //Abstract method


}

abstract class AbstractClass2 extends AbstractClass { //It is not necessary for AbstractClass2 to contain AbstractMethod of super class
    //because subclass AbstractClass2 is abstract
    void NonAbstractMethod(){
        System.out.println("This is a non abstract method");//A non abstract method in a abstract class
    }

}

class NonAbstractClass  {
    int number2;

    int SubstractOne2(){
        return number2 - 1;
    }
     //abstract void AbstractMethod2(); //If we want an abstract method in a class, we have to declare the class abstract too

}


class NonAbstractClass2 extends AbstractClass { //NonAbstractClass2 has to contain AbstractMethod of super class
    void AbstractMethod(){
        System.out.println("This is an abstract method");
    }
}


abstract interface ExampleInterface { //It is not necessary to add keyword abstract
    int Tempmethod(); //Abstract method
}