package com.test.maskot_25_slide_139;

public class Ternary_Operator {
    public static void main(String[] args) {
        StudentGrades g = new StudentGrades();

        float avg = g.CalculateAverage(6.4f, 8.5f); //average of object g
        float avg2 = g.CalculateAverage2(4.6f,5.1f); //average2 of object g
        float avg3 = g.CalculateAverage3(9.0f,9.5f); //average3 of object g

        //In each ternary operator we are setting the first string to the variable if average>5.0 or the other string
        //if average<5.0

        String pass = (avg>5.0)? "You passed the first lesson: "+avg:"You didnt pass the first lesson: "+avg;
        String pass2 = (avg2>5.0)? "You passed the second lesson: "+avg2:"You didnt pass the second lesson: "+avg2;
        String pass3 = (avg3>5.0)? "You passed the third lesson: "+avg3:"You didnt pass the third lesson: "+avg3;

        float classavg = (avg+avg2+avg3)/3; //classaverage of object g
        String passclass = (classavg>5.0)? "You passed this class: "+classavg:
                "You didnt pass this class: "+classavg;

        System.out.println(pass);
        System.out.println(pass2);
        System.out.println(pass3);
        System.out.println(passclass); //printing the results

    }
}

class StudentGrades{
    float grade1;//float variables
    float grade2;
    float grade3;
    float grade4;
    float grade5;
    float grade6;

    float CalculateAverage(float grade1,float grade2){//Calculate the average of 3 float variables
        this.grade1 = grade1;
        this.grade2 = grade2;
        return (this.grade1+this.grade2)/2;
    }
    float CalculateAverage2(float grade3,float grade4){//Calculate the average of 3 float variables
        this.grade3 = grade3;
        this.grade4 = grade4;
        return (this.grade4+this.grade3)/2;
    }
    float CalculateAverage3(float grade5,float grade6){//Calculate the average of 3 float variables
        this.grade5 = grade5;
        this.grade6 = grade6;
        return (this.grade6+this.grade5)/2;
    }
}