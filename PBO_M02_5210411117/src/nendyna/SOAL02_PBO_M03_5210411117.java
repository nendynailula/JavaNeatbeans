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
public class SOAL02_PBO_M03_5210411117 {
    public static void main(String[] args) {
        double bbi = 0.0D;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Tinggi Badan : ");
        int tb = sc.nextInt();
        System.out.print("Masukan Berat Badan : ");
        int bb = sc.nextInt();
        System.out.print("Masukan Jenis Kelamin : ");
        String jk = sc.next();
        
        switch (jk) {
            case "pria" -> {
                //statement
                bbi = (tb - 100) - (tb - 100)* 0.1D;
                System.out.println("Berat Badan Ideal Pria = " + bbi);
            }
            case "wanita" -> {
                //statement
                bbi = (tb-100) - (tb-100)* 0.15D;
                System.out.println("Berat Badan Ideal Wanita = " + bbi);
            }
            default -> {
            }
        }
            if (bb == bbi){
            System.out.println("Berat Badan Ideal" );
            }else {
            System.out.println("Berat Badan Tidak Ideal");
        }
            System.out.println("Program Selesai");
    }
    
}
