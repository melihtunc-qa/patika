package training;

import java.util.Scanner;

public class BankAccountSwitch {
    public static void main(String[] args) {
        String userName,password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right>3){
            System.out.println("Kullanıcı Adınız");
            userName = input.nextLine();
            System.out.println("Parolanız : ");
            password=input.nextLine();

            if (userName.equals("patika")&&password.equals("dev123"))
            {
                System.out.println("Merhaba , PatikaBanka hoşgeldiniz");

                do {
                    System.out.println("1 - Para Yatırma\n"+"2 - Para Çekme\n"+"3 - Bakiye Sorgulama\n" + "4 - Çıkış Yap");
                    System.out.println("Lütfen Yapmak İstediğiniz işlemi seçiniz");
                    select=input.nextInt();

                    switch (select){
                        case 1:
                            System.out.println("Para Miktarı : ");
                            int depositAmount=input.nextInt();
                            balance +=depositAmount;
                            break;
                        case 2:
                            System.out.println("Para Miktarı : ");
                            int withdrawAmount = input.nextInt();
                            if (withdrawAmount>balance){
                                System.out.println("Bakiye Yetersiz. ");
                            }else {
                                balance-=withdrawAmount;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Çıkış Yaptınız , Tekrar Görüşmek üzere");
                            break;
                        default:
                            System.out.println("Geçersiz Bir seçim yaptınız , lütfen 1-4 arası bir seçim yapınız");
                            break;

                    }


                }while (select!=4);

                break;


            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre , Tekrar Deneyiniz. ");

                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur , lütfen bankanızla iletişime geçiniz");

                }else {
                    System.out.println("kalan hakkınız : " + right);

                }
            }


        }

    }
}
