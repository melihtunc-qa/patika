package training;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı girin: ");
        int sayi = scanner.nextInt();


        if (isPalindrom(sayi)){
            System.out.println(sayi+ " bir palindrom sayıdır");
        }else {
            System.out.println(sayi+"bir palindrom sayı değildir");
        }
    }

    public static boolean isPalindrom(int sayi){
        int tersSayi = 0 , gecici=sayi;

        while (gecici!=0){
            int basamak = gecici%10;
            tersSayi = (tersSayi*10)+basamak;
            gecici/=10;
        }
        return  sayi==tersSayi;
    }

}
