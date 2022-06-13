package com.test.maskot_8_slide_66_first;

public class Access_Modifiers_First__Second_File {
    public static void main(String[] args) {
        //We are doing the same things with the first file of this package, in order to show that we can access public,
        // protected and default members at the same package

        Access_Modifiers_First a = new Access_Modifiers_First(2, 6.8f,"A protected string",120000000);
        a.var1=17; //public int of first file
        a.PROTECTED_METHOD(); //protected method of first file
        Access_Modifiers_First.ProtectedClass d = new Access_Modifiers_First.ProtectedClass();//protected class of first file
        d.ProtectedClassMethod(15);
        DefaultClass e = new DefaultClass();//default class of first file
        e.DefaultClassMethod(14);
    }
}
