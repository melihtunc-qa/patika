package examples;

public class ArrayMatrix {

    public static void main(String[] args) {
        String [][] array = {{"a","b","c"},
                             {"d","e","f"}};

        String [][] transpoze = new String[array[0].length][array.length] ;

        for (int i = 0;i< array.length;i++){
            for (int j = 0 ; j<array[i].length;j++){
                transpoze[j][i]=array[i][j];
            }
        }

        System.out.println("Orjinal Dizi: ");
        yazdir(array);

        System.out.println();

        System.out.println("Transpoz Dizi:");
        yazdir(transpoze);

    }
    public static void yazdir(String[][] arr){
        for (int i = 0;i< arr.length;i++){
            for (int j = 0 ; j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


}
