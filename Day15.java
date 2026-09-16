import java.util.Scanner;
public class Day15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // inputan dari pengguna
        System.out.print("Masukkan jumlah kotak apel\t:");
        int jumlahKotak = input.nextInt();

        System.out.print("Masukkan jumlah apel per kotak\t:");
        int jumlahApel = input.nextInt();

        System.out.print("Masukkan jumlah tetangga\t:");
        int jumlahTetangga = input.nextInt();

        // menghitung total seluruh apel menggunakan operator perkalian
        int totalApel = jumlahKotak * jumlahApel;

        // menghitung apel per tetangga menggunakan operator pembagian
        int apelPerTetangga = totalApel / jumlahTetangga;

        System.out.println("\n --- HASIL HITUNGAN ---");
        System.out.println("Total seluruh apel Pak Budi\t: " + totalApel + "buah");
        System.out.println("buah Setiap tetangga mendapatkan:" + apelPerTetangga + "buah");

        input.close();
    }
}
