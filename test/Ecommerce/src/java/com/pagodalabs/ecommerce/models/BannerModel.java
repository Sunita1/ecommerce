

package com.pagodalabs.ecommerce.models;

import com.pagodalabs.ecommerce.db.DBConnection;
import com.pagodalabs.ecommerce.entities.Banner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static jdk.nashorn.internal.runtime.Debug.id;


public class BannerModel {
//    private static int id;
//    private static Banner banner;
     public static int insert(Banner banner) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="INSERT INTO gc_banners(banner_collection_id,name,enable_date,image,link,new_window,sequence) VALUES(?,?,?,?,?,?,?)";
        
        PreparedStatement statement= connection.initStatement(sql);
       
        //statement.setInt(1,setting.getId());
        statement.setInt(1,banner.getBannerCollectionId());
        statement.setString(2,banner.getName());
        statement.setString(3,banner.getEnableDate());
        statement.setString(4,banner.getImage());
        statement.setString(5,banner.getLink());
        statement.setString(6,banner.getNewWindow());
        statement.setString(7,banner.getSequence());
       
        
        
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
    public static int Update(Banner banner) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="Update gc_banners setBannerCollectionId=?,setName=?,setEnableDate=? ,setImage=?,setLink=?,setNewWindow=?,setSequence=? WHERE id=?";
        
        System.out.println(banner.toString());
        PreparedStatement statement= connection.initStatement(sql);
       
     
         statement.setInt(1,banner.getBannerCollectionId());
        statement.setString(2,banner.getName());
        statement.setString(3,banner.getEnableDate());
        statement.setString(4,banner.getImage());
        statement.setString(5,banner.getLink());
        statement.setString(6,banner.getNewWindow());
        statement.setString(7,banner.getSequence());
        
        
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
        public static int Delete(Integer id) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="DELETE FROM gc_banner WHERE id=?";
        
        
        PreparedStatement statement= connection.initStatement(sql);
       
        statement.setString(1,id.toString());

        
        
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
    public static ArrayList<Banner> getAll() throws ClassNotFoundException, SQLException{
         DBConnection connection=new DBConnection();
        connection.open();
       ArrayList<Banner> banners=new ArrayList<Banner>();
        String sql="SELECT * from gc_banners";
        PreparedStatement statement= connection.initStatement(sql);
        ResultSet rs=connection.executeQuery();
      
    
       while(rs.next()){
            

           Banner banner = new Banner();
            banner.setBannerId(Integer.parseInt(rs.getString("banner_id")));
             banner.setBannerCollectionId(Integer.parseInt(rs.getString("banner_collection_id")));
            banner.setName(rs.getString("name"));
            banner.setEnableDate(rs.getString("enable_date"));
            banner.setImage(rs.getString("image"));
            banner.setLink(rs.getString("link"));
            banner.setNewWindow(rs.getString("new_window"));
            banner.setSequence(rs.getString("sequence"));
          banners.add(banner);
            
        }
        connection.close();                
       
        return banners;
    }
    
    public static Banner getByPk(int id) throws ClassNotFoundException, SQLException{
       DBConnection connection=new DBConnection();
        connection.open();
        Banner banner=null;
        String sql="SELECT * from gc_banners where id=?";
        PreparedStatement statement= connection.initStatement(sql);
        statement.setInt(1, id);
        ResultSet rs=connection.executeQuery();
    
       while(rs.next()){

            banner = new Banner();
             banner.setBannerId(Integer.parseInt(rs.getString("banner_id")));
             banner.setBannerCollectionId(Integer.parseInt(rs.getString("banner_collection_id")));
            banner.setName(rs.getString("name"));
            banner.setEnableDate(rs.getString("enable_date"));
            banner.setImage(rs.getString("image"));
            banner.setLink(rs.getString("link"));
            banner.setNewWindow(rs.getString("new_window"));
            banner.setSequence(rs.getString("sequence"));
         
            
        }
        connection.close();                
        return banner;
    }
    
}


