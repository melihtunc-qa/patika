package obs;

import java.util.random.RandomGenerator;

public class Student {

    Course c1;
    Course c2;
    Course c3;
    String name;
    String stdNo;
    String classes;
    double average;
    boolean isPass;


    Student(String name, String stdNo,String classes,Course c1,Course c2,Course c3){

        this.name=name;
        this.stdNo=stdNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.average=0.0;
        this.isPass=false;

    }


    void addBulkExamNote(int note1,int note2,int note3){
       if (note1<=100 && note1>=0){
           c1.note=note1;

       }
        if (note2<=100 && note2>=0){
            c2.note=note2;

        }
        if (note3<=100 && note3>=0){
            c3.note=note3;
        }
    }


    void  isPass(){
        this.average = (this.c1.note + this.c2.note+this.c3.note)/3.0;
    }

    void printNote(){

        System.out.println(c1.name + " Notu : \t " + c1.note);
        System.out.println(c2.name + " Notu : \t " + c2.note);
        System.out.println(c3.name + " Notu : \t " + c3.note);
        System.out.println("ortalamanız : " + this.average);
    }



}
