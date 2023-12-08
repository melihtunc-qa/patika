package training;

import java.util.Scanner;

public class RecursiveKatAlma {

    static int hesap(int taban, int kat){

        if (kat==0){
            return 1;
        }else{
            return taban*hesap(taban,kat-1);

        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("taban giriniz : ");

        int taban = scan.nextInt();

        System.out.println("kat giriniz :");

        int kat = scan.nextInt();

        scan.close();

        int sonuc=hesap(taban,kat);

        System.out.println("sonuç : " + sonuc);


    }


}
