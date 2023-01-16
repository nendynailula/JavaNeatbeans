package pbo_m13_5210411117;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class KoneksiDB {
    private static Connection koneksi;
    
    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/db_mahasiswa";
                String user = "root";
                String pass = "";

                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, pass);

                System.out.println("Koneksi Berhasil");
            } 
            catch (SQLException e) {
                System.out.println("Koneksi eror: " + e.getMessage());
            }
        }
        
        return koneksi;
    }
}
