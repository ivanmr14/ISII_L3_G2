/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author alumno
 */
public class Gerente {
    
    String user;
    String pass;
    
    public Gerente(String user, String pass){
       this.user = user;
       this.pass = pass;
    }
    
    //GETTERS Y SETTERS
    
    public void setUser(String user){
        this.user = user;
    }
    
    public void setPass(String pass){
        this.pass = pass;
    }
    
    public String getUser(){
        return this.user;
    }
    
    public String getPass(){
        return this.pass;
    }

    
}
