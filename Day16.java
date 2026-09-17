import java.util.Scanner;

public class Day16{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // inputan dari pengguna
        System.out.print("Masukkan Kelereng Rasya\t: ");
        int kelereng = input.nextInt();

        int sisaKelereng = kelereng % 3;

        System.out.print("Sisa Kelereng Rasya\t: " + sisaKelereng);
        
        input.close();
    }
}
