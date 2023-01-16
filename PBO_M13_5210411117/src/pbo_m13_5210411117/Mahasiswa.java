package pbo_m13_5210411117;

public class Mahasiswa {
    private String nama;
    private String nim;
    private int angkatan;
    private String smt;
    private String prodi;
    private int sks;
    
    public Mahasiswa(){
    }
    
    public Mahasiswa(String nama, String nim, int angkatan, String smt, String prodi, int sks){
        this.nama = nama;
        this.nim = nim;
        this.angkatan = angkatan;
        this.smt = smt;
        this.prodi = prodi;
        this.sks = sks;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public void setSmt(String smt) {
        this.smt = smt;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public String getSmt() {
        return smt;
    }

    public String getProdi() {
        return prodi;
    }

    public int getSks() {
        return sks;
    }
    
    // Cetak info
    public String cetakInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("* * * * * INFO MAHASISWA * * * * *");
        sb.append("\nNama\t: ").append(getNama());
        sb.append("\nNIM\t: ").append(getNim());
        sb.append("\nAngkatan\t: ").append(getAngkatan());
        sb.append("\nSemester\t: ").append(getSmt());
        sb.append("\nProdi\t: ").append(getProdi());
        sb.append("\nSKS\t: ").append(getSks()).append("\n");
        
        sb.append(cetakTagihanSPP());
        
        return sb.toString();
    }
    
    public String hitungSPPTetap(){
        double spp;
        switch (getProdi()) {
            case "Teknik Informatika":
                if (getAngkatan() <= 2019){
                    spp = 2050000;
                }
                else if (getAngkatan() == 2020){
                    spp = 2150000;
                }
                else{
                    spp = 2250000;
                }
                break;
            default:
                if (getAngkatan() <= 2019){
                    spp = 1650000;
                }
                else if (getAngkatan() == 2020){
                    spp = 1700000;
                }
                else{
                    spp = 1750000;
                }
        }

       return Double.toString(spp);
    }
    
    public String hitungSPPVariabel(){
        double sppVariable;
        switch (getProdi()) {
            case "Teknik Informatika":
                if (getAngkatan() <= 2019){
                    sppVariable = getSks() * 240000;
                }
                else if (getAngkatan() == 2020){  
                    sppVariable = getSks() * 245000;
                }               
                else{                    
                    sppVariable = getSks() * 250000;
                }
                break;
            default:
                if (getAngkatan() <= 2019){
                    sppVariable = getSks() * 170000;
                }
                else if (getAngkatan() == 2020){
                    sppVariable = getSks() * 180000;
                }
                else{
                    sppVariable = getSks() * 190000;
                }
                break;
        }
        
        return Double.toString(sppVariable);
    }
    
    public String hitungTotalSPP(){ 
        double sppTetap = Double.parseDouble(hitungSPPTetap());
        double sppVar = Double.parseDouble(hitungSPPVariabel());
        double totSPP = (sppTetap + sppVar);
        
        return Double.toString(totSPP);
    }
    
    public String cetakTagihanSPP(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n============ DATA TAGIHAN MAHASISWA ============");
        sb.append("\nSPP Tetap \t: Rp. ").append(hitungSPPTetap()).append("0");
        sb.append("\nSPP Variabel \t: Rp. ").append(hitungSPPVariabel()).append("0");
        sb.append("\nTotal Tagihan SPP Semester ini: Rp. ").append(hitungTotalSPP()).append("0");
        return sb.toString();
    }
          
}
