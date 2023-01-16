package pbo_m14_5210411117;

public class Pegawai {
    
    private String nama;
    private String nopegawai;
    private String posisi;
    private String gaji;
    
    public Pegawai(){}

    public Pegawai(String nama, String nopegawai, String posisi, String gaji) {
        this.nama = nama;
        this.nopegawai = nopegawai;
        this.posisi = posisi;
        this.gaji = gaji;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNopegawai(String nopegawai) {
        this.nopegawai = nopegawai;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public void setGaji(String gaji) {
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public String getNopegawai() {
        return nopegawai;
    }

    public String getPosisi() {
        return posisi;
    }

    public String getGaji() {
        return gaji;
    }  
}