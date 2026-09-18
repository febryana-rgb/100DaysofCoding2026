import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai Awal\t: ");
        int nilai = input.nextInt();

        nilai += 5;
        System.out.print("\nSetelah += 5 \t: " + nilai);

        nilai -= 3;
        System.out.print("\nSetelah -= 3 \t: " + nilai);

        nilai *= 4;
        System.out.print("\nSetelah *= 4 \t: " + nilai);

        nilai /= 2;
        System.out.print("\nSetelah /= 2 \t: " + nilai);

        nilai %= 5;
        System.out.print("\nSetelah %= 5 \t: " + nilai);

        input.close();
    }
