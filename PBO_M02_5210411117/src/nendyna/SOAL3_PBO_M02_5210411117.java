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
public class SOAL3_PBO_M02_5210411117 {
    public static void main(String[] args) {
        //Deklarasi Variabel
        double clc,frt,rmr,kln;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai celcius yang akan di konversi = ");
        
        //Isi variabel
        clc = input.nextInt();
        frt = (clc*9/5)+32;
        rmr = clc*4/5;
        kln = clc+273.15;
        
        //Print 
        System.out.println("Fahrenheit : " + frt);
        System.out.println("Reamur : " + rmr);
        System.out.println("Kelvin : " + kln);
    }
    
}
