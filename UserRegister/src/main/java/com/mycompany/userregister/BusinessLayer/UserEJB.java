/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.userregister.BusinessLayer;

import com.mycompany.userregister.Entities.Users;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author masag
 */
@Stateless
public class UserEJB {
    
    @PersistenceContext
    private EntityManager em;
    private Users user;

    public UserEJB() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("users");
        this.em = emf.createEntityManager();
    }
    
    //crud
    public void addUser(Users user){
        this.em.persist(user);
    }
    
    public void removeUser(Users user){
        this.em.remove(user);
    }
    
    public void updateUser(Users user){
        this.em.merge(user);
    }
    
    public Users findUser(Users user){
        return this.em.find(Users.class,user);
    }
    
    
}
