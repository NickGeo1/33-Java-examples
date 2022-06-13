package com.test.maskot_17_slide_104;

public class This_And_Super {
    public static void main(String[] args) {
       Son son = new Son();
       son.SetNamesAndAges(14, 46,"Stuart","Mark");
       System.out.println("Son said his name: "+son.getSonName());
       System.out.println("Son said his age: "+son.getSonAge());
       System.out.println("Son said his father's name: "+son.getFatherName());
       System.out.println("Son said his father's age: "+son.getFatherAge());

        Father father = new Father("George",54,"Pilot");
        System.out.println("Another father told his name: "+ father.name);
        System.out.println("Another father told his age: "+ father.age);
        father.TellWork();

    }
}

class Father{
    String name;
    static int age;
    String work;

    Father(String s){//First constructor
        System.out.println("My "+s+ " is the best");
    }//First constructor
    Father(String name, int age, String work){ //Second constructor
        this("son"); //Calling the first constructor with parameter "son"
        this.name = name;//Setting name method parameter value to object variable name(instance member)
        this.age = age;//Setting age method parameter value to object variable age(static member)
        this.work = work;
    }

    void TellWork(){//This function calls the function bellow with parameter the object that is calling this function
        TellWork(this); //"this" as a parameter
    }

    void TellWork(Father f){
        System.out.println("He is working as a "+f.work);
    }
}


class Son extends Father{
    private String name;
    private int age;

    void SetNamesAndAges(int sonage, int fatherage, String sonname, String fathername){//Setter for both sub and super class
        this.age = sonage;//Setting the object values of sub class equal to those at the method parameters
        this.name = sonname;
        super.name = fathername;//Setting the object values of super class equal to those at the method parameters
        super.age = fatherage; //age is static member and name is instance member
    }

    String getSonName(){//Getters
        return name;
    }
    int getSonAge(){
        return age;
    }

    String getFatherName(){//Getters for super
        return super.name;
    }
    int getFatherAge(){
        return super.age;
    }


    Son(){//Subclass constructor
        super("father"); //Calling the super's constructor with parameter "father"
        System.out.println("I love my father");
    }

}