package com.test.maskot_22_slide_124;

public class Mutable_Strings {
    StringBuilder strb; //StringBuilder Instance variable

    void MakeAStringBuilder(String sb){ //Setting value to StringBuilder variable
         this.strb = new StringBuilder(sb);
    }

    public static void main(String[] args) {
        //Using StringBuilder class to make a mutable string that accepts common modifications(Better code performance compared
        //to String object use)

        Mutable_Strings m = new Mutable_Strings();
        m.MakeAStringBuilder("This is a string builder object");
        StringBuilder strb_of_obj = m.strb;

        strb_of_obj = strb_of_obj.append(" from StringBuilder class");
        System.out.println(strb_of_obj);

        System.out.println(strb_of_obj.substring(25));

        strb_of_obj.setLength(16);
        System.out.println(strb_of_obj);

        strb_of_obj = strb_of_obj.delete(0,10);
        System.out.println(strb_of_obj);

    }
}
