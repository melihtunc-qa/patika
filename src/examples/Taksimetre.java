package examples;

import java.util.Scanner;

public class Taksimetre {

    public static void main(String[] args) {


    int acilis_ücreti = 30;

    double km_degeri,taksimetre_tutarı;

        System.out.println("kilometre giriniz ");

    Scanner input = new Scanner(System.in);

    km_degeri = input.nextDouble();

    taksimetre_tutarı = acilis_ücreti + km_degeri*20;
        System.out.println("taksimetre tutarı : " + taksimetre_tutarı);



    }
}
