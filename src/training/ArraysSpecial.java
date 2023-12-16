package training;

public class ArraysSpecial {

    public static void main(String[] args) {
        drawBWithStars(5);
    }

     static void drawBWithStars(int size) {

        char[][] matrix = new char[size][size];


        for (int i = 0;i<size;i++){
            for (int j = 0;j<size;j++){
                matrix[i][j] = ' ';
            }
        }

        for (int i = 0;i<size;i++){
            matrix[i][0]='*';
            matrix[i][size/2]='*';
            matrix[i][size-1]='*';
        }

        for (int j =1;j<size/2;j++){
            matrix[0][j]='*';
            matrix[size/2][j]='*';
            matrix[size-1][j]='*';

        }

        for (int i = 0;i<size;i++){
            for (int j = 0 ; j<size;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
