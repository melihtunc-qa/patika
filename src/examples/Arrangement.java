package examples;

import java.util.Scanner;

public class Arrangement {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.println("birinci. sayı :");

        a= input.nextInt();;

        System.out.println("ikinci sayı : ");

        b=input.nextInt();

        System.out.println("üçüncü sayı");

        c=input.nextInt();


        if (a>b&&a>c){
            System.out.println("birinci sayı en büyüktür");

        } else if (b>a&&b>c) {
            System.out.println("ikinci sayı en büyüktür");
        }else {
            System.out.println("üçüncü sayı en büyüktür");
        }

    }
}
