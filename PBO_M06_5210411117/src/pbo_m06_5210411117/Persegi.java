/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_m06_5210411117;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Persegi extends Bangun2D{    
    private double sisi;
    public Persegi(double sisi, String nama){
        super(nama);
        setSisi(sisi);
        hitungLuasPersegi();
    }
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    public double getSisi(){
        return this.sisi;
    }
    public void hitungLuasPersegi(){
        double luas = getSisi() * getSisi();
        super.setLuas(luas);
    }
    public void cetakInfoPersegi(){
        System.out.println("Nama Bangun2D\t: " + super.getNama());
        System.out.println("Sisi Persegi\t: " + getSisi());
        System.out.println("Luas Persegi\t: " + super.getLuas());
    }
}
