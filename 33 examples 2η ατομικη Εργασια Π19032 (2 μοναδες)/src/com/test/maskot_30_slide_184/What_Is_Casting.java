package com.test.maskot_30_slide_184;

public class What_Is_Casting {
    public static void main(String[] args) {
        Mayor c = new City(); //Class City implements Mayor interface
        //c.population = 8865000; //Interface cannot access its class instance variables
        ((City) c).population = 8865000; //We can have access after casting from Mayor type to City type
        ((City) c).name = "Chicago";
        ((City) c).square_kilometres = 606.1f;
        ((City) c).TellPopulation();
        ((City) c).Tellsquare_metres();
        c.TellMayor("Lori Lightfoot"); //Interface can have access at its method which has been overrided by its class


        Color col = new Building();//Same things here(for class Building that implements interface Color)
        //col.floors = 10; //Cant happen
        Building casted = (Building) col; //Casting from Color to Building type
        casted.floors = 10;
        casted.date_of_creation = "21/4/2001";

        //Building is subclass of City so we can have access to class City instance variables
        casted.population = 100;

        System.out.println("\n of creation of this building is "+casted.BuildingDOC());
        System.out.println("This building has "+casted.Buildingfloors()+" floors");


        City city = new Building();
        //city.floors = 32; //We have to cast from City type to Building type
        Building casted2 = (Building) city;
        casted2.square_kilometres = 600; //City variable
        casted2.floors = 32; //Building variable

    }
}

class City implements Mayor{
    int population;
    String name;
    float square_kilometres;

    @Override
    public void TellMayor(String p){
        System.out.println("President of "+name+" is "+p);
    }
    void TellPopulation(){
        System.out.println("Population of "+this.name+ " is approximately "+population);
    }
    void Tellsquare_metres(){
        System.out.println(name+" is approximately "+square_kilometres+" square kilometres");
    }

}

class Building extends City implements Color{
    int floors;
    String date_of_creation;

    @Override
    public void SetColor(String c){
        System.out.println("Color of this building is "+c);
    }
    int Buildingfloors(){
        return floors;
    }
    String BuildingDOC(){
        return date_of_creation;
    }
}



interface Mayor{
    void TellMayor(String p);
}

interface Color{
    void SetColor(String c);
}