import java.util.Scanner;

public class KdvCalculate {
    public static void main(String[] args) {


        double tutar,kdvTutar,kdvliTutar,kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println(" tutar  giriniz :   ");

        tutar = input.nextDouble();

         kdvTutar = tutar * kdvOran ;
         kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz tutar:  " + tutar);

        System.out.println("KDV Oranı : " + kdvOran);

        System.out.println("KDV Tutarı : "+ kdvTutar);

        System.out.println("KDV'li tutar : " +  kdvliTutar);


    }
}