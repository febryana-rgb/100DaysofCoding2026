public class Day14{
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int hasilPenjumlahan = a + b;
        int hasilPengurangan = a - b;

        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);
    }
}
