/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;
import backend.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
/**
 *
 * @author ia
 */
public class admin extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
        tampilkanDataBarang();
        kosongkanFormBarang();
        tampilkanDataSurat();
        kosongkanFormSurat();
        tampilkanDataKurir();
        kosongkanFormKurir();
        tampilkanDataPending();
        tampilkanDataProses();
        tampilkanDataRiwayat();
        tampilkanCmbKurir();
    }
    
    public void kosongkanFormBarang(){
        idPaketBarang.setText("0");
        dtlBarang.setText("");
        pengirimBarang.setText("");
        tujuanBarang.setText("");
        telpPengirimBarang.setText("+62");
        telpTujuanBarang.setText("+62");
        alamatBarang.setText("");
        hargaBarang.setText("15000");
        tipeBarang.setSelectedItem(0);
    }
    
    public void tampilkanDataBarang() {
        String[] kolom = {"Id Paket", "Nama Pengirim", "Detail Barang", "Nama Tujuan", "Telp Pengirim", "Telp Tujuan", "Alamat", "Harga", "Tipe Pengiriman"};
        ArrayList<Barang> list = new Barang().getAll();
        Object rowData[] = new Object[9];
        
        tableBarang.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for (Barang barang : list) {
            rowData[0] = barang.getId_barang();
            rowData[1] = barang.getDetail_barang();
            rowData[2] = barang.getNama_pengirim();
            rowData[3] = barang.getNama_tujuan();
            rowData[4] = barang.getTelp_pengirim();
            rowData[5] = barang.getTelp_tujuan();
            rowData[6] = barang.getAlamat();
            rowData[7] = barang.getHarga();
            rowData[8] = barang.getTipe_paket();
            
            ((DefaultTableModel)tableBarang.getModel()).addRow(rowData);
        }
    }

    public void cariBarang(String keyword) {
        String[] kolom = {"Id Paket", "Nama Pengirim", "Detail Barang", "Nama Tujuan", "Telp Pengirim", "Telp Tujuan", "Alamat", "Harga", "Tipe Pengiriman"};
        ArrayList<Barang> list = new Barang().search(keyword);
        Object rowData[] = new Object[9];
        
        tableBarang.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for (Barang barang : list) {
            rowData[0] = barang.getId_barang();
            rowData[1] = barang.getDetail_barang();
            rowData[2] = barang.getNama_pengirim();
            rowData[3] = barang.getNama_tujuan();
            rowData[4] = barang.getTelp_pengirim();
            rowData[5] = barang.getTelp_tujuan();
            rowData[6] = barang.getAlamat();
            rowData[7] = barang.getHarga();
            rowData[8] = barang.getTipe_paket();
            
            ((DefaultTableModel)tableBarang.getModel()).addRow(rowData);
        }
    }
    
    public void kosongkanFormSurat(){
        idPaketSurat.setText("0");
        noSurat.setText("");
        pengirimSurat.setText("");
        tujuanSurat.setText("");
        telpPengirimSurat.setText("+62");
        telpTujuanSurat.setText("+62");
        alamatSurat.setText("");
        hargaSurat.setText("5000");
        tipeSurat.setSelectedItem(0);
    }
    
    public void tampilkanDataSurat() {
        String[] kolom = {"Id Paket", "No Surat", "Nama Pengirim", "Nama Tujuan", "Telp Pengirim", "Telp Tujuan", "Alamat", "Harga", "Tipe Paket"};
        ArrayList<Surat> list = new Surat().getAll();
        Object rowData[] = new Object[9];
        
        tableSurat.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for (Surat surat : list) {
            rowData[0] = surat.getId_surat();
            rowData[1] = surat.getNo_surat();
            rowData[2] = surat.getNama_pengirim();
            rowData[3] = surat.getNama_tujuan();
            rowData[4] = surat.getTelp_pengirim();
            rowData[5] = surat.getTelp_tujuan();
            rowData[6] = surat.getAlamat();
            rowData[7] = surat.getHarga();
            rowData[8] = surat.getTipe_paket();
            
            ((DefaultTableModel)tableSurat.getModel()).addRow(rowData);
        }
    }
    
    public void cariSurat(String keyword) {
        String[] kolom = {"Id Paket", "No Surat", "Nama Pengirim", "Nama Tujuan", "Telp Pengirim", "Telp Tujuan", "Alamat", "Harga", "Tipe Paket"};
        ArrayList<Surat> list = new Surat().search(keyword);
        Object rowData[] = new Object[9];
        
        tableSurat.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for (Surat surat : list) {
            rowData[0] = surat.getId_surat();
            rowData[1] = surat.getNo_surat();
            rowData[2] = surat.getNama_pengirim();
            rowData[3] = surat.getNama_tujuan();
            rowData[4] = surat.getTelp_pengirim();
            rowData[5] = surat.getTelp_tujuan();
            rowData[6] = surat.getAlamat();
            rowData[7] = surat.getHarga();
            rowData[8] = surat.getTipe_paket();
            
            ((DefaultTableModel)tableSurat.getModel()).addRow(rowData);
        }
    }
    
    public void kosongkanFormKurir(){
        idKurir.setText("0");
        namaKurir.setText("");
        usernameKurir.setText("");
        passKurir.setText("");
    }
    
    public void tampilkanDataKurir() {
        String[] kolom = {"Id User", "Nama", "Username", "Password", "Role"};
        ArrayList<User> list = new User().getAll();
        Object rowData[] = new Object[5];
        
        tableKurir.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for (User user : list) {
            rowData[0] = user.getIduser();
            rowData[1] = user.getNama();
            rowData[2] = user.getUsername();
            rowData[3] = user.getPassword();
            rowData[4] = user.getRole();
            
            ((DefaultTableModel)tableKurir.getModel()).addRow(rowData);
        }
    }
    
    public void cariKurir(String keyword) {
        String[] kolom = {"Id User", "Nama", "Username", "Password", "Role"};
        ArrayList<User> list = new User().search(keyword);
        Object rowData[] = new Object[5];
        
        tableKurir.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for (User user : list) {
            rowData[0] = user.getIduser();
            rowData[1] = user.getNama();
            rowData[2] = user.getUsername();
            rowData[3] = user.getPassword();
            rowData[4] = user.getRole();
            
            ((DefaultTableModel)tableKurir.getModel()).addRow(rowData);
        }
    }
    
    public void kosongkanFormPending(){
        idPending.setText("0");
        kurirPending.setSelectedItem(0);
    }
    
    public void tampilkanDataPending() {
        String[] kolom = {"Id", "Id Paket", "Status", "Alamat", "Jenis Paket"};
        ArrayList<Paket> list = new Paket().getAllPending();
        Object rowData[] = new Object[5];
        
        tabelPending.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for (Paket paket : list) {
            rowData[0] = paket.getId();
            if (paket.getJenis_paket().equals("Barang")) {
                rowData[1] = paket.getBarang().getId_barang();
            } else if(paket.getJenis_paket().equals("Surat")) {
                rowData[1] = paket.getSurat().getId_surat();
            }
            rowData[2] = paket.getStatus();
            if (paket.getJenis_paket().equals("Barang")) {
                rowData[3] = paket.getBarang().getAlamat();
            } else if (paket.getJenis_paket().equals("Surat")) {
                rowData[3] = paket.getSurat().getAlamat();
            }
            rowData[4] = paket.getJenis_paket();
            
            ((DefaultTableModel)tabelPending.getModel()).addRow(rowData);
        }
    }
    
    public void tampilkanDataProses() {
        String[] kolom = {"Id", "Id Paket", "Status", "Alamat", "Jenis Paket"};
        ArrayList<Paket> list = new Paket().getAllProses();
        Object rowData[] = new Object[5];
        
        tabelProses.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for (Paket paket : list) {
            rowData[0] = paket.getId();
            if (paket.getJenis_paket().equals("Barang")) {
                rowData[1] = paket.getBarang().getId_barang();
            } else if(paket.getJenis_paket().equals("Surat")) {
                rowData[1] = paket.getSurat().getId_surat();
            }
            rowData[2] = paket.getStatus();
            if (paket.getJenis_paket().equals("Barang")) {
                rowData[3] = paket.getBarang().getAlamat();
            } else if (paket.getJenis_paket().equals("Surat")) {
                rowData[3] = paket.getSurat().getAlamat();
            }
            rowData[4] = paket.getJenis_paket();
            
            ((DefaultTableModel)tabelProses.getModel()).addRow(rowData);
        }
    }
    
    public void tampilkanDataRiwayat() {
        String[] kolom = {"Id", "Id Paket", "Status", "Alamat", "Jenis Paket"};
        ArrayList<Paket> list = new Paket().getAllRiwayat();
        Object rowData[] = new Object[5];
        
        tabelTerkirim.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for (Paket paket : list) {
            rowData[0] = paket.getId();
            if (paket.getJenis_paket().equals("Barang")) {
                rowData[1] = paket.getBarang().getId_barang();
            } else if(paket.getJenis_paket().equals("Surat")) {
                rowData[1] = paket.getSurat().getId_surat();
            }
            rowData[2] = paket.getStatus();
            if (paket.getJenis_paket().equals("Barang")) {
                rowData[3] = paket.getBarang().getAlamat();
            } else if (paket.getJenis_paket().equals("Surat")) {
                rowData[3] = paket.getSurat().getAlamat();
            }
            rowData[4] = paket.getJenis_paket();
            
            ((DefaultTableModel)tabelTerkirim.getModel()).addRow(rowData);
        }
    }
    
    public void tampilkanCmbKurir() {
//        kurirPending.setModel(new DefaultComboBoxModel(new User().getAll().toArray()));
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_spaket_kampus","root","");
            ResultSet rs = cn.createStatement().executeQuery("select nama from user where role='user'");
            while(rs.next()){
                Object[]ob = new Object[3];
                ob[0] = rs.getString(1);
                
                kurirPending.addItem((String) ob[0]);
            }
            
            int jumlahdata = rs.getRow();
            
        } catch(SQLException ex){
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
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
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        panelPaket = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        panelStatus = new javax.swing.JPanel();
        panelPending = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPending = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        idPending = new javax.swing.JTextField();
        btnCariPending = new javax.swing.JButton();
        cariPending = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        kurirPending = new javax.swing.JComboBox<>();
        btnProsesPending = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        panelProses = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        cariProses = new javax.swing.JTextField();
        btnCariProses = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabelProses = new javax.swing.JTable();
        panelTerkirim = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        cariTerkirim = new javax.swing.JTextField();
        btnCariTerkirim = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelTerkirim = new javax.swing.JTable();
        panelGagal = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelGagal = new javax.swing.JTable();
        btnCariGagal = new javax.swing.JButton();
        cariGagal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        panelSurat = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableSurat = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        idPaketSurat = new javax.swing.JTextField();
        btnCariSurat = new javax.swing.JButton();
        cariSurat = new javax.swing.JTextField();
        btnBaruSurat = new javax.swing.JButton();
        noSurat = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tipeSurat = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        pengirimSurat = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        telpPengirimSurat = new javax.swing.JTextField();
        hargaSurat = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        tujuanSurat = new javax.swing.JTextField();
        telpTujuanSurat = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        alamatSurat = new javax.swing.JTextArea();
        btnSimpanSurat = new javax.swing.JButton();
        btnHapusSurat = new javax.swing.JButton();
        panelBarang = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        btnBaruBarang = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        btnHapusBarang = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        tujuanBarang = new javax.swing.JTextField();
        telpPengirimBarang = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        hargaBarang = new javax.swing.JTextField();
        btnCariBarang = new javax.swing.JButton();
        telpTujuanBarang = new javax.swing.JTextField();
        idPaketBarang = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        alamatBarang = new javax.swing.JTextArea();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tableBarang = new javax.swing.JTable();
        tipeBarang = new javax.swing.JComboBox<>();
        btnSimpanBarang = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        dtlBarang = new javax.swing.JTextField();
        cariBarang = new javax.swing.JTextField();
        pengirimBarang = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        panelKurir = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        cariKurir = new javax.swing.JTextField();
        idKurir = new javax.swing.JTextField();
        btnBaruKurir = new javax.swing.JButton();
        btnCariKurir = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        tableKurir = new javax.swing.JTable();
        jLabel54 = new javax.swing.JLabel();
        namaKurir = new javax.swing.JTextField();
        btnHapusKurir = new javax.swing.JButton();
        btnSimpanKurir = new javax.swing.JButton();
        usernameKurir = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        passKurir = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setBackground(new java.awt.Color(255, 255, 255));

        menuPanel.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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

        jPanel6.setBackground(new java.awt.Color(255, 153, 255));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SURAT");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 153, 255));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BARANG");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 153, 255));
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("KURIR");

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
        jLabel31.setText("ADMIN");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel31)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        panelPaket.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Paket");

        jButton1.setBackground(new java.awt.Color(102, 0, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Pending");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 0, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Proses");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 0, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Terkirim & Gagal");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        panelStatus.setBackground(new java.awt.Color(255, 255, 255));
        panelStatus.setLayout(new java.awt.CardLayout());

        panelPending.setBackground(new java.awt.Color(255, 255, 255));

        tabelPending.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelPending.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPendingMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelPending);

        jLabel7.setText("ID");

        idPending.setEditable(false);

        btnCariPending.setText("cari");

        jLabel14.setText("Kurir");

        btnProsesPending.setBackground(new java.awt.Color(0, 153, 255));
        btnProsesPending.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnProsesPending.setForeground(new java.awt.Color(255, 255, 255));
        btnProsesPending.setText("Proses");
        btnProsesPending.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProsesPending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesPendingActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Paket Pending");

        javax.swing.GroupLayout panelPendingLayout = new javax.swing.GroupLayout(panelPending);
        panelPending.setLayout(panelPendingLayout);
        panelPendingLayout.setHorizontalGroup(
            panelPendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPendingLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cariPending, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCariPending, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelPendingLayout.createSequentialGroup()
                .addComponent(jLabel18)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelPendingLayout.createSequentialGroup()
                .addGroup(panelPendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPendingLayout.createSequentialGroup()
                        .addGroup(panelPendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(idPending, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelPendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(kurirPending, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnProsesPending, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPendingLayout.setVerticalGroup(
            panelPendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPendingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCariPending)
                    .addComponent(cariPending, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPendingLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idPending, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPendingLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kurirPending, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnProsesPending, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        panelStatus.add(panelPending, "card2");

        panelProses.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Paket Proses");

        btnCariProses.setText("cari");

        tabelProses.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(tabelProses);

        javax.swing.GroupLayout panelProsesLayout = new javax.swing.GroupLayout(panelProses);
        panelProses.setLayout(panelProsesLayout);
        panelProsesLayout.setHorizontalGroup(
            panelProsesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProsesLayout.createSequentialGroup()
                .addComponent(jLabel17)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProsesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cariProses, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCariProses, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelProsesLayout.setVerticalGroup(
            panelProsesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProsesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(panelProsesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCariProses)
                    .addComponent(cariProses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        panelStatus.add(panelProses, "card3");

        panelTerkirim.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Paket Terkirim");

        btnCariTerkirim.setText("cari");

        tabelTerkirim.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tabelTerkirim);

        javax.swing.GroupLayout panelTerkirimLayout = new javax.swing.GroupLayout(panelTerkirim);
        panelTerkirim.setLayout(panelTerkirimLayout);
        panelTerkirimLayout.setHorizontalGroup(
            panelTerkirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTerkirimLayout.createSequentialGroup()
                .addComponent(jLabel16)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTerkirimLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cariTerkirim, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCariTerkirim, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelTerkirimLayout.setVerticalGroup(
            panelTerkirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTerkirimLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(panelTerkirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCariTerkirim)
                    .addComponent(cariTerkirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        panelStatus.add(panelTerkirim, "card4");

        panelGagal.setBackground(new java.awt.Color(255, 255, 255));

        tabelGagal.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tabelGagal);

        btnCariGagal.setText("cari");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Paket Gagal");

        javax.swing.GroupLayout panelGagalLayout = new javax.swing.GroupLayout(panelGagal);
        panelGagal.setLayout(panelGagalLayout);
        panelGagalLayout.setHorizontalGroup(
            panelGagalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGagalLayout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGagalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cariGagal, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCariGagal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelGagalLayout.setVerticalGroup(
            panelGagalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGagalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(panelGagalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCariGagal)
                    .addComponent(cariGagal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        panelStatus.add(panelGagal, "card5");

        javax.swing.GroupLayout panelPaketLayout = new javax.swing.GroupLayout(panelPaket);
        panelPaket.setLayout(panelPaketLayout);
        panelPaketLayout.setHorizontalGroup(
            panelPaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPaketLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPaketLayout.createSequentialGroup()
                        .addGroup(panelPaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(panelPaketLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelPaketLayout.setVerticalGroup(
            panelPaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPaketLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(panelPaketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(panelPaket, "card2");

        panelSurat.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setText("Surat");

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
        jScrollPane3.setViewportView(tableSurat);

        jLabel20.setText("ID Paket");

        idPaketSurat.setEditable(false);
        idPaketSurat.setEnabled(false);

        btnCariSurat.setText("cari");
        btnCariSurat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCariSurat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariSuratActionPerformed(evt);
            }
        });

        btnBaruSurat.setBackground(new java.awt.Color(0, 153, 255));
        btnBaruSurat.setForeground(new java.awt.Color(255, 255, 255));
        btnBaruSurat.setText("Tambah Baru");
        btnBaruSurat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBaruSurat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaruSuratActionPerformed(evt);
            }
        });

        jLabel21.setText("No. Surat");

        jLabel22.setText("Tipe Pengiriman");

        tipeSurat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reguler", "Prioritas" }));
        tipeSurat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipeSuratActionPerformed(evt);
            }
        });

        jLabel23.setText("Nama Pengirim");

        jLabel24.setText("Telepon Pengirim");

        hargaSurat.setEditable(false);

        jLabel25.setText("Harga Pengiriman");

        jLabel26.setText("Nama Tujuan");

        tujuanSurat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuanSuratActionPerformed(evt);
            }
        });

        jLabel27.setText("Telepon Tujuan");

        jLabel28.setText("Alamat Tujuan");

        alamatSurat.setColumns(18);
        alamatSurat.setRows(3);
        jScrollPane4.setViewportView(alamatSurat);

        btnSimpanSurat.setBackground(new java.awt.Color(0, 204, 0));
        btnSimpanSurat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSimpanSurat.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpanSurat.setText("Simpan");
        btnSimpanSurat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimpanSurat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanSuratActionPerformed(evt);
            }
        });

        btnHapusSurat.setBackground(new java.awt.Color(255, 0, 51));
        btnHapusSurat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnHapusSurat.setForeground(new java.awt.Color(255, 255, 255));
        btnHapusSurat.setText("Hapus");
        btnHapusSurat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapusSurat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusSuratActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSuratLayout = new javax.swing.GroupLayout(panelSurat);
        panelSurat.setLayout(panelSuratLayout);
        panelSuratLayout.setHorizontalGroup(
            panelSuratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuratLayout.createSequentialGroup()
                .addComponent(btnBaruSurat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cariSurat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCariSurat, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelSuratLayout.createSequentialGroup()
                .addGroup(panelSuratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSuratLayout.createSequentialGroup()
                        .addGroup(panelSuratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSuratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(telpPengirimSurat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(pengirimSurat, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idPaketSurat, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel23)
                            .addGroup(panelSuratLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel19))
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelSuratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSuratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tujuanSurat, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(noSurat, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(telpTujuanSurat, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelSuratLayout.createSequentialGroup()
                                    .addGroup(panelSuratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(69, 69, 69)))
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelSuratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSuratLayout.createSequentialGroup()
                                .addGroup(panelSuratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(tipeSurat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelSuratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(hargaSurat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel28)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelSuratLayout.createSequentialGroup()
                        .addComponent(btnSimpanSurat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapusSurat, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 4, Short.MAX_VALUE))
        );
        panelSuratLayout.setVerticalGroup(
            panelSuratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuratLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSuratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelSuratLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addGroup(panelSuratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCariSurat)
                            .addComponent(cariSurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBaruSurat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idPaketSurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSuratLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noSurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tipeSurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelSuratLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(26, 26, 26))
                    .addGroup(panelSuratLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hargaSurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSuratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel26)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSuratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelSuratLayout.createSequentialGroup()
                        .addGroup(panelSuratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pengirimSurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tujuanSurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelSuratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelSuratLayout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telpPengirimSurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelSuratLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telpTujuanSurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelSuratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpanSurat)
                    .addComponent(btnHapusSurat))
                .addGap(33, 33, 33))
        );

        mainPanel.add(panelSurat, "card3");

        panelBarang.setBackground(new java.awt.Color(255, 255, 255));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel39.setText("Barang");

        btnBaruBarang.setBackground(new java.awt.Color(0, 153, 255));
        btnBaruBarang.setForeground(new java.awt.Color(255, 255, 255));
        btnBaruBarang.setText("Tambah Baru");
        btnBaruBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBaruBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaruBarangActionPerformed(evt);
            }
        });

        jLabel40.setText("Telepon Tujuan");

        btnHapusBarang.setBackground(new java.awt.Color(255, 0, 51));
        btnHapusBarang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnHapusBarang.setForeground(new java.awt.Color(255, 255, 255));
        btnHapusBarang.setText("Hapus");
        btnHapusBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapusBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusBarangActionPerformed(evt);
            }
        });

        jLabel41.setText("Nama Tujuan");

        tujuanBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuanBarangActionPerformed(evt);
            }
        });

        jLabel42.setText("Telepon Pengirim");

        jLabel43.setText("ID Paket");

        jLabel44.setText("Harga Pengiriman");

        hargaBarang.setEditable(false);

        btnCariBarang.setText("cari");
        btnCariBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCariBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariBarangActionPerformed(evt);
            }
        });

        idPaketBarang.setEditable(false);
        idPaketBarang.setEnabled(false);

        jLabel45.setText("Alamat Tujuan");

        alamatBarang.setColumns(18);
        alamatBarang.setRows(3);
        jScrollPane10.setViewportView(alamatBarang);

        jLabel46.setText("Nama Pengirim");

        tableBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        tableBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBarangMouseClicked(evt);
            }
        });
        tableBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableBarangKeyPressed(evt);
            }
        });
        jScrollPane11.setViewportView(tableBarang);

        tipeBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reguler", "Prioritas" }));
        tipeBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipeBarangActionPerformed(evt);
            }
        });

        btnSimpanBarang.setBackground(new java.awt.Color(0, 204, 0));
        btnSimpanBarang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSimpanBarang.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpanBarang.setText("Simpan");
        btnSimpanBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimpanBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanBarangActionPerformed(evt);
            }
        });

        jLabel47.setText("Detail Barang");

        jLabel48.setText("Tipe Pengiriman");

        javax.swing.GroupLayout panelBarangLayout = new javax.swing.GroupLayout(panelBarang);
        panelBarang.setLayout(panelBarangLayout);
        panelBarangLayout.setHorizontalGroup(
            panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarangLayout.createSequentialGroup()
                .addComponent(btnBaruBarang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cariBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCariBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelBarangLayout.createSequentialGroup()
                .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBarangLayout.createSequentialGroup()
                        .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(telpPengirimBarang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(pengirimBarang, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idPaketBarang, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel46)
                            .addGroup(panelBarangLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel39))
                            .addComponent(jLabel42))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tujuanBarang, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dtlBarang, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(telpTujuanBarang, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBarangLayout.createSequentialGroup()
                                    .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(69, 69, 69)))
                            .addComponent(jLabel41))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBarangLayout.createSequentialGroup()
                                .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel48)
                                    .addComponent(tipeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel44)
                                    .addComponent(hargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel45)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBarangLayout.createSequentialGroup()
                        .addComponent(btnSimpanBarang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapusBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 4, Short.MAX_VALUE))
        );
        panelBarangLayout.setVerticalGroup(
            panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBarangLayout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(18, 18, 18)
                        .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCariBarang)
                            .addComponent(cariBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBaruBarang))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idPaketBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBarangLayout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dtlBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tipeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBarangLayout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addGap(26, 26, 26))
                    .addGroup(panelBarangLayout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jLabel41)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelBarangLayout.createSequentialGroup()
                        .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pengirimBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tujuanBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelBarangLayout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telpPengirimBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBarangLayout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telpTujuanBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpanBarang)
                    .addComponent(btnHapusBarang))
                .addGap(33, 33, 33))
        );

        mainPanel.add(panelBarang, "card4");

        panelKurir.setBackground(new java.awt.Color(255, 255, 255));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel49.setText("Kurir");

        jLabel50.setText("Nama");

        idKurir.setEditable(false);
        idKurir.setEnabled(false);

        btnBaruKurir.setBackground(new java.awt.Color(0, 153, 255));
        btnBaruKurir.setForeground(new java.awt.Color(255, 255, 255));
        btnBaruKurir.setText("Tambah Baru");
        btnBaruKurir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBaruKurir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaruKurirActionPerformed(evt);
            }
        });

        btnCariKurir.setText("cari");
        btnCariKurir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCariKurir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariKurirActionPerformed(evt);
            }
        });

        tableKurir.setModel(new javax.swing.table.DefaultTableModel(
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
        tableKurir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKurirMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(tableKurir);

        jLabel54.setText("ID Paket");

        btnHapusKurir.setBackground(new java.awt.Color(255, 0, 51));
        btnHapusKurir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnHapusKurir.setForeground(new java.awt.Color(255, 255, 255));
        btnHapusKurir.setText("Hapus");
        btnHapusKurir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapusKurir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusKurirActionPerformed(evt);
            }
        });

        btnSimpanKurir.setBackground(new java.awt.Color(0, 204, 0));
        btnSimpanKurir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSimpanKurir.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpanKurir.setText("Simpan");
        btnSimpanKurir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimpanKurir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanKurirActionPerformed(evt);
            }
        });

        usernameKurir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameKurirActionPerformed(evt);
            }
        });

        jLabel29.setText("Username");

        jLabel30.setText("Password");

        javax.swing.GroupLayout panelKurirLayout = new javax.swing.GroupLayout(panelKurir);
        panelKurir.setLayout(panelKurirLayout);
        panelKurirLayout.setHorizontalGroup(
            panelKurirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKurirLayout.createSequentialGroup()
                .addComponent(btnBaruKurir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cariKurir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCariKurir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelKurirLayout.createSequentialGroup()
                .addGroup(panelKurirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelKurirLayout.createSequentialGroup()
                        .addGroup(panelKurirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addComponent(idKurir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelKurirLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel49)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelKurirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaKurir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelKurirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameKurir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelKurirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(passKurir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelKurirLayout.createSequentialGroup()
                        .addComponent(btnSimpanKurir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapusKurir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKurirLayout.setVerticalGroup(
            panelKurirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKurirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelKurirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelKurirLayout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addGap(18, 18, 18)
                        .addGroup(panelKurirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCariKurir)
                            .addComponent(cariKurir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBaruKurir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idKurir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelKurirLayout.createSequentialGroup()
                        .addGroup(panelKurirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelKurirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namaKurir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameKurir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passKurir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51)
                .addGroup(panelKurirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpanKurir)
                    .addComponent(btnHapusKurir))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        mainPanel.add(panelKurir, "card5");

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        //remove Pan
        panelStatus.removeAll();
        panelStatus.repaint();
        panelStatus.revalidate();
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        //add Pan
        panelStatus.add(panelPending);
        panelStatus.repaint();
        panelStatus.revalidate();
        mainPanel.add(panelPaket);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        //remove Pan
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        //add Pan
        mainPanel.add(panelSurat);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        //remove Pan
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        //add Pan
        mainPanel.add(panelBarang);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        //remove Pan
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        //add Pan
        mainPanel.add(panelKurir);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //remove Pan
        panelStatus.removeAll();
        panelStatus.repaint();
        panelStatus.revalidate();

        //add Pan
        panelStatus.add(panelPending);
        panelStatus.repaint();
        panelStatus.revalidate();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        //remove Pan
        panelStatus.removeAll();
        panelStatus.repaint();
        panelStatus.revalidate();

        //add Pan
        panelStatus.add(panelProses);
        panelStatus.repaint();
        panelStatus.revalidate();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        //remove Pan
        panelStatus.removeAll();
        panelStatus.repaint();
        panelStatus.revalidate();

        //add Pan
        panelStatus.add(panelTerkirim);
        panelStatus.repaint();
        panelStatus.revalidate();
    }//GEN-LAST:event_jButton4MouseClicked

    private void tabelPendingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPendingMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tabelPending.getModel();
        int row = tabelPending.getSelectedRow();

        idPending.setText(model.getValueAt(row, 0).toString());
    }//GEN-LAST:event_tabelPendingMouseClicked

    private void btnProsesPendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesPendingActionPerformed
        // TODO add your handling code here:
        Paket paket = new Paket();
        paket.setId(Integer.parseInt(idPending.getText()));
        paket.update();

        idPending.setText(Integer.toString(paket.getId()));
        tampilkanDataPending();
        kosongkanFormPending();
        tampilkanDataProses();
        tampilkanDataRiwayat();
    }//GEN-LAST:event_btnProsesPendingActionPerformed

    private void tableSuratMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSuratMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tableSurat.getModel();
        int row = tableSurat.getSelectedRow();

        idPaketSurat.setText(model.getValueAt(row, 0).toString());
        noSurat.setText(model.getValueAt(row, 1).toString());
        pengirimSurat.setText(model.getValueAt(row, 2).toString());
        tujuanSurat.setText(model.getValueAt(row, 3).toString());
        telpPengirimSurat.setText(model.getValueAt(row, 4).toString());
        telpTujuanSurat.setText(model.getValueAt(row, 5).toString());
        alamatSurat.setText(model.getValueAt(row, 6).toString());
        hargaSurat.setText(model.getValueAt(row, 7).toString());
        tipeSurat.setSelectedItem(model.getValueAt(row, 8).toString());
    }//GEN-LAST:event_tableSuratMouseClicked

    private void btnCariSuratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariSuratActionPerformed
        // TODO add your handling code here:
        cariSurat(cariSurat.getText());
    }//GEN-LAST:event_btnCariSuratActionPerformed

    private void btnBaruSuratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaruSuratActionPerformed
        // TODO add your handling code here:
        kosongkanFormSurat();
    }//GEN-LAST:event_btnBaruSuratActionPerformed

    private void tipeSuratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipeSuratActionPerformed
        // TODO add your handling code here:
        Object selected = tipeSurat.getSelectedItem();
        if(selected.toString().equals("Prioritas"))
        hargaSurat.setText("10000");
        else if(selected.toString().equals("Reguler"))
        hargaSurat.setText("5000");
    }//GEN-LAST:event_tipeSuratActionPerformed

    private void tujuanSuratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuanSuratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tujuanSuratActionPerformed

    private void btnSimpanSuratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanSuratActionPerformed
        // TODO add your handling code here:
        Surat surat = new Surat();
        surat.setId_surat(Integer.parseInt(idPaketSurat.getText()));
        surat.setNo_surat(noSurat.getText());
        surat.setNama_pengirim(pengirimSurat.getText());
        surat.setNama_tujuan(tujuanSurat.getText());
        surat.setTelp_pengirim(telpPengirimSurat.getText());
        surat.setTelp_tujuan(telpTujuanSurat.getText());
        surat.setAlamat(alamatSurat.getText());
        surat.setHarga(Integer.parseInt(hargaSurat.getText()));
        surat.setTipe_paket((String) tipeSurat.getSelectedItem());
        surat.save();
        idPaketSurat.setText(Integer.toString(surat.getId_surat()));
        tampilkanDataSurat();
        kosongkanFormSurat();
        tampilkanDataPending();
    }//GEN-LAST:event_btnSimpanSuratActionPerformed

    private void btnHapusSuratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusSuratActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tableSurat.getModel();
        int row = tableSurat.getSelectedRow();

        Surat surat = new Surat().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        surat.delete();
        kosongkanFormSurat();
        tampilkanDataSurat();
        tampilkanDataPending();
    }//GEN-LAST:event_btnHapusSuratActionPerformed

    private void btnBaruBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaruBarangActionPerformed
        // TODO add your handling code here:
        kosongkanFormBarang();
    }//GEN-LAST:event_btnBaruBarangActionPerformed

    private void btnHapusBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusBarangActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tableBarang.getModel();
        int row = tableBarang.getSelectedRow();

        Barang barang = new Barang().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        barang.delete();
        kosongkanFormBarang();
        tampilkanDataBarang();
        tampilkanDataPending();
    }//GEN-LAST:event_btnHapusBarangActionPerformed

    private void tujuanBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuanBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tujuanBarangActionPerformed

    private void btnCariBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariBarangActionPerformed
        // TODO add your handling code here:
        cariBarang(cariBarang.getText());
    }//GEN-LAST:event_btnCariBarangActionPerformed

    private void tableBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBarangMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tableBarang.getModel();
        int row = tableBarang.getSelectedRow();

        idPaketBarang.setText(model.getValueAt(row, 0).toString());
        dtlBarang.setText(model.getValueAt(row, 1).toString());
        pengirimBarang.setText(model.getValueAt(row, 2).toString());
        tujuanBarang.setText(model.getValueAt(row, 3).toString());
        telpPengirimBarang.setText(model.getValueAt(row, 4).toString());
        telpTujuanBarang.setText(model.getValueAt(row, 5).toString());
        alamatBarang.setText(model.getValueAt(row, 6).toString());
        hargaBarang.setText(model.getValueAt(row, 7).toString());
        tipeBarang.setSelectedItem(model.getValueAt(row, 8).toString());
    }//GEN-LAST:event_tableBarangMouseClicked

    private void tableBarangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableBarangKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_tableBarangKeyPressed

    private void tipeBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipeBarangActionPerformed
        // TODO add your handling code here:
        Object selected = tipeBarang.getSelectedItem();
        if(selected.toString().equals("Prioritas"))
        hargaBarang.setText("20000");
        else if(selected.toString().equals("Reguler"))
        hargaBarang.setText("15000");
    }//GEN-LAST:event_tipeBarangActionPerformed

    private void btnSimpanBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanBarangActionPerformed
        // TODO add your handling code here:
        Barang barang = new Barang();
        barang.setId_barang(Integer.parseInt(idPaketBarang.getText()));
        barang.setDetail_barang(dtlBarang.getText());
        barang.setNama_pengirim(pengirimBarang.getText());
        barang.setNama_tujuan(tujuanBarang.getText());
        barang.setTelp_pengirim(telpPengirimBarang.getText());
        barang.setTelp_tujuan(telpTujuanBarang.getText());
        barang.setAlamat(alamatBarang.getText());
        barang.setHarga(Integer.parseInt(hargaBarang.getText()));
        barang.setTipe_paket((String) tipeBarang.getSelectedItem());
        barang.save();
        idPaketBarang.setText(Integer.toString(barang.getId_barang()));
        tampilkanDataBarang();
        kosongkanFormBarang();
        tampilkanDataPending();
    }//GEN-LAST:event_btnSimpanBarangActionPerformed

    private void btnBaruKurirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaruKurirActionPerformed
        // TODO add your handling code here:
        kosongkanFormKurir();
    }//GEN-LAST:event_btnBaruKurirActionPerformed

    private void btnCariKurirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariKurirActionPerformed
        // TODO add your handling code here:
        cariKurir(cariKurir.getText());
    }//GEN-LAST:event_btnCariKurirActionPerformed

    private void tableKurirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKurirMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tableKurir.getModel();
        int row = tableKurir.getSelectedRow();

        idKurir.setText(model.getValueAt(row, 0).toString());
        namaKurir.setText(model.getValueAt(row, 1).toString());
        usernameKurir.setText(model.getValueAt(row, 2).toString());
        passKurir.setText(model.getValueAt(row, 3).toString());
    }//GEN-LAST:event_tableKurirMouseClicked

    private void btnHapusKurirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusKurirActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tableKurir.getModel();
        int row = tableKurir.getSelectedRow();

        User user = new User().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        user.delete();
        kosongkanFormKurir();
        tampilkanDataKurir();
    }//GEN-LAST:event_btnHapusKurirActionPerformed

    private void btnSimpanKurirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanKurirActionPerformed
        // TODO add your handling code here:
        User user = new User();
        user.setIduser(Integer.parseInt(idKurir.getText()));
        user.setNama(namaKurir.getText());
        user.setUsername(usernameKurir.getText());
        user.setPass(passKurir.getText());
        user.save();
        idKurir.setText(Integer.toString(user.getIduser()));
        tampilkanDataKurir();
        kosongkanFormKurir();
    }//GEN-LAST:event_btnSimpanKurirActionPerformed

    private void usernameKurirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameKurirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameKurirActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamatBarang;
    private javax.swing.JTextArea alamatSurat;
    private javax.swing.JPanel body;
    private javax.swing.JButton btnBaruBarang;
    private javax.swing.JButton btnBaruKurir;
    private javax.swing.JButton btnBaruSurat;
    private javax.swing.JButton btnCariBarang;
    private javax.swing.JButton btnCariGagal;
    private javax.swing.JButton btnCariKurir;
    private javax.swing.JButton btnCariPending;
    private javax.swing.JButton btnCariProses;
    private javax.swing.JButton btnCariSurat;
    private javax.swing.JButton btnCariTerkirim;
    private javax.swing.JButton btnHapusBarang;
    private javax.swing.JButton btnHapusKurir;
    private javax.swing.JButton btnHapusSurat;
    private javax.swing.JButton btnProsesPending;
    private javax.swing.JButton btnSimpanBarang;
    private javax.swing.JButton btnSimpanKurir;
    private javax.swing.JButton btnSimpanSurat;
    private javax.swing.JTextField cariBarang;
    private javax.swing.JTextField cariGagal;
    private javax.swing.JTextField cariKurir;
    private javax.swing.JTextField cariPending;
    private javax.swing.JTextField cariProses;
    private javax.swing.JTextField cariSurat;
    private javax.swing.JTextField cariTerkirim;
    private javax.swing.JTextField dtlBarang;
    private javax.swing.JTextField hargaBarang;
    private javax.swing.JTextField hargaSurat;
    private javax.swing.JTextField idKurir;
    private javax.swing.JTextField idPaketBarang;
    private javax.swing.JTextField idPaketSurat;
    private javax.swing.JTextField idPending;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JComboBox<String> kurirPending;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JTextField namaKurir;
    private javax.swing.JTextField noSurat;
    private javax.swing.JPanel panelBarang;
    private javax.swing.JPanel panelGagal;
    private javax.swing.JPanel panelKurir;
    private javax.swing.JPanel panelPaket;
    private javax.swing.JPanel panelPending;
    private javax.swing.JPanel panelProses;
    private javax.swing.JPanel panelStatus;
    private javax.swing.JPanel panelSurat;
    private javax.swing.JPanel panelTerkirim;
    private javax.swing.JTextField passKurir;
    private javax.swing.JTextField pengirimBarang;
    private javax.swing.JTextField pengirimSurat;
    private javax.swing.JTable tabelGagal;
    private javax.swing.JTable tabelPending;
    private javax.swing.JTable tabelProses;
    private javax.swing.JTable tabelTerkirim;
    private javax.swing.JTable tableBarang;
    private javax.swing.JTable tableKurir;
    private javax.swing.JTable tableSurat;
    private javax.swing.JTextField telpPengirimBarang;
    private javax.swing.JTextField telpPengirimSurat;
    private javax.swing.JTextField telpTujuanBarang;
    private javax.swing.JTextField telpTujuanSurat;
    private javax.swing.JComboBox<String> tipeBarang;
    private javax.swing.JComboBox<String> tipeSurat;
    private javax.swing.JTextField tujuanBarang;
    private javax.swing.JTextField tujuanSurat;
    private javax.swing.JTextField usernameKurir;
    // End of variables declaration//GEN-END:variables
}
