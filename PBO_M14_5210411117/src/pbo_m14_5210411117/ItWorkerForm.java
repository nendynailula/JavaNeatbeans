package pbo_m14_5210411117;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import java.awt.event.ItemListener;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;


public class ItWorkerForm extends javax.swing.JFrame {

    private Connection db;
    private DefaultTableModel model;
    
    
    public ItWorkerForm() {
        initComponents();
        
        db=KoneksiDB.getKoneksi();
        model=(DefaultTableModel) tabelpegawai.getModel();
        this.loadDataToTabel();
        
        initKomponenTambahan();
        
    }
    
    public ItWorkerForm(String Username){
        initComponents();
        
        db=KoneksiDB.getKoneksi();
        model=(DefaultTableModel) tabelpegawai.getModel();
        this.loadDataToTabel();
        
        initKomponenTambahan();
        
    }
    
    private void loadDataToTabel() {
        model.setRowCount(0);

        try {
            db = KoneksiDB.getKoneksi();
            Statement st = db.createStatement();

            String sql = "SELECT * FROM data_pegawai";

            ResultSet rs = st.executeQuery(sql);

            while(rs.next()) {
                Object[] data = new Object[4];
                data[0] = rs.getString("nama_pgw");
                data[1] = rs.getString("no_pgw");
                data[2] = rs.getString("posisi_pgw");
                data[3] = rs.getString("gaji_pgw");

                model.addRow(data);
            }

            rs.close();
            st.close();
        }
        catch (SQLException e) {
            System.err.println("Load data eror: " + e.getMessage());
        }
    }
    
    private void initKomponenTambahan(){
        txtGaji.setEditable(false);
        txtGaji.setBackground(Color.gray);
    }
    
