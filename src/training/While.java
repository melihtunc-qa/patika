package training;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {


      int toplam=0,adet=0, girilenSayi ;

      Scanner sc = new Scanner(System.in);

        System.out.println("sayi giriniz");

        girilenSayi = sc.nextInt();

        for (int i=0;i<=girilenSayi;i++){

            if (i%12==0){

                toplam += i ;
               adet++;

            }



        }
        double ortalama = adet>0 ?(double) toplam/adet:0;

        System.out.println("O'dan"+girilenSayi + " 'e kadar olan ve 3 ile 4 'e tam bölünebilen sayıların ortalaması : " + ortalama);


}
}
