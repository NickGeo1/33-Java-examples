package com.test.maskot_26_slide_144;

public class Switch_Vs_If {
    static char ch = 'S';
    static byte maxbyte = 127;
    static int randomint = 543;
    static String randomstr = "Random";
    static Short randomshort = 1323;

    public static void main(String[] args) {
        //Switch operator can accept many types

        switch(ch){ //char
            case 'A': System.out.println("First case");
                break;//Its necessary to add break at all cases or probably up to one case is going to be executed
            case 'B': System.out.println("Second case");
                break;
            case 'C': System.out.println("Third case");
                break;
            default: System.out.println("Default case("+ch+" didnt match with any case)");
                break; //break here is not necessary
        }

        switch(maxbyte){ //byte
            case 32: System.out.println("First case");
                break;
            case 16: System.out.println("Second case");
                break;
            case 127: System.out.println("Third case");
                break;
            default: System.out.println("Default case("+maxbyte+" didnt match with any case)");
        }

        switch(randomint){ //int
            case 543: System.out.println("First case");
                break;
            case 230: System.out.println("Second case");
                break;
            case 124: System.out.println("Third case");
                break;
            default: System.out.println("Default case("+randomint+" didnt match with any case)");
        }

        switch(randomstr){ //String
            case "A Random": System.out.println("First case");
                break;
            case "Random": System.out.println("Second case");
                break;
            case "random": System.out.println("Third case");
                break;
            default: System.out.println("Default case("+randomstr+" didnt match with any case)");
        }

        switch(randomshort){ //Short
            case 1324: System.out.println("First case");
                break;
            case 1325: System.out.println("Second case");
                break;
            case 2323: System.out.println("Third case");
                break;
            default: System.out.println("Default case("+randomshort+" didnt match with any case)");
        }

        switch(randomshort){//Breaks at all cases are missing.The result will be that all cases are going to be executed
            //because randomshort=1323
            case 1323: System.out.println("This is");
            case 1325: System.out.println("what happens");
            case 2323: System.out.println("when you dont add");
            default: System.out.println("break at all cases");
        }


        //In the other hand, if operator can accept only boolean types

        if(maxbyte == Byte.MAX_VALUE){ //boolean
            System.out.println("You found the max value of byte");
        }else{
            System.out.println("This is not the max value of byte");
        }

        if(true){//boolean
            System.out.println("Always true");
        }

        if(false){//boolean
            System.out.println("Always false.This part of code is never going to be executed");
        }
    }
}
