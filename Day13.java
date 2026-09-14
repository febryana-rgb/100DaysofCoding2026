import java.util.Scanner;

public class Day13{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama\t\t\t\t\t:");
        String nama = input.nextLine();

        System.out.print("NIM\t\t\t\t\t:");
        String nim = input.nextLine();

        System.out.print("Tinggi Badan\t\t\t\t:");
        double tb = input.nextDouble();

        System.out.print("Berat Badan\t\t\t\t:");
        double bb = input.nextDouble();

        System.out.print("Status Mahasiswa (\"true\" atau \"false\"\t:");
        boolean status = input.nextBoolean();
        
        System.out.println("\nNama\t\t\t\t\t:" + nama);
        System.out.println("NIM\t\t\t\t\t:" + nim);
        System.out.println("Tinggi Badan\t\t\t\t:" + tb + "cm");
        System.out.println("Berat Badan\t\t\t\t:" + bb + "kg");
        System.out.print("Status Mahasiswa (\"true\" atau \"false\"\t:" + status);

        input.close();
    }
}
