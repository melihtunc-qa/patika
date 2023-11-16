import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlıcan=5.0,toplamTutar;

        Scanner sc= new Scanner(System.in);

        System.out.println("armut kilo giriniz");
        double armut_kilo=sc.nextDouble();
        System.out.println("elma kilo giriniz");
        double elma_kilo=sc.nextDouble();
        System.out.println("domates kilo giriniz");
        double domates_kilo=sc.nextDouble();
        System.out.println("muz kilo giriniz");
        double muz_kilo=sc.nextDouble();
        System.out.println("patlıcan kilo giriniz");
        double patlıcan_kilo=sc.nextDouble();

        toplamTutar = armut_kilo*armut + elma_kilo*elma + domates_kilo*domates + patlıcan_kilo*patlıcan + muz_kilo*muz;

        System.out.println("toplam tutar : " + toplamTutar);





    }
}