    public void printAll() throws NoPegawaiHarus10DigitException,NamaHarusDiisiException,NoPegawaiHarusDiisiException{
        long nopegawai;
        try {
            nopegawai = Long.parseLong(txtNopegawai.getText());
        } 
        catch (NumberFormatException e) {
            throw new NoPegawaiHarus10DigitException();
        }
        if (txtNama.getText().equals("")){
            throw new NamaHarusDiisiException();
        }
        if (Long.toString(nopegawai).length() !=10){
            throw new NoPegawaiHarus10DigitException();
        }
        if (txtNopegawai.getText().equals("")){
            throw new NoPegawaiHarusDiisiException();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtNopegawai = new javax.swing.JTextField();
        cmbPosisi = new javax.swing.JComboBox<>();
        txtGaji = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelpegawai = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("IT Worker Form");

        btnExit.setBackground(new java.awt.Color(255, 102, 153));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel2.setText("Nama");

        jLabel3.setText("No. Pegawai");

        jLabel4.setText("Posisi");

        jLabel5.setText("Gaji (IDR)");

        cmbPosisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Senior Programmer", "Bussiness Analyst", "Data Center Officer", "Junior Programmer" }));
        cmbPosisi.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                switch (e.getItem().toString()) {
                    case "Senior Programmer":
                    txtGaji.setText("Rp 15.000.000");
                    break;
                    case "Bussiness Analyst":
                    txtGaji.setText("Rp 21.000.000");
                    break;
                    case "Data Center Officer":
                    txtGaji.setText("Rp 18.000.000");
                    break;
                    default:
                    txtGaji.setText("Rp 8.000.000");
                }
            }
        });
        cmbPosisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPosisiActionPerformed(evt);
            }
        });

        switch (cmbPosisi.getSelectedItem().toString()) {
            case "Senior Programmer":
            txtGaji.setText("Rp 15.000.000");
            break;
            case "Bussines Analyst":
            txtGaji.setText("Rp 21.000.000");
            break;
            case "Data Center Officer":
            txtGaji.setText("Rp 18.000.000");
            break;
            default:
            txtGaji.setText("Rp 8.000.000");
        }

        btnInsert.setBackground(new java.awt.Color(102, 204, 255));
        btnInsert.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInsert.setText("Insert");
        btnInsert.setToolTipText("");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(255, 255, 153));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        tabelpegawai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "NoPegawai", "Posisi", "Gaji"
            }
        ));
        tabelpegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelpegawaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelpegawai);

        btnDelete.setBackground(new java.awt.Color(0, 204, 51));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnInsert)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                                .addComponent(btnUpdate))
                            .addComponent(txtGaji)
                            .addComponent(txtNama)
                            .addComponent(txtNopegawai)
                            .addComponent(cmbPosisi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDelete)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNopegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbPosisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtGaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        
    try {
        this.printAll();
        
        try {
            db = KoneksiDB.getKoneksi();

            String sql = "INSERT INTO data_pegawai"
                    + "(nama_pgw,no_pgw,posisi_pgw,gaji_pgw) "
                    + "VALUES (?,?,?,?)";
            
            try (PreparedStatement ps = db.prepareStatement(sql)) {
                ps.setString(1, txtNama.getText());
                ps.setString(2, txtNopegawai.getText());
                ps.setString(3, cmbPosisi.getSelectedItem().toString());
                ps.setString(4, txtGaji.getText());
                
                int rowInsert = ps.executeUpdate();
                if (rowInsert > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil disimpan", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } 
        catch (SQLException e) {
            System.err.println("Insert data eror: " + e.getMessage());
        }
        finally {
            // Load tabel mahasiswa untuk melihat perubahan
            this.loadDataToTabel();
        }
    } 
    catch (NamaHarusDiisiException e) {
        JOptionPane.showMessageDialog(rootPane, e.getMessage());
    }  
    catch (NoPegawaiHarusDiisiException e) {
        JOptionPane.showMessageDialog(rootPane, e.getMessage());
    }
    catch (NoPegawaiHarus10DigitException e) {
        JOptionPane.showMessageDialog(rootPane, e.getMessage());
    }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            db = KoneksiDB.getKoneksi();

            String sql = "DELETE FROM data_pegawai "
                    + "WHERE no_pgw=?;";
            
            try (PreparedStatement ps = db.prepareStatement(sql)) {
                ps.setString(1, txtNopegawai.getText());
                
                int rowInsert = ps.executeUpdate();
                if (rowInsert > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } 
        catch (SQLException e) {
            System.err.println("Delete data eror: " + e.getMessage());
        }
        finally {
            // Load tabel mahasiswa untuk melihat perubahan
            this.loadDataToTabel();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            db = KoneksiDB.getKoneksi();
            
            String sql= "UPDATE data_pegawai "
                    +"SET nama_pgw=?, posisi_pgw=?, gaji_pgw=?"
                    +"WHERE no_pgw=?;";
            
            try (PreparedStatement ps = db.prepareStatement(sql)) {
                ps.setString(1, txtNama.getText());
                ps.setString(4, txtNopegawai.getText());
                ps.setString(2, cmbPosisi.getSelectedItem().toString());
                ps.setString(3, txtGaji.getText());
                
                
                int rowInsert = ps.executeUpdate();
                if (rowInsert > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil diperbarui", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } 
        catch (SQLException e) {
            System.err.println("Update data eror: " + e.getMessage());
        }
        finally {
            // Load tabel mahasiswa untuk melihat perubahan
            this.loadDataToTabel();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tabelpegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelpegawaiMouseClicked
        int rowIdx = tabelpegawai.getSelectedRow();

        // Tampilkan data ke form
        
        String nopegawai = tabelpegawai.getValueAt(rowIdx, 1).toString();
        txtNopegawai.setText(nopegawai);
        
        String nama = tabelpegawai.getValueAt(rowIdx, 0).toString();
        txtNama.setText(nama);


        String posisi = tabelpegawai.getValueAt(rowIdx, 2).toString();
        switch (posisi) {
            case "Senior Programmer" -> {
                cmbPosisi.setSelectedIndex(0);
                txtGaji.setText("Rp 15.000.000");
            }
            case "Bussiness Analyst" -> {
                cmbPosisi.setSelectedIndex(1);
                txtGaji.setText("Rp 21.000.000");
            }
            case "Data Center Officer" -> {
                cmbPosisi.setSelectedIndex(2);
                txtGaji.setText("Rp 18.000.000");
            }
            default -> {
                    cmbPosisi.setSelectedIndex(3);
                    txtGaji.setText("Rp 8.000.000");
            }
        }
    }//GEN-LAST:event_tabelpegawaiMouseClicked

    private void cmbPosisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPosisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPosisiActionPerformed
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ItWorkerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItWorkerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItWorkerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItWorkerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItWorkerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbPosisi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tabelpegawai;
    private javax.swing.JTextField txtGaji;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNopegawai;
    // End of variables declaration//GEN-END:variables
}