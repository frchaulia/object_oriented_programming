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
public class Surat {
    private int id_surat, harga;
    private String no_surat, nama_pengirim, nama_tujuan, telp_pengirim, telp_tujuan, alamat, tipe_paket;

    public int getId_surat() {
        return id_surat;
    }

    public void setId_surat(int id_surat) {
        this.id_surat = id_surat;
    }

    public String getNo_surat() {
        return no_surat;
    }

    public void setNo_surat(String no_surat) {
        this.no_surat = no_surat;
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

    public String getNama_tujuan() {
        return nama_tujuan;
    }

    public void setNama_tujuan(String nama_tujuan) {
        this.nama_tujuan = nama_tujuan;
    }

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
    
    public Surat() {
    
    }

    public Surat(int id_surat, int harga, String no_surat, String nama_pengirim, String nama_tujuan, String telp_pengirim, String telp_tujuan, String alamat, String tipe_paket) {
        this.id_surat = id_surat;
        this.harga = harga;
        this.no_surat = no_surat;
        this.nama_pengirim = nama_pengirim;
        this.nama_tujuan = nama_tujuan;
        this.telp_pengirim = telp_pengirim;
        this.telp_tujuan = telp_tujuan;
        this.alamat = alamat;
        this.tipe_paket = tipe_paket;
    }
    
    public Surat getById(int id) {
        Surat surat = new Surat();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM surat WHERE id_surat = '" + id + "'");

        try {
            while (rs.next()) {
                surat = new Surat();
                surat.setId_surat(rs.getInt("id_surat"));
                surat.setNo_surat(rs.getString("no_surat"));
                surat.setNama_pengirim(rs.getString("nama_pengirim"));
                surat.setNama_tujuan(rs.getString("nama_tujuan"));
                surat.setTelp_pengirim(rs.getString("telp_pengirim"));
                surat.setTelp_tujuan(rs.getString("telp_tujuan"));
                surat.setAlamat(rs.getString("alamat"));
                surat.setHarga(rs.getInt("harga"));
                surat.setTipe_paket(rs.getString("tipe_paket"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return surat;
    }

    public ArrayList<Surat> getAll() {
        ArrayList<Surat> ListSurat = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM surat");

        try {
            while (rs.next()) {
                Surat surat = new Surat();
                surat.setId_surat(rs.getInt("id_surat"));
                surat.setNo_surat(rs.getString("no_surat"));
                surat.setNama_pengirim(rs.getString("nama_pengirim"));
                surat.setNama_tujuan(rs.getString("nama_tujuan"));
                surat.setTelp_pengirim(rs.getString("telp_pengirim"));
                surat.setTelp_tujuan(rs.getString("telp_tujuan"));
                surat.setAlamat(rs.getString("alamat"));
                surat.setHarga(rs.getInt("harga"));
                surat.setTipe_paket(rs.getString("tipe_paket"));

                ListSurat.add(surat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListSurat;
    }

    public ArrayList<Surat> search(String keyword) {
        ArrayList<Surat> ListSurat = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM surat "
                + "WHERE no_surat LIKE '%" + keyword + "%' "
                + "OR nama_pengirim LIKE '%" + keyword + "%' "
                + "OR nama_tujuan LIKE '%" + keyword + "%' "
                + "OR alamat LIKE '%" + keyword + "%' "
                + "OR harga LIKE '%" + keyword + "%' "
                + "OR tipe_paket LIKE '%" + keyword + "%' ");

        try {
            while (rs.next()) {
                Surat surat = new Surat();
                surat.setId_surat(rs.getInt("id_surat"));
                surat.setNo_surat(rs.getString("no_surat"));
                surat.setNama_pengirim(rs.getString("nama_pengirim"));
                surat.setNama_tujuan(rs.getString("nama_tujuan"));
                surat.setTelp_pengirim(rs.getString("telp_pengirim"));
                surat.setTelp_tujuan(rs.getString("telp_tujuan"));
                surat.setAlamat(rs.getString("alamat"));
                surat.setHarga(rs.getInt("harga"));
                surat.setTipe_paket(rs.getString("tipe_paket"));

                ListSurat.add(surat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListSurat;
    }

    public void save() {
        if (getById(id_surat).getId_surat() == 0) {
            String SQL = "INSERT INTO surat (no_surat, nama_pengirim, nama_tujuan, "
                    + "telp_pengirim, telp_tujuan, alamat, harga, tipe_paket) VALUES("
                    + "'" + this.no_surat + "', "
                    + "'" + this.nama_pengirim + "', "
                    + "'" + this.nama_tujuan + "', "
                    + "'" + this.telp_pengirim + "', "
                    + "'" + this.telp_tujuan + "', "
                    + "'" + this.alamat + "', "
                    + "'" + this.harga + "', "
                    + "'" + this.tipe_paket + "'"
                    + ")";
            this.id_surat = DBHelper.insertQueryGetId(SQL);
            
            String SQLI = "INSERT INTO paket (id_paket, id_kurir, id_status, jenis_paket)"
                    + "VALUES ("
                    + "'" + this.id_surat + "', "
                    + "'1', "
                    + "'1', "
                    + "'Surat' "
                    + ")";
            this.id_surat = DBHelper.insertQueryGetId(SQLI);
            
        } else {
            String SQL = "UPDATE surat SET "
                    + "     no_surat = '" + this.no_surat + "', "
                    + "     nama_pengirim = '" + this.nama_pengirim + "', "
                    + "     nama_tujuan = '" + this.nama_tujuan + "', "
                    + "     telp_pengirim = '" + this.telp_pengirim + "', "
                    + "     telp_tujuan = '" + this.telp_tujuan + "', "
                    + "     alamat = '" + this.alamat + "', "
                    + "     harga = '" + this.harga + "', "
                    + "     tipe_paket = '" + this.tipe_paket + "' "
                    + "     WHERE id_surat = '" + this.id_surat + "'";
            this.id_surat = DBHelper.insertQueryGetId(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM surat WHERE id_surat = '" + this.id_surat + "'";
        DBHelper.executeQuery(SQL);
        
        String SQLI = "DELETE FROM paket WHERE id_paket = '" + this.id_surat + "' AND jenis_paket = 'Surat'";
        DBHelper.executeQuery(SQLI);
    }
}
