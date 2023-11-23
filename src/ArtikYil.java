import java.util.Scanner;




    public class ArtikYil {
        public ArtikYil() {
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Yıl Giriniz ");

            int yil;
            for(yil = sc.nextInt(); yil <= 0; yil = sc.nextInt()) {
                System.out.println("1'den büyük bir yıl giriniz");
            }

            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println("" + yil + " bir artık yıldır ve 366 gün çeker");
                } else {
                    System.out.println("" + yil + " artık yıl değildir ve 365 gün çeker");
                }
            } else if (yil % 4 == 0) {
                System.out.println("" + yil + "bir artık bir yıldır ve 366 gün çeker");
            } else {
                System.out.println("" + yil + " artık bir yıl değildir ve 365 gün çeker");
            }

        }
    }


