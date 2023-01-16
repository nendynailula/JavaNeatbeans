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
public class SOAL03_PBO_M03_5210411117 {
    public static void main(String[] args) {
        int a,b;
        a = 6;
        System.out.println("Nilai Awal a = " + a);
        b = -3;
        System.out.println("Nilai awal b = " + b);
        if((a+b)>=(b-a)){
            a +=2;
            b +=a;
        }
        if(a % 2 == 0){
            a = b;
        }else {
            b += a+1;
        }a = -b -a;
         System.out.println("Nilai Akhir a = " + a);
         System.out.println("Nilai Akhir b = " + b);
    }
    
}
