class Day2 {
    public static void main(String[] args) {
        String Nama = "Asipa Febriana";
        String NIM = "H0725005";
        String Prodi = "Pendidikan Teknologi Informasi";
        String Ttl = "Banyuasin, 21 Februari 2008";
        int Umur = 19;

        // println() untuk mencetak pindah otomatis ke baris berikutnya
        System.out.println("Nama             : " + Nama);
        System.out.println("NIM              : " + NIM);
        
        // print() untuk mencetak tidak pindah otomatis ke baris berikutnya
        System.out.print("Prodi            :");
        System.out.print(Prodi);
        System.out.println();

        // printf() untuk mencetak format specifier/format tertentu
        // %s untuk menampilkan tipe data string
        // %d untuk menampilkan tipe data bulat
        System.out.printf("Tempat/Tgl Lahir : %s%n", Ttl);
        System.out.printf("Umur             : %d tahun%n", Umur);
    }
}
