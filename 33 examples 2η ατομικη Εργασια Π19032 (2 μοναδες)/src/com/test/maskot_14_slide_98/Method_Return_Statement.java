package com.test.maskot_14_slide_98;

public class Method_Return_Statement {
    static int numbers[] = {122,223,682,467,234,580};

    public static void main(String[] args) {
        boolean found = Method_Return_Statement.Search();
        System.out.println("Did you find 467? "+found);
        Method_Return_Statement.VoidMethod();
    }

    static boolean Search(){
        for(int i: numbers) {
            if(i==467) {
                return true; //If we find 467 in the array, the return statement breaks the loop and returns true
            }
        }
        return false;
    }

    static void VoidMethod(){
        System.out.println("This is a void method that returns nothing");
        //return 5; //We cant return a value with a void method
        return; //Return statement is not necessary
        //int unreachableint; //We cant add anything bellow return statement because its unreachable
    }
    /*int FalseMethod(){
        return;
    }*/ //We cant create a  non-void-method that returns nothing
}
