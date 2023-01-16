/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_m06_5210411117;

/**
 *
 * @author Nendy Nailul Autor
 */
public class Bangun2D {
    protected String nama;
    protected double luas;
    public Bangun2D(){
    }
    public Bangun2D(String nama){
        setNama(nama);
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return this.nama;
    }
    public void setLuas(double luas){
        this.luas = luas;
    }
    public double getLuas(){
        return this.luas;
    }
    public void cetakInfoBangun2D(){
    }

}

