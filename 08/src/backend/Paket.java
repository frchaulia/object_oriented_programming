/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.sql.Date;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author ia
 */
public class Paket {
    private int id, id_status;
    private Barang barang = new Barang();
    private Surat surat = new Surat();
    private User user = new User();
    private String status;
    private String no_resi;
    private Date tanggalDikirim, tanggalDiterima;
    private String penerima, jenis_paket;

    public int getId_status() {
        return id_status;
    }

    public void setId_status(int id_status) {
        this.id_status = id_status;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public Surat getSurat() {
        return surat;
    }

    public void setSurat(Surat surat) {
        this.surat = surat;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNo_resi() {
        return no_resi;
    }

    public void setNo_resi(String no_resi) {
        this.no_resi = no_resi;
    }

    public Date getTanggalDikirim() {
        return tanggalDikirim;
    }

    public void setTanggalDikirim(Date tanggalDikirim) {
        this.tanggalDikirim = tanggalDikirim;
    }

    public Date getTanggalDiterima() {
        return tanggalDiterima;
    }

    public void setTanggalDiterima(Date tanggalDiterima) {
        this.tanggalDiterima = tanggalDiterima;
    }

    public String getPenerima() {
        return penerima;
    }

    public void setPenerima(String penerima) {
        this.penerima = penerima;
    }

    public String getJenis_paket() {
        return jenis_paket;
    }

    public void setJenis_paket(String jenis_paket) {
        this.jenis_paket = jenis_paket;
    }

    public Paket() {

    }

    public Paket(User user, int id, int id_status, String status, String no_resi, Date tanggalDikirim, Date tanggalDiterima, String penerima, String jenis_paket) {
        this.id = id;
        this.user = user;
        this.id_status = id_status;
        this.status = status;
        this.no_resi = no_resi;
        this.tanggalDikirim = tanggalDikirim;
        this.tanggalDiterima = tanggalDiterima;
        this.penerima = penerima;
        this.jenis_paket = jenis_paket;
    }

    public Paket getById(int id) {
        Paket paket = new Paket();
        ResultSet rs = DBHelper.selectQuery("SELECT a.*, b.*, c.* FROM paket a "
                + "LEFT JOIN user b ON b.id_user = a.id_kurir "
                + "LEFT JOIN status c ON c.id_status = a.id_status "
                + "WHERE id = '" + id + "'");

        try {
            while (rs.next()) {
                paket = new Paket();
                paket.setId(rs.getInt("id"));
                paket.getBarang().setId_barang(rs.getInt("id_paket"));
                paket.getSurat().setId_surat(rs.getInt("id_paket"));
                paket.getUser().setIduser(rs.getInt("iduser"));
                paket.getUser().setNama(rs.getString("nama"));
                paket.setStatus(rs.getString("status"));
                paket.getBarang().setAlamat("alamat");
                paket.getSurat().setAlamat("alamat");
                paket.setNo_resi(rs.getString("no_resi"));
                paket.setTanggalDikirim(rs.getDate("tanggalDikirim"));
                paket.setTanggalDiterima(rs.getDate("tanggalDiterima"));
                paket.setPenerima(rs.getString("penerima"));
                paket.setJenis_paket(rs.getString("jenis_paket"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return paket;
    }

    public ArrayList<Paket> getAll() {
        ArrayList<Paket> ListPaket = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT a.*, b.*, c.*, d.*, e.* FROM paket a "
                + "LEFT JOIN user b ON b.id_user = a.id_kurir "
                + "LEFT JOIN status c ON c.id_status = a.id_status "
                + "LEFT JOIN barang d ON a.id_paket = d.id_barang "
                + "LEFT JOIN surat e ON a.id_paket = e.id_surat");

        try {
            while (rs.next()) {
                Paket paket = new Paket();
                paket.setId(rs.getInt("id"));
                paket.getBarang().setId_barang(rs.getInt("id_paket"));
                paket.getSurat().setId_surat(rs.getInt("id_paket"));
                paket.getUser().setIduser(rs.getInt("iduser"));
                paket.getUser().setNama(rs.getString("nama"));
                paket.setStatus(rs.getString("status"));
                paket.getBarang().setAlamat(rs.getString("alamat"));
                paket.getSurat().setAlamat(rs.getString("alamat"));
                paket.setNo_resi(rs.getString("no_resi"));
                paket.setTanggalDikirim(rs.getDate("tanggalDikirim"));
                paket.setTanggalDiterima(rs.getDate("tanggalDiterima"));
                paket.setPenerima(rs.getString("penerima"));
                paket.setJenis_paket(rs.getString("jenis_paket"));

                ListPaket.add(paket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPaket;
    }

    public ArrayList<Paket> getAllPending() {
        ArrayList<Paket> ListPaket = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT a.*, b.*, c.*, d.*, e.* FROM paket a "
                + "LEFT JOIN user b ON b.id_user = a.id_kurir "
                + "LEFT JOIN status c ON c.id_status = a.id_status "
                + "LEFT JOIN barang d ON a.id_paket = d.id_barang "
                + "LEFT JOIN surat e ON a.id_paket = e.id_surat "
                + "WHERE a.id_status = 1 ");

        try {
            while (rs.next()) {
                Paket paket = new Paket();
                paket.setId(rs.getInt("id"));
                paket.getBarang().setId_barang(rs.getInt("id_paket"));
                paket.getSurat().setId_surat(rs.getInt("id_paket"));
                paket.getUser().setIduser(rs.getInt("iduser"));
                paket.getUser().setNama(rs.getString("nama"));
                paket.setStatus(rs.getString("status"));
                paket.getBarang().setAlamat(rs.getString("alamat"));
                paket.getSurat().setAlamat(rs.getString("alamat"));
                paket.setNo_resi(rs.getString("no_resi"));
                paket.setTanggalDikirim(rs.getDate("tanggalDikirim"));
                paket.setTanggalDiterima(rs.getDate("tanggalDiterima"));
                paket.setPenerima(rs.getString("penerima"));
                paket.setJenis_paket(rs.getString("jenis_paket"));

                ListPaket.add(paket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPaket;
    }
    
    public ArrayList<Paket> getAllProses() {
        ArrayList<Paket> ListPaket = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT a.*, b.*, c.*, d.*, e.* FROM paket a "
                + "LEFT JOIN user b ON b.id_user = a.id_kurir "
                + "LEFT JOIN status c ON c.id_status = a.id_status "
                + "LEFT JOIN barang d ON a.id_paket = d.id_barang "
                + "LEFT JOIN surat e ON a.id_paket = e.id_surat "
                + "WHERE a.id_status = 2 ");

        try {
            while (rs.next()) {
                Paket paket = new Paket();
                paket.setId(rs.getInt("id"));
                paket.getBarang().setId_barang(rs.getInt("id_paket"));
                paket.getSurat().setId_surat(rs.getInt("id_paket"));
                paket.getUser().setIduser(rs.getInt("iduser"));
                paket.getUser().setNama(rs.getString("nama"));
                paket.setStatus(rs.getString("status"));
                paket.getBarang().setAlamat(rs.getString("alamat"));
                paket.getSurat().setAlamat(rs.getString("alamat"));
                paket.setNo_resi(rs.getString("no_resi"));
                paket.setTanggalDikirim(rs.getDate("tanggalDikirim"));
                paket.setTanggalDiterima(rs.getDate("tanggalDiterima"));
                paket.setPenerima(rs.getString("penerima"));
                paket.setJenis_paket(rs.getString("jenis_paket"));

                ListPaket.add(paket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPaket;
    }
    
    public ArrayList<Paket> getAllRiwayat() {
        ArrayList<Paket> ListPaket = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT a.*, b.*, c.*, d.*, e.* FROM paket a "
                + "LEFT JOIN user b ON b.id_user = a.id_kurir "
                + "LEFT JOIN status c ON c.id_status = a.id_status "
                + "LEFT JOIN barang d ON a.id_paket = d.id_barang "
                + "LEFT JOIN surat e ON a.id_paket = e.id_surat "
                + "WHERE a.id_status = 3 OR a.id_status = 4");

        try {
            while (rs.next()) {
                Paket paket = new Paket();
                paket.setId(rs.getInt("id"));
                paket.getBarang().setId_barang(rs.getInt("id_paket"));
                paket.getSurat().setId_surat(rs.getInt("id_paket"));
                paket.getUser().setIduser(rs.getInt("iduser"));
                paket.getUser().setNama(rs.getString("nama"));
                paket.setStatus(rs.getString("status"));
                paket.getBarang().setAlamat(rs.getString("alamat"));
                paket.getSurat().setAlamat(rs.getString("alamat"));
                paket.setNo_resi(rs.getString("no_resi"));
                paket.setTanggalDikirim(rs.getDate("tanggalDikirim"));
                paket.setTanggalDiterima(rs.getDate("tanggalDiterima"));
                paket.setPenerima(rs.getString("penerima"));
                paket.setJenis_paket(rs.getString("jenis_paket"));

                ListPaket.add(paket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPaket;
    }
    
    public ArrayList<Paket> search(String keyword) {
        ArrayList<Paket> ListPaket = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT a.*, b.*, c.* FROM paket a "
                + "LEFT JOIN user b ON b.id_user = a.id_kurir "
                + "LEFT JOIN status c ON c.id_status = a.id_status"
                + "WHERE a.id_paket LIKE '%" + keyword + "%' "
                + "OR a.id_kurir LIKE '%" + keyword + "%' "
                + "OR a.status LIKE '%" + keyword + "%' "
                + "OR a.no_resi LIKE '%" + keyword + "%' "
                + "OR a.penerima LIKE '%" + keyword + "%' "
                + "OR a.jenis_paket LIKE '%" + keyword + "%' ");

        try {
            while (rs.next()) {
                Paket paket = new Paket();
                paket.setId(rs.getInt("id"));
                paket.getBarang().setId_barang(rs.getInt("id_barang"));
                paket.getSurat().setId_surat(rs.getInt("id_surat"));
                paket.getUser().setIduser(rs.getInt("iduser"));
                paket.getUser().setNama(rs.getString("nama"));
                paket.setStatus(rs.getString("status"));
                paket.getBarang().setAlamat("alamat");
                paket.getSurat().setAlamat("alamat");
                paket.setNo_resi(rs.getString("no_resi"));
                paket.setTanggalDikirim(rs.getDate("tanggalDikirim"));
                paket.setTanggalDiterima(rs.getDate("tanggalDiterima"));
                paket.setPenerima(rs.getString("penerima"));
                paket.setJenis_paket(rs.getString("jenis_paket"));

                ListPaket.add(paket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPaket;
    }

    public void update() {
        Calendar cal = Calendar.getInstance();
 
        SimpleDateFormat dateOnly = new SimpleDateFormat("yyyy-MM-dd");
        
        String SQL = "UPDATE paket SET "
                + "     id_status = '2', "
                + "     tanggalDikirim = '" + dateOnly.format(cal.getTime()) + "', "
                + "     id_kurir = '2' "
                + "     WHERE id = '" + this.id + "'";
        this.id = DBHelper.insertQueryGetId(SQL);
    }
    
    public void updateTerkirim() {
        Calendar cal = Calendar.getInstance();
 
        SimpleDateFormat dateOnly = new SimpleDateFormat("yyyy-MM-dd");
        
        String SQL = "UPDATE paket SET "
                + "     id_status = '3', "
                + "     tanggalDiterima = '" + dateOnly.format(cal.getTime()) + "', "
                + "     penerima = '" + this.penerima + "' "
                + "     WHERE id = '" + this.id + "'";
        this.id = DBHelper.insertQueryGetId(SQL);
    }
    
    public void updateGagal() {
        Calendar cal = Calendar.getInstance();
 
        SimpleDateFormat dateOnly = new SimpleDateFormat("yyyy-MM-dd");
        
        String SQL = "UPDATE paket SET "
                + "     id_status = '4' "
                + "     WHERE id = '" + this.id + "'";
        this.id = DBHelper.insertQueryGetId(SQL);
    }
}
