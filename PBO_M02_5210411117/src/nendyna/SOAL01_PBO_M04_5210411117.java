/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nendyna;
import java.util.Scanner;
/**
 *
 * @author NENDY NAILUL AUTOR 
 */
public class SOAL01_PBO_M04_5210411117 {
    public static void main(String[] args) {
        int [] array = {55, 31, 92, 36, 73};
        int menu = 0;
        
        Scanner in;
        in = new Scanner(System.in);
        do {
            System.out.println("==============================");
            System.out.println("PILIH MENU 1 SAMPAI 4");
            menu = in.nextInt();
            System.out.println("==============================");
            
            switch(menu){
                case 1 -> { 
                    System.out.print("Nilai Array : ");
                    for (int i = 0; i < array.length; i++){
                        System.out.print(array[i] + " ");
                    }
                    System.out.println();
                    menu = 0;
                }
                case 2 -> {
                    System.out.println("Nilai pangkat : ");
                    int nilaiPangkat = in.nextInt();
                    for (int i = 0; i < array.length; i++) {
                        array[i] = (int) Math.pow(array[i], nilaiPangkat);
                        System.out.println(array[i]+ "");
                    }
                    System.out.println();
                    menu = 0;
                }
                case 3 -> {
                    System.out.println("Inputkan Bilangan yang mau dicari ! ");
                    System.out.print("Bilangan pertama : ");
                    int BilanganPertama = in.nextInt();
                    System.out.print("Bilangan kedua : ");
                    int BilanganKedua= in.nextInt();
                    System.out.println();
                
                    int ditemukan = 0;
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] == BilanganPertama) {
                            System.out.println("Data Bilangan Pertama (" + BilanganPertama + ") yang Anda cari ditemukan di dalam Array dan berada pada indeks ke-" + i);
                            ditemukan = 1;
                            break;
                        }
                    }
                    if (ditemukan != 1) {
                        System.out.println("Data Bilangan Pertama (" + BilanganPertama + ") yang Anda cari TIDAK ditemukan di dalam Array");
                    }
                    ditemukan = 0;
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] == BilanganKedua) {
                            System.out.println("Data Bilangan Kedua (" + BilanganKedua+ ") yang Anda cari ditemukan di dalam Array dan berada pada indeks ke-" + i);
                            ditemukan = 2;
                            break;
                        }
                    }
                    if (ditemukan != 2) {
                        System.out.println("Data Bilangan Kedua (" + BilanganKedua + ") yang Anda cari TIDAK ditemukan di dalam Array");
                    }
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