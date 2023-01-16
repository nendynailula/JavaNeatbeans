/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_m08_5210411117;

/**
 *
 * @author Nendy Nailul Autor
 */
public class Manager extends Pegawai {
    private double tunjangan_lembur;
    
    public Manager(String no_pegawai, String nama, String alamat,
            String no_telp, double gaji_pokok, double tunjangan_lembur) {
        super(no_pegawai, nama, alamat, no_telp, gaji_pokok);
        this.tunjangan_lembur = tunjangan_lembur;
    }

    public void setTunjangan_lembur(double tunjangan_lembur) {
        this.tunjangan_lembur = tunjangan_lembur;
    }

    public double getTunjangan_lembur() {
        return tunjangan_lembur;
    }
    
    public double hitungBonus() {
        double bonusManager;
        bonusManager = (0.1 * getGaji_pokok()) + getTunjangan_lembur();
        
        return bonusManager;
    }
    
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Tunjangan Lembur : Rp." +getTunjangan_lembur());
        System.out.println("Bonus Manager : Rp." +hitungBonus());
    }
    
}