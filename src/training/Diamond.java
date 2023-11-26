package training;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bir sayı giriniz (tek sayı olmalı): ");

        int n = sc.nextInt();

        if (n%2==0){
            System.out.println("lütfen tek sayı giriniz");
        }else {
            elmasYapisi(n);
        }

        sc.close();

    }

    static void elmasYapisi(int n){

        for (int i = 0; i<n/2+1;i++ ){

            for (int j = 0; j<n/2-i;j++){
                System.out.print(" ");
            }
            for (int k = 0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n/2-1;i>=0;i--){
            for (int j = 0;j<n/2-i;j++){
                System.out.print(" ");
            }
            for (int k = 0; k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
