package com.test.maskot_33_slide_201;

public class Variable_Use_By_Anonymous_Classes {
    int membervar = 60; //member variable

    public static void main(String[] args) {
        //local variables

        final int intforanonymous;
        intforanonymous = 6;//final
        byte byteforanonymous = 7;
        char charforanonymous = 'H';
        String strforanonymous = "Anonymous";
        strforanonymous = "Changed Anonymous"; //strforanonymous initialized second time, so its not effectively final
        final float floatforanonymous = 33; //final

        new Variable_Use_By_Anonymous_Classes(){ //Anonymous class that extends an existing class

            int accessmembervar = membervar; //We can access any member variable from super class
            //String accesslocalvar = strforanonymous; //We cant access strforanonymous because it is nor final
            //or effectively final
            int accesslocalvar2 = intforanonymous;
            float accesslocalvar3 = floatforanonymous; //These variables are final, so they are accessible
            //byte accesslocalvar4 = byteforanonymous; //Unusable because it is being reinitialized bellow
            char accesslocalvar5 = charforanonymous; //Usable because it is not being reinitialized

            void ModifyAndPrintVarsMethod(){//Anonymous class method
                //byteforanonymous = 8; //Changing again byteforanonymous value is making it no more effectively final and
                //also unusable
                accesslocalvar2 = 90; //We can change already set variables
                accesslocalvar5 = 'B';

                System.out.println("Anonymous variables are: ");
                System.out.println(accessmembervar);
                System.out.println(accesslocalvar2);
                System.out.println(accesslocalvar3);
                System.out.println(accesslocalvar5);
            }
        }.ModifyAndPrintVarsMethod(); //Calling anonymous class method

    }
}
