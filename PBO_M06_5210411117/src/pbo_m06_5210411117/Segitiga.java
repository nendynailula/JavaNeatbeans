/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_m06_5210411117;

/**
 *
 * @author USER
 */
public class Segitiga extends Bangun2D {   
    private double alas;
    private double tinggi;
    public Segitiga(double alas, double tinggi, String nama){
        super(nama);
        setAlas(alas);
        setTinggi(tinggi);
        hitungLuasSegitiga();
    }
    public void setAlas(double alas){
        this.alas = alas;
    }
    public double getAlas(){
        return this.alas;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double getTinggi(){
        return this.tinggi;
    }
    public void hitungLuasSegitiga(){
        double luas = (getAlas() * getTinggi()) / 2;
        super.setLuas(luas);
    }
    public void cetakInfoSegitiga(){
        System.out.println("Nama Bangun2D\t: " + super.getNama());
        System.out.println("Alas Segitiga\t: " + getAlas());
        System.out.println("Tinggi Segitiga\t: " + getTinggi());
        System.out.println("Luas Segitiga\t: " + super.getLuas());
    }
}