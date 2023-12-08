package examples;

import java.util.Scanner;

public class RecursiveSeri {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz : ");

        int n = scanner.nextInt();

        scanner.close();

        islem(n);
    }

    private static void islem(int sayi){
        if (sayi<=0){
            System.out.println("son değer : "+sayi);
        }else {
            System.out.println("Çıkarma: " + sayi );

            islem(sayi-5);

            System.out.println("Toplama: " + (sayi-5));

        }

    }

}
