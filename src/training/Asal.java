package training;

import java.util.Scanner;

public class Asal {
    public static void main(String[] args) {
        int sayi=100;

        for (int i = 2;i<=100;i++){
            boolean asal=true;

            for (int j =2;j<i;j++){
                if (i%j==0){
                  //  asal=false;
                    break;
                }
            }

            if (asal){
                System.out.println(i + " ");
            }

        }


    }
}
