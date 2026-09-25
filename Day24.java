import java.util.Scanner;
public class Day24 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("=== PROGRAM MENGHITUNG LUAS TAMAN ===");
        System.out.print("Masukkan panjang taman (meter)\t: ");
        double panjangTaman = input.nextDouble();

        System.out.print("Masukkan lebar taman (meter)\t: ");
        double lebarTaman = input.nextDouble();

        double luasTaman = panjangTaman * lebarTaman;

        System.out.println("\n----------------------------");
        System.out.println("Hasil Perhitungan:");
        System.out.println("Panjang Taman\t: " + panjangTaman + " m");
        System.out.println("Lebar Taman\t: " + lebarTaman + " m");
        System.out.println("Luas Taman\t: " + luasTaman + " m2");
        System.out.println("==================");

        input.close();
    }
}
