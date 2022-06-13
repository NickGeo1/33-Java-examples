package com.test.maskot_27_slide_161;

import java.util.ArrayList;

public class Inheritance {
    public static void main(String[] args) {
        Library l = new Library(1500,14.8f,"Horror","Adventure","Love stories",
                "Movie based","Educational");
        l.ShowCategories();
        System.out.println("There is about "+l.ShowBooks()+" books in this library");
        System.out.println("There's an average cost of "+l.ShowAveragePrice()+" per book");

        LibraryKeeper lk = new LibraryKeeper(35, 8,"Bishop",2000,
                12.6f,"Mystery","Cooking","History","Technology","Medical");
        lk.TellAboutMe();
        lk.TellAboutLibrary();

        Costumer c = new Costumer();
        c.SetName("Lucas");
        c.Talk();
    }
}


class Library{
    int books;
    ArrayList<String> categories = new ArrayList<>();
    float average_price_per_book;

    Library(int books, float average_price_per_book, String... categories){//Custom Constructor
        //Initializing values
        this.books = books;
        this.average_price_per_book = average_price_per_book;
        for(String s: categories){
           (this.categories).add(s);
       }
    }
    Library(){//Deafult Constructor
        super();
    }

    void ShowCategories(){
        System.out.println("Our library books have the following categories: ");
        System.out.println(categories);
    }
    int ShowBooks(){
        return books;
    }
    float ShowAveragePrice(){
        return this.average_price_per_book;
    }
}



class LibraryKeeper extends Library{ //First subclass of Library
    private int age;
    private int daily_worktime;
    private String name;

    //sub class must have its own constructor or one that matches with super constructor.
    //This constructor takes parameters of sub and super class

    LibraryKeeper(/*parameters of subclass*/int age, int daily_worktime, String name,
     /*parameters of superclass */int books, float average_price_per_book, String... categories) {

        super(books, average_price_per_book, categories); //Initializing values of super

        //Initializing values of sub
        this.age = age;
        this.daily_worktime = daily_worktime;
        this.name = name;
    }

    void TellAboutMe(){
        System.out.println("\nMy name is "+name+" and I am the library keeper. I am "+age+" years old and my daily worktime" +
                " is "+daily_worktime+" hours");
    }
    void TellAboutLibrary(){
        System.out.println("I know that my library has the following:");
        System.out.println("Books: "+ books);
        System.out.println("Average price per book: "+average_price_per_book);
        System.out.println("Categories: "+categories);
    }

}



class Costumer extends Library { //Second subclass of Library(here we are using the default constructor)
    private String name;

    void Talk() {
        books = 1500; //Setting book variable of super equal to 1500
        System.out.println("\nMy name is " + name + " and the library I came across had about " + books + " books");
    }

    void SetName(String name) {
        this.name = name;
    }
}