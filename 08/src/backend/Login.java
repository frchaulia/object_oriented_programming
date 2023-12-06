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
public class Login {
    private int id;
    private String logUsername, logPassword;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogUsername() {
        return logUsername;
    }

    public void setLogUsername(String logUsername) {
        this.logUsername = logUsername;
    }

    public String getLogPassword() {
        return logPassword;
    }

    public void setLogPassword(String logPassword) {
        this.logPassword = logPassword;
    }
    
    public ArrayList<Login> search(String ussername, String password){
        ArrayList<Login> ListLogin = new ArrayList();
        
        String sql = "SELECT * FROM login WHERE "
                    + "     LogUsername LIKE '" + ussername + "' "
                    + "     AND LogPassword LIKE '" + password + "'; ";
        
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try{
            while(rs.next()){
                Login log = new Login();
                log.setId(rs.getInt("ID"));
                log.setLogUsername(rs.getString("LogUsername"));
                log.setLogPassword(rs.getString("LogPassword"));
                
                ListLogin.add(log);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return ListLogin;
        
    }
}
