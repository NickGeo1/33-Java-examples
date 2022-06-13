package com.test.maskot_3_slide_21;

public class Autoboxing_Unboxing {

    public static void main(String[] args) {
        int firstint = 10;
        Integer secondint = firstint; //Autoboxing
        System.out.println("This is an int that has been autoboxed: "+secondint);

        Integer thirdint = 20;
        int fourthint = thirdint;//Unboxing
        System.out.println("This is an Integer that has been unboxed: "+fourthint);

        double firstdouble = 6.004;
        Double seconddouble = firstdouble;//Autoboxing
        System.out.println("This is a double that has been autoboxed: "+seconddouble);

        Character ch = 'N';
        char ch2 = ch;//Unboxing
        System.out.println("This is a Character that has been unboxed: "+ch2);
    }


}
