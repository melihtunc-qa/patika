package training;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int katman,a=0,b=1;


        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen fibonacci katmanı  giriniz");

        katman=input.nextInt();

        for (int i =1;i<=katman;i++){

            System.out.println(a + ",");

            int nextTerm=a+b;
            a=b;
            b=nextTerm;

        }
input.close();
    }
}
