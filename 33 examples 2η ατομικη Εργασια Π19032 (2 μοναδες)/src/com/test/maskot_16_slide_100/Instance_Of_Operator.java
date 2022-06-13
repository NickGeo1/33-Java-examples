package com.test.maskot_16_slide_100;

public class Instance_Of_Operator {

    public static void main(String[] args) {
        Coach coach = new Coach();
        Kid kid = new Kid();
        Swimmer swimmer = new Swimmer(); //swimmer is instance of both Swimmer and Kid (can access class Kid members)
        Kid kid2 = new Swimmer(); //kid2 is instance of both Kid and Swimmer (cant access class Swimmer members)


        if (swimmer instanceof Kid){ //true because swimmer is instance of both Swimmer and Kid
            swimmer.isswimmer = true; //swimmer object can access class Kid variables
        }
        swimmer.age = 9;
        swimmer.name = "Johny";
        swimmer.technique = "backstroke";
        swimmer.Talk();
        swimmer.WayOfSwimming();

        if (kid instanceof Swimmer){ //false because kid is not an instance of Swimmer
            kid.isswimmer = true;
        }
        kid.age = 7;
        kid.name = "Tommy";
        kid.Talk();

        if (coach instanceof TeachSwimming){//true because Coach class implements TeachSwimming interface
            coach.age = 41;
            coach.WayOfTeaching();
            coach.WayOfSwimming();

        }

        if (kid2 instanceof TeachSwimming){ //false because Kid and Swimmer classes does not implement TeachSwimming interface
            System.out.println("Does this kid, knows how to teach swimming?");
        }

        if (kid2 instanceof Kid && kid2 instanceof Swimmer){ //true because kid2 is instance of both Kid and Swimmer
            System.out.println("\nThis kid knows how to swim");
        }
    }
}

class Coach implements Swim,TeachSwimming{
    int age;

    @Override
    public void WayOfSwimming() {
        System.out.println("I know a lot of swimming techniques");
    }
    @Override
    public void WayOfTeaching() {
        System.out.println("\nI am "+age+" years old and I teach the kids the basic techniques of swimming");
    }
}

class Kid{
    int age;
    boolean isswimmer;
    String name;

    void Talk(){
        System.out.println("\nHi, my name is "+name+" and I am "+age+" years old.");
        if (isswimmer){
            System.out.println("I am a swimmer");
        }else{
            System.out.println("I am not a swimmer");
        }
    }
}

class Swimmer extends Kid implements Swim{
    String technique;

    @Override
    public void WayOfSwimming() {
        System.out.println("I know how to do "+technique+". My average velocity is: "+velocity);
    }
}

interface Swim {
    float velocity = 5.4f;

    void WayOfSwimming();
}

interface  TeachSwimming{
    void WayOfTeaching();
}