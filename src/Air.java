import java.util.Scanner;

public class Air {

    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);

        System.out.println("Sıcaklık giriniz");

        heat=input.nextInt();

        if (heat<5){
            System.out.println("Kayak yapabilirsiniz");
        }
        else if (heat>=5&&heat<=25) {
            if (heat<=15){
                System.out.println("sinemaya gidebilir");
            }
            if (heat>=10){
                System.out.println("pikniğe gidebilirsiniz");
            }
        }else {
            System.out.println("yüzmeye gidebilirsiniz");
        }
    }
}
