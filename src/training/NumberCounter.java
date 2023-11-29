package training;

import java.util.Scanner;

public class NumberCounter {
    static  Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int sayi1,sayi2,sayi3,sayi4;
        System.out.println("Birinci sayiyi giriniz");
        sayi1=input.nextInt();
        System.out.println("Ikinci sayiyi giriniz");
        sayi2=input.nextInt();
        System.out.println("Ucuncu sayiyi giriniz");
        sayi3=input.nextInt();
        System.out.println("Dorduncu sayiyi giriniz");
        sayi4=input.nextInt();

        if (sayi1>sayi2&&sayi1>sayi3&&sayi1>sayi4){
            System.out.println("en buyuk sayi : " + sayi1);
        } else if (sayi2>sayi1&&sayi2>sayi3&&sayi2>sayi4) {
            System.out.println("en buyuk sayi "+ sayi2);
        } else if (sayi3>sayi1&&sayi3>sayi2&&sayi3>sayi4) {

        }else {
            System.out.println("en buyuk sayi "+ sayi4);
    }

        class EnKucukSayilar{
            public static void main(String[] args) {

                System.out.println("kac sayi gireceksiniz");

                int n = input.nextInt();

                System.out.println("1. sayiyi giriniz");
                int min = input.nextInt();


                 for (int i = 2; i<=n;i++){
                     System.out.println(i+ ". sayiyi giriniz ");
                 int sayi = input.nextInt();

                 if (sayi<min){
                     min=sayi;
                 }

                 }
                System.out.println("en kucuk sayi "+min);

                 input.close();
            }
        }



}

}
