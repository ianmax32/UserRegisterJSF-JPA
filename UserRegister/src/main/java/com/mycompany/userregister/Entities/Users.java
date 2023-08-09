package com.mycompany.userregister.Entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_info")
public class Users implements Serializable{
    @Id
    @Column(name="user_ID")
    private int id;
    
    @Column(name="user_name")
    private String username;
    
    @Column(name="user_email")
    private String email;
    
    @Column
    private String password;
    
    @Column
    private String gender;
    
    @Column
    private String address;
    

    public Users() {
    }
    
    

    public Users(int id, String username, String email, String password, String gender, String address) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
