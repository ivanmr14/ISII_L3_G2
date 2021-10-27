/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import vista.Cliente;

/**
 *
 * @author IvanMR
 */
public class Camping {
    
    private ArrayList<ClienteDatos> clientes;
    
    //private ArrayList<Cliente> clientesEnElCamping;
    
    public Camping(){
        clientes = new ArrayList();
    }
    
   

    public ArrayList<ClienteDatos> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<ClienteDatos> clientes) {
        this.clientes = clientes;
    }
}
