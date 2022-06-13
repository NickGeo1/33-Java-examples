package com.test.maskot_10_slide_85;

public class Final {
    public static void main(String[] args) {
        FinalClass f = new FinalClass();
        //f.finalstring = "Trying to change the final string..."; //We cannot change the value of a final variable
        String showfinalstring = f.finalstring ;
        System.out.println(showfinalstring);
        f.FinalMethod();
    }

}

final class FinalClass{ //Final class
    final String finalstring = "A string that is final and cannot be reinitialized"; //Final string variable

    final void FinalMethod(){ //Final method
        System.out.println("This is a final method");
    }
}

/*class ExtendTest extends FinalClass {
    String s;

    void TestMethod(){
    System.out.println("this is a test method");
    }
}
 */ //A final class cannot extend any other class


class NonFinalClass{
    String s2;

    final String FinalMethod2(){
        return "A string";
    }
}

/*class NonFinalClass2 extends NonFinalClass {
    String s3;

    String FinalMethod2(){
        return "A second string";
    }

}*/ // A final method cannot be overrided by a subclass



/*final interface TestInterface{
    float afloat = 4;
    void amethod();
}*/  //We cannot set the keyword final for an interface