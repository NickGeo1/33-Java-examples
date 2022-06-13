package com.test.maskot_18_slide_110;

public class Method_Overloading {
    public static void main(String[] args) {
        Method_Overloading o = new Method_Overloading();
        o.Method();
        o.Method("A string");
        o.Method(6);
        System.out.println(o.Method2());
        System.out.println(o.Method2(7));
        System.out.println(o.Method2(4.5f));
        o.Method3();

    }
    //Overloaded methods may or may not define a different return type

    void Method(){
        System.out.println("This is a method");
        return;
    }

    /*void Method(){
        System.out.println("This is another method");
    }*/ //Overloaded methods must have different parameters

    void Method(String s){
        System.out.println("This is an overloaded method that has a string parameter: "+s);
        return;
    }

    int Method(int num){
        System.out.println("This is an overloaded method that has an int parameter: "+num);
        return num;
    }



    //Overloaded methods may or may not define different access levels

    public int Method2(int num){
        return num + 7;
    }

    protected float Method2(float num){
        return num;
    }
    protected float Method2(){
        return 1;
    }



    //Overloaded methods cant be defined by only changing their return type or access modifiers or both

    public void Method3(){
        System.out.println("This method is void and public");
    }

    /*private void Method3(){
        System.out.println("This method is void and private");
    }*/         //We cant change only the access modifier

    /*public int Method3(){
        System.out.println("This method is int and public");
        return 3;
    }*/         //We cant change only the return type

    /*private int Method3(){
        System.out.println("This method is int and private");
        return 4;
    }*/         //We cant change only access modifier and return type
}

