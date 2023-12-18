package examples;

import java.util.Arrays;

public class ArraysCounter {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        Arrays.sort(dizi);

        int eleman = dizi[0];
        int frekans = 1;

        // Sıralı dizideki elemanları kontrol et ve frekansları hesapla
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] == eleman) {
                frekans++;
            } else {
                System.out.println(eleman + " sayısı " + frekans + " kere tekrar edildi.");
                eleman = dizi[i];
                frekans = 1;
            }
        }

        System.out.println(eleman + " sayısı " + frekans + " kere tekrar edildi.");
    }
}
