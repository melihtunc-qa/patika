package training;

import java.util.Scanner;

public class Kuvvet {


    public static void main(String[] args) {



        int n;

        Scanner sc=new Scanner(System.in);

        System.out.println("Bir sayı giriniz");
        n = sc.nextInt();

        for (int i = 1 ; i<=n ; i+=4){

            System.out.println("Dördün katı : " + i);


        }

        for (int i =1;i<=n;i+=5){
            System.out.println("Beşin katı : " + i);
        }




    }


}
