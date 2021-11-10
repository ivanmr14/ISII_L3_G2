/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
import java.util.Arrays;
import vista.Cliente;

/**
 *
 * @author MIRENA
 */
public class ClienteDatos {
    private String user;
    private String password;
    private String dni;
    private String name;
    private String surname;
    private ArrayList<Reserva> reservas;
    private ArrayList<Actividad> actividades;
    
    
    /**
     * 
     * @param user
     * @param password
     * @param dni
     * @param name
     * @param surname 
     */
    public ClienteDatos(String user, String password, String dni, String name, String surname) {
        this.user = user;
        this.password = password;
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        actividades = new ArrayList<Actividad>();
    }

    public ArrayList<Actividad> getActividades() {
        return actividades;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void addActividad(Actividad actividad){
        actividades.add(actividad);
    }
    

    /*public ClienteDatos() {
    }*/
    
   
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public String toString(){
        return this.user;
    }
    
    
    
}
