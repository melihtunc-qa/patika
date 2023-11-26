package training;

import java.util.Scanner;

public class Combination {

    static int total,combination;

    public static void main(String[] args) {

        total = 1;

        int n,r;
        Scanner sc=new Scanner(System.in);

        System.out.println("N kümenisin eleman sayısını giriniz");

        n=sc.nextInt();

        System.out.println("R kümesinin eleman sayısını giriniz");

        r=sc.nextInt();


        System.out.println("N elemanlı kümenin R elemanlı kümeyle oluşturabileceği kombinasyon : " + combination(n,r));


    }

    static int faktoriel(int eleman){

        for (int i = 1 ; i<=eleman;i++){

            total *= i;
        }

        return total;
    }

    static int combination(int eleman1,int eleman2){

        return combination = faktoriel(eleman1)/((faktoriel(eleman2)*(faktoriel((eleman2-eleman1)))));

    }



}
