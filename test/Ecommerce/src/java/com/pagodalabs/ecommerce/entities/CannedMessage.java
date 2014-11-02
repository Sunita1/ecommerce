/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pagodalabs.ecommerce.entities ;


public class CannedMessage {
       private int id;
    private int deletable;
    private String type;
    private String name;
    private String subject;
    private String content;



    public CannedMessage() {
    }

    public CannedMessage (int id,int deletable,String type,String name,String subject,String link,String newWindow,String sequence) {
        this.id = id;
        this.deletable = deletable;
        this.type = type;
        this.name = name;
        this.subject = subject;
        this.content = content;
  
     
    }

    public int getId() {
        return id;
    }

    public int getDeletable() {
        return deletable;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDeletable(int deletable) {
        this.deletable = deletable;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setContent(String content) {
        this.content = content;
    }

   

    
    
    
    
}

