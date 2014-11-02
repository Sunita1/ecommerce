

package com.pagodalabs.ecommerce.entities ;


public class BannerCollection {
       private int bannerCollectionId;
    private String name;

  


    public BannerCollection() {
    }

    public BannerCollection(int bannerCollectionId,String name) {
        this.bannerCollectionId = bannerCollectionId;
        this.name = name;
     
     
     
    }

    public int getBannerCollectionId() {
        return bannerCollectionId;
    }

    public String getName() {
        return name;
    }

    public void setBannerCollectionId(int bannerCollectionId) {
        this.bannerCollectionId = bannerCollectionId;
    }

    public void setName(String name) {
        this.name = name;
    }

  
    
    
}

  

   

    
    
    
    



