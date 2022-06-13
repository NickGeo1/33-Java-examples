package com.test.maskot_13_slide_91;

public class Variable_Scope {
    int instanceint; //Instance variable
    static float classfloat; //Class variable
    char text[] = {'H','e','l','l','o',' ','w','o','r','l','d'};

    public static void main(String[] args) {
        Variable_Scope v = new Variable_Scope();
        v.instanceint = 5; //Setting value to instance variable

        Variable_Scope.classfloat = 4.87f; //Setting value to class variable

        String str = v.Stringmethod("Hello world",8); //Setting value to method parameters
        System.out.println(str);

    }

    String Stringmethod(String parameterstr,int num){ //Method parameters
        int sum;//Local variable
        sum = num + 2; //Setting value to local variable

        instanceint = 56; //Accessing instance and class variables from method
        classfloat = 88;

        for(int i=0; i<11; i++){
            String str; //local for loop variable

            if (i==5){
                str = "END";
                break;
            }
            System.out.print(text[i]);
        }

        //str = "MODIFIED"; //We cant have access to local variable str because it have been initialized inside the for loop
        return "\nYour given string is: "+parameterstr+". Your given number + 2 is: "+sum;
    }
    //sum = 14; //We cant access the local variable sum from outside method
}
