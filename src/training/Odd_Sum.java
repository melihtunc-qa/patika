package training;

import java.util.Scanner;

public class Odd_Sum {

    public static void main(String[] args) {


        int n ;
        Scanner sc = new Scanner(System.in);

        int toplam = 0;

        System.out.println("Bir sayı giriniz");
        n=sc.nextInt();
        while (n%2==0)
        {
            System.out.println("Bir sayı daha giriniz");
            n=sc.nextInt();

            if (n%4==0){
                toplam +=n;
            }
        }

        System.out.println(n+"'e kadar olan sayılardan 4'ün katları olan sayıların toplamı: " + toplam);


    }



}
