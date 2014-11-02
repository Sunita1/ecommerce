

package com.pagodalabs.ecommerce.models;

import com.pagodalabs.ecommerce.db.DBConnection;
import com.pagodalabs.ecommerce.entities.CannedMessage;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static jdk.nashorn.internal.runtime.Debug.id;


public class CannedMessageModel {
//    private static int id;
//    private static CannedMessage message;
     public static int insert(CannedMessage message) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="INSERT INTO gc_canned_messages(deletable,type,name,subject,content) VALUES(?,?,?,?,?)";
        
        PreparedStatement statement= connection.initStatement(sql);
        statement.setInt(1,message.getDeletable());
        statement.setString(2,message.getType());
        statement.setString(3,message.getName());
        statement.setString(4,message.getSubject());
        statement.setString(5,message.getContent());
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
    public static int Update(CannedMessage message) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="Update gc_canned_messages setDeletable=?,setType=?,setName=? ,setSubject=?,setContent=? WHERE id=?";
        
        System.out.println(message.toString());
        PreparedStatement statement= connection.initStatement(sql);
       
     
     statement.setInt(1,message.getDeletable());
        statement.setString(2,message.getType());
        statement.setString(3,message.getName());
        statement.setString(4,message.getSubject());
        statement.setString(5,message.getContent());
        
        
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
        public static int Delete(Integer id) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="DELETE FROM gc_canned_messages WHERE id=?";
        
        
        PreparedStatement statement= connection.initStatement(sql);
       
        statement.setString(1,id.toString());

        
        
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
    public static ArrayList<CannedMessage> getAll() throws ClassNotFoundException, SQLException{
         DBConnection connection=new DBConnection();
        connection.open();
       ArrayList<CannedMessage> messages=new ArrayList<CannedMessage>();
        String sql="SELECT * from gc_canned_messages";
        PreparedStatement statement= connection.initStatement(sql);
        ResultSet rs=connection.executeQuery();
      
    
       while(rs.next()){

           CannedMessage message = new CannedMessage();
               message.setId(Integer.parseInt(rs.getString("id")));
            message.setDeletable(Integer.parseInt(rs.getString("deletable")));
            message.setType(rs.getString("type"));
            message.setName(rs.getString("name"));
            message.setSubject(rs.getString("subject"));
            message.setContent(rs.getString("content"));
          messages.add(message);
            
        }
        connection.close();                
       
        return messages;
    }
    
    public static CannedMessage getByPk(int id) throws ClassNotFoundException, SQLException{
       DBConnection connection=new DBConnection();
        connection.open();
        CannedMessage message=null;
        String sql="SELECT * from gc_canned_messages where id=?";
        PreparedStatement statement= connection.initStatement(sql);
        statement.setInt(1, id);
        ResultSet rs=connection.executeQuery();
    
       while(rs.next()){

            message = new CannedMessage();
            message.setId(Integer.parseInt(rs.getString("id")));
            message.setDeletable(Integer.parseInt(rs.getString("deletable")));
            message.setType(rs.getString("type"));
            message.setName(rs.getString("name"));
            message.setSubject(rs.getString("subject"));
            message.setContent(rs.getString("content"));
           
         
            
        }
        connection.close();                
        return message;
    }
    
}


