package training;

import java.util.Scanner;

public class KatAlma {

    public static void main(String[] args) {
        int n,k,total;

        Scanner sc=new Scanner(System.in);
        total=1;
        System.out.println("üssü alınacak sayıyı giriniz");
        n = sc.nextInt();

        System.out.println("üssü giriniz");

        k=sc.nextInt();

        for (int i =1;i<=k;i++){

            total *=n;

        }

        System.out.println(n+ "sayısının " + k+". kuvveti " + total);






    }

}
