import java.util.Scanner;
public class Day22 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai pertama\t: ");
        int pertama = input.nextInt();

        System.out.print("Masukkan nilai kedua\t: ");
        int kedua = input.nextInt();

        System.out.println("Sebelum di tukar: nilai pertama = " + pertama + ", nilai kedua =" + kedua);

        int sebelum = pertama;
        pertama = kedua;
        kedua = sebelum;

        System.out.println("Sesudah di tukar: nilai pertama = " + pertama + ", nilai kedua =" + kedua);

        input.close();
    }
}
