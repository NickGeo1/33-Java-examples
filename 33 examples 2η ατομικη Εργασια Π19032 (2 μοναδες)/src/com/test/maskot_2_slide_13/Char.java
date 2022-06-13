package com.test.maskot_2_slide_13;

public class Char {
    public static void main(String[] args) {
        //char c = "C"; char cannot be assigned with ""
        char c = 'C'; //char assignment
        char chararray[]={'C','h','a','r','a','c','t','e','r'}; //char array assignment
        System.out.println("This is a char: "+ c);
        System.out.print("These are the elements of a char array: ");
        for(char c1: chararray){//Making a for-each loop in order to print array's elements
            System.out.print(c1);
        }
    }
}

