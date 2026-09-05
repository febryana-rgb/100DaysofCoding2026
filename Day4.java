public class Day4 {
    public static void main(String[] args) {
        // tipe data numerik bilangan bulat byte 8 bit, digunakan untuk angka yang sangat kecil
        byte umur = 18;
        System.out.printf("Umur\t\t\t\t: %d Tahun\n", umur);

        // tipe data numerik bilangan bulat short 16 bit, digunakan untuk angka yang kecil
        short tahunLahir = 2008;
        System.out.printf("Tahun Lahir\t\t\t: %d\n", tahunLahir);

        // tipe data numerik bilangan bulat int 32 bit, digunakan untuk angka sedang, artinya tidak terlalu kecil dan juga tidak terlalu besar
        int jumlahMahasiswaKlsPTIA = 32;
        System.out.printf("Jumlah Mahasiswa Kelas PTI A\t: %d Mahasiswa\n", jumlahMahasiswaKlsPTIA); 

        // tipe data numerik bilangan bulat long 64 bit, digunakan untuk angka yang sangat besar
        long saldoTabungan = 1000000000000L;
        System.out.printf("Saldo Tabungan Saat Ini\t\t: Rp %,d\n", saldoTabungan);
    }
}
