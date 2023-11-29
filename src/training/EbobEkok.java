package training;

import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int sayi1,sayi2,ebob=1,ekok=1;




        System.out.println("ilk sayiyi giriniz");

        sayi1=input.nextInt();

        System.out.println("ikinci sayiyi giriniz");

        sayi2=input.nextInt();

        while (sayi1%ebob==0&&sayi2%ebob==0){
            ebob++;

        } System.out.println(" sayilarin en buyuk ortak boleni :" + (ebob-1));


         System.out.println("sayilarin en kucuk ortak kati: " + (sayi1*sayi2/(ebob-1)));

    }


}
