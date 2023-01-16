/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_m07_5210411117;

/**
 *
 * @author Nendy Nailul Autor
 */
public class Pegawai {
    protected String no_pegawai;
    protected String nama;
    protected String alamat;
    protected String no_telp;
    protected double gaji_pokok;
    
    public Pegawai(){}
    
    public Pegawai(String no_pegawai, String nama,
            String alamat, String no_telp, double gaji_pokok) {
        this();
        this.no_pegawai = no_pegawai;
        this.nama = nama;
        this.alamat = alamat;
        this.no_telp = no_telp;
        this.gaji_pokok = gaji_pokok;
    }

    public void setNo_pegawai(String no_pegawai) {
        this.no_pegawai = no_pegawai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public void setGaji_pokok(double gaji_pokok) {
        this.gaji_pokok = gaji_pokok;
    }

    public String getNo_pegawai() {
        return no_pegawai;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public Double getGaji_pokok() {
        return gaji_pokok;
    }
    
    public void cetakInfo() {
        System.out.println("No Pegawai : " +getNo_pegawai());
        System.out.println("Nama : " +getNama());
        System.out.println("Alamat : " +getAlamat());
        System.out.println("No.Telp : " +getNo_telp());
        System.out.println("Gaji Pokok : " +getGaji_pokok());
    }
}