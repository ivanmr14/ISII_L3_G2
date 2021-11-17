/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import vista.Cliente;

/**
 *
 * @author MIRENA
 */
public class Actividad {
    private String nombre;
    private String horario;
    private ArrayList<ClienteDatos> clientes;

    public Actividad(String nombre, String horario) {
        this.nombre = nombre;
        this.horario = horario;
        clientes = new ArrayList<ClienteDatos>();
   
    }
    
    public void addCliente(ClienteDatos cliente){
        clientes.add(cliente);
        
        
    }
    @Override
    public String toString(){
        return nombre +" " + horario;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void borrarCliente(ClienteDatos c){
        clientes.remove(c);
    }

    public void setClientes(ArrayList<ClienteDatos> clientes) {
        this.clientes = clientes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public ArrayList<ClienteDatos> getClientes() {
        return clientes;
    }
    
}
