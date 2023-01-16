package pbo_m14_5210411117;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDB {
    private static Connection koneksi;

    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/db_pegawai";
                String user = "root";
                String pass = "";

                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, pass);
            }
            catch (SQLException e) {
                System.err.println("Koneksi error: " + e.getMessage());
            }
        }

        return koneksi;
    }
}
