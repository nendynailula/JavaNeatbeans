/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_m06_5210411117;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class MAIN_PBO_M06_5210411117 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int menu = 0;
        do {
            System.out.println("=======================================");
            System.out.println("Pilih Menu : ");
            System.out.println("1. Pembuatan Segitiga");
            System.out.println("2. Pembuatan Persegi");
            System.out.println("3. Pembuatan Persegi Panjang");
            System.out.println("4. Keluar Program");
            System.out.print("Menu : ");
            menu = in.nextInt();
            System.out.println("=======================================");
            
            switch(menu) {
            case 1 -> {
                System.out.print("Alas Segitiga\t: ");
                double alas = in.nextDouble();
                System.out.print("Tinggi Segitiga\t: "); 
                double tinggi = in.nextDouble();
                String nama1 = "Segitiga";
                System.out.println("------------ Info Bangun2D ------------");

                Segitiga segitiga = new Segitiga(alas, tinggi, nama1);
                segitiga.cetakInfoSegitiga();

                menu = 0;
                }
            case 2 -> {
                System.out.print("Sisi Persegi\t: ");
                double sisi = in.nextDouble();
                String nama2 = "Persegi";
                System.out.println("------------ Info Bangun2D ------------");

                Persegi persegi = new Persegi(sisi, nama2);
                persegi.cetakInfoPersegi();
                
                menu = 0;
                }
            case 3 -> {
                System.out.print("Panjang Persegi Panjang\t: ");
                double panjang = in.nextDouble();
                System.out.print("Lebar Persegi Panjang\t: "); 
                double lebar = in.nextDouble();
                String nama3 = "Persegi Panjang";
                System.out.println("------------ Info Bangun2D ------------");

                PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar, nama3);
                persegiPanjang.cetakInfoPersegiPanjang();
                
                menu = 0;
                }
            case 4 -> {
                System.out.println("Sampai Jumpa Lagi... :-)");
                System.exit(0);
                }
            default -> {
                }
            }
        } while (menu != 1 && menu != 2 && menu != 3 && menu != 4);     
    }
}