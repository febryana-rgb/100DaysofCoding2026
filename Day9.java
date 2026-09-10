public class Day9 {
    public static void main(String[] args){
     /*konstanta (final variabel), bersifat tetap dan tidak dapat di ubah setelah diberi nilai awal, variabel konstanta ditulis menggunakan huruf kapital agar mudah dibedakan dengan variabel biasa*/
     final String PRODI = "Pendidikan Teknologi Informasi";
     final double UKT = 1500000;
     
     System.out.println("Program Studi\t:" + PRODI);
     // %f untuk menampilkan tipe data pecahan
     //.0 agar angka dibelakang koma tidak tampil
     System.out.printf("Nominal UKT\t\t: Rp %,.0f\n", UKT);

     //UKT = 2000000; <-- error
    }
}
