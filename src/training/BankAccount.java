package training;

import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

        String username, password;
        int right = 3;
        int balance = 1500;
        while (right > 0) {
        int select ;

            Scanner input = new Scanner(System.in);

            System.out.println("Kullanıcı Adınız : ");

            username = input.nextLine();

            System.out.println("Şifreniz");

            password = input.nextLine();

            if (username.equals("patika")&&password.equals("dev123")){
                System.out.println("Merhaba , Patikabank'a hoşgeldiniz");
               do {
                   System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
                   System.out.println("1- Para Yatırma\n" + "2 - Para Çekme\n" + "3 - Bakiye Sorgulama\n" + "4 - Çıkış Yap");
                   select = input.nextInt();
                   if (select==1){
                       System.out.println(" Para miktarı : ");
                       int price=input.nextInt();
                       balance+=price;
                   }else if (select==2){
                       System.out.println("Para miktarı : ");
                       int price=input.nextInt();
                       if (price>balance){
                           System.out.println("bakiye yetersiz \n");
                       }else {
                           balance-=price;
                       }

                   } else if (select==3) {
                       System.out.println("Bakiyeniz : " + balance);
                   } else if (select>4) {
                       System.out.println("Lütfen 1-4 arası bir sayı giriniz\n");

                   }
               }while (select != 4);
                System.out.println("Tekrar görüşmek üzere !");
               break;

            }else {
                right--;
                System.out.println("hatalı kullanıcı adı veya şifre");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur , banka ile irtibata geçiniz");
                } else {
                    System.out.println("Kalan giriş hakkınız " + right);
                }
            }



    }
}}
