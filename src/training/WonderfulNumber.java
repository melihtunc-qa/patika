package training;

import java.util.Scanner;

public class WonderfulNumber {

    public static void main(String[] args) {

        int sayi,toplam = 0;




        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz");

        sayi=input.nextInt();
        toplam=sayi;


        for (int i =1; i<sayi;i++){

               if (sayi%i==0) {
                   toplam -= i;
               }
        }

        if (toplam==0){
            System.out.println("seçtiğiniz sayı mükemmel bir sayıdır");
        }else {
            System.out.println("seçtiğiniz sayı mükemmel bir sayı değildir");
        }




    }}
