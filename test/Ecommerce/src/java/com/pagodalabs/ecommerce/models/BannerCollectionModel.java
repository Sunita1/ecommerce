

package com.pagodalabs.ecommerce.models;

import com.pagodalabs.ecommerce.db.DBConnection;
import com.pagodalabs.ecommerce.entities.BannerCollection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static jdk.nashorn.internal.runtime.Debug.id;


public class BannerCollectionModel {
//    private static int id;
//    private static BannerCollectionCollection collection;
     public static int insert(BannerCollection collection) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="INSERT INTO gc_banner_collections(name) VALUES(?)";
        
        PreparedStatement statement= connection.initStatement(sql);
        
        statement.setString(1,collection.getName());  
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
    public static int Update(BannerCollection collection) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="Update gc_banner_collections setName=? WHERE id=?";
        
        System.out.println(collection.toString());
        PreparedStatement statement= connection.initStatement(sql);
        statement.setString(1,collection.getName());
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
        public static int Delete(Integer id) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="DELETE FROM gc_banner_collections WHERE id=?";
        
        
        PreparedStatement statement= connection.initStatement(sql);
       
        statement.setString(1,id.toString());
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
    public static ArrayList<BannerCollection> getAll() throws ClassNotFoundException, SQLException{
         DBConnection connection=new DBConnection();
        connection.open();
       ArrayList<BannerCollection > collections=new ArrayList<BannerCollection>();
        String sql="SELECT * from gc_banner_collections";
        PreparedStatement statement= connection.initStatement(sql);
        ResultSet rs=connection.executeQuery();
      
    
       while(rs.next()){
            

           BannerCollection collection = new BannerCollection();
            collection.setBannerCollectionId(Integer.parseInt(rs.getString("collection_id")));
        
            collection.setName(rs.getString("name"));
          
          collections.add(collection);
            
        }
        connection.close();                
       
        return collections;
    }
    
    public static BannerCollection getByPk(int id) throws ClassNotFoundException, SQLException{
       DBConnection connection=new DBConnection();
        connection.open();
        BannerCollection collection=null;
        String sql="SELECT * from gc_banner_collections where id=?";
        PreparedStatement statement= connection.initStatement(sql);
        statement.setInt(1, id);
        ResultSet rs=connection.executeQuery();
    
       while(rs.next()){

            collection = new BannerCollection();
             collection.setBannerCollectionId(Integer.parseInt(rs.getString("banner_id")));
         
            collection.setName(rs.getString("name"));
         
         
            
        }
        connection.close();                
        return collection;
    }
    
}



