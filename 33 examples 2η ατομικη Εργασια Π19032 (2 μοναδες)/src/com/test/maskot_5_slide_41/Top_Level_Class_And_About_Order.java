package com.test.maskot_5_slide_41;

/*public class AnotherTopClass {
    int a_number;

    void a_method() {
        System.out.println("Something...");
    }
}

public interface TopInterface{
 void final anothermethod();
 int anotherint = 4;
} */  // We are unable to have up to one top level class or interface

                //We create some classes and interfaces in random order, in order to show that their order doesn't matter

public class Top_Level_Class_And_About_Order {
    public static void main(String[] args) {
        A varA = new A();
        B varB = new B();

        varA.MethodA(5);
        System.out.println(varB.MethodB(4));
        System.out.println(varB.MethodC());
        varA.AccessClassB();
    }

   static class A implements IA{ //Class A that implements an interface that's bellow
    int a;

    @Override
    public void MethodA(int a){//Overriding Interface's method
        System.out.println("This is method A.It is printing the int value of a: ");
        this.a = a;
        System.out.println(this.a);
    }

    @Override
    public void AccessClassB(){//Access class B which is bellow
        B temp = new B();
        System.out.println("int b of Class B is: "+temp.b);
    }

   }

    interface IA{ //class A above implements this interface
        void MethodA(int a);
        void AccessClassB();
    }
}




interface IB{ //class B bellow implements this interface
    int MethodB(int number);
}

class B implements IB,IC{ //Class B that implements interfaces that's both below and above
    int b = 2;

    @Override//Overriding Interface IB method
    public int MethodB(int number){
        System.out.println("This is method B and returns: ");
        return number + b;
    }

    @Override //Overriding Interface IC method
    public String MethodC(){
        return "This is method C";
    }

}

interface IC{  //class B above implements this interface
    String MethodC();
}