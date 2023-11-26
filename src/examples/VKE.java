package examples;

import java.util.Scanner;

public class VKE {
    public static void main(String[] args) {

        double kilogram,boy;

        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen boyunuzu giriniz");
        boy=input.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz");

        kilogram=input.nextDouble();

       double vke=kilogram/(boy*boy);

        System.out.println("boyunuz : " + boy + "kilonuz : " + kilogram );
        System.out.println("Kitle endeksiniz : " + vke);




    }
}
