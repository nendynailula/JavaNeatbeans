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
public class PBO_M03_5210411117CONTOH2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input nilai : ");
        int nilai = sc.nextInt();
        
        if (nilai >= 0 && nilai < 75) {
            System.out.println("maaf anda belum lolos");
                
            //cabang baru
            if (nilai <40) {
                System.out.println("grade : kurang");
            }
            else {
                System.out.println("grade : cukup");
            }
            //percabangan switch
            System.out.print("apakah anda akan ikut tes ulang?");
            String jawab = sc.next();
            
            switch (jawab) {
                case "y":
                    System.out.println("anda terdaftar untuk ujian ulang");
                        break;
                default:
                    System.out.println("anda tidak terdaftar ujian ulang");
                        
            }
                
        }
        else if (nilai <=100) {
            System.out.println("Anda lolos");
            
            //cabang baru
            if (nilai >90){
                System.out.println("grade baik sekali");
            }
        }
        else {
            System.out.println("maaf nilai anda tidak valid");
        }
        System.out.println("program selesai");
    }
    
}
