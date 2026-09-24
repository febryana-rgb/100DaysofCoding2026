import java.util.Scanner;

public class Day23 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukan panjang sisi persegi\t: ");
        int  sisi = input.nextInt();

        int luas = sisi * sisi;

        System.out.println("Luas Persegi adalah\t\t: " + luas);

        input.close();
    } 
}
