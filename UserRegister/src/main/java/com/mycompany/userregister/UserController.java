/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.userregister;

import com.mycompany.userregister.BusinessLayer.UserEJB;
import com.mycompany.userregister.Entities.Users;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author masag
 */

@ManagedBean(name="userBean")
public class UserController {
    
    @EJB
    private UserEJB ejb;
    private String username;
    private String email;
    private String password;
    private String gender;
    private String address;
    
    private Users users = new Users();

    public UserController() {
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
    
    
    
    public String RegisterUser(){
        ejb.addUser(users);
        return "Home";
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

    @Override
    public String toString() {
        return "Username=" + username + "\nemail=" + email + "\npassword=" + password + "\ngender=" + gender + "\naddress=" + address;
    }
    
    public String validate(){
        //if information is valid for the database
        if(!getEmail().contains("@")){
            return "Index.xhtml";
        }
       
        
        return "Index.xhtml";
    }
    
}
