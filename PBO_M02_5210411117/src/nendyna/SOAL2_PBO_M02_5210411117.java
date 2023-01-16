/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nendyna;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class SOAL2_PBO_M02_5210411117 {
    public static void main(String[] args) {
        //Deklarasi variabel
        int x=2022,y=2003;
        
        //sebelum ditukar nilai
        System.out.println("Sebelum ditukar nilai variabelnya : ");
        System.out.println("x : " + x);
        System.out.println("y : " + y);
        
        //XOR
        x = x^y;
        y = x^y;
        x = x^y;
        
        //sesudah ditukar nilai
        System.out.println("Sesudah ditukar nilai variabelnya : ");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
    
}
