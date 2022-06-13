package com.test.maskot_4_slide_40;

public class Nested_Classes {
    public static void main(String[] args) {

        new AnonymousStuff(){ // Non-static inner class: Anonymous class that implements an existing interface
            @Override
            public void Anonymousmethod(){
                 System.out.println("Overriding interface method inside a non-static nested anonymous class");
             }
        }.Anonymousmethod(); //Running Anonymousmethod via anonymous object

        Nested_Classes n = new Nested_Classes();
        //Local l = new Local(); We cant access class Local from here
        n.Method(); //Access Method in order to access class Local

        StaticNested s = new StaticNested(); //Object of static-nested class
        s.staticinteger = 30;
        s.staticfloat = 34.6f;
        s.staticstring = "a static string";
        String returnstaticstr = s.StaticMethod();
        System.out.println(returnstaticstr);

    }

    void Method(){ //We can have access to class Local only from this Method

         class Local{  //Non-static inner class: local class
            long locallongint;
            boolean localbool;
            String localstring;

            String LocalMethod(){ //class Local method
                return "The method of a non-static Local nested class returns this string";
            }
        }

        Local l = new Local();
        String returnlocalstr= l.LocalMethod();
        l.localbool = false;
        l.locallongint = 1000;
        l.localstring = "a local string";
        System.out.println(returnlocalstr);

    }


      static class StaticNested{ //Static nested class
        int staticinteger;
        float staticfloat;
        String staticstring;

        String StaticMethod(){ //Static nested class method
            return "The method of a static nested class returns this string";
        }
    }

}

interface AnonymousStuff{ //interface which is going to be implemented at anonymous class
void Anonymousmethod();
}

