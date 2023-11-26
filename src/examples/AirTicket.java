package examples;

import java.util.Scanner;

public class AirTicket {

    public static void main(String[] args) {


    int yas,km,tip,kategori,kmSabiti;

    kategori=1;
    kmSabiti=10;
    double indirimli = 0;


        Scanner sc=new Scanner(System.in);

        System.out.println("Mesafe giriniz");

        km=sc.nextInt();
        while (km<=0){
            System.out.println("geçerli bir değer giriniz");
            km=sc.nextInt();

        }

        System.out.println("Yaş giriniz");

        yas=sc.nextInt();

        while (yas<=0){
            System.out.println("geçerli bir yaş giriniz");
            yas=sc.nextInt();

        }

        System.out.println("yolculuk tipi giriniz (1 : tek yön - 2 : gidiş-dönüş)");

        tip=sc.nextInt();

        while (!(tip==1||tip==2)){
            System.out.println("1 veya 2 değerini giriniz");
            tip=sc.nextInt();
        }

        double total = kmSabiti*km;

        System.out.println("bilet ücreti :" + total);

        if (yas<12){
            indirimli=total/2;
        } else if (yas<24||yas>12) {
            indirimli = total*9/10;
            kategori++;
        } else if (yas>65) {
            indirimli = total*7/10;
            kategori++;
        }

        System.out.println( kategori+"."+ " yolcu kategorisine girdiğiniz için indirimli ücretiniz : " + indirimli);

        if (tip==2){
            System.out.println("gidiş-dönüş bilet seçtiğiniz için ekstra %20 indirimle son bilet ücretiniz : " + (indirimli*4/5));
        }





    }

}
