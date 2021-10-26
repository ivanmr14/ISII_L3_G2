/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campingparty;

/**
 *
 * @author Christian (para RegistroCliente)
 */
public class Usuario {
    
    private String user;
    private String password;
    private String dni;
    private String name;
    private String surname;
    
    //CONSTRUCTOR
    public Usuario(String user, String password, String dni, String name, String surname){
        this.user = user;
        this.password = password;
        this.dni = dni;
        this.name = name;
        this.surname = surname;
    }
    
    //SETTERS Y GETTERS
    public String getUser(){
        return this.user;
    }
    public String getPassword(){
        return this.user;
    }
    public String getDNI(){
        return this.dni;
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    
    public void setUser(String user){
        this.user =  user;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setDNI(String dni){
        this.dni = dni;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    
}
