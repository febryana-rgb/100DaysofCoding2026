//Mengambil class scanner dari package jave.util, yang digunakan untuk membaca input dari keyboard
import java.util.Scanner;

public class Day12{
    public static void main(String[] args) {
    // membuat objek scanner agar dapat membaca input dari keyboard
    Scanner input = new Scanner(System.in);

    System.out.println("===SILAHKAN ISI BIODATA ANDA===");

    // meminta pengguna agar memasukkan nama lengkap
        System.out.print("Nama Lengkap\t:");
        String nama = input.nextLine();
        System.out.println(nama);

    // meminta pengguna agar memasukkan Jenis Kelamin
        System.out.print("Jenis Kelamin (L/P) \t:");
        char jenisKelamin = input.nextLine().charAt(0);
        System.out.println(jenisKelamin);

    // meminta pengguna agar memasukkan Umur
        System.out.print("Umur\t:");
        int umur = input.nextInt();
        System.out.println(umur);

    // untuk membersihkan sisa Enter yang tertinggal setelah nextInt
        input.nextLine();

    // meminta pengguna agar memasukkan NIM
        System.out.print("NIM\t:");
        String nim = input.nextLine();
        System.out.println(nim);
    
    // meminta pengguna agar memasukkan Program Studi
        System.out.print("Program Studi\t:");
        String prodi = input.nextLine();
        System.out.println(prodi);

    // meminta pengguna agar memasukkan Fakultas
        System.out.print("Fakultas\t:");
        String fakultas = input.nextLine();
        System.out.println(fakultas);

    // meminta pengguna agar memasukkan Angkatan
        System.out.print("Angkatan\t:");
        short angkatan = input.nextShort();
        System.out.println(angkatan);

    // meminta pengguna agar memasukkan Status
        System.out.print("Mahasiswa Aktif (true/false)\t:");
        boolean status = input.nextBoolean();
        System.out.println(status);

    // untuk menutup scanner
        input.close();
    }
}
