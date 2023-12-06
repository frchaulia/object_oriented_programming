/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author ia
 */
public class Barang {
    private int id_barang, harga;
    private String nama_pengirim, detail_barang, nama_tujuan, alamat, tipe_paket, telp_pengirim, telp_tujuan;

    public String getTelp_pengirim() {
        return telp_pengirim;
    }

    public void setTelp_pengirim(String telp_pengirim) {
        this.telp_pengirim = telp_pengirim;
    }

    public String getTelp_tujuan() {
        return telp_tujuan;
    }

    public void setTelp_tujuan(String telp_tujuan) {
        this.telp_tujuan = telp_tujuan;
    }

    public int getId_barang() {
        return id_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getNama_pengirim() {
        return nama_pengirim;
    }

    public void setNama_pengirim(String nama_pengirim) {
        this.nama_pengirim = nama_pengirim;
    }

    public String getDetail_barang() {
        return detail_barang;
    }

    public void setDetail_barang(String detail_barang) {
        this.detail_barang = detail_barang;
    }

    public String getNama_tujuan() {
        return nama_tujuan;
    }

    public void setNama_tujuan(String nama_tujuan) {
        this.nama_tujuan = nama_tujuan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTipe_paket() {
        return tipe_paket;
    }

    public void setTipe_paket(String tipe_paket) {
        this.tipe_paket = tipe_paket;
    }
    
    public Barang() {
    
    }
    
    public Barang(int id_barang, int harga, String nama_pengirim, String detail_barang, String nama_tujuan, String telp_pengirim, String telp_tujuan, String alamat, String tipe_paket) {
        this.id_barang = id_barang;
        this.harga = harga;
        this.nama_pengirim = nama_pengirim;
        this.detail_barang = detail_barang;
        this.nama_tujuan = nama_tujuan;
        this.telp_pengirim = telp_pengirim;
        this.telp_tujuan = telp_tujuan;
        this.alamat = alamat;
        this.tipe_paket = tipe_paket;
    }
    
    public Barang getById(int id) {
        Barang barang = new Barang();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM barang WHERE id_barang = '" + id + "'");

        try {
            while (rs.next()) {
                barang = new Barang();
                barang.setId_barang(rs.getInt("id_barang"));
                barang.setNama_pengirim(rs.getString("nama_pengirim"));
                barang.setDetail_barang(rs.getString("detail_barang"));
                barang.setNama_tujuan(rs.getString("nama_tujuan"));
                barang.setTelp_pengirim(rs.getString("telp_pengirim"));
                barang.setTelp_tujuan(rs.getString("telp_tujuan"));
                barang.setAlamat(rs.getString("alamat"));
                barang.setHarga(rs.getInt("harga"));
                barang.setTipe_paket(rs.getString("tipe_paket"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return barang;
    }

    public ArrayList<Barang> getAll() {
        ArrayList<Barang> ListBarang = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM barang");

        try {
            while (rs.next()) {
                Barang barang = new Barang();
                barang.setId_barang(rs.getInt("id_barang"));
                barang.setNama_pengirim(rs.getString("nama_pengirim"));
                barang.setDetail_barang(rs.getString("detail_barang"));
                barang.setNama_tujuan(rs.getString("nama_tujuan"));
                barang.setTelp_pengirim(rs.getString("telp_pengirim"));
                barang.setTelp_tujuan(rs.getString("telp_tujuan"));
                barang.setAlamat(rs.getString("alamat"));
                barang.setHarga(rs.getInt("harga"));
                barang.setTipe_paket(rs.getString("tipe_paket"));

                ListBarang.add(barang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBarang;
    }

    public ArrayList<Barang> search(String keyword) {
        ArrayList<Barang> ListBarang = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM barang "
                + "WHERE nama_pengirim LIKE '%" + keyword + "%' "
                + "OR detail_barang LIKE '%" + keyword + "%' "
                + "OR nama_tujuan LIKE '%" + keyword + "%' "
                + "OR alamat LIKE '%" + keyword + "%' "
                + "OR harga LIKE '%" + keyword + "%' "
                + "OR tipe_paket LIKE '%" + keyword + "%' ");

        try {
            while (rs.next()) {
                Barang barang = new Barang();
                barang.setId_barang(rs.getInt("id_barang"));
                barang.setNama_pengirim(rs.getString("nama_pengirim"));
                barang.setDetail_barang("detail_barang");
                barang.setNama_tujuan(rs.getString("nama_tujuan"));
                barang.setTelp_pengirim(rs.getString("telp_pengirim"));
                barang.setTelp_tujuan(rs.getString("telp_tujuan"));
                barang.setAlamat(rs.getString("alamat"));
                barang.setHarga(rs.getInt("harga"));
                barang.setTipe_paket(rs.getString("tipe_paket"));

                ListBarang.add(barang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBarang;
    }

    public void save() {
        if (getById(id_barang).getId_barang() == 0) {
            String SQL = "INSERT INTO barang (nama_pengirim, detail_barang, "
                    + "nama_tujuan, telp_pengirim, telp_tujuan, alamat, harga, "
                    + "tipe_paket) VALUES("
                    + "'" + this.nama_pengirim + "', "
                    + "'" + this.detail_barang + "', "
                    + "'" + this.nama_tujuan + "', "
                    + "'" + this.telp_pengirim + "', "
                    + "'" + this.telp_tujuan + "', "
                    + "'" + this.alamat + "', "
                    + "'" + this.harga + "', "
                    + "'" + this.tipe_paket + "'"
                    + ")";
            this.id_barang = DBHelper.insertQueryGetId(SQL);
            
            String SQLI = "INSERT INTO paket (id_paket, id_kurir, id_status, no_resi, jenis_paket)"
                    + "VALUES ("
                    + "'" + this.id_barang + "', "
                    + "'1', "
                    + "'1', "
                    + "'', "
                    + "'Barang' "
                    + ")";
            this.id_barang = DBHelper.insertQueryGetId(SQLI);
        } else {
            String SQL = "UPDATE barang SET "
                    + "     nama_pengirim = '" + this.nama_pengirim + "', "
                    + "     detail_barang = '" + this.detail_barang + "', "
                    + "     nama_tujuan = '" + this.nama_tujuan + "', "
                    + "     telp_pengirim = '" + this.telp_pengirim + "', "
                    + "     telp_tujuan = '" + this.telp_tujuan + "', "
                    + "     alamat = '" + this.alamat + "', "
                    + "     harga = '" + this.harga + "', "
                    + "     tipe_paket = '" + this.tipe_paket + "' "
                    + "     WHERE id_barang = '" + this.id_barang + "'";
            this.id_barang = DBHelper.insertQueryGetId(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM barang WHERE id_barang = '" + this.id_barang + "'";
        DBHelper.executeQuery(SQL);
        
        String SQLI = "DELETE FROM paket WHERE id_paket = '" + this.id_barang + "' AND jenis_paket = 'Barang'";
        DBHelper.executeQuery(SQLI);
    }
}
