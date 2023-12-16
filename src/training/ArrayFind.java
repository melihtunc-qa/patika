package training;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFind {

    static Scanner scanner=new Scanner(System.in);
    static int[] arraySort(int[] i ){

        int [] sortedList = Arrays.stream(i).sorted().toArray();

        return sortedList;
    }

    public static void main(String[] args) {

        int[] list1 = new int[5];

        for (int i = 0 ; i<5 ; i++){
            System.out.println("diziye bir değer girin ");

            list1[i]=scanner.nextInt(); }

        System.out.println(" dizi :  " + Arrays.toString(list1));

        int [] sortedList=arraySort(list1);

        System.out.println("dizinin küçükten büyüğe sıralanmış hali: " + Arrays.toString(sortedList));



    }


}
