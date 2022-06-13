package com.test.maskot_8_slide_66_second;

import com.test.maskot_8_slide_66_first.Access_Modifiers_First;
//import com.test.maskot_8_slide_66_first.DefaultClass; //We cant access a default class from another package

public class Access_Modifiers_Second extends Access_Modifiers_First { //Access_Modifiers_Second is subclass of
    //Access_Modifiers_First which is from another package.The subclass can access protected members of the superclass

    public static void main(String[] args) {
        Access_Modifiers_Second t = new Access_Modifiers_Second();
        t.PROTECTED_METHOD();//Access protected method from first package
        t.var3 = "Protected string"; //Access protected string from first package
        ProtectedClass.intforoutsidepackage = 27; //Access Protected nested class from first package

        /* DefaultClass e = new DefaultClass();//default class of first file
        e.DefaultClassMethod(14); */ //We cant access a default class from another package
    }



}

