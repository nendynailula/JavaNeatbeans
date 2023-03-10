package pbo_m13_5210411117;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import pbo_m13_5210411117.Mahasiswa;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SimpleSPP extends javax.swing.JFrame {
    
    private Connection db;
    
    // TODO: ADD variabel default tabel model
    
    public SimpleSPP() {
        initComponents();
        // Set label User
        lblUser.setText("John Doe");
        
        // Komponen tambahan
        initKomponenTambahan();
    }
    
    public SimpleSPP (String username){
        initComponents();
        // Set label User
        lblUser.setText(username);
        
        // Komponen tambahan
        initKomponenTambahan();
    }
    
    private void initKomponenTambahan() {
        bgProgramStudi.add(rbTF);
        bgProgramStudi.add(rbTI);
        // Sembunyikan kolom ID Mhs
        tabelMahasiswa.getColumnModel().getColumn(6).setMinWidth(0);
        tabelMahasiswa.getColumnModel().getColumn(6).setMaxWidth(0);
        model = (DefaultTableModel) tabelMahasiswa.getModel();
        this.loadDataToTabel();
        txtSemester.setEditable(true);
    }
    
    private DefaultTableModel model;
    
    private void loadDataToTabel() {
        model.setRowCount(0);

        try {
            db = KoneksiDB.getKoneksi();
            Statement st = db.createStatement();

            String sql = "SELECT * FROM data_mahasiswa";

            ResultSet rs = st.executeQuery(sql);

            while(rs.next()) {
                Object[] data = new Object[7];
                data[0] = rs.getString("nama_mhs");
                data[1] = rs.getString("nim_mhs");
                data[2] = rs.getInt("angkatan_masuk");
                data[3] = rs.getString("semester");
                data[4] = rs.getString("prodi");
                data[5] = rs.getInt("sks_mhs");
                data[6] = rs.getInt("id_mhs");

                model.addRow(data);
            }

            rs.close();
            st.close();
        }
        catch (SQLException e) {
            System.err.println("Load data eror: " + e.getMessage());
        }
    }
    
    

    
    
    // TODO: READ data dari database ke tabel
    
    
    public void printAll() throws NimHarusAngkaException, NimHarusPositifException, NimHarus10Digit, SemesterHarusValid{
        long nim;
        try {
            nim = Long.parseLong(txtNim.getText());
        } 
        catch (NumberFormatException e) {
            throw new NimHarusAngkaException();
        }
        
        if (nim < 0) {
            throw new NimHarusPositifException();
        }
        if (Long.toString(nim).length() != 10){
            throw new NimHarus10Digit();
        }
        
        int smt = Integer.valueOf(txtSemester.getText());
        if (smt <1 || smt >14){
            throw new SemesterHarusValid();
        }
        Mahasiswa newMahasiswa = new Mahasiswa(
                txtNama.getText(), 
                txtNim.getText(), 
                Integer.parseInt(cmbAngkatan.getSelectedItem().toString()), 
                txtSemester.getText(), 
                bgProgramStudi.getSelection().getActionCommand(), 
                Integer.parseInt(txtSks.getText())
        );
        
        taPrint.setText(newMahasiswa.cetakInfo());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgProgramStudi = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNim = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbAngkatan = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtSemester = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rbTF = new javax.swing.JRadioButton();
        rbTI = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txtSks = new javax.swing.JTextField();
        btnPrint = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taPrint = new javax.swing.JTextArea();
        btnLogout = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelMahasiswa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 580));

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setText("Simple SPP Form");

        jLabel2.setText("Selamat datang,");

        lblUser.setText("user");

        jLabel3.setText("Nama");

        jLabel4.setText("NIM");

        jLabel5.setText("Angkatan");

        cmbAngkatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021" }));
        cmbAngkatan.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                switch (e.getItem().toString()) {
                    case "2018":
                    txtSemester.setText("8");
                    break;
                    case "2019":
                    txtSemester.setText("6");
                    break;
                    case "2020":
                    txtSemester.setText("4");
                    break;
                    default:
                    txtSemester.setText("2");
                }
            }
        });
        cmbAngkatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAngkatanActionPerformed(evt);
            }
        });

        jLabel6.setText("Semester");

        txtSemester.setEditable(false);
        switch (cmbAngkatan.getSelectedItem().toString()) {
            case "2018":
            txtSemester.setText("8");
            break;
            case "2019":
            txtSemester.setText("6");
            break;
            case "2020":
            txtSemester.setText("4");
            break;
            default:
            txtSemester.setText("2");
        }

        jLabel7.setText("Prodi");

        rbTF.setSelected(true);
        rbTF.setText("Teknik Informatika");
        rbTF.setActionCommand("Teknik Informatika");

        rbTI.setText("Teknik Industri");
        rbTI.setActionCommand("Teknik Industri");

        jLabel8.setText("Jumlah SKS");

        btnPrint.setBackground(new java.awt.Color(0, 204, 51));
        btnPrint.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setText("Print");
        btnPrint.setFocusPainted(false);
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setFocusPainted(false);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("Simple SPP Print");

        taPrint.setColumns(20);
        taPrint.setRows(5);
        jScrollPane1.setViewportView(taPrint);

        btnLogout.setBackground(new java.awt.Color(255, 51, 51));
        btnLogout.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setFocusPainted(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setFocusPainted(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setFocusPainted(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel11.setText("ID");

        txtId.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                        .addComponent(btnLogout))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPrint)
                                .addGap(18, 18, 18)
                                .addComponent(btnReset)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbAngkatan, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbTF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbTI))
                            .addComponent(txtSks, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnLogout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblUser))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbAngkatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rbTF)
                    .addComponent(rbTI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrint)
                    .addComponent(btnReset)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 255, 204));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setText("Data Mahasiswa");

        tabelMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "NIM", "Angkatan", "Semester", "Prodi", "Sks", "ID Mhs"
            }
        ));
        tabelMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelMahasiswa);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try {
            this.printAll();
            db = KoneksiDB.getKoneksi();

            String sql = "INSERT INTO data_mahasiswa "
                    + "(nama_mhs,nim_mhs,angkatan_masuk,semester,prodi,sks_mhs) "
                    + "VALUES (?,?,?,?,?,?)";

            PreparedStatement ps = db.prepareStatement(sql);

            ps.setString(1, txtNama.getText());
            ps.setString(2, txtNim.getText());
            ps.setString(3, cmbAngkatan.getSelectedItem().toString());
            ps.setString(4, txtSemester.getText());
            ps.setString(5, bgProgramStudi.getSelection().getActionCommand());
            ps.setString(6, txtSks.getText());

            int rowInsert = ps.executeUpdate();
            if (rowInsert > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan", "Success", JOptionPane.INFORMATION_MESSAGE);
            }

            ps.close();
        } 
        catch (NimHarusAngkaException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        catch (NimHarusPositifException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        catch (SQLException e) {
            System.err.println("Insert data eror: " + e.getMessage());
        } catch (NimHarus10Digit e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        } catch (SemesterHarusValid e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        finally {
            this.loadDataToTabel();
        }
        
        // TODO: INSERT data mahasiswa ke database
        
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtNama.setText("");
        txtNim.setText("");
        txtSks.setText("");
        rbTF.setSelected(true);
        cmbAngkatan.setSelectedIndex(0);
        switch (cmbAngkatan.getSelectedItem().toString()) {
            case "2018":
                txtSemester.setText("8");
                break;
            case "2019":
                txtSemester.setText("6");
                break;
            case "2020":
                txtSemester.setText("4");
                break;
            default:
                txtSemester.setText("2");
        }
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO: UPDATE data mahasiswa
        try {
            db = KoneksiDB.getKoneksi();

            String sql = "UPDATE data_mahasiswa "
                    + "SET nama_mhs=?, nim_mhs=?, angkatan_masuk=?, semester=?, prodi=? ,sks_mhs=? "
                    + "WHERE id_mhs=?;";

            PreparedStatement ps = db.prepareStatement(sql);

            ps.setString(1, txtNama.getText());
            ps.setString(2, txtNim.getText());
            ps.setString(3, cmbAngkatan.getSelectedItem().toString());
            ps.setString(4, txtSemester.getText());
            ps.setString(5, bgProgramStudi.getSelection().getActionCommand());
            ps.setString(6, txtSks.getText());
            ps.setString(7, txtId.getText());

            int rowInsert = ps.executeUpdate();
            if (rowInsert > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil diperbarui", "Success", JOptionPane.INFORMATION_MESSAGE);
            }

            ps.close();
        }
        catch (SQLException e) {
            System.err.println("Update data eror: " + e.getMessage());
        }
        finally {
            // Load tabel mahasiswa untuk melihat perubahan
            this.loadDataToTabel();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO: DELETE data mahasiswa
        try {
            db = KoneksiDB.getKoneksi();

            String sql = "DELETE FROM data_mahasiswa "
                    + "WHERE id_mhs=?;";

            PreparedStatement ps = db.prepareStatement(sql);

            ps.setString(1, txtId.getText());

            int rowInsert = ps.executeUpdate();
            if (rowInsert > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Success", JOptionPane.INFORMATION_MESSAGE);
            }

            ps.close();
        }
        catch (SQLException e) {
            System.err.println("Delete data eror: " + e.getMessage());
        }
        finally {
            // Load tabel mahasiswa untuk melihat perubahan
            this.loadDataToTabel();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tabelMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMahasiswaMouseClicked
        // TODO: ADD baris data terpilih ke form
        int rowIdx = tabelMahasiswa.getSelectedRow();

        // Tampilkan data ke form
        String id = tabelMahasiswa.getValueAt(rowIdx, 6).toString();
        txtId.setText(id);

        String nama = tabelMahasiswa.getValueAt(rowIdx, 0).toString();
        txtNama.setText(nama);

        String nim = tabelMahasiswa.getValueAt(rowIdx, 1).toString();
        txtNim.setText(nim);

        String angkatan = tabelMahasiswa.getValueAt(rowIdx, 2).toString();
        switch (angkatan) {
            case "2018":
                cmbAngkatan.setSelectedIndex(0);
                txtSemester.setText("8");
                break;
            case "2019":
                cmbAngkatan.setSelectedIndex(1);
                txtSemester.setText("6");
                break;
            case "2020":
                cmbAngkatan.setSelectedIndex(2);
                txtSemester.setText("4");
                break;
            default:
                cmbAngkatan.setSelectedIndex(3);
                txtSemester.setText("2");
        }

        String prodi = tabelMahasiswa.getValueAt(rowIdx, 4).toString();
        switch (prodi) {
            case "Teknik Informatika":
                rbTF.setSelected(true);
                break;
            default:
                rbTI.setSelected(true);
        }

        String sks = tabelMahasiswa.getValueAt(rowIdx, 5).toString();
        txtSks.setText(sks);
    }//GEN-LAST:event_tabelMahasiswaMouseClicked

    private void cmbAngkatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAngkatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAngkatanActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SimpleSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimpleSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimpleSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimpleSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpleSPP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgProgramStudi;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbAngkatan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblUser;
    private javax.swing.JRadioButton rbTF;
    private javax.swing.JRadioButton rbTI;
    private javax.swing.JTextArea taPrint;
    private javax.swing.JTable tabelMahasiswa;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNim;
    private javax.swing.JTextField txtSemester;
    private javax.swing.JTextField txtSks;
    // End of variables declaration//GEN-END:variables
}
