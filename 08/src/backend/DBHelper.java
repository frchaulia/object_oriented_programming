/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ia
 */
public class DBHelper {
    private static Connection koneksi;
    private Statement stat;
    private ResultSet rs;
    
    public void Koneksi(){
    
        String url = "jdbc:mysql://localhost:3306/dbpaket";
        try{ 
          koneksi = DriverManager.getConnection(url,"root","");
          stat = koneksi.createStatement();
          System.out.println("Data berhasil tersambung");
        }catch(SQLException a) {
            System.out.println("tidak ada database"+a);  
        }
    }
    
    public static com.mysql.jdbc.Driver konek(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection konekDB = DriverManager.getConnection("jdbc:mysql://localhost/dbpaket", "root", "");
            return (com.mysql.jdbc.Driver) konekDB;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    public static void bukaKoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/dbpaket";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
            } catch (SQLException t) {
                System.out.println("Error koneksi!");
            }
        }
    }

    public static int insertQueryGetId(String query) {
        bukaKoneksi();
        int num = 0;
        int result = -1;

        try {
            Statement stmt = koneksi.createStatement();
            num = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();

            if (rs.next()) {
                result = rs.getInt(1);
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            result = -1;
        }

        return result;
    }

    public static boolean executeQuery(String query) {
        bukaKoneksi();
        boolean result = false;

        try {
            Statement stmt = koneksi.createStatement();
            stmt.executeUpdate(query);

            result = true;

            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static ResultSet selectQuery(String query) {
        bukaKoneksi();
        ResultSet rs = null;

        try {
            Statement stmt = koneksi.createStatement();
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs;
    }

}