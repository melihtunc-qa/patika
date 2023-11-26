package training;

import java.util.Scanner;

public class HarmonikSayi {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();
        double result = 0.0;

        for (double i = 1;i<=n;i++){

            result += (1/i);
        }

        System.out.println("seçilen sayının harmonik toplamları : " + result);
    }

}
