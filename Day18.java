public class Days18 {
    public static void main(String[] args) {
        byte nilaiByte = 21;

        // konversi otomatis dari tipe data byte ke tipe data short
        short nilaiShort = nilaiByte;

        // konversi otomatis dari tipe data short ke tipe data int
        int nilaiInt = nilaiShort;

        // konversi otomatis dari tipe data int ke tipe data long
        long nilaiLong = nilaiInt;

        // konversi otomatis dari tipe data long ke tipe data float
        float nilaiFloat = nilaiLong;

        // konversi otomatis dari tipe data float ke tipe data double
        double nilaiDouble = nilaiFloat;

        // konversi otomatis dari tipe data chart ke tipe data int
        char inisial = 'A';
        int kodeInisial = inisial;

        // tipe data boolean hanya bernilai true/ false
        boolean statusBoolean = true;


        System.out.println("=== Konversi Otomatis Tipe Data Kecil ke Tipe Data Besar ===");
        System.out.println("Tipe Data byte\t: " + nilaiByte);
        System.out.println("Tipe Data short\t: " + nilaiShort);
        System.out.println("Tipe Data int\t: " + nilaiLong);
        System.out.println("Tipe Data long\t: " + nilaiLong);
        System.out.println("Tipe Data float\t: " +  nilaiFloat);
        System.out.println("Tipe Data double: " + nilaiDouble);
        // Hasil Konversi tipe data char ke tipe data int
        System.out.println("\nTipe Data char sebelum konversi \t: " + inisial);
        System.out.println("Konversi Tipe Data char ke tipe data int\t: " + kodeInisial);

        // Hasil tipe data boolean yang bernilai true
        System.out.println("Tipe Data boolean\t: " + statusBoolean);
    }
}
