public class Day8 {
    public static void main(String[] args) {
        // Deklarasi variabel, nama variabel dan tipe data belum memiliki nilai
        String nama;
        int umur;
        double tinggi;
        double berat;

        // Inisialisasi variabel, memberi nilai ke variabel
        nama = "Asipa Febriana";
        umur = 18;
        tinggi = 160.2;
        berat = 60;

        System.out.println("Nama\t\t\t:" + nama);
        System.out.println("Umur\t\t\t:" + umur + "tahun");
        System.out.println("Tinggi Badan\t:" + tinggi + "cm");
        System.out.println("BB saat ini\t\t:" + berat + "kg");

        // Update variabel, mengubah nilai variabel yang sudah ada
        berat -= 2;
        System.out.println("BB setelah Diet\t:" + berat + "kg");
    }
}
