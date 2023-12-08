package examples;

import java.util.Scanner;

public class AsalBulmaWithRecursive {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = scan.nextInt();

        scan.close();


        if (asalMi(sayi,2)){
            System.out.println(sayi + " asal bir sayıdır ");
        }else{
            System.out.println(sayi + "asal bir sayı değildir");
        }
    }


    private static boolean asalMi(int sayi , int bolen){
        if (sayi<=2){
            return (sayi==2);
        }

        if (bolen==sayi){
            return true;
        }

        if (sayi%bolen==0){
            return false;
        }

        return asalMi(sayi,bolen+1);

    }

}
