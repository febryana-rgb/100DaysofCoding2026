//Mengambil class scanner dari package jave.util, yang digunakan untuk membaca input dari keyboard
import java.util.Scanner;

public class Day11{
    public static void main(String[] args) {
        // membuat objek scanner agar dapat membaca input dari keyboard
        Scanner input = new Scanner(System.in);

        // meminta pengguna agar memasukkan nama lengkap
        System.out.print("Nama Lengkap\t:");
        // membaca inputan dan disimpan ke dalam tipe data string
        String nama = input.nextLine();
        System.out.println(nama);

        // meminta pengguna agar memasukkan Umur
        System.out.print("Umur\t:");
        // membaca inputan dan disimpan ke dalam tipe data int
        int umur = input.nextInt();
        System.out.println(umur);

        //untuk membersihkan sisa Enter yang tertinggal setelah nextInt
        input.nextLine();

        // meminta pengguna agar memasukkan Jenis Kelamin
        System.out.print("Jenis Kelamin\t:");
        // membaca inputan dan disimpan ke dalam tipe data char
        char jenisKelamin = input.nextLine().charAt(0);
        System.out.println(jenisKelamin);

        // meminta pengguna agar memasukkan Tinggi Badan
        System.out.print("Tinggi Badan\t:");
        // membaca inputan dan disimpan ke dalam tipe data float
        float tb = input.nextFloat();
        System.out.println(tb);

        // meminta pengguna agar memasukkan No HP
        System.out.print("No. Hp\t:");
        // membaca inputan dan disimpan ke dalam tipe data long
        long noHp = input.nextLong();
        System.out.println(noHp);
        
        // meminta pengguna agar memasukkan Angkatan
        System.out.print("Tahun Angkatan\t:");
        // membaca inputan dan disimpan ke dalam tipe data short
        short angkatan = input.nextShort();
        System.out.println(angkatan);

        // meminta pengguna agar memasukkan Semester
        System.out.print("Semester\t:");
        // membaca inputan dan disimpan ke dalam tipe data byte
        byte semester = input.nextByte();
        System.out.println(semester);

        // meminta pengguna agar memasukkan IPK
        System.out.print("IPK\t:");
        // membaca inputan dan disimpan ke dalam tipe data double
        double ipk = input.nextDouble();
        System.out.println(ipk);

        // meminta pengguna agar memasukkan Status
        System.out.print("Sudah Lulus\t:");
        // membaca inputan dan disimpan ke dalam tipe data boolean
        boolean status = input.nextBoolean();
        System.out.println(status);

        // untuk menutup scanner
        input.close();
    }
}
