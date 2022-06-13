package com.test.maskot_1_slide_5;

public class Class_vs_Object {
 int c;
    public static void main(String[] args) {
        House h = new House(); //Creating new instance/object
	    h.TellOwner("John"); //Calling a method of this object

        h.members = 5; //Set value of this object
        h.TellMembers(); //Calling a method of this object

        h.sqdimensions = 280.56;//Set value of this object
        double sqd = h.sqdimensions;
        System.out.println("Square Dimensions of this house are: "+ sqd);
    }

    static public class House{ //Class
       public double sqdimensions;
       public String owner;
       public int members; //Class variables

        void TellMembers(){ //Class method
            System.out.println("Number of house members: "+this.members);

        }

        void TellOwner(String owner){//Class method
            this.owner = owner;
            System.out.println("Name of owner is: "+this.owner);
        }
    }


}
