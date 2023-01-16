/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nendyna;

import java.util.Scanner;

/**
 NPM : 5210411117
 NAMA : NENDY NAILUL AUTOR
 */
public class PBO_M02_5210411117 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("pertemuan sesi kedua");//ini juga komentar
        
        //variabel
        String nama = "nendy";
        
        int umur ;
        umur = 18;
        
        //tipedata
        boolean isAdmin = false;
        
        Byte angkaByte = 127;
        Short angkaShort = 32767;
        
        int angka = 40000 ;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Max int : " + maxInt);
        
        Long angkaLong = 9223372036854775807L;
        System.out.println("Max Long " + Long.MAX_VALUE);
        
        float angkaFloat = 4.67F;
        double angkaDouble = 3.14 ;
        
        char karakter = '7';
        
        //string
        String pesan = "selamat belajar";
        System.out.println(pesan);
        
        //menggabungkan string
        //String pesan2 = pesan + " OOP java";
        String pesan2 = pesan.concat(" OOP java sesi 1");
        System.out.println("pesan kedua " + pesan2);
        
        //Transformasi string
        System.out.println("Upper Case : " + pesan2.toUpperCase());
        String tempPesan = pesan2.toLowerCase();
        System.out.println("Lower Case : " + tempPesan);
        
        // MENYISIPKAN KARAKTER
        String kalimat = "\nkelas PBO \"Dua\" sesi 1.";
        System.out.println(kalimat);
        
        //casting
        int nilaiInt = 12;
        double nilaiDouble = nilaiInt;
        System.out.println(" Int : " + nilaiInt + ", Double : " + nilaiDouble);
        
        double number = 89.68;
        int numberInt = (int) number;
        System.out.println("Double : " + number + ". Int : " + numberInt);
        
        //konversi
        String bilangan_1 = "17";
        int bil_int = Integer.parseInt(bilangan_1);
        system.out.println(bil_int);
        double bil_double = Double.parseDouble(bilangan_1);
        System.out.println(bil_double);
        
        // operator aritmatika
        int a=7, b=4;
        System.out.println("a + b = " + (a+b));    
        System.out.println("a / b = " + (a/b));
        
        
        //operator Assigment
        double c= 3.67;
        c *= 2;//c = c *2
        System.out.println("c *= 2 : " + c);
        
        //operator Relational
        String kota1 = "jogja", kota2 = "Jogja";
        System.out.println("jogja == Jogja" + (kota1 == null ? kota2 == null : kota1.equals(kota2)));
        System.out.println("jogja == Jogja" + (kota1 != kota2));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a > b : " + (a > b));
        
        //Operator Logika
        boolean exp1 = true, exp2 = false;
        System.out.println("exp1 && exp2 : " + (exp1 && exp2 && true));
        System.out.println("exp1 && true : " + (exp1 && true));
        System.out.println("exp1 || exp2 || false: " + (exp1 || exp2 || false));
        System.out.println("exp2 || false: " + (exp2 || false));
        System.out.println("NOT exp1 : " + (!exp1));
        System.out.println("NOT exp2 : " + (!exp2));
        
        //operator unary
        a++;
        System.out.println("a++ = " + a);
        b--;
        System.out.println("b-- = " + b);
        
        // operator ternary
        boolean isAdmin ;
        String result = 8 < 3 ? "True" : "False";
        System.out.println("Result = " + result);
        
        //input keyboard
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nama : ");
        nama = sc.nextLine();
        System.out.print("Umur : ");
        umur =  sc.nextInt();
        System.out.print("Nilai : ");
        double nilai = sc.nextDouble();
        
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Nilai : " + nilai);
    }
    
}
