package com.test.maskot_21_slide_122;

public class String_Comparison {
    static String s1 = "New address string"; //Making a string object which points to a new address
    static String s2 = s1;
    static String s3 = "New address string"; //These strings have the same value of s1 so they are pointing to the same address as s1
    //(String pool)

    static String s4 = new String("New address string"); //Making a string that has the same value of the above strings
    //but it is pointing to a different address
    static String s5 = "A different string";

    public static void main(String[] args) {
        if(s1==s2){//Comparing addresses of s1,s2
            System.out.println("s1 has the same address as s2");
        }else{
            System.out.println("s1 has different address from s2");
        }

        if(s1.equals(s2)){//Comparing values of s1,s2
            System.out.println("s1 has the same value as s2");
        }else{
            System.out.println("s1 has different value from s2");
        }

        if(s1==s3){
            System.out.println("s1 has the same address as s3");
        }else{
            System.out.println("s1 has different address from s3");
        }

        if(s1.equals(s3)){
            System.out.println("s1 has the same value as s3");
        }else{
            System.out.println("s1 has different value from s3");
        }

        if(s1==s4){
            System.out.println("s1 has the same address as s4");
        }else{
            System.out.println("s1 has different address from s4");
        }

        if(s1.equals(s4)){
            System.out.println("s1 has the same value as s4");
        }else{
            System.out.println("s1 has different value from s4");
        }

        if(s1.equals(s5)){
            System.out.println("s1 has the same value as s5");
        }else{
            System.out.println("s1 has different value from s5");
        }
    }
}
