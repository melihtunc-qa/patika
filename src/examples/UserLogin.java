package examples;

import java.util.Scanner;

public class UserLogin {

    public static void main(String[] args) {

        String username,password;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı adınız : ");

        username = input.nextLine();

        System.out.println("şifreniz : ");

        password= input.nextLine();


        if (username.equals("patika")&&password.equals("java123")){

            System.out.println("Giriş yaptınız");

        }else {
            System.out.println("Bilgileriniz yanlış");
        }

    }
}
