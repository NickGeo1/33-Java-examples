package com.test.maskot_7_slide_53_second;

import static com.test.maskot_7_slide_53_first.Static_Imports_Example_First.*; //Import all static members

//We can import static also this way:
//1// import static com.test.maskot_7_slide_53_first.Static_Imports_Example_First.pi;
//2// import static com.test.maskot_7_slide_53_first.Static_Imports_Example_First.Astaticmethod;

public class Static_Imports_Example_Second {
    public static void main(String[] args) {
        System.out.println("The value of pi is approximately: "+pi);
        Astaticmethod();
    }
}
