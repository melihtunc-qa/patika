package training;

import java.util.Scanner;

public class Basamak {

    public static void main(String[] args) {

    int a ,sonbasamak,total=0, basamakSayisi = 0;

    Scanner sc=new Scanner(System.in);

        System.out.println("Sayı giriniz : ");

        a=sc.nextInt();

        while (a!=0){
            sonbasamak=a%10;
            a=a/10;
            basamakSayisi++;
            total+=sonbasamak;
        }

        System.out.println(a + "sayısının basamak sayıları toplamı " + total);


    }

}
