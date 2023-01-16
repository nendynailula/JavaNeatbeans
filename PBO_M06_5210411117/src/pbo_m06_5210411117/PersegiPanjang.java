/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_m06_5210411117;

/**
 *
 * @author Nendy Nailul A
 */
public class PersegiPanjang extends Bangun2D{
    private double panjang;
    private double lebar;
    public PersegiPanjang(double panjang, double lebar, String nama){
        super(nama);
        setPanjang(panjang);
        setLebar(lebar);
        hitungLuasPersegiPanjang();
    }
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    public double getPanjang(){
        return this.panjang;
    }
    public void setLebar(double lebar){
        this.lebar = lebar;
    }
    public double getLebar(){
        return this.lebar;
    }
    public void hitungLuasPersegiPanjang(){
        double luas = getPanjang() * getLebar();
        super.setLuas(luas);
    }
    public void cetakInfoPersegiPanjang(){
        System.out.println("Nama Bangun2D\t\t: " + super.getNama());
        System.out.println("Panjang Persegi Panjang\t: " + getPanjang());
        System.out.println("Lebar Persegi Panjang\t: " + getLebar());
        System.out.println("Luas Persegi Panjang\t: " + super.getLuas());
    }
}

