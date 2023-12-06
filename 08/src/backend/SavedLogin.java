/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;
import frontend.teslogin;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ia
 */
public class SavedLogin {
     private String name;
    
    private int iD;
    
    int test;

    public int getID() {
        return iD;
    }

    public void setID(int iD) {
        this.iD = iD;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName (String name){
        this.name = name;
    }
    
    public int getId(teslogin input){
        SavedLogin sl = new SavedLogin();
        String sql = "SELECT login.StaffID FROM login, staff WHERE "
                    + "     LogUsername LIKE '" + input.getUssername() + "'; ";
        
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try{
            while(rs.next()){
                sl.setID(rs.getInt("StaffID"));
                test = rs.getInt("StaffID");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return test;
    }
    
    public String getNameLogin(){
        SavedLogin sl = new SavedLogin();
        String sql = "SELECT StaffName FROM `staff`"
                    + "WHERE StaffID LIKE " + test + ";";
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try{
            while(rs.next()){
                sl.setName(rs.getString("StaffName"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        return sl.getName();
    }
    
    public void save(){
        String SQL = "UPDATE savedlogin SET "
                        + "     Name = '" + this.name + "' "
                        + "     WHERE ID = 1 ";
        DBHelper.executeQuery(SQL);
    }
    
    public ArrayList<SavedLogin> getAll(){
        ArrayList<SavedLogin> ListOfName = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM savedlogin");
        
        try{
            while(rs.next()){
                SavedLogin sl = new SavedLogin();
                sl.setName(rs.getString("Name"));
                
                ListOfName.add(sl);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return ListOfName;
    }
}
