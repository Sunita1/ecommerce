

package com.pagodalabs.ecommerce.entities ;


public class Admin {
       private int id;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String access;
    private String password;
  


    public Admin() {
    }

    public Admin(int id,String firstName,String lastName,String userName,String email,String access,String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.access = access;
        this.password = password;
     
     
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getAccess() {
        return access;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

public void setEmail(String email) {
        this.email = email;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}

  

   

    
    
    
    


