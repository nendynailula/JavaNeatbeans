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
public class PBO_M03_5210411117CONTOH {
    public static void main(String[] args){
        int a, b;
        int hasil;
        String operator;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        
        System.out.print("operator : ");
        operator = sc.next();
        
        //percabangan switch
        switch (operator){
            case "+":
                //statement 1
                hasil = a+b;
                System.out.println("a + b = " + hasil);
                break;
            case "-":
                //statement 2
                hasil = a-b;
                System.out.println("a - b = " + hasil);
                break;
            default :
                //statement default
                System.out.println("OPERATOR TIDAK TERSEDIA");
        }
        
        System.out.println("Program selesai");
    }
    
}
