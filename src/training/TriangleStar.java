package training;

import java.util.Scanner;

public class TriangleStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısını girin: ");
        int basamakSayisi = scanner.nextInt();

        for (int i = 0; i < basamakSayisi; i++) {
            // Boşlukları ekleyerek yıldızları yazdırma
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Yıldızları yazdırma
            for (int k = 0; k < basamakSayisi - i; k++) {
                System.out.print("* ");
            }

            System.out.println(); // Bir satırı tamamladıktan sonra yeni bir satıra geç
        }

        scanner.close();
    }
}
