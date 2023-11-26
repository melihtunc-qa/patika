package examples;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        {
            int number1, number2, select;

            Scanner inp = new Scanner(System.in);
            System.out.println("ilk sayıyı giriniz");
            number1 = inp.nextInt();

            System.out.println("ikinci sayıyı giriniz");

            number2 = inp.nextInt();
            System.out.println("number1 : " + number1 + "number2" + number2);

            System.out.println("1- toplama \n 2- çıkarma \n 3- çarpma \n 4-bölme ");

            System.out.println("seçiminiz : ");

            select = inp.nextInt();

            System.out.println(select);

            if (select == 1) {
                System.out.println("toplam : " + (number1 + number2));
            } else if (select == 2) {

                System.out.println("çıkarma : " + (number1 - number2));
            } else if (select == 3) {

                System.out.println("çarpma " + (number1 * number2));

            } else if (select == 4) {
                if (number2 != 0) {
                    System.out.println("bölme : " + (number1 / number2));
                } else System.out.println("bölüm sıfır olamaz");
            } else System.out.println("yanlış seçim yaptınız");

        }


        {
            int number1, number2, select;

            Scanner inp = new Scanner(System.in);
            System.out.println("ilk sayıyı giriniz");
            number1 = inp.nextInt();

            System.out.println("ikinci sayıyı giriniz");

            number2 = inp.nextInt();
            System.out.println("number1 : " + number1 + "number2 : " + number2);

            System.out.println("1- toplama \n 2- çıkarma \n 3- çarpma \n 4-bölme ");

            System.out.println("işlem seçiniz");

            select = inp.nextInt();

            while ( select >=1 || select <= 4){


            switch (select) {

                case 1:
                    System.out.println(" toplam : " + (number1 + number2));
                    break;
                case 2:
                    System.out.println("çıkarma : " + (number1 - number2));
                    break;
                case 3:
                    System.out.println("çarpma : " + (number1 * number2));
                    break;
                case 4:
                    if (number2 != 0) {


                        System.out.println("bölme : " + (number1 / number2));
                    } else {
                        System.out.println("Bir sayıyı 0'a bölemezsiniz");
                    }
                    break;
                default:
                    System.out.println("seçimi tekrarlayınız");
            }
break;
            }

        }


    }
}
