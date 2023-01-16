/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nendyna;
import java.util.Scanner;
/**
 *
 * @author nendyna
 */
public class PBO_M03_5210411117 {
    public static void main(String[] args) {
        //contoh percabangan
        //String kota = "jogja";
        int nilai = 10;
        
        //if (kota.equalsIgnoreCase("jogja")|| kota.equalsIgnoreCase("jogjakarta"))
        if (nilai < 0){
            //statement
            System.out.println("Nilai adalah bilangan negatif");
            //System.out.println(kota+"sama dengan jogja");
        }
        //else if (kota.equalsIgnoreCase("sleman")){  
        else if (nilai >0){
            //statement
            System.out.println("Nilai adalah bilangan positif");
            //System.out.println(kota+" sama dengan sleman");
        }
        //else if (kota.equalsIgnorecase("bantul")){
        else {
            //statement alternatif
            //System.out.println(kota+ "sama dengan kulonprogo");
            System.out.println("Nilai adalah 0");
        }
        System.out.println("program selesai");
    }    
}
