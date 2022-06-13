package com.test.maskot_8_slide_66_first;

//Public class
public class Access_Modifiers_First {
    public static void main(String[] args) {
        //We have access at all private variables,methods and nested classes
        // because we are inside their class.We cannot access private members outside this class.

        Access_Modifiers_First a = new Access_Modifiers_First(2, 6.8f,"A protected string",120000000);
        System.out.println("private float of top class is: "+a.var2);//Access private float
        a.PRIVATE_METHOD();//Access private method
        PrivateClass c = new PrivateClass();
        c.PrivateClassMethod(5);

        //We have access at default,protected and public members from this package
        a.var1=17; //public int
        a.PROTECTED_METHOD(); //protected method
        ProtectedClass d = new ProtectedClass();//protected class
        d.ProtectedClassMethod(15);
        DefaultClass e = new DefaultClass();//default class
        e.DefaultClassMethod(14);

    }

   public int var1;
   private float var2;
   protected String var3;
   long var4; //Variables with different access modifiers

   public Access_Modifiers_First(int var1, float var2, String var3, long var4){ //public Constructor
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        this.var4 = var4;
    }

    public Access_Modifiers_First(){
       super();
    }; //public default constructor


   static protected class ProtectedClass{ //Protected class
       public int protectedclassvar;
       public static int intforoutsidepackage;

       protected void ProtectedClassMethod(int v){
            this.protectedclassvar = v;
            System.out.println("Integer of protected class is: "+this.protectedclassvar);
        }
    }

    static private class PrivateClass{//Private class
        int privateclassvar;

        void PrivateClassMethod(int v){
            this.privateclassvar = v;
            System.out.println("Integer of private class is: "+this.privateclassvar);
        }
    }


    protected void PROTECTED_METHOD(){ //Protected method
        System.out.println("This is a protected method");
    }

    private void PRIVATE_METHOD(){//Private method
        System.out.println("This is a private method");
    }

}



class DefaultClass { //Default class
    int defaultclassvar;

    void DefaultClassMethod(int v){
        this.defaultclassvar = v;
        System.out.println("Integer of default class is: "+this.defaultclassvar);

        /*Access_Modifiers_First b = new Access_Modifiers_First(1,2.4f,"string",12);
        float f = b.var2;
        b.PRIVATE_METHOD();
        */ //We cant access private members from another class.We can access them only from the class of their origin
    }
}