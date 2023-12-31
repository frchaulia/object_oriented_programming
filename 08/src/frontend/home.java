/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;
import backend.Paket;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ia
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        tampilkanDataPending();
        kosongkanFormPending();
        tampilkanDataRiwayat();
    }
    
    public void kosongkanFormPending() {
        idPaketSurat.setText("0");
        namaPenerima.setText("");
    }

    public void tampilkanDataPending() {
        String[] kolom = {"Id", "Id Paket", "Status", "Alamat", "Jenis Paket"};
        ArrayList<Paket> list = new Paket().getAllProses();
        Object rowData[] = new Object[5];

        tableSurat.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (Paket paket : list) {

            rowData[0] = paket.getId();
            if (paket.getJenis_paket().equals("Barang")) {
                rowData[1] = paket.getBarang().getId_barang();
            } else {
                rowData[1] = paket.getSurat().getId_surat();
            }
            rowData[2] = paket.getStatus();
            if (paket.getJenis_paket().equals("Barang")) {
                rowData[3] = paket.getBarang().getAlamat();
            } else {
                rowData[3] = paket.getSurat().getAlamat();
            }
            rowData[4] = paket.getJenis_paket();

            ((DefaultTableModel) tableSurat.getModel()).addRow(rowData);
        }
    }
    
    public void tampilkanDataRiwayat() {
        String[] kolom = {"Id", "Id Paket", "Status", "Alamat", "Jenis Paket"};
        ArrayList<Paket> list = new Paket().getAllRiwayat();
        Object rowData[] = new Object[5];

        tableSurat1.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (Paket paket : list) {

            rowData[0] = paket.getId();
            if (paket.getJenis_paket().equals("Barang")) {
                rowData[1] = paket.getBarang().getId_barang();
            } else {
                rowData[1] = paket.getSurat().getId_surat();
            }
            rowData[2] = paket.getStatus();
            if (paket.getJenis_paket().equals("Barang")) {
                rowData[3] = paket.getBarang().getAlamat();
            } else {
                rowData[3] = paket.getSurat().getAlamat();
            }
            rowData[4] = paket.getJenis_paket();

            ((DefaultTableModel) tableSurat1.getModel()).addRow(rowData);
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

        body = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        panelPaket = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableSurat = new javax.swing.JTable();
        btnSimpanSurat = new javax.swing.JButton();
        cariSurat = new javax.swing.JTextField();
        idPaketSurat = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        btnCariSurat = new javax.swing.JButton();
        btnHapusSurat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        namaPenerima = new javax.swing.JTextField();
        panelRiwayat = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableSurat1 = new javax.swing.JTable();
        cariSurat1 = new javax.swing.JTextField();
        btnCariSurat1 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setBackground(new java.awt.Color(255, 255, 255));

        menuPanel.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel8.setBackground(new java.awt.Color(255, 153, 255));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("RIWAYAT");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("KURIR");

        jPanel5.setBackground(new java.awt.Color(255, 153, 255));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PAKET");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addGap(64, 64, 64))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addGap(24, 24, 24)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        panelPaket.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setText("Paket");

        tableSurat.setModel(new javax.swing.table.DefaultTableModel(
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
        tableSurat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSuratMouseClicked(evt);
            }
        });
        tableSurat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableSuratKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(tableSurat);

        btnSimpanSurat.setBackground(new java.awt.Color(0, 204, 0));
        btnSimpanSurat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSimpanSurat.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpanSurat.setText("Terkirim");
        btnSimpanSurat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimpanSurat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanSuratActionPerformed(evt);
            }
        });

        idPaketSurat.setEditable(false);

        jLabel20.setText("ID Paket");

        btnCariSurat.setText("cari");
        btnCariSurat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnHapusSurat.setBackground(new java.awt.Color(255, 0, 51));
        btnHapusSurat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnHapusSurat.setForeground(new java.awt.Color(255, 255, 255));
        btnHapusSurat.setText("Gagal");
        btnHapusSurat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapusSurat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusSuratActionPerformed(evt);
            }
        });

        jLabel2.setText("Nama Penerima");

        javax.swing.GroupLayout panelPaketLayout = new javax.swing.GroupLayout(panelPaket);
        panelPaket.setLayout(panelPaketLayout);
        panelPaketLayout.setHorizontalGroup(
            panelPaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPaketLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cariSurat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCariSurat, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelPaketLayout.createSequentialGroup()
                .addGroup(panelPaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPaketLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19))
                    .addGroup(panelPaketLayout.createSequentialGroup()
                        .addGroup(panelPaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(idPaketSurat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelPaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namaPenerima)
                            .addGroup(panelPaketLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 76, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelPaketLayout.createSequentialGroup()
                .addComponent(btnSimpanSurat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHapusSurat, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 447, Short.MAX_VALUE))
        );
        panelPaketLayout.setVerticalGroup(
            panelPaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPaketLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addGroup(panelPaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCariSurat)
                    .addComponent(cariSurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPaketLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idPaketSurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPaketLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namaPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelPaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpanSurat)
                    .addComponent(btnHapusSurat))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        mainPanel.add(panelPaket, "card2");

        panelRiwayat.setBackground(new java.awt.Color(255, 255, 255));

        tableSurat1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tableSurat1);

        btnCariSurat1.setText("cari");
        btnCariSurat1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel29.setText("Riwayat");

        javax.swing.GroupLayout panelRiwayatLayout = new javax.swing.GroupLayout(panelRiwayat);
        panelRiwayat.setLayout(panelRiwayatLayout);
        panelRiwayatLayout.setHorizontalGroup(
            panelRiwayatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRiwayatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRiwayatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRiwayatLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addContainerGap(540, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRiwayatLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cariSurat1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCariSurat1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))))
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
        );
        panelRiwayatLayout.setVerticalGroup(
            panelRiwayatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRiwayatLayout.createSequentialGroup()
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addGroup(panelRiwayatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCariSurat1)
                    .addComponent(cariSurat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPanel.add(panelRiwayat, "card3");

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 479, Short.MAX_VALUE)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        //remove Pan
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        //add Pan
        mainPanel.add(panelRiwayat);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        //remove Pan
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        //add Pan
        mainPanel.add(panelPaket);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void tableSuratMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSuratMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tableSurat.getModel();
        int row = tableSurat.getSelectedRow();

        idPaketSurat.setText(model.getValueAt(row, 0).toString());
    }//GEN-LAST:event_tableSuratMouseClicked

    private void tableSuratKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableSuratKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tableSuratKeyPressed

    private void btnSimpanSuratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanSuratActionPerformed
        // TODO add your handling code here:
        Paket paket = new Paket();
        paket.setId(Integer.parseInt(idPaketSurat.getText()));
        paket.setPenerima(namaPenerima.getText());
        paket.updateTerkirim();

        idPaketSurat.setText(Integer.toString(paket.getId()));
        tampilkanDataPending();
        kosongkanFormPending();
        tampilkanDataRiwayat();
    }//GEN-LAST:event_btnSimpanSuratActionPerformed

    private void btnHapusSuratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusSuratActionPerformed
        // TODO add your handling code here:
        Paket paket = new Paket();
        paket.setId(Integer.parseInt(idPaketSurat.getText()));
        paket.updateGagal();

        idPaketSurat.setText(Integer.toString(paket.getId()));
        tampilkanDataPending();
        kosongkanFormPending();
        tampilkanDataRiwayat();
    }//GEN-LAST:event_btnHapusSuratActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JButton btnCariSurat;
    private javax.swing.JButton btnCariSurat1;
    private javax.swing.JButton btnHapusSurat;
    private javax.swing.JButton btnSimpanSurat;
    private javax.swing.JTextField cariSurat;
    private javax.swing.JTextField cariSurat1;
    private javax.swing.JTextField idPaketSurat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JTextField namaPenerima;
    private javax.swing.JPanel panelPaket;
    private javax.swing.JPanel panelRiwayat;
    private javax.swing.JTable tableSurat;
    private javax.swing.JTable tableSurat1;
    // End of variables declaration//GEN-END:variables
}
