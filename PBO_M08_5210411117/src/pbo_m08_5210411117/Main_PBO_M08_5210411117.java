/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_m08_5210411117;
import java.util.Scanner;
/**
 *
 * @author Nendy Nailul Autor
 */
public class Main_PBO_M08_5210411117 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        boolean loop = true;
        
        Manager[] listM;
        listM = new Manager[5];
        GeneralManager[] listGM;
        listGM = new GeneralManager[5];
        
        do {
            System.out.println("\nSistem Informasi Pegawai");
            System.out.println("==========================");
            System.out.println("1. Tambah Data Manager");
            System.out.println("2. Tambah Data General Manager");
            System.out.println("3. Tampil Seluruh Data Pegawai");
            System.out.println("4. Keluar Program");
            System.out.println("==========================");
            
            System.out.println("Menu :");
            int menu = Integer.parseInt(sc.nextLine());
            
            switch (menu) {
                case 1 -> {
                    System.out.println("\nInput Data Manager");
                    System.out.println("No.Pegawai : ");
                    String no_pegawai = sc.nextLine();
                    System.out.println("Nama : ");
                    String nama = sc.nextLine();
                    System.out.println("Alamat : ");
                    String alamat = sc.nextLine();
                    System.out.println("No.Telepon : ");
                    String no_telp = sc.nextLine();
                    System.out.println("Gaji Pokok : ");
                    double gaji_pokok = Double.parseDouble(sc.nextLine());
                    System.out.println("Tunjangan Lembur : ");
                    double tunjangan_lembur = Double.parseDouble(sc.nextLine());
                        
                    Manager manager = new Manager(no_pegawai, nama, alamat,
                            no_telp, gaji_pokok, tunjangan_lembur);
                    
                    for (int i = 0; i < listM.length; i++) {
                        System.out.println("\nIndex : " + i);
                        if(listM[i] == null) {
                            listM[i] = manager;
                            break;
                        }       
                    } 
                }
                case 2 -> {
                    System.out.println("\nInput Data General Manager");
                    System.out.println("No Pegawai : ");
                          String no_pegawai = sc.nextLine();
                          System.out.println("Nama : ");
                          String nama = sc.nextLine();
                          System.out.println("Alamat :");
                          String alamat = sc.nextLine();
                          System.out.println("No.Telepon :");
                          String no_telp = sc.nextLine();
                          System.out.println("Gaji Pokok : ");
                          double gaji_pokok = Double.parseDouble(sc.nextLine());
                          System.out.println("Dividen Saham : ");
                          double dividen_saham = Double.parseDouble(sc.nextLine());
                          GeneralManager gm = new GeneralManager(no_pegawai,
                                  nama, alamat, no_telp, gaji_pokok, dividen_saham);
                          for (int i = 0; i < listGM.length; i++) {
                              System.out.println("\nIndex" + i);
                              if(listGM[i] == null) {
                                  listGM[i] = gm;
                                  break;
                        }         
                    }
                }
                case 3 -> {
                    System.out.println("\nDaftar Data Manager");
                    for (int i = 0; i < listM.length; i++) {
                        if(listM[i] != null) {
                            Manager mgr = listM[i];
                            System.out.println(i+1+"."+"\tNo.Pegawai\t\t : " +mgr.getNo_pegawai());
                            System.out.println("\tNama\t\t\t : " + mgr.getNama());
                            System.out.println("\tAlamat\t\t\t : " + mgr.getAlamat());
                            System.out.println("\tNo.Telepon\t\t : " + mgr.getNo_telp());
                            System.out.println("\tGaji Pokok\t\t : Rp." + mgr.getGaji_pokok());
                            System.out.println("\tTunjangan Lembur\t : Rp." + mgr.getTunjangan_lembur());
                            System.out.println("\tBonus\t\t\t : Rp." + mgr.hitungBonus());                 
                        }                
                    }        
                    System.out.println("\nDaftar Data General Manager");
                    for (int i = 0; i < listGM.length; i++) {
                        if(listGM[i] != null) {
                            GeneralManager gmanager = listGM[i];
                            System.out.println(i+1+"."+"\tNo.Pegawai\t\t : " +gmanager.getNo_pegawai());
                            System.out.println("\tNama\t\t\t : " + gmanager.getNama());
                            System.out.println("\tAlamat\t\t\t : " + gmanager.getAlamat());
                            System.out.println("\tNo.Telepon\t\t : " + gmanager.getNo_telp());
                            System.out.println("\tGaji Pokok\t\t : Rp." + gmanager.getGaji_pokok());
                            System.out.println("\tDividen Saham\t\t : Rp." + gmanager.getDividen_saham());
                            System.out.println("\tBonus General Manager\t : Rp." + gmanager.hitungBonus());
                        }    
                    }
                }
                case 4 -> {
                    System.out.println("You're Signed Out...");
                    loop = false;
                }
            }    
        }while(loop!=false);
    }
}
