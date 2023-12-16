package training;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysMinMax {


    static int n = 10;
    static int[] list = new int[n];

    static int minimum ;
    static int max ;

    public static void main(String[] args) {


    int[] sirali = Arrays.stream(list).sorted().toArray();

    minimum = sirali[0];
    max = sirali[n-1];



        System.out.println("minimum değer " + minimum);

       System.out.println("maximum değer " + max);
    }


}
