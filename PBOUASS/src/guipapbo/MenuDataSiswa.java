/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guipapbo;
import java.sql.*;
import javax.swing.JOptionPane;
import Package2.dataSiswa;
import java.util.logging.Level;
import java.util.logging.Logger;
import Package2.dataSiswa;
import java.awt.event.KeyEvent;
public class MenuDataSiswa extends javax.swing.JFrame {
    dataSiswa data_siswa;
    /**
     * Creates new form MenuDataSiswa
     */
    public MenuDataSiswa() throws ClassNotFoundException, SQLException {
        data_siswa = new dataSiswa();
        initComponents();
        this.showData();
    }
     public boolean checkinput (){
         
         if(txtnamasiswa.getText().isEmpty()) return false;
         if(txtorangtua.getText().isEmpty()) return false;
         if(txtkelas.getText().isEmpty()) return false;
         
         return true;
         
     }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbsiswa = new javax.swing.JTable();
        Kembali = new javax.swing.JButton();
        tambahdata = new javax.swing.JButton();
        update = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnamasiswa = new javax.swing.JTextField();
        txtorangtua = new javax.swing.JTextField();
        txtkelas = new javax.swing.JTextField();
        txtidsiswa = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data Siswa");

        tbsiswa = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbsiswa.getTableHeader().setReorderingAllowed(false);
        tbsiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Siswa", "Nama Siswa", "Nama Orang Tua", "Kelas"
            }
        ));
        tbsiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbsiswaMouseClicked(evt);
            }
        });
        tbsiswa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbsiswaKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(tbsiswa);

        Kembali.setBackground(new java.awt.Color(234, 231, 214));
        Kembali.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Kembali.setForeground(new java.awt.Color(93, 123, 111));
        Kembali.setText("Kembali");
        Kembali.setBorderPainted(false);
        Kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KembaliMouseClicked(evt);
            }
        });
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });

        tambahdata.setBackground(new java.awt.Color(234, 231, 214));
        tambahdata.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tambahdata.setForeground(new java.awt.Color(93, 123, 111));
        tambahdata.setText("Tambah");
        tambahdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahdataMouseClicked(evt);
            }
        });
        tambahdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahdataActionPerformed(evt);
            }
        });
        tambahdata.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tambahdataKeyPressed(evt);
            }
        });

        update.setBackground(new java.awt.Color(234, 231, 214));
        update.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        update.setForeground(new java.awt.Color(102, 102, 255));
        update.setText("Ubah");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });

        hapus.setBackground(new java.awt.Color(234, 231, 214));
        hapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hapus.setForeground(new java.awt.Color(255, 102, 102));
        hapus.setText("Hapus");
        hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusMouseClicked(evt);
            }
        });
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Siswa");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Orang Tua ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kelas");

        txtnamasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamasiswaActionPerformed(evt);
            }
        });
        txtnamasiswa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnamasiswaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnamasiswaKeyTyped(evt);
            }
        });

        txtorangtua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtorangtuaActionPerformed(evt);
            }
        });
        txtorangtua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtorangtuaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtorangtuaKeyTyped(evt);
            }
        });

        txtkelas.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtkelasInputMethodTextChanged(evt);
            }
        });
        txtkelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkelasActionPerformed(evt);
            }
        });
        txtkelas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtkelasKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtkelasKeyTyped(evt);
            }
        });

        txtidsiswa.setEditable(false);
        txtidsiswa.setBackground(new java.awt.Color(51, 51, 255));
        txtidsiswa.setForeground(new java.awt.Color(164, 195, 162));
        txtidsiswa.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtidsiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(222, 222, 222))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtorangtua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                                    .addComponent(txtnamasiswa, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtkelas)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tambahdata, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Kembali)))
                        .addContainerGap(40, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtidsiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnamasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtorangtua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtkelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update)
                    .addComponent(hapus)
                    .addComponent(tambahdata)
                    .addComponent(Kembali))
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 580, 400));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/238a9c568f8506bc2b7aff82ee4e5733 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        
    }//GEN-LAST:event_hapusActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KembaliActionPerformed

    private void tambahdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahdataActionPerformed
        
    }//GEN-LAST:event_tambahdataActionPerformed

    private void tambahdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahdataMouseClicked
        if (checkinput()) {
        String ns = txtnamasiswa.getText();
        String ot = txtorangtua.getText();
        String jh = txtkelas.getText();
        
        
        data_siswa.insertdataSiswa(ns,ot,jh);
        JOptionPane.showMessageDialog(null, "TAMBAH DATA BERHASIL");
        this.dispose();
        try {
            new MenuDataSiswa().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuDataSiswa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuDataSiswa.class.getName()).log(Level.SEVERE, null, ex);
        } 

        
       
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
        }
    }//GEN-LAST:event_tambahdataMouseClicked

    private void KembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KembaliMouseClicked

        MenuUtama m = new MenuUtama();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_KembaliMouseClicked

    private void hapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusMouseClicked
        String id = txtidsiswa.getText();
        
        data_siswa.deleteSiswa(id);
        
        JOptionPane.showMessageDialog(null, "Hapus data berhasil");
        this.dispose();
        try {
            new MenuDataSiswa().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuDataSiswa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuDataSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_hapusMouseClicked

    private void tbsiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbsiswaMouseClicked
        
        int baris = tbsiswa.rowAtPoint(evt.getPoint());
        String id_siswa = tbsiswa.getValueAt(baris, 0).toString();
        txtidsiswa.setText(id_siswa);
        
        String nama_siswa = tbsiswa.getValueAt(baris, 1).toString();
        txtnamasiswa.setText(nama_siswa);

        String orangtua_siswa = tbsiswa.getValueAt(baris, 2).toString();
        txtorangtua.setText(orangtua_siswa);

        String kelas= tbsiswa.getValueAt(baris, 3).toString();
        txtkelas.setText(kelas);
    }//GEN-LAST:event_tbsiswaMouseClicked

    private void txtorangtuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtorangtuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtorangtuaActionPerformed

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        if (checkinput()){
            String id = txtidsiswa.getText();
            String ns = txtnamasiswa.getText();
            String ot = txtorangtua.getText();
            String jh = txtkelas.getText();
           
            data_siswa.updateSiswa(ns, ot, jh, id);
            JOptionPane.showMessageDialog(null, "Data berhasil di rubah");
            this.dispose();
            try {
                new MenuDataSiswa().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MenuDataSiswa.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(MenuDataSiswa.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else{
            JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
        }
    }//GEN-LAST:event_updateMouseClicked
    
    void filterangka(KeyEvent b){
        if((Character.isDigit(b.getKeyChar())) && (Character.isJavaIdentifierPart(b.getKeyChar())) ){
            b.consume();
        }
    }
    private void txtkelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkelasActionPerformed

    private void txtkelasInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtkelasInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkelasInputMethodTextChanged

    private void tbsiswaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbsiswaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tbsiswaKeyTyped

    private void txtkelasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkelasKeyTyped
        char karakter = evt.getKeyChar();
        if(!((karakter >= '0')&& (karakter <= '9')&& txtkelas.getText().length()<2 || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtkelasKeyTyped

    private void txtorangtuaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtorangtuaKeyTyped
        filterangka(evt);
    }//GEN-LAST:event_txtorangtuaKeyTyped

    private void txtnamasiswaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnamasiswaKeyTyped
        filterangka(evt);
    }//GEN-LAST:event_txtnamasiswaKeyTyped

    private void txtnamasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamasiswaActionPerformed
        while (true){
        if(txtnamasiswa.getText().matches("[a-zA-Z]+")){
            break;
        }else{
            JOptionPane.showMessageDialog(null, "eror");
            this.dispose();
            try {
                new MenuDataSiswa().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MenuDataSiswa.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(MenuDataSiswa.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
        }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_txtnamasiswaActionPerformed

    private void txtnamasiswaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnamasiswaKeyPressed
    if (evt.getKeyCode()==10){
        while (true){
        if(txtnamasiswa.getText().matches("[a-zA-Z]+")){
            txtorangtua.requestFocus();
            break;
        }else{
            JOptionPane.showMessageDialog(null, "eror");
            this.dispose();
            try {
                new MenuDataSiswa().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MenuDataSiswa.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(MenuDataSiswa.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
        }}
    }
    }//GEN-LAST:event_txtnamasiswaKeyPressed

    private void tambahdataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tambahdataKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahdataKeyPressed

    private void txtorangtuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtorangtuaKeyPressed
    if (evt.getKeyCode()==10){
        while (true){
        if(txtorangtua.getText().matches("[a-zA-Z]+")){
            txtkelas.requestFocus();
            break;
        }else{
            JOptionPane.showMessageDialog(null, "eror");
            this.dispose();
            try {
                new MenuDataSiswa().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MenuDataSiswa.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(MenuDataSiswa.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
        }}
    }
    }//GEN-LAST:event_txtorangtuaKeyPressed

    private void txtkelasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkelasKeyPressed
   
    }//GEN-LAST:event_txtkelasKeyPressed

    public void showData() throws SQLException {
        tbsiswa.setModel(new javax.swing.table.DefaultTableModel(
            data_siswa.showSiswa(),
            new String [] {
                "ID Siswa", "Nama Siswa", "Orangtua Siswa", "Kelas"
            }
        ));}
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
            java.util.logging.Logger.getLogger(MenuDataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MenuDataSiswa().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MenuDataSiswa.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(MenuDataSiswa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Kembali;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton tambahdata;
    private javax.swing.JTable tbsiswa;
    private javax.swing.JTextField txtidsiswa;
    private javax.swing.JTextField txtkelas;
    private javax.swing.JTextField txtnamasiswa;
    private javax.swing.JTextField txtorangtua;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
