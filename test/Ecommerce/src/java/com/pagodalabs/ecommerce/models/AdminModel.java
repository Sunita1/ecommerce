

package com.pagodalabs.ecommerce.models;

import com.pagodalabs.ecommerce.db.DBConnection;
import com.pagodalabs.ecommerce.entities.Admin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static jdk.nashorn.internal.runtime.Debug.id;


public class AdminModel {
    private static int id;
    private static Admin admin;
     public static int insert(Admin admin) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="INSERT INTO gc_admin(firstName,lastName,userName,email,access,password) VALUES(?,?,?,?,?,?)";
        
        PreparedStatement statement= connection.initStatement(sql);
       
        //statement.setInt(1,setting.getId());
        statement.setString(1,admin.getFirstName());
        statement.setString(2,admin.getLastName());
        statement.setString(3,admin.getUserName());
        statement.setString(4,admin.getEmail());
        statement.setString(5,admin.getAccess());
        statement.setString(6,admin.getPassword());
       
        
        
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
    public static int Update(Admin admin) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="Update gc_admin setFirstName=?,setLastName=?,setUserName=? ,setEmail=?,setAccess=?,setPassword=? WHERE id=?";
        
        System.out.println(admin.toString());
        PreparedStatement statement= connection.initStatement(sql);
       
     
        statement.setString(1,admin.getFirstName());
        statement.setString(2,admin.getLastName());
        statement.setString(3,admin.getUserName());
        statement.setString(4,admin.getEmail());
        statement.setString(4,admin.getAccess());
        statement.setString(5,admin.getPassword());
        statement.setInt(6,admin.getId());
        
        
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
        public static int Delete(Integer id) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="DELETE FROM gc_admin WHERE id=?";
        
        
        PreparedStatement statement= connection.initStatement(sql);
       
        statement.setString(1,id.toString());

        
        
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
    public static ArrayList<Admin> getAll() throws ClassNotFoundException, SQLException{
         DBConnection connection=new DBConnection();
        connection.open();
       ArrayList<Admin> admins=new ArrayList<Admin>();
        String sql="SELECT * from gc_admin";
        PreparedStatement statement= connection.initStatement(sql);
        ResultSet rs=connection.executeQuery();
      
    
       while(rs.next()){

           Admin admin = new Admin();
            admin.setId(Integer.parseInt(rs.getString("id")));
            admin.setFirstName(rs.getString("firstName"));
            admin.setLastName(rs.getString("lastName"));
            admin.setUserName(rs.getString("userName"));
            admin.setEmail(rs.getString("email"));
            admin.setAccess(rs.getString("access"));
            admin.setPassword(rs.getString("password"));
          admins.add(admin);
            
        }
        connection.close();                
       
        return admins;
    }
    
    public static Admin getByPk(int id) throws ClassNotFoundException, SQLException{
       DBConnection connection=new DBConnection();
        connection.open();
        Admin admin=null;
        String sql="SELECT * from gc_admin where id=?";
        PreparedStatement statement= connection.initStatement(sql);
        statement.setInt(1, id);
        ResultSet rs=connection.executeQuery();
    
       while(rs.next()){

            admin = new Admin();
            admin.setId(Integer.parseInt(rs.getString("id")));
            admin.setFirstName(rs.getString("firstName"));
            admin.setLastName(rs.getString("lastName"));
            admin.setUserName(rs.getString("userName"));
            admin.setEmail(rs.getString("email"));
            admin.setAccess(rs.getString("access"));
            admin.setPassword(rs.getString("password"));
         
            
        }
        connection.close();                
        return admin;
    }
    
}

