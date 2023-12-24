package oop.animal;

public class HayvanatBahcesi {
    public static void main(String[] args) {

    At at = new At("Arap atı",500.0,5);
    Kedigiller kaplan=new Kedigiller("Bengal Kaplanı", 150.0,3);
    Kemirgenler fare = new Kemirgenler("Ev Faresi",0.2,1);

        System.out.println(" Hayvan Türü: " + kaplan.getTurAdi());
        System.out.println("Hayvan Ağırlığı: " + kaplan.getAgirlik());
        System.out.println("Hayvan Yaşı: "+kaplan.getYas()+ " yıl ");
        System.out.println("Dozaj: " + kaplan.getDosage() + " ml");
        System.out.println("Yem verme Zamanı " + kaplan.getFeedSchedule() );

        System.out.println("*-*-*-*-*-*-*-*-*-*--*-*-**-*-*-*-*-**-*-*");

        System.out.println(" Hayvan Türü: " + fare.getTurAdi());
        System.out.println("Hayvan Ağırlığı: " + fare.getAgirlik());
        System.out.println("Hayvan Yaşı: "+fare.getYas()+ " yıl ");
        System.out.println("Dozaj: " + fare.getDosage() + " ml");
        System.out.println("Yem verme Zamanı " + fare.getFeedSchedule() );

        System.out.println("*-*-*-*-*-*-*-*-*-*--*-*-**-*-*-*-*-**-*-*");

        System.out.println(" Hayvan Türü: " + at.getTurAdi());
        System.out.println("Hayvan Ağırlığı: " + at.getAgirlik());
        System.out.println("Hayvan Yaşı: "+at.getYas()+ " yıl ");
        System.out.println("Dozaj: " + at.getDosage() + " ml");
        System.out.println("Yem verme Zamanı " + at.getFeedSchedule() );

        System.out.println("*-*-*-*-*-*-*-*-*-*--*-*-**-*-*-*-*-**-*-*");





    }

}
