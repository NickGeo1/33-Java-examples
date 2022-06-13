package com.test.maskot_11_slide_86;

public class Static implements TopInterface,TopInterface.NestedInterface { //implementing both top and inner interfaces
    @Override
    public int First(){
        return 1;
    }
    @Override
    public int Second(){
        return 2;
    }
    public static void main(String[] args) {

        //We can have access to static members with two ways:

        //1// Creating an object
        StaticThings a = new StaticThings();
        a.afloat = 2.9f;
        a.StaticMethod();
        a.text = "This is a modified text";
        System.out.println(a.text);

        //2// Without Creating an object
        StaticThings.afloat = 2.7f;
        StaticThings.StaticMethod();

        StaticThings.NestedStaticClass b = new StaticThings.NestedStaticClass(); //accessing nested static class with the
        //reference of its outer class
       // NestedStaticClass b2 = new NestedStaticClass(); //We cant access the nested static class this way from here
        b.AnotherMethod(6);


    }

}


class StaticThings{//A top level class
    static float afloat; //Static variable
    String text = "this is a text";

    static void StaticMethod(){ //Static method
        System.out.println(afloat + " is float");

        StaticThings.NestedStaticClass n = new StaticThings.NestedStaticClass();//We are used to refer to the name of the inner
        //static class after the name of the outer class
        NestedStaticClass n2 = new NestedStaticClass(); //From here only, we can refer to the inner static class also this way
    }
    static class NestedStaticClass{ //Static nested class
        String nestedtext = "this is a text inside a static nested class";

        void AnotherMethod(int num){
            System.out.println(afloat+" + "+num+" is: "+(afloat+num));
            StaticThings h = new StaticThings();
            //System.out.println(text); We cant have access to a non static member of outer class via an inner static class
            System.out.println(nestedtext);
        }
    }
}




interface TopInterface {
    int First();

    static interface NestedInterface{ //Nested interface is by default static so we dont have to add the keyword static
        int Second();
    }

}