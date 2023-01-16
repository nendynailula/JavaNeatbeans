/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_m08_5210411117;

/**
 *
 * @author USER
 */
public class GeneralManager extends Pegawai{
    private double dividen_saham;
    
    public GeneralManager(String no_pegawai, String nama
    , String alamat, String no_telp, double gaji_pokok, double dividen_saham) {
        super(no_pegawai, nama, alamat, no_telp, gaji_pokok);
        this.dividen_saham = dividen_saham;
    }

    public void setDividen_saham(double dividen_saham) {
        this.dividen_saham = dividen_saham;
    }

    public double getDividen_saham() {
        return dividen_saham;
    }
    
    public double hitungBonus() {
        double bonusGeneralManager;
        bonusGeneralManager =  0.25 * (getGaji_pokok() + getDividen_saham());
        
        return bonusGeneralManager;
    }
    
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Dividen Saham : Rp." +getDividen_saham());
        System.out.println("Bonus General Manager : Rp." + hitungBonus());
    }
}