/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pagodalabs.ecommerce.entities ;


public class Banner {
       private int bannerId;
    private int bannerCollectionId;
    private String name;
    private String enableDate;
    private String image;
    private String link;
    private String newWindow;
    private String sequence;


    public Banner() {
    }

    public Banner(int bannerId,int bannerCollectionId,String name,String enableDate,String image,String link,String newWindow,String sequence) {
        this.bannerId = bannerId;
        this.bannerCollectionId = bannerCollectionId;
        this.name = name;
        this.enableDate = enableDate;
        this.image = image;
        this.link = link;
        this.newWindow = newWindow;
        this.sequence = sequence;
        this.image = image;
     
    }

    public int getBannerId() {
        return bannerId;
    }

    public int getBannerCollectionId() {
        return bannerCollectionId;
    }

    public String getName() {
        return name;
    }

    public String getEnableDate() {
        return enableDate;
    }

    public String getImage() {
        return image;
    }

    public String getLink() {
        return link;
    }

    public String getNewWindow() {
        return newWindow;
    }

    public String getSequence() {
        return sequence;
    }

    public void setBannerId(int bannerId) {
        this.bannerId = bannerId;
    }

    public void setBannerCollectionId(int bannerCollectionId) {
        this.bannerCollectionId = bannerCollectionId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnableDate(String enableDate) {
        this.enableDate = enableDate;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setNewWindow(String newWindow) {
        this.newWindow = newWindow;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

   

    
    
    
    
}
